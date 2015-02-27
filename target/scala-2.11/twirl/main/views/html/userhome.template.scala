
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

"""),_display_(/*4.2*/usermain("User Home")/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
"""),format.raw/*5.1*/("""<div class="row">
  <div class="panel panel-primary">
  	 <div class="panel-heading">
      	<h3 class="panel-title">Welcome - """),_display_(/*8.43*/param),format.raw/*8.48*/("""</h3>
   	</div>
   <div class="col-sm-5 col-xs-12 col-md-5">
   	<div class="panel-body">
			<div class="panel-body">
				<ul class="list-group">
					<a href="#" class="list-group-item active">
						<h4 class="list-group-item-heading">Profile</h4>
					</a>
					<li class="list-group-item">Update Profile</li>
					<li class="list-group-item">Your Sessions</li>
					<li class="list-group-item">Messages<span class="badge">12</span></li>
					<li class="list-group-item"><span class="badge">New</span>
						Request Session</li>					
				</ul>
			</div>
	    	<div class="panel-body">
				<ul class="list-group">
					<a href="#" class="list-group-item active">
						<h4 class="list-group-item-heading">Read</h4>
					</a>
					<li class="list-group-item">Session List</li>
					<li class="list-group-item">Session Schedules</li>
					<li class="list-group-item">Best Knolx<span class="badge">7</span></li>
					<li class="list-group-item"><span class="badge">New</span>
						Meetups</li>	
				</ul>
			</div>
	 </div>
	</div>	
	<div class="col-sm-7 col-xs-12 col-md-7">
	<div class="panel-body">
			<div class="panel-body">
	   <div class="panel-group" id="accordion">
   <div class="panel panel-default">
      <div class="panel-heading">
         <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" 
               href="#collapseOne">
            Latest Technology Trends
            </a>
         </h4>
      </div>
      <div id="collapseOne" class="panel-collapse collapse in">
         <div class="panel-body">
            Knoldus strongly believes in strongly sharing knowledge. We conduct knowledge sessions every week.
         </div>
      </div>
   </div>
   <div class="panel panel-success">
      <div class="panel-heading">
         <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" 
               href="#collapseTwo">
              Live Demos
            </a>
         </h4>
      </div>
      <div id="collapseTwo" class="panel-collapse collapse">
         <div class="panel-body">
           Theory does not work every time, so in every session live practicals takes place.
         </div>
      </div>
   </div>
   <div class="panel panel-info">
      <div class="panel-heading">
         <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" 
               href="#collapseThree">
               Developers
            </a>
         </h4>
      </div>
      <div id="collapseThree" class="panel-collapse collapse">
         <div class="panel-body">
          Developer & Designers share their hard earned experience in session
                  Developers<br>
               SCALA<br>
               PLAY<br>
               AKKA<br>
               ANGULAR JS
         </div>
      </div>
   </div>
   <div class="panel panel-warning">
      <div class="panel-heading">
         <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" 
               href="#collapseFour">
              You can be a part 
            </a>
         </h4>
      </div>
      <div id="collapseFour" class="panel-collapse collapse">
         <div class="panel-body">
           If you want to share your experience, you are most welcomed
         </div>
      </div>
   </div>
</div>
<script type="text/javascript">
	$(function() """),format.raw/*109.15*/("""{"""),format.raw/*109.16*/("""
		"""),format.raw/*110.3*/("""$('#collapseFour').collapse("""),format.raw/*110.31*/("""{"""),format.raw/*110.32*/("""
			"""),format.raw/*111.4*/("""toggle : false
		"""),format.raw/*112.3*/("""}"""),format.raw/*112.4*/(""")
	"""),format.raw/*113.2*/("""}"""),format.raw/*113.3*/(""");
	$(function() """),format.raw/*114.15*/("""{"""),format.raw/*114.16*/("""
		"""),format.raw/*115.3*/("""$('#collapseTwo').collapse('show')
	"""),format.raw/*116.2*/("""}"""),format.raw/*116.3*/(""");
	$(function() """),format.raw/*117.15*/("""{"""),format.raw/*117.16*/("""
		"""),format.raw/*118.3*/("""$('#collapseThree').collapse('toggle')
	"""),format.raw/*119.2*/("""}"""),format.raw/*119.3*/(""");
	$(function() """),format.raw/*120.15*/("""{"""),format.raw/*120.16*/("""
		"""),format.raw/*121.3*/("""$('#collapseOne').collapse('hide')
	"""),format.raw/*122.2*/("""}"""),format.raw/*122.3*/(""");
</script> 
	
	</div></div></div></div>
 </div>
</div>
   	
  </div>
</div>
	
	
""")))}))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 17:05:49 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/userhome.scala.html
                  HASH: bf85e0c39e6b8d699456eec19fd87be412a54724
                  MATRIX: 553->30|653->42|681->45|710->66|748->67|775->68|929->196|954->201|4360->3578|4390->3579|4421->3582|4478->3610|4508->3611|4540->3615|4585->3632|4614->3633|4645->3636|4674->3637|4720->3654|4750->3655|4781->3658|4845->3694|4874->3695|4920->3712|4950->3713|4981->3716|5049->3756|5078->3757|5124->3774|5154->3775|5185->3778|5249->3814|5278->3815
                  LINES: 19->2|22->2|24->4|24->4|24->4|25->5|28->8|28->8|129->109|129->109|130->110|130->110|130->110|131->111|132->112|132->112|133->113|133->113|134->114|134->114|135->115|136->116|136->116|137->117|137->117|138->118|139->119|139->119|140->120|140->120|141->121|142->122|142->122
                  -- GENERATED --
              */
          