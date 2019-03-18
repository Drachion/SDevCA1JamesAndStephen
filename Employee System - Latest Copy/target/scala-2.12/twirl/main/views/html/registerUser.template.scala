
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.UserPassword2],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login",user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    <!-- Display login errors if there are any-->
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
                """),_display_(/*10.18*/e/*10.19*/.message),format.raw/*10.27*/("""<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
	"""),format.raw/*14.54*/("""
	"""),_display_(/*15.3*/if(flash.containsKey("error"))/*15.33*/ {_display_(Seq[Any](format.raw/*15.35*/("""
		"""),format.raw/*16.3*/("""<div class="alert alert-success">
			"""),_display_(/*17.5*/flash/*17.10*/.get("error")),format.raw/*17.23*/("""
		"""),format.raw/*18.3*/("""</div>
	""")))}),format.raw/*19.3*/("""
    """),format.raw/*20.5*/("""<!-- The login form-->
    """),_display_(/*21.6*/helper/*21.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.76*/ {_display_(Seq[Any](format.raw/*21.78*/("""
        """),format.raw/*22.37*/("""
        """),format.raw/*24.84*/("""
        """),_display_(/*25.10*/CSRF/*25.14*/.formField),format.raw/*25.24*/("""
        
        """),format.raw/*27.9*/("""<div class="form-group">
            """),_display_(/*28.14*/inputText(loginForm("email"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.72*/("""
        """),format.raw/*30.9*/("""</div>
        <div class="form-group">
            """),_display_(/*32.14*/inputPassword(loginForm("password"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*33.75*/("""
        
        """),format.raw/*35.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*39.6*/(""" """),format.raw/*39.24*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:47:10 GMT 2019
                  SOURCE: D:/CA1Public/CA1PUBLIC/Employee System - Latest Copy/app/views/registerUser.scala.html
                  HASH: aec4ac3332b950554a33d2d2488ccffc23340bd1
                  MATRIX: 999->1|1141->73|1186->70|1214->90|1242->93|1268->111|1307->113|1339->119|1438->193|1475->222|1514->224|1550->234|1622->280|1669->312|1708->314|1754->333|1764->334|1793->342|1844->362|1881->372|1922->383|1953->438|1983->442|2022->472|2062->474|2093->478|2158->517|2172->522|2206->535|2237->539|2277->549|2310->555|2365->584|2380->590|2453->654|2493->656|2531->694|2569->857|2607->868|2620->872|2651->882|2698->902|2764->941|2903->1059|2940->1069|3022->1124|3171->1252|3218->1272|3386->1410|3415->1428
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12|45->13|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|53->21|53->21|53->21|53->21|54->22|55->24|56->25|56->25|56->25|58->27|59->28|60->29|61->30|63->32|64->33|66->35|70->39|70->39
                  -- GENERATED --
              */
          