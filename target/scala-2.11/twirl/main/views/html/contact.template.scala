
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

/* contact Template File */
object contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Int,String,play.twirl.api.HtmlFormat.Appendable] {

  /* contact Template File */
  def apply/*2.2*/(contactNumber:Int, title:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.35*/("""


"""),format.raw/*5.1*/("""<html>
	<title>"""),_display_(/*6.10*/title),format.raw/*6.15*/("""</title>
	<head>  </head>

<body>
	<h1>Contact Form</h1>
		<footer>
		Our Contact Details <br>							
		"""),_display_(/*13.4*/title),format.raw/*13.9*/("""
		"""),_display_(/*14.4*/contactNumber),format.raw/*14.17*/("""
		
"""),format.raw/*16.1*/("""</footer>
</body>

</html>"""))}
  }

  def render(contactNumber:Int,title:String): play.twirl.api.HtmlFormat.Appendable = apply(contactNumber,title)

  def f:((Int,String) => play.twirl.api.HtmlFormat.Appendable) = (contactNumber,title) => apply(contactNumber,title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Feb 25 14:52:53 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/contact.scala.html
                  HASH: 821461bdab36ce9d509eb7b5845aa1432989da6e
                  MATRIX: 557->29|678->62|707->65|749->81|774->86|905->191|930->196|960->200|994->213|1025->217
                  LINES: 19->2|22->2|25->5|26->6|26->6|33->13|33->13|34->14|34->14|36->16
                  -- GENERATED --
              */
          