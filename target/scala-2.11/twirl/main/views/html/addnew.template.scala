
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
import helper._
/**/
object addnew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(employeeForm : Form[Employee]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f)}};
Seq[Any](format.raw/*4.33*/("""

"""),format.raw/*6.74*/("""

"""),_display_(/*8.2*/main("addnew")/*8.16*/{_display_(Seq[Any](format.raw/*8.17*/("""
"""),format.raw/*9.1*/("""<div>
	<style type="text/css">
		.panelbackground"""),format.raw/*11.19*/("""{"""),format.raw/*11.20*/("""
						"""),format.raw/*12.7*/("""background-color: black;
						"""),format.raw/*13.7*/("""}"""),format.raw/*13.8*/("""
	"""),format.raw/*14.2*/("""</style>
	
	<div class="col-sm-6 col-xs-8 col-dm-6">
		<div class="panel panel-primary">
  			<div class="panelbackground panel-heading">New Registration</div>
  				<div class="panel-body">
					"""),_display_(/*20.7*/form(routes.Application.insert())/*20.40*/{_display_(Seq[Any](format.raw/*20.41*/("""
         			"""),format.raw/*21.13*/("""<fieldset>"""),_display_(/*21.24*/formElements(employeeForm)),format.raw/*21.50*/("""</fieldset>         
                     <div class="actions">
                        <input type="submit" value="Register" class="btn btn-primary"> or
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.Application.index),format.raw/*24.59*/("""" class="btn btn-default">Cancel</a>
               		</div>
          			""")))}),format.raw/*26.15*/("""
				""")))}),format.raw/*27.6*/("""
 				"""),format.raw/*28.6*/("""</div>
 		</div>
 	</div>
 	<div class="col-sm-6 col-xs-4 col-dm-6">
 	
 	<div class="thumbnail">
 	
      <img src='"""),_display_(/*35.18*/routes/*35.24*/.Assets.at("images/img_1.png")),format.raw/*35.54*/("""' alt="...">
      <div class="caption">
        <h3>Register with us for opportunities</h3>
        <p><a href="#" class="btn btn-primary" role="button">Contribute</a> <a href="#" class="btn btn-default" role="button">Share</a></p>
      </div>
    </div>
    
 	<div class="thumbnail">
      <img src='"""),_display_(/*43.18*/routes/*43.24*/.Assets.at("images/img_2.jpg")),format.raw/*43.54*/("""' alt="...">
      <div class="caption">
        <h3>Knowledge Tree</h3>
        <p></p>
        <p><a href="#" class="btn btn-primary" role="button">Grow the tree of knowledge</a> <a href="#" class="btn btn-default" role="button">Share</a></p>
      </div>
    </div>
    
 	<div class="thumbnail">
      <img src="..." alt="...">
      <div class="caption">
        <h3>Thumbnail label</h3>
        <p>...</p>
        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
      </div>
    </div>   
  </div> 	
 </div>


"""))}
  }

  def render(employeeForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm)

  def f:((Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm) => apply(employeeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 19:25:47 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/addnew.scala.html
                  HASH: 7de6759cd382311ecc3ce11a6cc009a43c2de16b
                  MATRIX: 529->46|640->80|672->104|750->77|779->152|807->155|829->169|867->170|894->171|971->220|1000->221|1034->228|1092->259|1120->260|1149->262|1372->459|1414->492|1453->493|1494->506|1532->517|1579->543|1794->731|1809->737|1848->755|1954->830|1990->836|2023->842|2168->960|2183->966|2234->996|2566->1301|2581->1307|2632->1337
                  LINES: 19->4|21->6|21->6|22->4|24->6|26->8|26->8|26->8|27->9|29->11|29->11|30->12|31->13|31->13|32->14|38->20|38->20|38->20|39->21|39->21|39->21|42->24|42->24|42->24|44->26|45->27|46->28|53->35|53->35|53->35|61->43|61->43|61->43
                  -- GENERATED --
              */
          