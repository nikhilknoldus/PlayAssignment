
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
					<li class="list-group-item">Scrum & XP Evangelists and
						Practitioners</li>
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

	<hr class="">
</div>

<div class="row">

	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">Recent Knolx Sessions</h3>
		</div>

		<div class="col-sm-4 col-xs-4 col-md-4">
			<div class="panel-body">
				<div class="thumbnail">
					<img src='"""),_display_(/*59.17*/routes/*59.23*/.Assets.at("images/session1.jpg")),format.raw/*59.56*/("""' alt="...">
					<div class="caption">
						<h4 align="center">
							<span>Angular Js</span>
						</h4>
						<h5 align="center">
							<br> <a href="#"><span class="label label-default">Know
									More</span></a>
						</h5>

					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-4 col-xs-4 col-md-4">
			<div class="panel-body">
				<div class="thumbnail">
					<img src='"""),_display_(/*76.17*/routes/*76.23*/.Assets.at("images/session.png")),format.raw/*76.55*/("""' alt="...">
					<div class="caption">
						<br>
						<h4 align="center">
							<span>Scala Collections</span>
						</h4>
						<h5 align="center">
							<br> <a href="#"><span class="label label-default">Know
									More</span></a>
						</h5>
					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-4 col-xs-4 col-md-4">
			<div class="panel-body">
				<div class="thumbnail">
					<img src='"""),_display_(/*93.17*/routes/*93.23*/.Assets.at("images/session2.png")),format.raw/*93.56*/("""' alt="...">
					<div class="caption">
						<br>
						<h4 align="center">
							<span>Intro to Play Framework</span>
						</h4>
						<h5 align="center">
							<br> <a href="#"><span class="label label-default">Know
									More</span></a>
						</h5>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
""")))}),format.raw/*109.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 01:00:04 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/index.scala.html
                  HASH: f5b54d69adbaabaad86d81dab430313f9c4b82b6
                  MATRIX: 580->1|601->14|640->16|669->19|2339->1662|2354->1668|2408->1701|2828->2094|2843->2100|2896->2132|3333->2542|3348->2548|3402->2581|3750->2898
                  LINES: 22->1|22->1|22->1|25->4|80->59|80->59|80->59|97->76|97->76|97->76|114->93|114->93|114->93|130->109
                  -- GENERATED --
              */
          