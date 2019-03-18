
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

object manager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Manager],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(managers: List[models.users.Manager],user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.91*/("""
"""),_display_(/*2.2*/main("Manager",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""

    """),_display_(/*4.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*4.100*/ {_display_(Seq[Any](format.raw/*4.102*/("""
    """),format.raw/*5.5*/("""<h1>Manager Management</h1>
    """)))}/*6.7*/else/*6.12*/{_display_(Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<h1>Manager List</h1>
    """)))}),format.raw/*8.6*/("""

    """),format.raw/*10.71*/("""
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
		"""),format.raw/*12.3*/("""<div class="alert alert-success">
			"""),_display_(/*13.5*/flash/*13.10*/.get("success")),format.raw/*13.25*/("""
		"""),format.raw/*14.3*/("""</div>
""")))}),format.raw/*15.2*/("""

    """),format.raw/*17.5*/("""<div class="col-sm-12">
        <h4>Here are all the current Managers on the system. </h4>

        <!-- """),_display_(/*20.15*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*20.109*/ {_display_(Seq[Any](format.raw/*20.111*/("""
            """),format.raw/*21.13*/("""<p>
                <a href=""""),_display_(/*22.27*/routes/*22.33*/.HomeController.addManager()),format.raw/*22.61*/("""">
                    <button class="btn btn-primary">Add a new Manager</button>
                </a>
            </p>
        """)))}),format.raw/*26.10*/("""

        """),_display_(/*28.10*/if((user != null) && ("admin".equals(user.getRole())))/*28.64*/ {_display_(Seq[Any](format.raw/*28.66*/("""

            """),format.raw/*30.13*/("""<p>
                <a href=""""),_display_(/*31.27*/routes/*31.33*/.HomeController.addManager()),format.raw/*31.61*/("""">
                    <button class="btn btn-primary">Add a new Manager</button>
                </a>
            </p>

        """)))}),format.raw/*36.10*/(""" """),format.raw/*36.11*/("""-->


        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
                <th>Image</th>
                <th>ID</th>
                <th>Name</th>
                <th>Job Role</th>
                <th>Street1</th>
                <th>Street2</th>
                <th>Town</th>
                <th>Post Code</th>
                <th>Department(Won't save)</th>
                <th>Email</th>
                <th>DOB</th>

            <!-- DO we also need to output their address here?  -->
        </tr>
        </thead>
        <tbody>
        <!-- Managers data -->
       
            """),format.raw/*61.62*/("""
            """),_display_(/*62.14*/for(m<-managers) yield /*62.30*/ {_display_(Seq[Any](format.raw/*62.32*/("""
               """),format.raw/*63.16*/("""<tr>
                    """),_display_(/*64.22*/if(env.resource("public/images/productImages/" + m.getId + "thumb.jpg").isDefined)/*64.104*/ {_display_(Seq[Any](format.raw/*64.106*/("""
                        """),format.raw/*65.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*65.69*/(m.getId + "thumb.jpg")),format.raw/*65.92*/(""""/></td>
                    """)))}/*66.23*/else/*66.28*/{_display_(Seq[Any](format.raw/*66.29*/("""
                        """),format.raw/*67.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
""")))}),format.raw/*68.2*/("""
                    """),format.raw/*69.21*/("""<td>"""),_display_(/*69.26*/m/*69.27*/.getId),format.raw/*69.33*/("""</td>
                    <td>"""),_display_(/*70.26*/m/*70.27*/.getName),format.raw/*70.35*/("""</td>
                    <td>"""),_display_(/*71.26*/m/*71.27*/.getJobRole),format.raw/*71.38*/("""</td>
                    <td>"""),_display_(/*72.26*/m/*72.27*/.getAddress().getStreet1),format.raw/*72.51*/("""</td>
                    <td>"""),_display_(/*73.26*/m/*73.27*/.getAddress().getStreet2),format.raw/*73.51*/("""</td>
                    <td>"""),_display_(/*74.26*/m/*74.27*/.getAddress().getTown),format.raw/*74.48*/("""</td>
                    <td>"""),_display_(/*75.26*/m/*75.27*/.getAddress().getPostCode),format.raw/*75.52*/("""</td>
                    <td>"""),_display_(/*76.26*/m/*76.27*/.getDepartment()),format.raw/*76.43*/("""</td>
                    <td>"""),_display_(/*77.26*/m/*77.27*/.getEmail),format.raw/*77.36*/("""</td>
                    <td>"""),_display_(/*78.26*/m/*78.27*/.getDateOfBirthString),format.raw/*78.48*/("""</td>

                    """),_display_(/*80.22*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*80.116*/ {_display_(Seq[Any](format.raw/*80.118*/("""
                  """),format.raw/*81.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*83.18*/routes/*83.24*/.HomeController.updateManager(m.getEmail)),format.raw/*83.65*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*89.18*/routes/*89.24*/.HomeController.deleteManager(m.getEmail)),format.raw/*89.65*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*94.14*/(""" """),format.raw/*94.57*/("""
            
        """)))}),format.raw/*96.10*/("""
        
        """),format.raw/*98.9*/("""</tbody>
    </table>

    """),_display_(/*101.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*101.100*/ {_display_(Seq[Any](format.raw/*101.102*/("""
    """),format.raw/*102.5*/("""<p>
        <a href=""""),_display_(/*103.19*/routes/*103.25*/.HomeController.addManager()),format.raw/*103.53*/("""">
            <button class="btn btn-primary">Add a new Manager</button>
        </a>
    </p>
    """)))}),format.raw/*107.6*/("""
"""),format.raw/*108.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(managers:List[models.users.Manager],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(managers,user,env)

  def f:((List[models.users.Manager],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (managers,user,env) => apply(managers,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:58:59 GMT 2019
                  SOURCE: D:/CA1Public/CA1PUBLIC/Employee System - Latest Copy/app/views/manager.scala.html
                  HASH: d1b605d35ab943383997c6e6c1da5c3c8d94093b
                  MATRIX: 1009->1|1193->90|1221->93|1249->113|1287->114|1321->123|1424->217|1464->219|1496->225|1547->260|1559->265|1597->266|1629->272|1686->300|1722->374|1752->378|1793->410|1833->412|1864->416|1929->455|1943->460|1979->475|2010->479|2049->488|2084->496|2220->605|2324->699|2365->701|2407->715|2465->746|2480->752|2529->780|2693->913|2733->926|2796->980|2836->982|2880->998|2938->1029|2953->1035|3002->1063|3168->1198|3197->1199|3922->1945|3964->1960|3996->1976|4036->1978|4081->1995|4135->2022|4227->2104|4268->2106|4322->2132|4393->2176|4437->2199|4487->2231|4500->2236|4539->2237|4593->2263|4688->2328|4738->2350|4770->2355|4780->2356|4807->2362|4866->2394|4876->2395|4905->2403|4964->2435|4974->2436|5006->2447|5065->2479|5075->2480|5120->2504|5179->2536|5189->2537|5234->2561|5293->2593|5303->2594|5345->2615|5404->2647|5414->2648|5460->2673|5519->2705|5529->2706|5566->2722|5625->2754|5635->2755|5665->2764|5724->2796|5734->2797|5776->2818|5833->2848|5937->2942|5978->2944|6026->2964|6106->3017|6121->3023|6183->3064|6416->3270|6431->3276|6493->3317|6724->3517|6753->3560|6809->3585|6856->3605|6914->3636|7019->3730|7061->3732|7095->3738|7146->3761|7162->3767|7212->3795|7348->3900|7378->3902
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|40->8|42->10|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|49->17|52->20|52->20|52->20|53->21|54->22|54->22|54->22|58->26|60->28|60->28|60->28|62->30|63->31|63->31|63->31|68->36|68->36|93->61|94->62|94->62|94->62|95->63|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|100->68|101->69|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|107->75|107->75|107->75|108->76|108->76|108->76|109->77|109->77|109->77|110->78|110->78|110->78|112->80|112->80|112->80|113->81|115->83|115->83|115->83|121->89|121->89|121->89|126->94|126->94|128->96|130->98|133->101|133->101|133->101|134->102|135->103|135->103|135->103|139->107|140->108
                  -- GENERATED --
              */
          