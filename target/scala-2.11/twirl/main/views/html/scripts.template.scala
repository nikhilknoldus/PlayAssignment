
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

/* scripts Template File */
object scripts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* scripts Template File */
  def apply/*2.2*/(param: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.17*/("""


"""),_display_(/*5.2*/param/*5.7*/ match/*5.13*/{/*6.2*/case "index"=>/*6.16*/{_display_(Seq[Any](format.raw/*6.17*/("""
"""),format.raw/*7.1*/("""<script src= """"),_display_(/*7.16*/routes/*7.22*/.Assets.at("javascripts/jquery.js")),format.raw/*7.57*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*8.63*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.at("javascripts/angular.min.js")),format.raw/*9.61*/("""" type="text/javascript"></script>			
<script src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.at("javascripts/script.js")),format.raw/*10.56*/("""" type="text/javascript"></script>
   """)))}/*13.4*/case "addnew"=>/*13.19*/{_display_(Seq[Any](format.raw/*13.20*/("""
"""),format.raw/*14.1*/("""<script src= """"),_display_(/*14.16*/routes/*14.22*/.Assets.at("javascripts/jquery.js")),format.raw/*14.57*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*15.63*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.at("javascripts/angular.min.js")),format.raw/*16.61*/("""" type="text/javascript"></script>			
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("javascripts/script.js")),format.raw/*17.56*/("""" type="text/javascript"></script>
   """)))}/*20.4*/case "showAll" =>/*20.21*/ {_display_(Seq[Any](format.raw/*20.23*/("""
   	"""),format.raw/*21.5*/("""<script src= """"),_display_(/*21.20*/routes/*21.26*/.Assets.at("javascripts/jquery.js")),format.raw/*21.61*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*22.15*/routes/*22.21*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*22.63*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*23.15*/routes/*23.21*/.Assets.at("javascripts/angular.min.js")),format.raw/*23.61*/("""" type="text/javascript"></script>			
<script src=""""),_display_(/*24.15*/routes/*24.21*/.Assets.at("javascripts/script.js")),format.raw/*24.56*/("""" type="text/javascript"></script>
""")))}/*27.1*/case _ =>/*27.10*/ {_display_(Seq[Any](format.raw/*27.12*/("""<script src= """"),_display_(/*27.27*/routes/*27.33*/.Assets.at("javascripts/jquery.js")),format.raw/*27.68*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*28.15*/routes/*28.21*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*28.63*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*29.15*/routes/*29.21*/.Assets.at("javascripts/angular.min.js")),format.raw/*29.61*/("""" type="text/javascript"></script>			
<script src=""""),_display_(/*30.15*/routes/*30.21*/.Assets.at("javascripts/script.js")),format.raw/*30.56*/("""" type="text/javascript"></script>
   	
   """)))}}))}
  }

  def render(param:String): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 12:28:34 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/scripts.scala.html
                  HASH: 334bc06eb52fd6c653fbadba3d05a02e34436268
                  MATRIX: 553->29|656->44|685->48|697->53|711->59|719->62|741->76|779->77|806->78|847->93|861->99|916->134|991->183|1005->189|1067->231|1142->280|1156->286|1216->326|1295->378|1310->384|1366->419|1423->466|1447->481|1486->482|1514->483|1556->498|1571->504|1627->539|1703->588|1718->594|1781->636|1857->685|1872->691|1933->731|2012->783|2027->789|2083->824|2140->871|2166->888|2206->890|2238->895|2280->910|2295->916|2351->951|2427->1000|2442->1006|2505->1048|2581->1097|2596->1103|2657->1143|2736->1195|2751->1201|2807->1236|2861->1274|2879->1283|2919->1285|2961->1300|2976->1306|3032->1341|3108->1390|3123->1396|3186->1438|3262->1487|3277->1493|3338->1533|3417->1585|3432->1591|3488->1626
                  LINES: 19->2|22->2|25->5|25->5|25->5|25->6|25->6|25->6|26->7|26->7|26->7|26->7|27->8|27->8|27->8|28->9|28->9|28->9|29->10|29->10|29->10|30->13|30->13|30->13|31->14|31->14|31->14|31->14|32->15|32->15|32->15|33->16|33->16|33->16|34->17|34->17|34->17|35->20|35->20|35->20|36->21|36->21|36->21|36->21|37->22|37->22|37->22|38->23|38->23|38->23|39->24|39->24|39->24|40->27|40->27|40->27|40->27|40->27|40->27|41->28|41->28|41->28|42->29|42->29|42->29|43->30|43->30|43->30
                  -- GENERATED --
              */
          