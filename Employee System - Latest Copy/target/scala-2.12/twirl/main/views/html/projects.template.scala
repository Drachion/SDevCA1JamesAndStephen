
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.project.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee], projects: List[models.project.Project],
user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.51*/("""
"""),_display_(/*3.2*/main("Projects",user)/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""

    """),_display_(/*5.6*/if((user != null) && ("employee".equals(user.getRole())))/*5.63*/ {_display_(Seq[Any](format.raw/*5.65*/("""
        """),format.raw/*6.9*/("""<h1>Your Current Projects</h1>
    """)))}/*7.7*/else/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""
        """),format.raw/*8.9*/("""<h1>Currently Active Projects</h1>
    """)))}),format.raw/*9.6*/("""


    """),format.raw/*12.74*/("""
	"""),_display_(/*13.3*/if(flash.containsKey("success"))/*13.35*/ {_display_(Seq[Any](format.raw/*13.37*/("""
		"""),format.raw/*14.3*/("""<div class="alert alert-success">
			"""),_display_(/*15.5*/flash/*15.10*/.get("success")),format.raw/*15.25*/("""
		"""),format.raw/*16.3*/("""</div>
""")))}),format.raw/*17.2*/("""
    """),format.raw/*18.5*/("""<div class="col-sm-3">
        <h4>Project List</h4>
            <ul class="list-group">
                <a href = """"),_display_(/*21.29*/routes/*21.35*/.HomeController.projects(0)),format.raw/*21.62*/("""" class="list-group-item">All Projects</a>
            """),_display_(/*22.14*/for(p<-projects) yield /*22.30*/ {_display_(Seq[Any](format.raw/*22.32*/("""
                """),format.raw/*23.17*/("""<a href = """"),_display_(/*23.29*/routes/*23.35*/.HomeController.projects(p.getId())),format.raw/*23.70*/("""" class="list-group-item catheight">"""),_display_(/*23.107*/p/*23.108*/.getName),format.raw/*23.116*/("""
                    """),format.raw/*24.21*/("""<span class="badge">"""),_display_(/*24.42*/p/*24.43*/.getEmployees.size),format.raw/*24.61*/("""</span> 
                </a>
            """)))}),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""</ul>
    </div>

    <div class="col-sm-9">

        """),_display_(/*32.10*/if((user != null) && ("employee".equals(user.getRole())))/*32.67*/ {_display_(Seq[Any](format.raw/*32.69*/("""
            """),format.raw/*33.13*/("""<h4>Select from your assigned projects from the list to view full list of colleagues active on it.</h4>
        """)))}/*34.11*/else/*34.16*/{_display_(Seq[Any](format.raw/*34.17*/("""
            """),format.raw/*35.13*/("""<h4>Select a project from the list to view all employees currently assigned to it.</h4>
        """)))}),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""<table class="table table-bordered table-hover table-condensed">
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
            <th>Department</th>
            <th>Email</th>
            <th>DOB</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*57.66*/("""
            """),_display_(/*58.14*/for(e<-employees) yield /*58.31*/ {_display_(Seq[Any](format.raw/*58.33*/("""
               """),format.raw/*59.16*/("""<tr>
                    """),_display_(/*60.22*/if(env.resource("public/images/productImages/" + e.getId + "thumb.jpg").isDefined)/*60.104*/ {_display_(Seq[Any](format.raw/*60.106*/("""
                        """),format.raw/*61.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*61.69*/(e.getId + "thumb.jpg")),format.raw/*61.92*/(""""/></td>
                    """)))}/*62.23*/else/*62.28*/{_display_(Seq[Any](format.raw/*62.29*/("""
                        """),format.raw/*63.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*64.22*/("""
                  """),format.raw/*65.19*/("""<td>"""),_display_(/*65.24*/e/*65.25*/.getId),format.raw/*65.31*/("""</td>
                  <td>"""),_display_(/*66.24*/e/*66.25*/.getName),format.raw/*66.33*/("""</td>
                  <td>"""),_display_(/*67.24*/e/*67.25*/.getJobRole),format.raw/*67.36*/("""</td>
                  <td>"""),_display_(/*68.24*/e/*68.25*/.getAddress().getStreet1),format.raw/*68.49*/("""</td>
                  <td>"""),_display_(/*69.24*/e/*69.25*/.getAddress().getStreet2),format.raw/*69.49*/("""</td>
                  <td>"""),_display_(/*70.24*/e/*70.25*/.getAddress().getTown),format.raw/*70.46*/("""</td>
                  <td>"""),_display_(/*71.24*/e/*71.25*/.getAddress().getPostCode),format.raw/*71.50*/("""</td>
                  <td>"""),_display_(/*72.24*/e/*72.25*/.getDepartment),format.raw/*72.39*/("""</td>
                  <td>"""),_display_(/*73.24*/e/*73.25*/.getEmail),format.raw/*73.34*/("""</td>
                  <td>"""),_display_(/*74.24*/e/*74.25*/.getDateOfBirthString),format.raw/*74.46*/("""</td>

                  """),_display_(/*76.20*/if((user != null) && ("manager".equals(user.getRole())))/*76.76*/ {_display_(Seq[Any](format.raw/*76.78*/("""
                  """),format.raw/*77.19*/("""<!-- Update button -->

			    <td>
					<a href=""""),_display_(/*80.16*/routes/*80.22*/.HomeController.updateEmployee(e.getEmail)),format.raw/*80.64*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
                        </td> 
                  <!-- Delete button -->

				<td>
					<a href=""""),_display_(/*87.16*/routes/*87.22*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*87.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
                </td>
                  """)))}),format.raw/*91.20*/(""" 

                """)))}),format.raw/*93.18*/("""
               """),format.raw/*94.16*/("""</tr>
            """)))}),format.raw/*95.14*/("""
        
        """),format.raw/*97.9*/("""</tbody>
    </table>
    """),_display_(/*99.6*/if((user != null) && ("manager".equals(user.getRole())))/*99.62*/ {_display_(Seq[Any](format.raw/*99.64*/("""
    """),format.raw/*100.5*/("""<p>
        <a href=""""),_display_(/*101.19*/routes/*101.25*/.HomeController.usersEmployees()),format.raw/*101.57*/("""">
            <button class="btn btn-primary">Manage Employees</button>
        </a>
    </p>
    """)))}),format.raw/*105.6*/("""
"""),format.raw/*106.1*/("""</div>
 """))
      }
    }
  }

  def render(employees:List[models.users.Employee],projects:List[models.project.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.users.Employee],List[models.project.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 16:03:17 GMT 2019
                  SOURCE: D:/CA1Public/CA1PUBLIC/Employee System - Latest Copy/app/views/projects.scala.html
                  HASH: 850a64b8908613b3a8f866db6cb88fd22de4abd9
                  MATRIX: 1040->1|1267->133|1295->136|1324->157|1362->158|1396->167|1461->224|1500->226|1536->236|1590->274|1602->279|1640->280|1676->290|1746->331|1784->410|1814->414|1855->446|1895->448|1926->452|1991->491|2005->496|2041->511|2072->515|2111->524|2144->530|2291->650|2306->656|2354->683|2438->740|2470->756|2510->758|2556->776|2595->788|2610->794|2666->829|2731->866|2742->867|2772->875|2822->897|2870->918|2880->919|2919->937|2995->982|3032->992|3119->1052|3185->1109|3225->1111|3267->1125|3400->1240|3413->1245|3452->1246|3494->1260|3623->1358|3660->1368|4242->1975|4284->1990|4317->2007|4357->2009|4402->2026|4456->2053|4548->2135|4589->2137|4643->2163|4714->2207|4758->2230|4808->2262|4821->2267|4860->2268|4914->2294|5030->2379|5078->2399|5110->2404|5120->2405|5147->2411|5204->2441|5214->2442|5243->2450|5300->2480|5310->2481|5342->2492|5399->2522|5409->2523|5454->2547|5511->2577|5521->2578|5566->2602|5623->2632|5633->2633|5675->2654|5732->2684|5742->2685|5788->2710|5845->2740|5855->2741|5890->2755|5947->2785|5957->2786|5987->2795|6044->2825|6054->2826|6096->2847|6151->2875|6216->2931|6256->2933|6304->2953|6385->3007|6400->3013|6463->3055|6691->3256|6706->3262|6769->3304|6972->3476|7025->3498|7070->3515|7121->3535|7168->3555|7223->3584|7288->3640|7328->3642|7362->3648|7413->3671|7429->3677|7483->3709|7618->3813|7648->3815
                  LINES: 28->1|34->2|35->3|35->3|35->3|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|58->26|59->27|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|68->36|69->37|89->57|90->58|90->58|90->58|91->59|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|94->62|95->63|96->64|97->65|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|108->76|108->76|108->76|109->77|112->80|112->80|112->80|119->87|119->87|119->87|123->91|125->93|126->94|127->95|129->97|131->99|131->99|131->99|132->100|133->101|133->101|133->101|137->105|138->106
                  -- GENERATED --
              */
          