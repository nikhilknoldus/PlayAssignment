
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

/* userhome Template File */
object userhome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* userhome Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""
"""),_display_(/*3.2*/param),format.raw/*3.7*/("""

"""),_display_(/*5.2*/usermain("User Home")/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
	
	"""),format.raw/*7.2*/("""<h1>"""),_display_(/*7.7*/param),format.raw/*7.12*/("""</h1>
	
""")))}))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 13:16:04 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/userhome.scala.html
                  HASH: f13b16b00b5a7d6310963d0c643f23f7056ea4a4
                  MATRIX: 553->30|653->42|680->44|704->49|732->52|761->73|799->74|829->78|859->83|884->88
                  LINES: 19->2|22->2|23->3|23->3|25->5|25->5|25->5|27->7|27->7|27->7
                  -- GENERATED --
              */
          