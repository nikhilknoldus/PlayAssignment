
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
 	    
    <div class="panel-group" id="accordion">
   <div class="panel panel-default">
      <div class="panel-heading">
         <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" 
               href="#collapseOne">
            Latest Technology Trends
            </a>
         </h4>
      </div>
      <div id="collapseOne" class="panel-collapse collapse in">
         <div class="panel-body">
            Knoldus strongly believes in strongly sharing knowledge. We conduct knowledge sessions every week.
         </div>
      </div>
   </div>
   <div class="panel panel-success">
      <div class="panel-heading">
         <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" 
               href="#collapseTwo">
              Live Demos
            </a>
         </h4>
      </div>
      <div id="collapseTwo" class="panel-collapse collapse">
         <div class="panel-body">
           Theory does not work every time, so in every session live practicals takes place
         </div>
      </div>
   </div>
   <div class="panel panel-info">
      <div class="panel-heading">
         <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" 
               href="#collapseThree">
               Developers
            </a>
         </h4>
      </div>
      <div id="collapseThree" class="panel-collapse collapse">
         <div class="panel-body">
          Developer & Designers share their hard earned experience in session
         </div>
      </div>
   </div>
   <div class="panel panel-warning">
      <div class="panel-heading">
         <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" 
               href="#collapseFour">
              You can be a part 
            </a>
         </h4>
      </div>
      <div id="collapseFour" class="panel-collapse collapse">
         <div class="panel-body">
           If you want to share your experience, you are most welcomed
         </div>
      </div>
   </div>
</div>
<script type="text/javascript">
	$(function() """),format.raw/*96.15*/("""{"""),format.raw/*96.16*/("""
		"""),format.raw/*97.3*/("""$('#collapseFour').collapse("""),format.raw/*97.31*/("""{"""),format.raw/*97.32*/("""
			"""),format.raw/*98.4*/("""toggle : false
		"""),format.raw/*99.3*/("""}"""),format.raw/*99.4*/(""")
	"""),format.raw/*100.2*/("""}"""),format.raw/*100.3*/(""");
	$(function() """),format.raw/*101.15*/("""{"""),format.raw/*101.16*/("""
		"""),format.raw/*102.3*/("""$('#collapseTwo').collapse('show')
	"""),format.raw/*103.2*/("""}"""),format.raw/*103.3*/(""");
	$(function() """),format.raw/*104.15*/("""{"""),format.raw/*104.16*/("""
		"""),format.raw/*105.3*/("""$('#collapseThree').collapse('toggle')
	"""),format.raw/*106.2*/("""}"""),format.raw/*106.3*/(""");
	$(function() """),format.raw/*107.15*/("""{"""),format.raw/*107.16*/("""
		"""),format.raw/*108.3*/("""$('#collapseOne').collapse('hide')
	"""),format.raw/*109.2*/("""}"""),format.raw/*109.3*/(""");
</script>  
    
 
 	<div class="thumbnail">	
      <img src='"""),_display_(/*114.18*/routes/*114.24*/.Assets.at("images/img_1.png")),format.raw/*114.54*/("""' alt="...">
      <div class="caption">
  			<h4 align="center"><span>We always welcome talent </span></h4>
       		 <p align="center"><a href="#" class="btn btn-primary" role="button">Contribute</a> <a href="#" class="btn btn-default" role="button">Share</a></p>
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
                  DATE: Fri Feb 27 01:09:58 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/addnew.scala.html
                  HASH: 4bdccfd343ef68805fa0dab7daea1387b48dc465
                  MATRIX: 529->46|640->80|672->104|750->77|779->152|807->155|829->169|867->170|894->171|971->220|1000->221|1034->228|1092->259|1120->260|1149->262|1372->459|1414->492|1453->493|1494->506|1532->517|1579->543|1794->731|1809->737|1848->755|1954->830|1990->836|2023->842|4240->3031|4269->3032|4299->3035|4355->3063|4384->3064|4415->3068|4459->3085|4487->3086|4518->3089|4547->3090|4593->3107|4623->3108|4654->3111|4718->3147|4747->3148|4793->3165|4823->3166|4854->3169|4922->3209|4951->3210|4997->3227|5027->3228|5058->3231|5122->3267|5151->3268|5245->3334|5261->3340|5313->3370
                  LINES: 19->4|21->6|21->6|22->4|24->6|26->8|26->8|26->8|27->9|29->11|29->11|30->12|31->13|31->13|32->14|38->20|38->20|38->20|39->21|39->21|39->21|42->24|42->24|42->24|44->26|45->27|46->28|114->96|114->96|115->97|115->97|115->97|116->98|117->99|117->99|118->100|118->100|119->101|119->101|120->102|121->103|121->103|122->104|122->104|123->105|124->106|124->106|125->107|125->107|126->108|127->109|127->109|132->114|132->114|132->114
                  -- GENERATED --
              */
          