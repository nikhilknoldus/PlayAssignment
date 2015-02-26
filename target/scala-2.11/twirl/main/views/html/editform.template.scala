
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
object editform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Int,Form[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Int, employeeForm: Form[Employee]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main("editform")/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
    
    """),format.raw/*9.5*/("""<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Edit Employee</h1>
		</div>
	</div>
""")))}),format.raw/*15.2*/("""
"""))}
  }

  def render(id:Int,employeeForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(id,employeeForm)

  def f:((Int,Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (id,employeeForm) => apply(id,employeeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 16:18:26 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/editform.scala.html
                  HASH: a239901d69b596bc95d00bb35a0a1cf83c357c07
                  MATRIX: 520->1|654->61|686->85|765->40|793->59|821->134|849->137|873->153|912->155|948->165|1103->290
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|29->9|35->15
                  -- GENERATED --
              */
          