// @SOURCE:/home/knoldus/workspace/PlayAssignment/conf/routes
// @HASH:51da015c8dabc4fe6c2ad85f12455d917cd172cd
// @DATE:Thu Feb 26 18:10:59 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:40
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers {

// @LINE:40
class ReverseAssets {


// @LINE:40
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:20
def checklogin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "checklogin")
}
                        

// @LINE:30
def userupdateEmp(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "userupdateEmp" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:12
def insert(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix)
}
                        

// @LINE:26
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:24
def loginpage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "loginpage")
}
                        

// @LINE:28
def usereditEmp(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usereditEmp")
}
                        

// @LINE:22
def userhome(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "userhome")
}
                        

// @LINE:18
def searchlist(name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchlist" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("name", name)))))
}
                        

// @LINE:16
def deleteEmp(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "delete" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                        

// @LINE:14
def showAll(page:Int = 0, pagesize:Int = 5, filter:String = "", totalsize:Int = 35): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showAll" + queryString(List(if(page == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("page", page)), if(pagesize == 5) None else Some(implicitly[QueryStringBindable[Int]].unbind("pagesize", pagesize)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)), if(totalsize == 35) None else Some(implicitly[QueryStringBindable[Int]].unbind("totalsize", totalsize)))))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:8
def contact(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                        

// @LINE:10
def addnew(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "addnew")
}
                        

}
                          
}
                  


// @LINE:40
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:40
class ReverseAssets {


// @LINE:40
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:20
def checklogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checklogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checklogin"})
      }
   """
)
                        

// @LINE:30
def userupdateEmp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.userupdateEmp",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userupdateEmp" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def insert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.insert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:26
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:24
def loginpage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginpage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginpage"})
      }
   """
)
                        

// @LINE:28
def usereditEmp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.usereditEmp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usereditEmp"})
      }
   """
)
                        

// @LINE:22
def userhome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.userhome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userhome"})
      }
   """
)
                        

// @LINE:18
def searchlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchlist",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchlist" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("name", name)])})
      }
   """
)
                        

// @LINE:16
def deleteEmp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteEmp",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:14
def showAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showAll",
   """
      function(page,pagesize,filter,totalsize) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showAll" + _qS([(page == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("page", page)), (pagesize == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("pagesize", pagesize)), (filter == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter)), (totalsize == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("totalsize", totalsize))])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

// @LINE:10
def addnew : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addnew",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addnew"})
      }
   """
)
                        

}
              
}
        


// @LINE:40
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:40
class ReverseAssets {


// @LINE:40
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:20
def checklogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checklogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "checklogin", Seq(), "GET", """""", _prefix + """checklogin""")
)
                      

// @LINE:30
def userupdateEmp(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.userupdateEmp(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "userupdateEmp", Seq(classOf[Int]), "POST", """""", _prefix + """userupdateEmp$id<[^/]+>""")
)
                      

// @LINE:12
def insert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.insert(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "insert", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:26
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:24
def loginpage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginpage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginpage", Seq(), "GET", """""", _prefix + """loginpage""")
)
                      

// @LINE:28
def usereditEmp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.usereditEmp(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "usereditEmp", Seq(), "GET", """""", _prefix + """usereditEmp""")
)
                      

// @LINE:22
def userhome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.userhome(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "userhome", Seq(), "GET", """""", _prefix + """userhome""")
)
                      

// @LINE:18
def searchlist(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchlist(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchlist", Seq(classOf[String]), "GET", """""", _prefix + """searchlist""")
)
                      

// @LINE:16
def deleteEmp(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteEmp(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteEmp", Seq(classOf[Int]), "GET", """""", _prefix + """delete""")
)
                      

// @LINE:14
def showAll(page:Int, pagesize:Int, filter:String, totalsize:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showAll(page, pagesize, filter, totalsize), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showAll", Seq(classOf[Int], classOf[Int], classOf[String], classOf[Int]), "GET", """""", _prefix + """showAll""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def contact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contact", Seq(), "GET", """""", _prefix + """contact""")
)
                      

// @LINE:10
def addnew(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addnew(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addnew", Seq(), "GET", """""", _prefix + """addnew""")
)
                      

}
                          
}
        
    