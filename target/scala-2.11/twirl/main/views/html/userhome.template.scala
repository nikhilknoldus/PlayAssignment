
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
			
			  <!-- Poll for logged in Knolx -->
	
       	<div class="panel panel-primary">
								<div class="panel-heading">
									<h3 class="panel-title">
										<span class="glyphicon glyphicon-arrow-right"></span>How Helpful Knolx to you ?
										</p>
									</h3>
								</div>
								<div class="panel-body">
									<ul class="list-group">
										<li class="list-group-item">
											<div class="radio">
												<label> <input type="radio" name="optionsRadios">
													Good
												</label>
											</div>
										</li>
										<li class="list-group-item">
											<div class="radio">
												<label> <input type="radio" name="optionsRadios">
													Excellent
												</label>
											</div>
										</li>
										<li class="list-group-item">
											<div class="radio">
												<label> <input type="radio" name="optionsRadios">
													Nice
												</label>
											</div>
										</li>
										<li class="list-group-item">
											<div class="radio">
												<label> <input type="radio" name="optionsRadios">
													Not Satisfied
												</label>
											</div>
										</li>
										<li class="list-group-item">
											<div class="radio">
												<label> <input type="radio" name="optionsRadios">
													Can Be Improved
												</label>
											</div>
										</li>
									</ul>
								</div>
								<div class="panel-footer">
									<button type="button" class="btn btn-primary btn-sm">
										Vote</button>
									<a href="#">View Result</a>
								</div>
							</div>
					 </div>
				</div>	
	
	<div class="col-sm-7 col-xs-12 col-md-7">
	   	<div class="panel-body">
			<div class="panel-body">
      				<div class="panel-heading">
        	 			<h3 class="panel-title">Your Skill Set</h3>
     				</div>
      				<div class="panel-body"> 
        				 <div class="progress">
 		 					<div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 85%">
    							BootStrap<span class="sr-only">45% Complete</span>
  							</div>
	 					</div>
   		 			</div>
   		 			<div class="panel-body"> 
        				 <div class="progress">
 		 					<div class="progress-bar progress-bar-striped progress-bar-info active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 55%">
    							Scala<span class="sr-only">45% Complete</span>
  							</div>
	 					</div>
   		 			</div>
   		 				<div class="panel-body"> 
        				 <div class="progress">
 		 					<div class="progress-bar progress-bar-striped progress-bar-success active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
    						Play Framework	<span class="sr-only">45% Complete</span>
  							</div>
	 					</div>
   		 			  </div>
   		 			  	<div class="panel-body"> 
        				 <div class="progress">
 		 					<div class="progress-bar progress-bar-striped progress-bar-success active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
    						AngularJs<span class="sr-only">45% Complete</span>
  							</div>
	 					</div>
   		 			</div>
   		 			<div class="panel-body"> 
        				 <div class="progress">
 		 					<div class="progress-bar progress-bar-striped progress-bar-danger active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 25%">
    						Slick<span class="sr-only">45% Complete</span>
  							</div>
	 					</div>
   		 			</div>
   		 				<div class="panel-body"> 
        				 <div class="progress">
 		 					<div class="progress-bar progress-bar-striped progress-bar-warining active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 75%">
    						CSS3 & Html5<span class="sr-only">45% Complete</span>
  							</div>
	 					</div>
   		 			</div>
    	 	</div>
	
	<!-- According starting here -->
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
				$(function() """),format.raw/*215.18*/("""{"""),format.raw/*215.19*/("""
					"""),format.raw/*216.6*/("""$('#collapseFour').collapse("""),format.raw/*216.34*/("""{"""),format.raw/*216.35*/("""
						"""),format.raw/*217.7*/("""toggle : false
					"""),format.raw/*218.6*/("""}"""),format.raw/*218.7*/(""")
				"""),format.raw/*219.5*/("""}"""),format.raw/*219.6*/(""");
				$(function() """),format.raw/*220.18*/("""{"""),format.raw/*220.19*/("""
					"""),format.raw/*221.6*/("""$('#collapseTwo').collapse('show')
				"""),format.raw/*222.5*/("""}"""),format.raw/*222.6*/(""");
				$(function() """),format.raw/*223.18*/("""{"""),format.raw/*223.19*/("""
					"""),format.raw/*224.6*/("""$('#collapseThree').collapse('toggle')
				"""),format.raw/*225.5*/("""}"""),format.raw/*225.6*/(""");
				$(function() """),format.raw/*226.18*/("""{"""),format.raw/*226.19*/("""
					"""),format.raw/*227.6*/("""$('#collapseOne').collapse('hide')
							"""),format.raw/*228.8*/("""}"""),format.raw/*228.9*/(""");
		 </script> 
	</div>
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
                  DATE: Fri Feb 27 23:42:43 IST 2015
                  SOURCE: /home/knoldus/workspace/PlayAssignment/app/views/userhome.scala.html
                  HASH: e307d67aa9d55b85f23b5c8f70788741dafa5e85
                  MATRIX: 553->30|653->42|681->45|710->66|748->67|775->68|929->196|954->201|8354->7572|8384->7573|8418->7579|8475->7607|8505->7608|8540->7615|8588->7635|8617->7636|8651->7642|8680->7643|8729->7663|8759->7664|8793->7670|8860->7709|8889->7710|8938->7730|8968->7731|9002->7737|9073->7780|9102->7781|9151->7801|9181->7802|9215->7808|9285->7850|9314->7851
                  LINES: 19->2|22->2|24->4|24->4|24->4|25->5|28->8|28->8|235->215|235->215|236->216|236->216|236->216|237->217|238->218|238->218|239->219|239->219|240->220|240->220|241->221|242->222|242->222|243->223|243->223|244->224|245->225|245->225|246->226|246->226|247->227|248->228|248->228
                  -- GENERATED --
              */
          