
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String,user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color:#222; """),format.raw/*9.72*/("""}"""),format.raw/*9.73*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: rgb(2, 163, 83); border-width: thick; border-color: black"""),format.raw/*10.111*/("""}"""),format.raw/*10.112*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: darkred; """),format.raw/*14.33*/("""}"""),format.raw/*14.34*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>Software CA1 """),_display_(/*16.23*/pagename),format.raw/*16.31*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">Software CA1</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*25.18*/if(pagename == "Home")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active"""")))}),format.raw/*25.57*/("""><a href=""""),_display_(/*25.68*/routes/*25.74*/.HomeController.index()),format.raw/*25.97*/("""">Home</a></li>
			<li """),_display_(/*26.9*/if(pagename == "Projects")/*26.35*/ {_display_(Seq[Any](format.raw/*26.37*/("""class="active"""")))}),format.raw/*26.52*/("""><a href=""""),_display_(/*26.63*/routes/*26.69*/.HomeController.projects()),format.raw/*26.95*/("""">Projects</a></li>
			<li """),_display_(/*27.9*/if(pagename == "Employees")/*27.36*/ {_display_(Seq[Any](format.raw/*27.38*/("""class="active"""")))}),format.raw/*27.53*/("""><a href=""""),_display_(/*27.64*/routes/*27.70*/.HomeController.usersEmployees()),format.raw/*27.102*/("""">Employees</a></li>
			
			
			"""),_display_(/*30.5*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*30.99*/ {_display_(Seq[Any](format.raw/*30.101*/("""
				"""),format.raw/*31.5*/("""<li """),_display_(/*31.10*/if(pagename == "Managers")/*31.36*/ {_display_(Seq[Any](format.raw/*31.38*/("""class="active"""")))}),format.raw/*31.53*/("""><a href=""""),_display_(/*31.64*/routes/*31.70*/.HomeController.usersManagers()),format.raw/*31.101*/("""">View Managers</a></li>

			""")))}),format.raw/*33.5*/("""
		"""),format.raw/*34.3*/("""</ul>
			<ul class="nav navbar-nav navbar-right">
			<li """),_display_(/*36.9*/if(pagename == "Register")/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""class="active"""")))}),format.raw/*36.52*/("""><a href=""""),_display_(/*36.63*/routes/*36.69*/.LoginController.registerUser()),format.raw/*36.100*/(""""><span class="glyphicon glyphicon-user"></span> Register user</a></li>
			<li """),_display_(/*37.9*/if(pagename == "Log In")/*37.33*/ {_display_(Seq[Any](format.raw/*37.35*/("""class="active"""")))}),format.raw/*37.50*/(""">
				"""),_display_(/*38.6*/if(user != null)/*38.22*/ {_display_(Seq[Any](format.raw/*38.24*/("""
					"""),format.raw/*39.6*/("""<a href=""""),_display_(/*39.16*/routes/*39.22*/.LoginController.logout()),format.raw/*39.47*/(""""><span class="glyphicon glyphicon-log-in"></span> Log Out</a>
				""")))}/*40.7*/else/*40.12*/{_display_(Seq[Any](format.raw/*40.13*/("""
					"""),format.raw/*41.6*/("""<a href=""""),_display_(/*41.16*/routes/*41.22*/.LoginController.login()),format.raw/*41.46*/(""""><span class="glyphicon glyphicon-log-in"></span> Log In</a>
			</li>
			</ul>
""")))}),format.raw/*44.2*/(""" 
		
	    """),format.raw/*46.6*/("""</div>
	</nav>


	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>Text pertaining to databases</h3>
			<p>This is a CA by James Lynam (X00073019) and Stephen Murphy(X00149904) and it <span class="redtext">will</span> be fixed before Monday!</p>
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
			"""),_display_(/*61.5*/content),format.raw/*61.12*/("""
		    """),format.raw/*62.7*/("""</div>
		</div>

	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by the lads.
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*74.17*/routes/*74.23*/.Assets.versioned("javascripts/main.js")),format.raw/*74.63*/(""""></script>


    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:47:10 GMT 2019
                  SOURCE: D:/CA1Public/CA1PUBLIC/Employee System - Latest Copy/app/views/main.scala.html
                  HASH: da98f8f4fd675b2eaa9de78ef526f505da373d9e
                  MATRIX: 970->1|1120->56|1148->58|1437->320|1465->321|1493->322|1576->378|1604->379|1638->386|1675->395|1704->396|1733->397|1856->491|1886->492|1920->499|1960->511|1989->512|2018->513|2065->532|2094->533|2128->540|2167->551|2196->552|2225->553|2292->592|2321->593|2355->600|2394->611|2423->612|2452->613|2518->651|2547->652|2581->659|2618->668|2647->669|2676->670|2720->686|2749->687|2779->690|2838->722|2867->730|3149->985|3180->1007|3220->1009|3266->1024|3304->1035|3319->1041|3363->1064|3414->1089|3449->1115|3489->1117|3535->1132|3573->1143|3588->1149|3635->1175|3690->1204|3726->1231|3766->1233|3812->1248|3850->1259|3865->1265|3919->1297|3981->1333|4084->1427|4125->1429|4158->1435|4190->1440|4225->1466|4265->1468|4311->1483|4349->1494|4364->1500|4417->1531|4479->1563|4510->1567|4596->1627|4631->1653|4671->1655|4717->1670|4755->1681|4770->1687|4823->1718|4930->1799|4963->1823|5003->1825|5049->1840|5083->1848|5108->1864|5148->1866|5182->1873|5219->1883|5234->1889|5280->1914|5367->1984|5380->1989|5419->1990|5453->1997|5490->2007|5505->2013|5550->2037|5664->2121|5703->2133|6154->2558|6182->2565|6217->2573|6456->2785|6471->2791|6532->2831
                  LINES: 28->1|33->1|34->2|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|47->15|48->16|48->16|57->25|57->25|57->25|57->25|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|59->27|59->27|59->27|59->27|59->27|59->27|59->27|62->30|62->30|62->30|63->31|63->31|63->31|63->31|63->31|63->31|63->31|63->31|65->33|66->34|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|76->44|78->46|93->61|93->61|94->62|106->74|106->74|106->74
                  -- GENERATED --
              */
          