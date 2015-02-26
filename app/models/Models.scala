package models

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * 6 imports are done here in which util.Date is
 * used for date functionality and slick.DB is 
 * imported for the interaction with postgres
 * database
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

import scala.slick.lifted.Tag
import org.joda.time.LocalDateTime
import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.DB
import java.util.Date

object Models extends App {

  implicit lazy val util2sqlDateMapper = MappedColumnType.base[java.util.Date, java.sql.Date](
    { utilDate => new java.sql.Date(utilDate.getTime()) },
    { sqlDate => new java.util.Date(sqlDate.getTime()) })

  class employeeTable(tag: Tag) extends Table[Employee](tag, "knol") {
    def name: Column[String] = column[String]("name", O.NotNull)
    def password: Column[String] = column[String]("password", O.NotNull)
    def address: Column[String] = column[String]("address", O.NotNull)
    def company: Column[String] = column[String]("company", O.NotNull)
    def email: Column[String] = column[String]("email", O.NotNull)
    def phone: Column[Long] = column[Long]("phone", O.NotNull)
    def created: Column[Date] = column[Date]("created", O.NotNull)
    def updated: Column[Date] = column[Date]("updated", O.NotNull)
    def user_type: Column[Int] = column[Int]("user_type")
    def id: Column[Int] = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def idx = index("idx_a", email, unique = true)
    def * = (name, password, address, company, email, phone, created, updated, user_type, id.?) <> (Employee.tupled, Employee.unapply)
  }

  val employeeTableQuery = TableQuery[employeeTable]
  def count(filter: String)(implicit s: Session): Int =
    Query(employeeTableQuery.filter(_.name.toLowerCase like filter.toLowerCase).length).first

  // val employees = TableQuery(new employeeTable(_))

  def insertInTo(employeeObj: Employee)(implicit s: Session) {
    val employeeTableQuery = TableQuery[employeeTable]
    val db = Database.forURL(url = "jdbc:postgresql://localhost:5432/test", user = "postgres", password = "postgres", driver = "org.postgresql.Driver")
    val session: Session = db.createSession()
    // employeeTableQuery.ddl.create(session)
    employeeTableQuery.insert(employeeObj)
  }

  def find(email:String)(implicit s:Session):Option[Int]={
    val employeeTableQuery = TableQuery[employeeTable]
    employeeTableQuery.filter(_.email===email).list.head.id
}
  
  
  def checklogin(obj: Login)(implicit s: Session): Int = {
    val employeeTableQueryNew = TableQuery[employeeTable]
    val ans = employeeTableQueryNew.filter(x => x.email === obj.email && x.password === obj.password).list.length
    ans
    /*
    println("Ans ======" + ans)
    val ans2 = ans.list
    println("Ans2 ======" + ans2)
    val ans3 = ans2.length
    println("Ans3 ======" + ans3)
    ans3*/
  }

  def showall(page: Int, pagesize: Int, filter: String, totalsize: Int)(implicit s: Session): List[Employee] = {
    val employeeTableQuery = TableQuery[employeeTable]
    val db = Database.forURL(url = "jdbc:postgresql://localhost:5432/test", user = "postgres", password = "postgres", driver = "org.postgresql.Driver")
    val offset = pagesize * page
    val datatablefilter = employeeTableQuery.filter(_.name.toLowerCase like filter.toLowerCase).drop(offset).take(pagesize).list
    val session: Session = db.createSession()
    employeeTableQuery.list
  }

  def deleteEmpMethod(id: Int)(implicit s: Session): Int = {
    val employeeTableQuery = TableQuery[employeeTable]
    employeeTableQuery.filter(_.id === id).delete
  }

  def useredit(id: Int=1)(implicit s: Session): Option[Employee] = {
    val employeeTableQuery = TableQuery[employeeTable]
    employeeTableQuery.filter(_.id === id).firstOption
  }

  def userupdate(id: Int, emp: Employee)(implicit s: Session): Int = {
    val employeeTableQuery = TableQuery[employeeTable]
    employeeTableQuery.filter(_.id === id).update(emp)
  }

  def getsearchlist(name: String)(implicit s: Session): Option[List[Employee]] = {
    val employeeTableQuery = TableQuery[employeeTable]
    Some(employeeTableQuery.filter(_.name.toLowerCase like "%" + name.toLowerCase + "%").list)
  }

}

case class Employee(name: String, password: String, address: String, company: String, email: String, phone: Long, created: Date = new Date(), updated: Date = new Date(), user_type: Int, id: Option[Int])
case class Login(email: String, password: String)
