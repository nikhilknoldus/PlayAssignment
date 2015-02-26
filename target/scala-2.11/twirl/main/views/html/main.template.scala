
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(contentPassed: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<!-- Including all the js and css libraries here -->
   <head>
    
    <!-- Title of the page -->
    <title>"""),_display_(/*10.13*/title),format.raw/*10.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
 """),_display_(/*13.3*/scripts(title)),format.raw/*13.17*/("""
 """),_display_(/*14.3*/css(title)),format.raw/*14.13*/("""
 
 
 """),format.raw/*17.2*/("""</head>
    
    <body class="container">    
    <!-- This is content of the page that contains body -->
     	
   	"""),_display_(/*22.6*/header()),format.raw/*22.14*/("""
    """),_display_(/*23.6*/contentPassed),format.raw/*23.19*/("""
    """),_display_(/*24.6*/footer()),format.raw/*24.14*/("""
    """),format.raw/*25.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,contentPassed:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(contentPassed)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (contentPassed) => apply(title)(contentPassed)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 13:14:20 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/main.scala.html
                  HASH: 348108e9046c9c6fbac29f7e3d5099535843f54d
                  MATRIX: 509->1|633->37|661->39|823->174|849->179|961->265|996->279|1025->282|1056->292|1089->298|1233->416|1262->424|1294->430|1328->443|1360->449|1389->457|1421->462
                  LINES: 19->1|22->1|24->3|31->10|31->10|34->13|34->13|35->14|35->14|38->17|43->22|43->22|44->23|44->23|45->24|45->24|46->25
                  -- GENERATED --
              */
          