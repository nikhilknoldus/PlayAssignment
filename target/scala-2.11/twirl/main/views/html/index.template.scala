
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("index")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""


"""),format.raw/*4.1*/("""<div class="row">

	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">Welcome to our page</h3>
		</div>

		<div class="col-sm-6 col-xs-6 col-md-6">
			<div class="panel-body">
				<ul class="list-group">
					<a href="#" class="list-group-item active">
						<h4 class="list-group-item-heading">Knolx Qualities</h4>
					</a>
					<li class="list-group-item">Expert in Scala, Clojue & Haskell</li>
					<li class="list-group-item">Great Communities</li>
					<li class="list-group-item">Proper material</li>
					<li class="list-group-item"><span class="badge">New</span>
						Asking for session</li>
					<li class="list-group-item">
						Scrum & XP Evangelists and Practitioners</li>
				</ul>
			</div>
		</div>
		<div class="col-sm-6 col-xs-6 col-md-6">
			<div class="panel-body">
				<ul class="list-group">
					<a href="#" class="list-group-item active">
						<h4 class="list-group-item-heading">Technologies</h4>
					</a>
					<li class="list-group-item">Scala</li>
					<li class="list-group-item">Play Framework</li>
					<li class="list-group-item"><span class="badge">New</span>
						Akka</li>
					<li class="list-group-item">Slick</li>			
					<li class="list-group-item"><span class="badge">New</span>
						Functional Programming . Reactive Applications</li>
				</ul>
			</div>
		</div>

	</div>
</div>

""")))}),format.raw/*47.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 18:36:49 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/index.scala.html
                  HASH: 8fc93ed8d6a7c8091a25dde1beeb43f2a95f37fd
                  MATRIX: 580->1|601->14|640->16|669->19|2068->1388
                  LINES: 22->1|22->1|22->1|25->4|68->47
                  -- GENERATED --
              */
          