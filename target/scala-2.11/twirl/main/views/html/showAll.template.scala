
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
object showAll extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[List[Employee],Int,Int,String,Int,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(param: List[Employee], page:Int,pagesize:Int,filter:String,total:Int)(implicit flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import models.Models

Seq[Any](format.raw/*2.108*/("""
"""),_display_(/*3.2*/param),format.raw/*3.7*/("""


"""),format.raw/*7.1*/("""



"""),format.raw/*11.1*/("""<!-- Body tag that contains the page body -->
"""),_display_(/*12.2*/main("showAll")/*12.17*/{_display_(Seq[Any](format.raw/*12.18*/("""

"""),format.raw/*14.1*/("""<div data-ng-app="" class="data-ng-controller= "MyController">
	<div>
	
	"""),_display_(/*17.3*/flash/*17.8*/.get("success").map/*17.27*/ { message =>_display_(Seq[Any](format.raw/*17.40*/("""
			"""),format.raw/*18.4*/("""<div class="alert alert-dismissable alert-success">
				<button type="button" class="close" data-dismiss="alert">×</button>
				<strong>Well done!</strong> """),_display_(/*20.34*/message),format.raw/*20.41*/("""
			"""),format.raw/*21.4*/("""</div>
		""")))}),format.raw/*22.4*/("""
		"""),format.raw/*23.3*/("""<!-- Created a panel that contains a table with some static data -->
		<div class="panel">
			<table class="table table-striped">
				<div style="background-color: skyblue" class="panel-heading">Employee</div>
				
				<tr>
					<th><a data-ng-click="sort='id'" href="#">ID</a></th>
					<th><a data-ng-click="sort='name'" href="#">Name</a></th>
							<th><a data-ng-click="sort='email'" href="#">Password</a></th>
					<th><a data-ng-click="sort='gender'" href="#">Address</a></th>
					<th><a data-ng-click="sort='email'" href="#">Company</a></th>
					<th><a data-ng-click="sort='email'" href="#">Email</a></th>
					<th><a data-ng-click="sort='phone'" href="#">Phone</a></th>
					<th><a data-ng-click="sort='phone'" href="#">Created</a></th>
					<th><a data-ng-click="sort='phone'" href="#">Updated</a></th>
					<th><a data-ng-click="sort='phone'" href="#">UserType</a></th>
					<th><a data-ng-click="sort='delete'" href="#">Delete Record </a></th>
					<th><a data-ng-click="sort='update'" href="#">Update Record</a></th>
					
				</tr>
				<tr>
					"""),_display_(/*44.7*/for(x<-param) yield /*44.20*/{_display_(Seq[Any](format.raw/*44.21*/("""
					"""),format.raw/*45.6*/("""<td>"""),_display_(/*45.11*/x/*45.12*/.id),format.raw/*45.15*/("""</td>	
					<td>"""),_display_(/*46.11*/x/*46.12*/.name),format.raw/*46.17*/("""</td>
					<td>"""),_display_(/*47.11*/x/*47.12*/.password),format.raw/*47.21*/("""</td>	
					<td>"""),_display_(/*48.11*/x/*48.12*/.address),format.raw/*48.20*/("""</td>
					<td>"""),_display_(/*49.11*/x/*49.12*/.company),format.raw/*49.20*/("""</td>
					<td>"""),_display_(/*50.11*/x/*50.12*/.email),format.raw/*50.18*/("""</td>
					<td>"""),_display_(/*51.11*/x/*51.12*/.phone),format.raw/*51.18*/("""</td>
					<td>"""),_display_(/*52.11*/x/*52.12*/.created),format.raw/*52.20*/("""</td>
					<td>"""),_display_(/*53.11*/x/*53.12*/.updated),format.raw/*53.20*/("""</td>
					<td>"""),_display_(/*54.11*/x/*54.12*/.user_type),format.raw/*54.22*/("""</td>
					
				
					<td><a href=""""),_display_(/*57.20*/routes/*57.26*/.Application.deleteEmp((x.id).get)),format.raw/*57.60*/(""""> 
					<button type="button" class="btn btn-default" aria-label="Left Align">
 						 <span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
					</button>
					</a>
					</td>
					<td><a href="#"><span>
					<button class="btn btn-primary" type="button"><span class="badge">"""),_display_(/*64.73*/x/*64.74*/.name),format.raw/*64.79*/("""</span>
					</button></span></td>
					
				</tr>""")))}),format.raw/*67.11*/("""
				
				
			"""),format.raw/*70.4*/("""</table>
			<tr>
			<div><a href="/showAll?page="""),_display_(/*72.33*/(page-1)),format.raw/*72.41*/("""&search="""),_display_(/*72.50*/filter),format.raw/*72.56*/("""" class="btn btn-info col-md-2"  id="prev"><span class="glyphicon glyphicon-chevron-left"></span>Previous</a>
                <div class="col-md-8" align="center"><h3>"""),_display_(/*73.59*/(page+1)),format.raw/*73.67*/("""/"""),_display_(/*73.69*/(((total-1)/5)+1)),format.raw/*73.86*/("""</h3></div>
                <a href="/showAll?page="""),_display_(/*74.41*/(page+1)),format.raw/*74.49*/("""&search="""),_display_(/*74.58*/filter),format.raw/*74.64*/("""" class="btn btn-info col-md-2" id="next">Next<span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
			</tr>
		</div>
		<!-- Panel ends here -->
	</div>
</div>
""")))}),format.raw/*81.2*/("""

"""),format.raw/*83.1*/("""<!-- Body ends here -->"""))}
  }

  def render(param:List[Employee],page:Int,pagesize:Int,filter:String,total:Int,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(param,page,pagesize,filter,total)(flash)

  def f:((List[Employee],Int,Int,String,Int) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (param,page,pagesize,filter,total) => (flash) => apply(param,page,pagesize,filter,total)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 01:55:41 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/showAll.scala.html
                  HASH: 0a743a60e526b7883b95283d95635bdad6bd785e
                  MATRIX: 553->2|768->108|795->110|819->115|848->140|879->144|952->191|976->206|1015->207|1044->209|1144->283|1157->288|1185->307|1236->320|1267->324|1451->481|1479->488|1510->492|1550->502|1580->505|2669->1568|2698->1581|2737->1582|2770->1588|2802->1593|2812->1594|2836->1597|2880->1614|2890->1615|2916->1620|2959->1636|2969->1637|2999->1646|3043->1663|3053->1664|3082->1672|3125->1688|3135->1689|3164->1697|3207->1713|3217->1714|3244->1720|3287->1736|3297->1737|3324->1743|3367->1759|3377->1760|3406->1768|3449->1784|3459->1785|3488->1793|3531->1809|3541->1810|3572->1820|3635->1856|3650->1862|3705->1896|4028->2192|4038->2193|4064->2198|4146->2249|4187->2263|4263->2312|4292->2320|4328->2329|4355->2335|4550->2503|4579->2511|4608->2513|4646->2530|4725->2582|4754->2590|4790->2599|4817->2605|5033->2791|5062->2793
                  LINES: 19->2|22->2|23->3|23->3|26->7|30->11|31->12|31->12|31->12|33->14|36->17|36->17|36->17|36->17|37->18|39->20|39->20|40->21|41->22|42->23|63->44|63->44|63->44|64->45|64->45|64->45|64->45|65->46|65->46|65->46|66->47|66->47|66->47|67->48|67->48|67->48|68->49|68->49|68->49|69->50|69->50|69->50|70->51|70->51|70->51|71->52|71->52|71->52|72->53|72->53|72->53|73->54|73->54|73->54|76->57|76->57|76->57|83->64|83->64|83->64|86->67|89->70|91->72|91->72|91->72|91->72|92->73|92->73|92->73|92->73|93->74|93->74|93->74|93->74|100->81|102->83
                  -- GENERATED --
              */
          