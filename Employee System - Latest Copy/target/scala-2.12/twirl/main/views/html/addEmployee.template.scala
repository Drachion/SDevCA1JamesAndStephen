
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Employee],Form[models.users.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(empForm: Form[models.users.Employee], addressForm: Form[models.users.Address],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*1.105*/("""


"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Employee",user)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new Employee</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addEmployeeSubmit, 'class -> "form-horizontal", 'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*12.158*/ {_display_(Seq[Any](format.raw/*12.160*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
             """),_display_(/*16.15*/inputText(empForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.88*/("""
             """),_display_(/*17.15*/inputText(empForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.86*/("""
             """),_display_(/*18.15*/inputDate(empForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*18.122*/("""
             """),_display_(/*19.15*/inputText(empForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.94*/("""
             """),_display_(/*20.15*/inputText(empForm("dept"), '_label -> "Department", 'class -> "form-control")),format.raw/*20.92*/("""         
             """),_display_(/*21.15*/inputText(empForm("jobRole"), '_label -> "Position", 'class -> "form-control")),format.raw/*21.93*/("""
             
		"""),format.raw/*23.3*/("""<p><strong>Assign Projects</strong></p>
            """),_display_(/*24.14*/for((value, name) <- project.Project.options) yield /*24.59*/ {_display_(Seq[Any](format.raw/*24.61*/("""
                """),format.raw/*25.17*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*25.68*/value),format.raw/*25.73*/(""""  
                    """),_display_(/*26.22*/if(empForm("id").getValue.isPresent && empForm("id").getValue.get != "")/*26.94*/ {_display_(Seq[Any](format.raw/*26.96*/(""" 
                        """),_display_(/*27.26*/if(project.Project.inProject(value.toLong, empForm("id").getValue.get.toLong))/*27.104*/ {_display_(Seq[Any](format.raw/*27.106*/("""
                            """),format.raw/*28.29*/("""checked
                        """)))}),format.raw/*29.26*/("""
                    """)))}),format.raw/*30.22*/(""" 
                """),format.raw/*31.17*/("""/> """),_display_(/*31.21*/name),format.raw/*31.25*/(""" """),format.raw/*31.26*/("""</br>
            """)))}),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""</p>

	
"""),_display_(/*36.2*/inputText(addressForm("street1"), '_label -> "Street 1 Address", 'class -> "form-control")),format.raw/*36.92*/("""
             """),_display_(/*37.15*/inputText(addressForm("street2"), '_label -> "Street 2 Address", 'class -> "form-control")),format.raw/*37.105*/("""
             """),_display_(/*38.15*/inputText(addressForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*38.90*/("""
             """),_display_(/*39.15*/inputText(addressForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*39.98*/("""

             """),_display_(/*41.15*/inputText(empForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*41.105*/("""
             """),_display_(/*42.15*/inputText(addressForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*42.82*/("""



             """),format.raw/*46.14*/("""<label>Image Upload</label>
             <input class="btn-sm btn-default" type="file" name="upload"> 

            
            <!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            
            """),_display_(/*55.14*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*55.108*/ {_display_(Seq[Any](format.raw/*55.110*/("""
            """),format.raw/*56.13*/("""<div class="actions">
                <input type="submit" value="Add / Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*58.27*/routes/*58.33*/.HomeController.usersEmployees()),format.raw/*58.65*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        """)))}),format.raw/*62.10*/(""" """),format.raw/*63.24*/("""
""")))}),format.raw/*64.2*/(""" """),format.raw/*64.20*/("""
""")))}))
      }
    }
  }

  def render(empForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(empForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (empForm,addressForm,user) => apply(empForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:49:31 GMT 2019
                  SOURCE: D:/CA1Public/CA1PUBLIC/Employee System - Latest Copy/app/views/addEmployee.scala.html
                  HASH: 1a67d7aab8c8467c6bc14b5c333d53570c429f09
                  MATRIX: 1020->1|1196->111|1242->104|1274->128|1302->131|1335->156|1373->157|1405->163|1733->465|1895->617|1936->619|1974->657|2012->757|2050->768|2063->772|2094->782|2137->798|2231->871|2274->887|2366->958|2409->974|2538->1081|2581->1097|2681->1176|2724->1192|2822->1269|2874->1294|2973->1372|3019->1391|3100->1445|3161->1490|3201->1492|3247->1510|3325->1561|3351->1566|3404->1592|3485->1664|3525->1666|3580->1694|3668->1772|3709->1774|3767->1804|3832->1838|3886->1861|3933->1880|3964->1884|3989->1888|4018->1889|4069->1909|4111->1923|4149->1935|4260->2025|4303->2041|4415->2131|4458->2147|4554->2222|4597->2238|4701->2321|4746->2339|4858->2429|4901->2445|4989->2512|5038->2533|5448->2916|5552->3010|5593->3012|5635->3026|5804->3168|5819->3174|5872->3206|6041->3344|6070->3424|6103->3427|6132->3445
                  LINES: 28->1|31->4|34->1|37->5|38->6|38->6|38->6|39->7|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|61->29|62->30|63->31|63->31|63->31|63->31|64->32|65->33|68->36|68->36|69->37|69->37|70->38|70->38|71->39|71->39|73->41|73->41|74->42|74->42|78->46|87->55|87->55|87->55|88->56|90->58|90->58|90->58|94->62|94->63|95->64|95->64
                  -- GENERATED --
              */
          