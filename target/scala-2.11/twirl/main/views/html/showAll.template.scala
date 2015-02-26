
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
					"""),_display_(/*52.7*/for(x<-param) yield /*52.20*/{_display_(Seq[Any](format.raw/*52.21*/("""
					"""),format.raw/*53.6*/("""<td>"""),_display_(/*53.11*/x/*53.12*/.id),format.raw/*53.15*/("""</td>	
					<td>"""),_display_(/*54.11*/x/*54.12*/.name),format.raw/*54.17*/("""</td>
					<td>"""),_display_(/*55.11*/x/*55.12*/.password),format.raw/*55.21*/("""</td>	
					<td>"""),_display_(/*56.11*/x/*56.12*/.address),format.raw/*56.20*/("""</td>
					<td>"""),_display_(/*57.11*/x/*57.12*/.company),format.raw/*57.20*/("""</td>
					<td>"""),_display_(/*58.11*/x/*58.12*/.email),format.raw/*58.18*/("""</td>
					<td>"""),_display_(/*59.11*/x/*59.12*/.phone),format.raw/*59.18*/("""</td>
					<td>"""),_display_(/*60.11*/x/*60.12*/.created),format.raw/*60.20*/("""</td>
					<td>"""),_display_(/*61.11*/x/*61.12*/.updated),format.raw/*61.20*/("""</td>
					<td>"""),_display_(/*62.11*/x/*62.12*/.user_type),format.raw/*62.22*/("""</td>
					
				
					<td><a href=""""),_display_(/*65.20*/routes/*65.26*/.Application.deleteEmp((x.id).get)),format.raw/*65.60*/(""""> 
					<button type="button" class="btn btn-default" aria-label="Left Align">
  <span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
</button></a>
					</td>
					
					<td><a href="#"><span>
					<button class="btn btn-primary" type="button"><span class="badge">"""),_display_(/*72.73*/x/*72.74*/.name),format.raw/*72.79*/("""</span>
					</button></span></td>
					
				</tr>""")))}),format.raw/*75.11*/("""
				
				
			"""),format.raw/*78.4*/("""</table>
			<tr>
			<div><a href="/showAll?page="""),_display_(/*80.33*/(page-1)),format.raw/*80.41*/("""&search="""),_display_(/*80.50*/filter),format.raw/*80.56*/("""" class="btn btn-info col-md-2"  id="prev"><span class="glyphicon glyphicon-chevron-left"></span>Previous</a>
                <div class="col-md-8" align="center"><h3>"""),_display_(/*81.59*/(page+1)),format.raw/*81.67*/("""/"""),_display_(/*81.69*/(((total-1)/5)+1)),format.raw/*81.86*/("""</h3></div>
                <a href="/showAll?page="""),_display_(/*82.41*/(page+1)),format.raw/*82.49*/("""&search="""),_display_(/*82.58*/filter),format.raw/*82.64*/("""" class="btn btn-info col-md-2" id="next">Next<span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
			</tr>
			
			
			
					</div>
		<!-- Panel ends here -->
	</div>
</div>
""")))}),format.raw/*92.2*/("""

"""),format.raw/*94.1*/("""<!-- Body ends here -->"""))}
  }

  def render(param:List[Employee],page:Int,pagesize:Int,filter:String,total:Int,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(param,page,pagesize,filter,total)(flash)

  def f:((List[Employee],Int,Int,String,Int) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (param,page,pagesize,filter,total) => (flash) => apply(param,page,pagesize,filter,total)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 16:13:38 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/showAll.scala.html
                  HASH: f24e76f1abc27a251875c25d2077039ab5ab230d
                  MATRIX: 553->2|768->108|795->110|819->115|848->140|879->144|952->191|976->206|1015->207|1044->209|1144->283|1157->288|1185->307|1236->320|1267->324|1451->481|1479->488|1510->492|1550->502|1580->505|2707->1606|2736->1619|2775->1620|2808->1626|2840->1631|2850->1632|2874->1635|2918->1652|2928->1653|2954->1658|2997->1674|3007->1675|3037->1684|3081->1701|3091->1702|3120->1710|3163->1726|3173->1727|3202->1735|3245->1751|3255->1752|3282->1758|3325->1774|3335->1775|3362->1781|3405->1797|3415->1798|3444->1806|3487->1822|3497->1823|3526->1831|3569->1847|3579->1848|3610->1858|3673->1894|3688->1900|3743->1934|4055->2219|4065->2220|4091->2225|4173->2276|4214->2290|4290->2339|4319->2347|4355->2356|4382->2362|4577->2530|4606->2538|4635->2540|4673->2557|4752->2609|4781->2617|4817->2626|4844->2632|5075->2833|5104->2835
                  LINES: 19->2|22->2|23->3|23->3|26->7|30->11|31->12|31->12|31->12|33->14|36->17|36->17|36->17|36->17|37->18|39->20|39->20|40->21|41->22|42->23|71->52|71->52|71->52|72->53|72->53|72->53|72->53|73->54|73->54|73->54|74->55|74->55|74->55|75->56|75->56|75->56|76->57|76->57|76->57|77->58|77->58|77->58|78->59|78->59|78->59|79->60|79->60|79->60|80->61|80->61|80->61|81->62|81->62|81->62|84->65|84->65|84->65|91->72|91->72|91->72|94->75|97->78|99->80|99->80|99->80|99->80|100->81|100->81|100->81|100->81|101->82|101->82|101->82|101->82|111->92|113->94
                  -- GENERATED --
              */
          