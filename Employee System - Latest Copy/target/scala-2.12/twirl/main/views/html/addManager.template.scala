
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

object addManager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Manager],Form[models.users.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ManagerForm: Form[models.users.Manager], addressForm: Form[models.users.Address],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*1.108*/("""


"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Manager",user)/*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new Manager</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addManagerSubmit, 'class -> "form-horizontal", 'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*12.157*/ {_display_(Seq[Any](format.raw/*12.159*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
             """),_display_(/*16.15*/inputText(ManagerForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.92*/("""
             """),_display_(/*17.15*/inputText(ManagerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.90*/("""
             """),_display_(/*18.15*/inputDate(ManagerForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*18.126*/("""
             """),_display_(/*19.15*/inputText(ManagerForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.98*/("""
             """),format.raw/*20.14*/("""<!-- """),_display_(/*20.20*/inputText(ManagerForm("dept"), '_label -> "Department", 'class -> "form-control")),format.raw/*20.101*/("""          """),format.raw/*20.111*/("""-->
             """),_display_(/*21.15*/inputText(ManagerForm("jobRole"), '_label -> "Position", 'class -> "form-control")),format.raw/*21.97*/("""
             
		"""),format.raw/*23.3*/("""<p><strong>Assign Projects</strong></p>
            """),_display_(/*24.14*/for((value, name) <- project.Project.options) yield /*24.59*/ {_display_(Seq[Any](format.raw/*24.61*/("""
                """),format.raw/*25.17*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*25.68*/value),format.raw/*25.73*/(""""  
                    """),_display_(/*26.22*/if(ManagerForm("id").getValue.isPresent && ManagerForm("id").getValue.get != "")/*26.102*/ {_display_(Seq[Any](format.raw/*26.104*/(""" 
                        """),_display_(/*27.26*/if(project.Project.inProject(value.toLong, ManagerForm("id").getValue.get.toLong))/*27.108*/ {_display_(Seq[Any](format.raw/*27.110*/("""
                            """),format.raw/*28.29*/("""checked
                        """)))}),format.raw/*29.26*/("""
                    """)))}),format.raw/*30.22*/(""" 
                """),format.raw/*31.17*/("""/> """),_display_(/*31.21*/name),format.raw/*31.25*/(""" """),format.raw/*31.26*/("""</br>
            """)))}),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""</p>


             """),_display_(/*36.15*/inputText(addressForm("street1"), '_label -> "Street 1 Address", 'class -> "form-control")),format.raw/*36.105*/("""
             """),_display_(/*37.15*/inputText(addressForm("street2"), '_label -> "Street 2 Address", 'class -> "form-control")),format.raw/*37.105*/("""
             """),_display_(/*38.15*/inputText(addressForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*38.90*/("""
             """),_display_(/*39.15*/inputText(addressForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*39.98*/("""

             """),_display_(/*41.15*/inputText(ManagerForm("role").copy(value=Some("manager")), '_label -> "",'hidden -> "hidden")),format.raw/*41.108*/("""
             """),_display_(/*42.15*/inputText(addressForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*42.82*/("""



             """),format.raw/*46.14*/("""<label>Image Upload</label>
             <input class="btn-sm btn-default" type="file" name="upload"> 

            
            <!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            
            """),_display_(/*55.14*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*55.108*/ {_display_(Seq[Any](format.raw/*55.110*/("""
            """),format.raw/*56.13*/("""<div class="actions">
                <input type="submit" value="Add / Update Manager" class="btn btn-primary">
                <a href=""""),_display_(/*58.27*/routes/*58.33*/.HomeController.usersManagers()),format.raw/*58.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        """)))}),format.raw/*62.10*/(""" """),format.raw/*63.24*/("""
""")))}),format.raw/*64.2*/(""" """),format.raw/*64.20*/("""
""")))}))
      }
    }
  }

  def render(ManagerForm:Form[models.users.Manager],addressForm:Form[models.users.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(ManagerForm,addressForm,user)

  def f:((Form[models.users.Manager],Form[models.users.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (ManagerForm,addressForm,user) => apply(ManagerForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:58:58 GMT 2019
                  SOURCE: D:/CA1Public/CA1PUBLIC/Employee System - Latest Copy/app/views/addManager.scala.html
                  HASH: a04d92159890fefb201b9fbbc8dc4d494c615f0b
                  MATRIX: 1018->1|1197->114|1243->107|1275->131|1303->134|1335->158|1373->159|1405->165|1732->466|1893->617|1934->619|1972->657|2010->757|2048->768|2061->772|2092->782|2135->798|2233->875|2276->891|2372->966|2415->982|2548->1093|2591->1109|2695->1192|2738->1207|2771->1213|2874->1294|2913->1304|2959->1323|3062->1405|3108->1424|3189->1478|3250->1523|3290->1525|3336->1543|3414->1594|3440->1599|3493->1625|3583->1705|3624->1707|3679->1735|3771->1817|3812->1819|3870->1849|3935->1883|3989->1906|4036->1925|4067->1929|4092->1933|4121->1934|4172->1954|4214->1968|4265->1992|4377->2082|4420->2098|4532->2188|4575->2204|4671->2279|4714->2295|4818->2378|4863->2396|4978->2489|5021->2505|5109->2572|5158->2593|5568->2976|5672->3070|5713->3072|5755->3086|5923->3227|5938->3233|5990->3264|6159->3402|6188->3481|6221->3484|6250->3502
                  LINES: 28->1|31->4|34->1|37->5|38->6|38->6|38->6|39->7|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|52->20|52->20|53->21|53->21|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|61->29|62->30|63->31|63->31|63->31|63->31|64->32|65->33|68->36|68->36|69->37|69->37|70->38|70->38|71->39|71->39|73->41|73->41|74->42|74->42|78->46|87->55|87->55|87->55|88->56|90->58|90->58|90->58|94->62|94->63|95->64|95->64
                  -- GENERATED --
              */
          