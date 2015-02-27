
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
object userheader extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<style>
.bs-example """),format.raw/*3.13*/("""{"""),format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""margin: 20px;

	/* Fix alignment issue of label on extra small devices in Bootstrap 3.2 */
	.
	form-horizontal
	.control-label"""),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
	"""),format.raw/*10.2*/("""padding-top
	:
	7px;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""
"""),format.raw/*16.1*/(""".custom_class """),format.raw/*16.15*/("""{"""),format.raw/*16.16*/("""
	"""),format.raw/*17.2*/("""background-color: black !important;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""
"""),format.raw/*19.1*/("""</style>
<style>

/* make sidebar nav vertical */
.sidebar-nav .navbar ul """),format.raw/*23.25*/("""{"""),format.raw/*23.26*/("""
	"""),format.raw/*24.2*/("""float: none;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

"""),format.raw/*27.1*/(""".sidebar-nav .navbar ul:not """),format.raw/*27.29*/("""{"""),format.raw/*27.30*/("""
	"""),format.raw/*28.2*/("""display: block;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""

"""),format.raw/*31.1*/(""".sidebar-nav .navbar li """),format.raw/*31.25*/("""{"""),format.raw/*31.26*/("""
	"""),format.raw/*32.2*/("""float: none;
	display: block;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""

"""),format.raw/*36.1*/(""".sidebar-nav .navbar li a """),format.raw/*36.27*/("""{"""),format.raw/*36.28*/("""
	"""),format.raw/*37.2*/("""padding-top: 12px;
	padding-bottom: 12px;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""

"""),format.raw/*41.1*/(""".roundedcorner """),format.raw/*41.16*/("""{"""),format.raw/*41.17*/("""
	"""),format.raw/*42.2*/("""border-radius: 20px;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

"""),format.raw/*45.1*/(""".topmargin """),format.raw/*45.12*/("""{"""),format.raw/*45.13*/("""
	"""),format.raw/*46.2*/("""margin-top: 0%;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""
"""),format.raw/*48.1*/("""</style>

</head>

<!-- Container starts here in the Body -->


<div class="row roundedcorner topmargin"
	style="background-color: black;">
	<div class="col-sm-8 col-xs-9 col-md-8">
	
		<form>
			<div class="form-group"></div>
			<a href=""""),_display_(/*61.14*/routes/*61.20*/.Application.logout),format.raw/*61.39*/(""""><span class="badge">Logout</span></a>
		</form>
	</div>
	<div class="col-sm-4 col-xs-3 col-md-4">
		<h3>
			<label
				style="text-align: left; font-size: .6em; font-style: italic; color: white;">
				Logged In Page (Private)</label> 
		</h3>
	</div>
</div>
<br>

<!-- carousel of the header -->

<div class="row roundedcorner"
	style="background-image: url('"""),_display_(/*77.33*/routes/*77.39*/.Assets.at("images/backg.jpg")),format.raw/*77.69*/("""'); background-color:black;">

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox" style="margin: auto;">
			<div class="item active">
				<img src='"""),_display_(/*91.16*/routes/*91.22*/.Assets.at("images/a.jpg")),format.raw/*91.48*/("""' alt="Chania">
				<div class="carousel-caption">
					<h3>TIME</h3>
					<p>Time is money...</p>
				</div>
			</div>

			<div class="item">
				<img src='"""),_display_(/*99.16*/routes/*99.22*/.Assets.at("images/c.jpg")),format.raw/*99.48*/("""' alt="Chania">
				<div class="carousel-caption">
					<h3>Cheer</h3>
					<p>Work hard and party harder...</p>
				</div>
			</div>

			<div class="item">
				<img src='"""),_display_(/*107.16*/routes/*107.22*/.Assets.at("images/e.jpg")),format.raw/*107.48*/("""' alt="Flower">
				<div class="carousel-caption">
					<h3>Test Yourself</h3>
					<p>Evaluate your capabilities, these may be endless</p>
				</div>
			</div>

			<div class="item">
				<img src='"""),_display_(/*115.16*/routes/*115.22*/.Assets.at("images/f.png")),format.raw/*115.48*/("""' alt="Flower">
				<div class="carousel-caption">
					<h3>Development & Design</h3>
					<p>World is beautiful so bring your creativity and portrate
						it...</p>
				</div>
			</div>
		</div>
	</div>
</div>

<!--carousel ends here  -->

<!-- Navigation bar with the search box -->

<div class="row">
	<div class="col-sm-12 col-xs-12 col-md-12">

		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Knoldus</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li class="active"><a href=""""),_display_(/*145.36*/routes/*145.42*/.Application.index),format.raw/*145.60*/("""">Home</a></li>
						<li><a href=""""),_display_(/*146.21*/routes/*146.27*/.Application.usereditEmp),format.raw/*146.51*/("""">Update Profile</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right" style="padding-top: .7%;">
						<form action="/searchlist" method="get" form-inline" role="search">
							<div class="form-group">
								 <div class="input-group">
      <input type="text" name="name" class="form-control" placeholder="Search users...">
      <span class="input-group-btn">
        <button class="btn btn-default" type="submit">Go!</button>
      </span>
    </div><!-- /input-group -->
							</div>
						</form>
					</ul>
				</div>
			</div>
		</nav>
	</div>
</div>
<!-- Navigation bar ends here -->
<!-- body ends here -->
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 16:21:24 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/userheader.scala.html
                  HASH: 86aaa08c7c6c87e0c081cd5db9124c502d1eff57
                  MATRIX: 585->1|632->21|660->22|688->24|841->150|869->151|898->153|946->174|974->175|1003->177|1031->178|1059->179|1101->193|1130->194|1159->196|1222->232|1250->233|1278->234|1380->308|1409->309|1438->311|1478->324|1506->325|1535->327|1591->355|1620->356|1649->358|1692->374|1720->375|1749->377|1801->401|1830->402|1859->404|1916->434|1944->435|1973->437|2027->463|2056->464|2085->466|2154->508|2182->509|2211->511|2254->526|2283->527|2312->529|2360->550|2388->551|2417->553|2456->564|2485->565|2514->567|2557->583|2585->584|2613->585|2880->825|2895->831|2935->850|3324->1212|3339->1218|3390->1248|3966->1797|3981->1803|4028->1829|4213->1987|4228->1993|4275->2019|4475->2191|4491->2197|4539->2223|4766->2422|4782->2428|4830->2454|5722->3318|5738->3324|5778->3342|5842->3378|5858->3384|5904->3408
                  LINES: 22->2|23->3|23->3|24->4|29->9|29->9|30->10|33->13|33->13|35->15|35->15|36->16|36->16|36->16|37->17|38->18|38->18|39->19|43->23|43->23|44->24|45->25|45->25|47->27|47->27|47->27|48->28|49->29|49->29|51->31|51->31|51->31|52->32|54->34|54->34|56->36|56->36|56->36|57->37|59->39|59->39|61->41|61->41|61->41|62->42|63->43|63->43|65->45|65->45|65->45|66->46|67->47|67->47|68->48|81->61|81->61|81->61|97->77|97->77|97->77|111->91|111->91|111->91|119->99|119->99|119->99|127->107|127->107|127->107|135->115|135->115|135->115|165->145|165->145|165->145|166->146|166->146|166->146
                  -- GENERATED --
              */
          