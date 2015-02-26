
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

/* css Template File */
object css extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* css Template File */
  def apply/*2.2*/(param: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.17*/("""


"""),_display_(/*5.2*/param/*5.7*/ match/*5.13*/ {/*6.2*/case "index" =>/*6.17*/{_display_(Seq[Any](format.raw/*6.18*/("""
 """),format.raw/*7.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*7.47*/routes/*7.53*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*7.92*/(""""> 
<link rel="stylesheet" media="screen" href=""""),_display_(/*8.46*/routes/*8.52*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*8.95*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*9.46*/routes/*9.52*/.Assets.at("stylesheets/bootstrap-theme.min.css")),format.raw/*9.101*/("""">
""")))}/*11.2*/case "addnew" =>/*11.18*/{_display_(Seq[Any](format.raw/*11.19*/("""
 """),format.raw/*12.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*12.47*/routes/*12.53*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*12.92*/(""""> 
<link rel="stylesheet" media="screen" href=""""),_display_(/*13.46*/routes/*13.52*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*13.95*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*14.46*/routes/*14.52*/.Assets.at("stylesheets/bootstrap-theme.min.css")),format.raw/*14.101*/("""">
""")))}/*16.1*/case "showAll" =>/*16.18*/{_display_(Seq[Any](format.raw/*16.19*/("""
	"""),format.raw/*17.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*17.47*/routes/*17.53*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*17.92*/(""""> 
<link rel="stylesheet" media="screen" href=""""),_display_(/*18.46*/routes/*18.52*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*18.95*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*19.46*/routes/*19.52*/.Assets.at("stylesheets/bootstrap-theme.min.css")),format.raw/*19.101*/("""">
""")))}/*22.1*/case _ =>/*22.10*/{_display_(Seq[Any](format.raw/*22.11*/("""
	"""),format.raw/*23.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*23.47*/routes/*23.53*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*23.92*/(""""> 
<link rel="stylesheet" media="screen" href=""""),_display_(/*24.46*/routes/*24.52*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*24.95*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*25.46*/routes/*25.52*/.Assets.at("stylesheets/bootstrap-theme.min.css")),format.raw/*25.101*/("""">""")))}}))}
  }

  def render(param:String): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 12:28:34 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/css.scala.html
                  HASH: 7e88108d15b591ad91425654119d3f0a46893bff
                  MATRIX: 541->25|644->40|673->44|685->49|699->55|708->59|731->74|769->75|797->77|868->122|882->128|941->167|1016->216|1030->222|1093->265|1167->313|1181->319|1251->368|1273->374|1298->390|1337->391|1366->393|1438->438|1453->444|1513->483|1589->532|1604->538|1668->581|1743->629|1758->635|1829->684|1851->689|1877->706|1916->707|1945->709|2017->754|2032->760|2092->799|2168->848|2183->854|2247->897|2322->945|2337->951|2408->1000|2430->1006|2448->1015|2487->1016|2516->1018|2588->1063|2603->1069|2663->1108|2739->1157|2754->1163|2818->1206|2893->1254|2908->1260|2979->1309
                  LINES: 19->2|22->2|25->5|25->5|25->5|25->6|25->6|25->6|26->7|26->7|26->7|26->7|27->8|27->8|27->8|28->9|28->9|28->9|29->11|29->11|29->11|30->12|30->12|30->12|30->12|31->13|31->13|31->13|32->14|32->14|32->14|33->16|33->16|33->16|34->17|34->17|34->17|34->17|35->18|35->18|35->18|36->19|36->19|36->19|37->22|37->22|37->22|38->23|38->23|38->23|38->23|39->24|39->24|39->24|40->25|40->25|40->25
                  -- GENERATED --
              */
          