
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
object content extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<!-- Body tag that contains the page body -->

"""),_display_(/*4.2*/main("showAll")/*4.17*/{_display_(Seq[Any](format.raw/*4.18*/("""
"""),format.raw/*5.1*/("""<div data-ng-app="" class="data-ng-controller= "MyController">
	<div>
		<!-- Created a panel that contains a table with some static data -->
		<div class="panel">
			<table class="table table-striped">
				<div style="background-color:silver;" class="panel-heading">Employee</div>
				
				
				<tr>
					<th><a data-ng-click="sort='name'" href="#">Name</a></th>
					<th><a data-ng-click="sort='gender'" href="#">Gender</a></th>
					<th><a data-ng-click="sort='email'" href="#">Email</a></th>
					<th><a data-ng-click="sort='phone'" href="#">Phone</a></th>
					<th><a data-ng-click="sort='registered'" href="#">Date</a></th>
				</tr>
				<tr>
					<data-ng-repeat="xinlist">
					<td>Mike</td>
					<td>Male</td>
					<td>mike@knoldus.com</td>
					<td>9990009991</td>
					<td>2015-02-02</td>
				</tr>
				<tr>
					<data-ng-repeat="xinlist">
					<td>Mike</td>
					<td>Male</td>
					<td>mike@knoldus.com</td>
					<td>9990009991</td>
					<td>2015-02-02</td>
				</tr>
				<tr>
					<data-ng-repeat="xinlist">
					<td>Mike</td>
					<td>Male</td>
					<td>mike@knoldus.com</td>
					<td>9990009991</td>
					<td>2015-02-02</td>
				</tr>
				<tr>
					<data-ng-repeat="xinlist">
					<td>Mike</td>
					<td>Male</td>
					<td>mike@knoldus.com</td>
					<td>9990009991</td>
					<td>2015-02-02</td>
				</tr>
				<tr>
					<data-ng-repeat="xinlist">
					<td>Mike</td>
					<td>Male</td>
					<td>mike@knoldus.com</td>
					<td>9990009991</td>
					<td>2015-02-02</td>
				</tr>
				<tr>
					<data-ng-repeat="xinlist">
					<td>Mike</td>
					<td>Male</td>
					<td>mike@knoldus.com</td>
					<td>9990009991</td>
					<td>2015-02-02</td>
				</tr>
				<tr>
					<data-ng-repeat="xinlist">
					<td>Mike</td>
					<td>Male</td>
					<td>mike@knoldus.com</td>
					<td>9990009991</td>
					<td>2015-02-02</td>
				</tr>
				<tr>
					<data-ng-repeat="xinlist">
					<td>Mike</td>
					<td>Male</td>
					<td>mike@knoldus.com</td>
					<td>9990009991</td>
					<td>2015-02-02</td>
				</tr>
			</table>
		</div>
		<!-- Panel ends here -->
	</div>
</div>
""")))}),format.raw/*89.2*/("""
"""),format.raw/*90.1*/("""<!-- Body ends here -->"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Feb 25 15:00:10 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/content.scala.html
                  HASH: d73fcaa06e465c9c7c45ac8d036cda26a87073b1
                  MATRIX: 582->1|655->49|678->64|716->65|743->66|2836->2137|2864->2138
                  LINES: 22->2|24->4|24->4|24->4|25->5|109->89|110->90
                  -- GENERATED --
              */
          