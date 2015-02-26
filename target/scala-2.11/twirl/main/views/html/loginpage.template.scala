
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
object loginpage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(formData:Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f)}};
Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.74*/("""

"""),_display_(/*7.2*/main("loginpage")/*7.19*/{_display_(Seq[Any](format.raw/*7.20*/("""
"""),format.raw/*8.1*/("""<style>
.bs-example """),format.raw/*9.13*/("""{"""),format.raw/*9.14*/("""
	"""),format.raw/*10.2*/("""margin: 20px;

	/* Fix alignment issue of label on extra small devices in Bootstrap 3.2 */
	.
	form-horizontal
	.control-label"""),format.raw/*15.16*/("""{"""),format.raw/*15.17*/("""
	"""),format.raw/*16.2*/("""padding-top
	:
	7px;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
"""),format.raw/*21.1*/(""".custom_class """),format.raw/*21.15*/("""{"""),format.raw/*21.16*/("""
	"""),format.raw/*22.2*/("""background-color: black !important;
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""
"""),format.raw/*24.1*/("""</style>
<style>

/* make sidebar nav vertical */
.sidebar-nav .navbar ul """),format.raw/*28.25*/("""{"""),format.raw/*28.26*/("""
	"""),format.raw/*29.2*/("""float: none;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""

"""),format.raw/*32.1*/(""".sidebar-nav .navbar ul:not """),format.raw/*32.29*/("""{"""),format.raw/*32.30*/("""
	"""),format.raw/*33.2*/("""display: block;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""

"""),format.raw/*36.1*/(""".sidebar-nav .navbar li """),format.raw/*36.25*/("""{"""),format.raw/*36.26*/("""
	"""),format.raw/*37.2*/("""float: none;
	display: block;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""

"""),format.raw/*41.1*/(""".sidebar-nav .navbar li a """),format.raw/*41.27*/("""{"""),format.raw/*41.28*/("""
	"""),format.raw/*42.2*/("""padding-top: 12px;
	padding-bottom: 12px;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/(""".roundedcorner """),format.raw/*46.16*/("""{"""),format.raw/*46.17*/("""
	"""),format.raw/*47.2*/("""border-radius: 20px;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

"""),format.raw/*50.1*/(""".topmargin """),format.raw/*50.12*/("""{"""),format.raw/*50.13*/("""
	"""),format.raw/*51.2*/("""margin-top: 0%;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""
"""),format.raw/*53.1*/("""</style>

</head>

<!-- Container starts here in the Body -->


<div class="row roundedcorner topmargin"
	style="background-color: black;">
	<div class="col-sm-8 col-xs-9 col-md-8">
		<br> 
		"""),_display_(/*64.4*/form(routes.Application.checklogin)/*64.39*/{_display_(Seq[Any](format.raw/*64.40*/("""
		
		"""),format.raw/*66.3*/("""<div class="form-group">
			<div class="col-dm-12 col-sm-12 col-xs-12">
				"""),_display_(/*68.6*/inputText(formData("email"), '_label -> "Email",'class -> "form-control")),format.raw/*68.79*/("""
				"""),format.raw/*69.5*/("""<span
					class="glyphicon glyphicon-envelope form-control-feedback"></span>
			</div>
		</div>
		<div class="form-group">
			<div class="col-dm-12 col-sm-12 col-xs-12">
				"""),_display_(/*75.6*/inputText(formData("password"), '_label -> "Password",'class -> "form-control")),format.raw/*75.85*/(""" """),format.raw/*75.86*/("""<span
					class="glyphicon glyphicon-asterisk form-control-feedback"></span>
			</div>
		</div>
		<button type="submit" class="btn btn-default">Login</button>
		""")))}),format.raw/*80.4*/("""

	"""),format.raw/*82.2*/("""</div>
</div>
""")))}))}
  }

  def render(formData:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(formData)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (formData) => apply(formData)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 12:29:21 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/loginpage.scala.html
                  HASH: 5ae50776615e7f3929af5a4211ebbe44c24e0d54
                  MATRIX: 529->19|631->44|663->68|741->41|770->116|798->119|823->136|861->137|888->138|935->158|963->159|992->161|1146->287|1175->288|1204->290|1252->311|1280->312|1308->313|1336->314|1364->315|1406->329|1435->330|1464->332|1527->368|1555->369|1583->370|1685->444|1714->445|1743->447|1783->460|1811->461|1840->463|1896->491|1925->492|1954->494|1997->510|2025->511|2054->513|2106->537|2135->538|2164->540|2221->570|2249->571|2278->573|2332->599|2361->600|2390->602|2459->644|2487->645|2516->647|2559->662|2588->663|2617->665|2665->686|2693->687|2722->689|2761->700|2790->701|2819->703|2862->719|2890->720|2918->721|3137->914|3181->949|3220->950|3253->956|3356->1033|3450->1106|3482->1111|3684->1287|3784->1366|3813->1367|4006->1530|4036->1533
                  LINES: 19->3|21->5|21->5|22->3|24->5|26->7|26->7|26->7|27->8|28->9|28->9|29->10|34->15|34->15|35->16|38->19|38->19|39->20|39->20|40->21|40->21|40->21|41->22|42->23|42->23|43->24|47->28|47->28|48->29|49->30|49->30|51->32|51->32|51->32|52->33|53->34|53->34|55->36|55->36|55->36|56->37|58->39|58->39|60->41|60->41|60->41|61->42|63->44|63->44|65->46|65->46|65->46|66->47|67->48|67->48|69->50|69->50|69->50|70->51|71->52|71->52|72->53|83->64|83->64|83->64|85->66|87->68|87->68|88->69|94->75|94->75|94->75|99->80|101->82
                  -- GENERATED --
              */
          