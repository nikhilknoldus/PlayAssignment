
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
object usermain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

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
     	
   	"""),_display_(/*22.6*/userheader()),format.raw/*22.18*/("""
    """),_display_(/*23.6*/contentPassed),format.raw/*23.19*/("""
    """),_display_(/*24.6*/footer()),format.raw/*24.14*/("""
    """),format.raw/*25.5*/("""</body>
</html>ll
"""))}
  }

  def render(title:String,contentPassed:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(contentPassed)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (contentPassed) => apply(title)(contentPassed)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 16:24:52 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/usermain.scala.html
                  HASH: 222bd4a3e112c784d40c38f212772f94f3576d63
                  MATRIX: 513->1|637->37|665->39|827->174|853->179|965->265|1000->279|1029->282|1060->292|1093->298|1237->416|1270->428|1302->434|1336->447|1368->453|1397->461|1429->466
                  LINES: 19->1|22->1|24->3|31->10|31->10|34->13|34->13|35->14|35->14|38->17|43->22|43->22|44->23|44->23|45->24|45->24|46->25
                  -- GENERATED --
              */
          