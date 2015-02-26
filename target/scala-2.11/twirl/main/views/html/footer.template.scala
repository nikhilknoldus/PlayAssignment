
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

/* footer Template File */
object footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /* footer Template File */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.1*/("""<!-- Row starts here for the footer of the page -->
<div class ="row">
<div class="col-md-12 col-xs-12">
<footer class="footer">
    <div class="container text-center">
              By Nikhil Kumar
      </div>
</footer>
</div>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Feb 25 14:52:53 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/footer.scala.html
                  HASH: caaa4a9eea12c561e1ba55d5c07401c172ce87ce
                  MATRIX: 625->28
                  LINES: 22->3
                  -- GENERATED --
              */
          