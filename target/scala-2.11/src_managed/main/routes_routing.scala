// @SOURCE:/home/knoldus/workspace/PlayAssignment/conf/routes
// @HASH:51da015c8dabc4fe6c2ad85f12455d917cd172cd
// @DATE:Thu Feb 26 18:10:59 IST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_contact1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
private[this] lazy val controllers_Application_contact1_invoker = createInvoker(
controllers.Application.contact,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contact", Nil,"GET", """""", Routes.prefix + """contact"""))
        

// @LINE:10
private[this] lazy val controllers_Application_addnew2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addnew"))))
private[this] lazy val controllers_Application_addnew2_invoker = createInvoker(
controllers.Application.addnew,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addnew", Nil,"GET", """""", Routes.prefix + """addnew"""))
        

// @LINE:12
private[this] lazy val controllers_Application_insert3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_insert3_invoker = createInvoker(
controllers.Application.insert,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "insert", Nil,"POST", """""", Routes.prefix + """"""))
        

// @LINE:14
private[this] lazy val controllers_Application_showAll4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showAll"))))
private[this] lazy val controllers_Application_showAll4_invoker = createInvoker(
controllers.Application.showAll(fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showAll", Seq(classOf[Int], classOf[Int], classOf[String], classOf[Int]),"GET", """""", Routes.prefix + """showAll"""))
        

// @LINE:16
private[this] lazy val controllers_Application_deleteEmp5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete"))))
private[this] lazy val controllers_Application_deleteEmp5_invoker = createInvoker(
controllers.Application.deleteEmp(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteEmp", Seq(classOf[Int]),"GET", """""", Routes.prefix + """delete"""))
        

// @LINE:18
private[this] lazy val controllers_Application_searchlist6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchlist"))))
private[this] lazy val controllers_Application_searchlist6_invoker = createInvoker(
controllers.Application.searchlist(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchlist", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchlist"""))
        

// @LINE:20
private[this] lazy val controllers_Application_checklogin7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checklogin"))))
private[this] lazy val controllers_Application_checklogin7_invoker = createInvoker(
controllers.Application.checklogin,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "checklogin", Nil,"GET", """""", Routes.prefix + """checklogin"""))
        

// @LINE:22
private[this] lazy val controllers_Application_userhome8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userhome"))))
private[this] lazy val controllers_Application_userhome8_invoker = createInvoker(
controllers.Application.userhome,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "userhome", Nil,"GET", """""", Routes.prefix + """userhome"""))
        

// @LINE:24
private[this] lazy val controllers_Application_loginpage9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginpage"))))
private[this] lazy val controllers_Application_loginpage9_invoker = createInvoker(
controllers.Application.loginpage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginpage", Nil,"GET", """""", Routes.prefix + """loginpage"""))
        

// @LINE:26
private[this] lazy val controllers_Application_logout10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout10_invoker = createInvoker(
controllers.Application.logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:28
private[this] lazy val controllers_Application_usereditEmp11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usereditEmp"))))
private[this] lazy val controllers_Application_usereditEmp11_invoker = createInvoker(
controllers.Application.usereditEmp,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "usereditEmp", Nil,"GET", """""", Routes.prefix + """usereditEmp"""))
        

// @LINE:30
private[this] lazy val controllers_Application_userupdateEmp12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userupdateEmp"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_userupdateEmp12_invoker = createInvoker(
controllers.Application.userupdateEmp(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "userupdateEmp", Seq(classOf[Int]),"POST", """""", Routes.prefix + """userupdateEmp$id<[^/]+>"""))
        

// @LINE:40
private[this] lazy val controllers_Assets_at13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addnew""","""controllers.Application.addnew"""),("""POST""", prefix,"""controllers.Application.insert"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showAll""","""controllers.Application.showAll(page:Int ?= 0, pagesize:Int ?= 5, filter:String ?= "", totalsize:Int ?= 35)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete""","""controllers.Application.deleteEmp(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchlist""","""controllers.Application.searchlist(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checklogin""","""controllers.Application.checklogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userhome""","""controllers.Application.userhome"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginpage""","""controllers.Application.loginpage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usereditEmp""","""controllers.Application.usereditEmp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userupdateEmp$id<[^/]+>""","""controllers.Application.userupdateEmp(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:8
case controllers_Application_contact1_route(params) => {
   call { 
        controllers_Application_contact1_invoker.call(controllers.Application.contact)
   }
}
        

// @LINE:10
case controllers_Application_addnew2_route(params) => {
   call { 
        controllers_Application_addnew2_invoker.call(controllers.Application.addnew)
   }
}
        

// @LINE:12
case controllers_Application_insert3_route(params) => {
   call { 
        controllers_Application_insert3_invoker.call(controllers.Application.insert)
   }
}
        

// @LINE:14
case controllers_Application_showAll4_route(params) => {
   call(params.fromQuery[Int]("page", Some(0)), params.fromQuery[Int]("pagesize", Some(5)), params.fromQuery[String]("filter", Some("")), params.fromQuery[Int]("totalsize", Some(35))) { (page, pagesize, filter, totalsize) =>
        controllers_Application_showAll4_invoker.call(controllers.Application.showAll(page, pagesize, filter, totalsize))
   }
}
        

// @LINE:16
case controllers_Application_deleteEmp5_route(params) => {
   call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_Application_deleteEmp5_invoker.call(controllers.Application.deleteEmp(id))
   }
}
        

// @LINE:18
case controllers_Application_searchlist6_route(params) => {
   call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_Application_searchlist6_invoker.call(controllers.Application.searchlist(name))
   }
}
        

// @LINE:20
case controllers_Application_checklogin7_route(params) => {
   call { 
        controllers_Application_checklogin7_invoker.call(controllers.Application.checklogin)
   }
}
        

// @LINE:22
case controllers_Application_userhome8_route(params) => {
   call { 
        controllers_Application_userhome8_invoker.call(controllers.Application.userhome)
   }
}
        

// @LINE:24
case controllers_Application_loginpage9_route(params) => {
   call { 
        controllers_Application_loginpage9_invoker.call(controllers.Application.loginpage)
   }
}
        

// @LINE:26
case controllers_Application_logout10_route(params) => {
   call { 
        controllers_Application_logout10_invoker.call(controllers.Application.logout)
   }
}
        

// @LINE:28
case controllers_Application_usereditEmp11_route(params) => {
   call { 
        controllers_Application_usereditEmp11_invoker.call(controllers.Application.usereditEmp)
   }
}
        

// @LINE:30
case controllers_Application_userupdateEmp12_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_userupdateEmp12_invoker.call(controllers.Application.userupdateEmp(id))
   }
}
        

// @LINE:40
case controllers_Assets_at13_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     