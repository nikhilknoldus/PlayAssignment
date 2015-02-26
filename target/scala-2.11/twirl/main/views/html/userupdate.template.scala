
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
    <div class="row">
    <div class="col-sm-8 col-dm-8 col-xs-8"> 
		<div class="panel panel-primary">
   <div class="panel-heading">
      <h3 class="panel-title">Update Profile</h3>
   </div>
   <div class="panel-body">
      
		
		"""),_display_(/*19.4*/form(routes.Application.userupdateEmp(id))/*19.46*/ {_display_(Seq[Any](format.raw/*19.48*/("""
			"""),format.raw/*20.4*/("""<fieldset>
				"""),_display_(/*21.6*/formElements(employeeForm)),format.raw/*21.32*/("""
			"""),format.raw/*22.4*/("""</fieldset>
					<div class="actions"> 
	     					<input type="submit" value="update this employee" class="btn btn-danger">
					</div>
		""")))}),format.raw/*26.4*/("""
	"""),format.raw/*27.2*/("""</div>
</div>
</div>
    <div class="col-sm-4 col-dm-4 col-xs-4">
    
 	<div class="thumbnail">	
      <img src='"""),_display_(/*33.18*/routes/*33.24*/.Assets.at("images/img_1.png")),format.raw/*33.54*/("""' alt="...">
      <div class="caption">
  			<h4 align="center"><span>Set Your Avatar </span></h4>
       		 <p align="center"><a href="#" class="btn btn-primary" role="button">Browse</a> <a href="#" class="btn btn-default" role="button">Search</a></p>
      </div>
    </div>
  
    
 	<div class="thumbnail">	
      <img src='"""),_display_(/*42.18*/routes/*42.24*/.Assets.at("images/img_1.png")),format.raw/*42.54*/("""' alt="...">
      <div class="caption">
  			<h4 align="center"><span>Link Your Account </span></h4>
       		 <p align="center"><span class="badge"><a href="#" class="btn btn-primary" role="button">Facebook</a></span><span class="badge"><a href="#" class="btn btn-primary" role="button">Twitter</a></span><span class="badge"><a href="#" class="btn btn-primary" role="button">linkedIn</a></span>  </p>
      </div>
    </div>
    </div>
</div>
""")))}),format.raw/*50.2*/("""
"""))}
  }

  def render(id:Int,employeeForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(id,employeeForm)

  def f:((Int,Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (id,employeeForm) => apply(id,employeeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 01:52:20 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/userupdate.scala.html
                  HASH: b38e2d391ebb270d8fa000d13a02fa420ff69333
                  MATRIX: 522->1|656->61|688->85|767->40|795->59|823->134|851->137|877->155|916->157|952->167|1242->431|1293->473|1333->475|1364->479|1406->495|1453->521|1484->525|1654->665|1683->667|1825->782|1840->788|1891->818|2248->1148|2263->1154|2314->1184|2790->1630
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|29->9|39->19|39->19|39->19|40->20|41->21|41->21|42->22|46->26|47->27|53->33|53->33|53->33|62->42|62->42|62->42|70->50
                  -- GENERATED --
              */
          