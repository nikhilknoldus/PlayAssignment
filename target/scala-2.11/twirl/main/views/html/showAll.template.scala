
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



"""),format.raw/*7.1*/("""



"""),format.raw/*11.1*/("""<!-- Body tag that contains the page body -->
"""),_display_(/*12.2*/main("showAll")/*12.17*/{_display_(Seq[Any](format.raw/*12.18*/("""

"""),format.raw/*14.1*/("""<div data-ng-app="" class="data-ng-controller= "MyController">
	<div>
	
	"""),_display_(/*17.3*/flash/*17.8*/.get("success").map/*17.27*/ { message =>_display_(Seq[Any](format.raw/*17.40*/("""
			"""),format.raw/*18.4*/("""<div class="alert alert-dismissable alert-success">
				<button type="button" class="close" data-dismiss="alert">X</button>
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
					<th><a data-ng-click="sort='gender'" href="#">Address</a></th>
					<th><a data-ng-click="sort='email'" href="#">Company</a></th>
					<th><a data-ng-click="sort='email'" href="#">Email</a></th>
					<th><a data-ng-click="sort='phone'" href="#">Phone</a></th>
					<th><a data-ng-click="sort='phone'" href="#">Created</a></th>
					<th><a data-ng-click="sort='delete'" href="#">Delete Record </a></th>
					<th><a data-ng-click="sort='update'" href="#">Update Record</a></th>
					
				</tr>
				<tr>
					"""),_display_(/*41.7*/for(x<-param) yield /*41.20*/{_display_(Seq[Any](format.raw/*41.21*/("""
					"""),format.raw/*42.6*/("""<td>"""),_display_(/*42.11*/x/*42.12*/.id),format.raw/*42.15*/("""</td>	
					<td>"""),_display_(/*43.11*/x/*43.12*/.name),format.raw/*43.17*/("""</td>	
					<td>"""),_display_(/*44.11*/x/*44.12*/.address),format.raw/*44.20*/("""</td>
					<td>"""),_display_(/*45.11*/x/*45.12*/.company),format.raw/*45.20*/("""</td>
					<td>"""),_display_(/*46.11*/x/*46.12*/.email),format.raw/*46.18*/("""</td>
					<td>"""),_display_(/*47.11*/x/*47.12*/.phone),format.raw/*47.18*/("""</td>
					<td>"""),_display_(/*48.11*/x/*48.12*/.created),format.raw/*48.20*/("""</td>
					
				
					<td><a href=""""),_display_(/*51.20*/routes/*51.26*/.Application.deleteEmp((x.id).get)),format.raw/*51.60*/(""""> 
					<button type="button" class="btn btn-default" aria-label="Left Align">
 						 <span class="glyphicon glyphicon-align-left" aria-hidden="true">X</span>
					</button>
					</a>
					</td>
					<td><a href="#"><span>
					<button class="btn btn-primary" type="button"><span class="badge">"""),_display_(/*58.73*/x/*58.74*/.name),format.raw/*58.79*/("""</span>
					</button></span></td>
					
				</tr>""")))}),format.raw/*61.11*/("""
				
				
			"""),format.raw/*64.4*/("""</table>
			<tr>
			<div><a href="/showAll?page="""),_display_(/*66.33*/(page-1)),format.raw/*66.41*/("""&search="""),_display_(/*66.50*/filter),format.raw/*66.56*/("""" class="btn btn-info col-md-2"  id="prev"><span class="glyphicon glyphicon-chevron-left"></span>Previous</a>
                <div class="col-md-8" align="center"><h3>"""),_display_(/*67.59*/(page+1)),format.raw/*67.67*/("""/"""),_display_(/*67.69*/(((total-1)/5)+1)),format.raw/*67.86*/("""</h3></div>
                <a href="/showAll?page="""),_display_(/*68.41*/(page+1)),format.raw/*68.49*/("""&search="""),_display_(/*68.58*/filter),format.raw/*68.64*/("""" class="btn btn-info col-md-2" id="next">Next<span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
			</tr>
		</div>
		<!-- Panel ends here -->
	</div>
</div>
""")))}),format.raw/*75.2*/("""

"""),format.raw/*77.1*/("""<!-- Body ends here -->"""))}
  }

  def render(param:List[Employee],page:Int,pagesize:Int,filter:String,total:Int,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(param,page,pagesize,filter,total)(flash)

  def f:((List[Employee],Int,Int,String,Int) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (param,page,pagesize,filter,total) => (flash) => apply(param,page,pagesize,filter,total)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 17:08:33 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/showAll.scala.html
                  HASH: 6a5817d9d29e1521656ef0cc55cd629413f78d7b
                  MATRIX: 553->2|768->108|798->134|829->138|902->185|926->200|965->201|994->203|1094->277|1107->282|1135->301|1186->314|1217->318|1401->475|1429->482|1460->486|1500->496|1530->499|2414->1357|2443->1370|2482->1371|2515->1377|2547->1382|2557->1383|2581->1386|2625->1403|2635->1404|2661->1409|2705->1426|2715->1427|2744->1435|2787->1451|2797->1452|2826->1460|2869->1476|2879->1477|2906->1483|2949->1499|2959->1500|2986->1506|3029->1522|3039->1523|3068->1531|3131->1567|3146->1573|3201->1607|3525->1904|3535->1905|3561->1910|3643->1961|3684->1975|3760->2024|3789->2032|3825->2041|3852->2047|4047->2215|4076->2223|4105->2225|4143->2242|4222->2294|4251->2302|4287->2311|4314->2317|4530->2503|4559->2505
                  LINES: 19->2|22->2|26->7|30->11|31->12|31->12|31->12|33->14|36->17|36->17|36->17|36->17|37->18|39->20|39->20|40->21|41->22|42->23|60->41|60->41|60->41|61->42|61->42|61->42|61->42|62->43|62->43|62->43|63->44|63->44|63->44|64->45|64->45|64->45|65->46|65->46|65->46|66->47|66->47|66->47|67->48|67->48|67->48|70->51|70->51|70->51|77->58|77->58|77->58|80->61|83->64|85->66|85->66|85->66|85->66|86->67|86->67|86->67|86->67|87->68|87->68|87->68|87->68|94->75|96->77
                  -- GENERATED --
              */
          