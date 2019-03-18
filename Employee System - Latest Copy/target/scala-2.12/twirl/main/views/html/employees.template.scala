
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Employee],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.93*/("""
"""),_display_(/*2.2*/main("Employees",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""

    """),_display_(/*4.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*4.100*/ {_display_(Seq[Any](format.raw/*4.102*/("""
    """),format.raw/*5.5*/("""<h1>Employee Management</h1>
    """)))}/*6.7*/else/*6.12*/{_display_(Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<h1>Employee List</h1>
    """)))}),format.raw/*8.6*/("""

    """),format.raw/*10.71*/("""
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
		"""),format.raw/*12.3*/("""<div class="alert alert-success">
			"""),_display_(/*13.5*/flash/*13.10*/.get("success")),format.raw/*13.25*/("""
		"""),format.raw/*14.3*/("""</div>
""")))}),format.raw/*15.2*/("""

    """),format.raw/*17.5*/("""<div class="col-sm-12">
        <h4>Here are all the current employees on the system. </h4>



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
       
            """),format.raw/*44.62*/("""
            """),_display_(/*45.14*/for(e<-employees) yield /*45.31*/ {_display_(Seq[Any](format.raw/*45.33*/("""
               """),format.raw/*46.16*/("""<tr>
                    """),_display_(/*47.22*/if(env.resource("public/images/productImages/" + e.getId + "thumb.jpg").isDefined)/*47.104*/ {_display_(Seq[Any](format.raw/*47.106*/("""
                        """),format.raw/*48.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*48.69*/(e.getId + "thumb.jpg")),format.raw/*48.92*/(""""/></td>
                    """)))}/*49.23*/else/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
                        """),format.raw/*50.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
""")))}),format.raw/*51.2*/("""
                    """),format.raw/*52.21*/("""<td>"""),_display_(/*52.26*/e/*52.27*/.getId),format.raw/*52.33*/("""</td>
                    <td>"""),_display_(/*53.26*/e/*53.27*/.getName),format.raw/*53.35*/("""</td>
                    <td>"""),_display_(/*54.26*/e/*54.27*/.getJobRole),format.raw/*54.38*/("""</td>
                    <td>"""),_display_(/*55.26*/e/*55.27*/.getAddress().getStreet1),format.raw/*55.51*/("""</td>
                    <td>"""),_display_(/*56.26*/e/*56.27*/.getAddress().getStreet2),format.raw/*56.51*/("""</td>
                    <td>"""),_display_(/*57.26*/e/*57.27*/.getAddress().getTown),format.raw/*57.48*/("""</td>
                    <td>"""),_display_(/*58.26*/e/*58.27*/.getAddress().getPostCode),format.raw/*58.52*/("""</td>
                    <td>"""),_display_(/*59.26*/e/*59.27*/.getDepartment()),format.raw/*59.43*/("""</td>
                    <td>"""),_display_(/*60.26*/e/*60.27*/.getEmail),format.raw/*60.36*/("""</td>
                    <td>"""),_display_(/*61.26*/e/*61.27*/.getDateOfBirthString),format.raw/*61.48*/("""</td>

                    """),_display_(/*63.22*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*63.116*/ {_display_(Seq[Any](format.raw/*63.118*/("""
                  """),format.raw/*64.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*66.18*/routes/*66.24*/.HomeController.updateEmployee(e.getEmail)),format.raw/*66.66*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*72.18*/routes/*72.24*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*72.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*77.14*/(""" """),format.raw/*77.57*/("""
            
        """)))}),format.raw/*79.10*/("""
        
        """),format.raw/*81.9*/("""</tbody>
    </table>

    """),_display_(/*84.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*84.100*/ {_display_(Seq[Any](format.raw/*84.102*/("""
    """),format.raw/*85.5*/("""<p>
        <a href=""""),_display_(/*86.19*/routes/*86.25*/.HomeController.addEmployee()),format.raw/*86.54*/("""">
            <button class="btn btn-primary">Add a new Employee</button>
        </a>
    </p>
    """)))}),format.raw/*90.6*/("""
"""),format.raw/*91.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,user,env)

  def f:((List[models.users.Employee],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,user,env) => apply(employees,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:58:59 GMT 2019
                  SOURCE: D:/CA1Public/CA1PUBLIC/Employee System - Latest Copy/app/views/employees.scala.html
                  HASH: 85ecfb641b3c8ec36f5872ea1056d73c6a818733
                  MATRIX: 1012->1|1198->92|1226->95|1256->117|1294->118|1328->127|1431->221|1471->223|1503->229|1555->265|1567->270|1605->271|1637->277|1695->306|1731->380|1761->384|1802->416|1842->418|1873->422|1938->461|1952->466|1988->481|2019->485|2058->494|2093->502|2909->1339|2951->1354|2984->1371|3024->1373|3069->1390|3123->1417|3215->1499|3256->1501|3310->1527|3381->1571|3425->1594|3475->1626|3488->1631|3527->1632|3581->1658|3676->1723|3726->1745|3758->1750|3768->1751|3795->1757|3854->1789|3864->1790|3893->1798|3952->1830|3962->1831|3994->1842|4053->1874|4063->1875|4108->1899|4167->1931|4177->1932|4222->1956|4281->1988|4291->1989|4333->2010|4392->2042|4402->2043|4448->2068|4507->2100|4517->2101|4554->2117|4613->2149|4623->2150|4653->2159|4712->2191|4722->2192|4764->2213|4821->2243|4925->2337|4966->2339|5014->2359|5094->2412|5109->2418|5172->2460|5405->2666|5420->2672|5483->2714|5714->2914|5743->2957|5799->2982|5846->3002|5903->3033|6007->3127|6048->3129|6081->3135|6131->3158|6146->3164|6196->3193|6332->3299|6361->3301
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|40->8|42->10|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|49->17|76->44|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|83->51|84->52|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|95->63|95->63|95->63|96->64|98->66|98->66|98->66|104->72|104->72|104->72|109->77|109->77|111->79|113->81|116->84|116->84|116->84|117->85|118->86|118->86|118->86|122->90|123->91
                  -- GENERATED --
              */
          