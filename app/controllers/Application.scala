package controllers

import scala.slick.lifted.TableQuery
import models._
import models._
import models.Employee
import models.Models.employeeTable
import play.api._
import play.api.Play.current
import play.api.data._
import play.api.data.Form
import play.api.data.Forms._
import play.api.db.slick._
import play.api.mvc._
import views._
import org.joda.time.LocalDateTime
import play.api.db.slick.Config.driver.simple._
import java.util.Date
import java.nio.file.DirectoryStream.Filter

object Application extends Controller {

  /*
   * self type reference
   */
  
  //this: Controller =>

  val log: Logger = Logger(this.getClass)

  val employeeForm: Form[Employee] = Form(
    mapping(

      "name" -> nonEmptyText,
      "password" -> nonEmptyText,
      "address" -> nonEmptyText,
      "company" -> nonEmptyText,
      "email" -> email,
      "phone" -> longNumber,
      "created" -> ignored(new Date()),
      "updated" -> ignored(new Date()),
      "user_type" -> ignored(2),
      "id" -> ignored(Some(0): Option[Int]))(Employee.apply)(Employee.unapply))

  val loginForm: Form[Login] = Form(
    mapping(

      "email" -> nonEmptyText,
      "password" -> nonEmptyText)(Login.apply)(Login.unapply))

  def checklogin: Action[AnyContent] = DBAction { implicit request =>
    loginForm.bindFromRequest().fold(
      hasErrors = { form => Ok("Error") },
      success = { newUsr =>
        val ans = Models.checklogin(newUsr)
        println(ans)
        if (ans == 1)
          Ok(views.html.userhome("Home")).withSession("usr" -> newUsr.email)
        else
          Ok("FAILED")
      })
  }

  def userhome: Action[AnyContent] = Action { implicit request =>
    request.session.get("usr").map { usr =>
      Ok(views.html.userhome("Hi," + usr))
    }.getOrElse {
      Ok(views.html.index())
    }
  }

  def insert: Action[AnyContent] = DBAction { implicit request =>
    val interval = employeeForm.bindFromRequest()
    interval.fold(
      hasErrors = {
        form => Ok("error")
      },
      success = {
        newUser =>
          Models.insertInTo(newUser)
          Redirect(routes.Application.index).flashing("success" -> "Employee has been added")
      })
  }

  val employees = TableQuery(new employeeTable(_))

  def deleteEmp(id: Int): Action[AnyContent] = DBAction { implicit request =>
    Models.deleteEmpMethod(id)
    Redirect(routes.Application.showAll(0, 5, "", 50)).flashing("success" -> "Employee has been deleted")
  }

  /*  def editEmp(id: Int) = DBAction { implicit request =>
    Models.edit(id) match {
      case Some(employee) => Ok(views.html.editform(id, employeeForm.fill(employee)))
      case None           => NotFound
    }
  }

  def updateEmp(id: Int) = DBAction { implicit request =>
    employeeForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.editform(id, formWithErrors)),
      emp => {
        val companyToUpdate: Employee = emp.copy(id = Some(id))
        Models.updateEmpMethod(id, companyToUpdate)
        Redirect(routes.Application.showAll(0, 5, "", 50)).flashing("success" -> "Employee has been updated")
      })
 }
*/

  def usereditEmp() = DBAction { implicit request =>
    val email= request.session.get("usr").get
    val id=Models.find(email).get
    
    Models.useredit(id) match {
      case Some(employee) => Ok(views.html.userupdate( id, employeeForm.fill(employee)))
      case None           => NotFound
    }
  }

  def userupdateEmp(id: Int) = DBAction { implicit request =>
    employeeForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.userupdate(id, formWithErrors)),
      emp => {
        val companyToUpdate: Employee = emp.copy(id = Some(id))
        Models.userupdate(id, companyToUpdate)
        Ok(views.html.userhome("home"))
      })
  }



  def showAll(page: Int, pagesize: Int, filter: String, totalsize: Int): Action[AnyContent] = DBAction { implicit rs =>
    val ans = Models.showall(page, pagesize, "%" + filter + "%", totalsize)
    Ok(views.html.showAll(ans, page, pagesize, filter, totalsize))
  }

  def searchlist(search: String): Action[AnyContent] = DBAction { implicit rs =>
    val ans = Models.getsearchlist(search)
    ans match {
      case Some(ans) => Ok(views.html.showAll(ans, 0, 5, "", 50))
      case None      => Redirect(routes.Application.showAll()).flashing("success" -> "Result of search")
    }
  }

  def loginpage: Action[AnyContent] = Action {
    Ok(views.html.loginpage(loginForm))
  }

  def logout: Action[AnyContent] = Action {
    Ok(views.html.index()).withNewSession
  }

  def index: Action[AnyContent] = Action { implicit rs =>
    rs.session.get("usr").map { usr =>
      Ok(views.html.userhome("Hi," + usr))
    }.getOrElse {
      Ok(views.html.index())
    }
  }

  /* def userupdate: Action[AnyContent] = Action { implicit rs =>
    Ok(views.html.userupdate())
  }*/

  def contact: Action[AnyContent] = Action { implicit rs =>
    Ok(views.html.contact(801065634, "Contact Us"))
  }

  def addnew: Action[AnyContent] = Action { implicit rs =>

    Ok(views.html.addnew(employeeForm))
  }

}
