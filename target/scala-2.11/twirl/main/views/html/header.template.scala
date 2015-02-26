
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
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.1*/("""<style>
.bs-example """),format.raw/*4.13*/("""{"""),format.raw/*4.14*/("""
	"""),format.raw/*5.2*/("""margin: 20px;

	/* Fix alignment issue of label on extra small devices in Bootstrap 3.2 */
	.
	form-horizontal
	.control-label"""),format.raw/*10.16*/("""{"""),format.raw/*10.17*/("""
	"""),format.raw/*11.2*/("""padding-top
	:
	1%;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""
"""),format.raw/*17.1*/(""".custom_class """),format.raw/*17.15*/("""{"""),format.raw/*17.16*/("""
	"""),format.raw/*18.2*/("""background-color: black !important;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""
"""),format.raw/*20.1*/("""</style>
<style>

/* make sidebar nav vertical */
.sidebar-nav .navbar ul """),format.raw/*24.25*/("""{"""),format.raw/*24.26*/("""
	"""),format.raw/*25.2*/("""float: none;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""

"""),format.raw/*28.1*/(""".sidebar-nav .navbar ul:not """),format.raw/*28.29*/("""{"""),format.raw/*28.30*/("""
	"""),format.raw/*29.2*/("""display: block;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""

"""),format.raw/*32.1*/(""".sidebar-nav .navbar li """),format.raw/*32.25*/("""{"""),format.raw/*32.26*/("""
	"""),format.raw/*33.2*/("""float: none;
	display: block;
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""

"""),format.raw/*37.1*/(""".sidebar-nav .navbar li a """),format.raw/*37.27*/("""{"""),format.raw/*37.28*/("""
	"""),format.raw/*38.2*/("""padding-top: 12px;
	padding-bottom: 12px;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""

"""),format.raw/*42.1*/(""".roundedcorner """),format.raw/*42.16*/("""{"""),format.raw/*42.17*/("""
	"""),format.raw/*43.2*/("""border-radius: 20px;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/(""".topmargin """),format.raw/*46.12*/("""{"""),format.raw/*46.13*/("""
	"""),format.raw/*47.2*/("""margin-top: 0%;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""
"""),format.raw/*49.1*/("""</style>

</head>

<!-- Container starts here in the Body -->


<div class="row roundedcorner topmargin"
	style="background-color: black;">
	<div class="col-sm-8 col-xs-8 col-md-9">
	</div>
	<div class="col-sm-4 col-xs-4 col-md-3">
		<h3>
		<form>
			<div class="form-group"></div>
			<a href=""""),_display_(/*64.14*/routes/*64.20*/.Application.loginpage),format.raw/*64.42*/("""">   <button class="btn btn-primary" type="button">
  <span class="badge">Login</span>
</button>  </a>

			 <a href="/addnew"><button class="btn btn-primary" type="button">
  <span class="badge">Register</span>
</button></a>
		</form>
		
		

		</h3>
	</div>
</div>
<br>

<!-- carousel of the header -->

<div class="row roundedcorner"
	style="background-image: url('"""),_display_(/*83.33*/routes/*83.39*/.Assets.at("images/backg.jpg")),format.raw/*83.69*/("""'); background-color:black;">
	<center>
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
					<img src='"""),_display_(/*97.17*/routes/*97.23*/.Assets.at("images/a.jpg")),format.raw/*97.49*/("""' alt="Chania">
					<div class="carousel-caption">
						<h3>TIME</h3>
						<p>Time is money...</p>
					</div>
				</div>

				<div class="item">
					<img src='"""),_display_(/*105.17*/routes/*105.23*/.Assets.at("images/c.jpg")),format.raw/*105.49*/("""' alt="Chania">
					<div class="carousel-caption">
						<h3>Cheer</h3>
						<p>Work hard and party harder...</p>
					</div>
				</div>

				<div class="item">
					<img src='"""),_display_(/*113.17*/routes/*113.23*/.Assets.at("images/e.jpg")),format.raw/*113.49*/("""' alt="Flower">
					<div class="carousel-caption">
						<h3>Test Yourself</h3>
						<p>Evaluate your capabilities, these may be endless</p>
					</div>
				</div>

				<div class="item">
					<img src='"""),_display_(/*121.17*/routes/*121.23*/.Assets.at("images/f.png")),format.raw/*121.49*/("""' alt="Flower">
					<div class="carousel-caption">
						<h3>Development & Design</h3>
						<p>World is beautiful so bring your creativity and portrate
							it...</p>
					</div>
				</div>
			</div>
		</div>
	</center>
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
						<li class="active"><a href=""""),_display_(/*152.36*/routes/*152.42*/.Application.index),format.raw/*152.60*/("""">Home</a></li>
						<li><a href="/addnew">New Registration</a></li>
						<li><a href="#"></a></li>
						<li><a href=""""),_display_(/*155.21*/routes/*155.27*/.Application.showAll(0,5,"",50)),format.raw/*155.58*/("""">Show
								All Emp</a></li>
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
								
								
							<!-- 	<input type="search" class="form-control" name="name"
									placeholder="Search here...">
								<button type="submit" class="btn btn-default">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
								</button>
							 -->
							
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
                  DATE: Thu Feb 26 18:53:04 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/header.scala.html
                  HASH: 9ec151bdf71265aa994da5f1bf1a5e0cb361e5a4
                  MATRIX: 581->2|628->22|656->23|684->25|838->151|867->152|896->154|943->174|971->175|1000->177|1028->178|1056->179|1098->193|1127->194|1156->196|1219->232|1247->233|1275->234|1377->308|1406->309|1435->311|1475->324|1503->325|1532->327|1588->355|1617->356|1646->358|1689->374|1717->375|1746->377|1798->401|1827->402|1856->404|1913->434|1941->435|1970->437|2024->463|2053->464|2082->466|2151->508|2179->509|2208->511|2251->526|2280->527|2309->529|2357->550|2385->551|2414->553|2453->564|2482->565|2511->567|2554->583|2582->584|2610->585|2932->880|2947->886|2990->908|3384->1275|3399->1281|3450->1311|4047->1881|4062->1887|4109->1913|4302->2078|4318->2084|4366->2110|4573->2289|4589->2295|4637->2321|4871->2527|4887->2533|4935->2559|5846->3442|5862->3448|5902->3466|6052->3588|6068->3594|6121->3625
                  LINES: 22->3|23->4|23->4|24->5|29->10|29->10|30->11|33->14|33->14|35->16|35->16|36->17|36->17|36->17|37->18|38->19|38->19|39->20|43->24|43->24|44->25|45->26|45->26|47->28|47->28|47->28|48->29|49->30|49->30|51->32|51->32|51->32|52->33|54->35|54->35|56->37|56->37|56->37|57->38|59->40|59->40|61->42|61->42|61->42|62->43|63->44|63->44|65->46|65->46|65->46|66->47|67->48|67->48|68->49|83->64|83->64|83->64|102->83|102->83|102->83|116->97|116->97|116->97|124->105|124->105|124->105|132->113|132->113|132->113|140->121|140->121|140->121|171->152|171->152|171->152|174->155|174->155|174->155
                  -- GENERATED --
              */
          