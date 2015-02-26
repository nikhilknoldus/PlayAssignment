
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
object twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
"""),format.raw/*6.1*/("""<div class="form-group """),_display_(/*6.25*/if(elements.hasErrors)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""has-error""")))}),format.raw/*6.59*/("""">
  <label for=""""),_display_(/*7.16*/elements/*7.24*/.id),format.raw/*7.27*/("""" class="col-sm-2 control-label">"""),_display_(/*7.61*/elements/*7.69*/.label),format.raw/*7.75*/("""</label>
  <div class="col-sm-10"><span class="help-block">"""),_display_(/*8.52*/elements/*8.60*/.infos.mkString(", ")),format.raw/*8.81*/("""</span>
    """),_display_(/*9.6*/elements/*9.14*/.input),format.raw/*9.20*/("""
    
  """),format.raw/*11.3*/("""</div>
</div>
"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Feb 25 16:25:12 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/twitterBootstrapInput.scala.html
                  HASH: 550c181c09352325e6f321445d4198449feabab1
                  MATRIX: 535->1|655->33|684->190|711->191|761->215|791->237|830->239|870->249|914->267|930->275|953->278|1013->312|1029->320|1055->326|1141->386|1157->394|1198->415|1236->428|1252->436|1278->442|1313->450
                  LINES: 19->1|22->1|24->5|25->6|25->6|25->6|25->6|25->6|26->7|26->7|26->7|26->7|26->7|26->7|27->8|27->8|27->8|28->9|28->9|28->9|30->11
                  -- GENERATED --
              */
          