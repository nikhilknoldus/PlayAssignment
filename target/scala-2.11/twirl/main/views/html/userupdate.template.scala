
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
object userupdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Int,Form[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Int, employeeForm: Form[Employee]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main("userupdate")/*7.20*/ {_display_(Seq[Any](format.raw/*7.22*/("""
    
    """),format.raw/*9.5*/("""<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Edit Employee</h1>
		</div>
		
		"""),_display_(/*15.4*/form(routes.Application.userupdateEmp(id))/*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/("""
			"""),format.raw/*16.4*/("""<fieldset>
				"""),_display_(/*17.6*/formElements(employeeForm)),format.raw/*17.32*/("""
			"""),format.raw/*18.4*/("""</fieldset>
					<div class="actions"> 
	     					<input type="submit" value="update this employee" class="btn btn-danger">
					</div>
		""")))}),format.raw/*22.4*/("""
	"""),format.raw/*23.2*/("""</div>
""")))}),format.raw/*24.2*/("""
"""))}
  }

  def render(id:Int,employeeForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(id,employeeForm)

  def f:((Int,Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (id,employeeForm) => apply(id,employeeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 14:57:23 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/userupdate.scala.html
                  HASH: 6576304a67b496d747171198258527a45760fd90
                  MATRIX: 522->1|656->61|688->85|767->40|795->59|823->134|851->137|877->155|916->157|952->167|1100->289|1151->331|1191->333|1222->337|1264->353|1311->379|1342->383|1512->523|1541->525|1579->533
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|29->9|35->15|35->15|35->15|36->16|37->17|37->17|38->18|42->22|43->23|44->24
                  -- GENERATED --
              */
          