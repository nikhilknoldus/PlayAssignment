
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object formElements extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(empForm: Form[Employee]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/inputText(empForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*5.73*/("""
"""),_display_(/*6.2*/inputText(empForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*6.81*/("""
"""),_display_(/*7.2*/inputText(empForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*7.79*/("""
"""),_display_(/*8.2*/inputText(empForm("company"), '_label -> "Company", 'class -> "form-control")),format.raw/*8.79*/("""
"""),_display_(/*9.2*/inputText(empForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*9.75*/("""
"""),_display_(/*10.2*/inputText(empForm("phone"), '_label -> "Phone", 'class -> "form-control")),format.raw/*10.75*/("""





"""))}
  }

  def render(empForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(empForm)

  def f:((Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (empForm) => apply(empForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 18:57:06 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/formElements.scala.html
                  HASH: 832c153a27e849ccc5e7cf2c7d847254066210e3
                  MATRIX: 520->1|648->26|676->45|703->47|794->118|821->120|920->199|947->201|1044->278|1071->280|1168->357|1195->359|1288->432|1316->434|1410->507
                  LINES: 19->1|22->1|24->4|25->5|25->5|26->6|26->6|27->7|27->7|28->8|28->8|29->9|29->9|30->10|30->10
                  -- GENERATED --
              */
          