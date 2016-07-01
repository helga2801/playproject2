
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addfruit_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class addfruit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Fruit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fruitForm: Form[Fruit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    """),format.raw/*8.5*/("""<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href=" ">Add Form</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
            </div>
        </div>
    </nav>
    <div class="jumbotron">
        <div class="container">
            <h2>Add fruit</h2>

        </div>
    </div>
    <div class="container">

    """),_display_(/*25.6*/b3/*25.8*/.form(action = routes.Application.save(), 'method -> "post")/*25.68*/ {_display_(Seq[Any](format.raw/*25.70*/("""
        
        """),format.raw/*27.9*/("""<fieldset>
            """),_display_(/*28.14*/b3/*28.16*/.text(fruitForm("name"), '_label -> "Name")),format.raw/*28.59*/("""
            """),_display_(/*29.14*/b3/*29.16*/.text(fruitForm("sum"), '_label -> "Sum")),format.raw/*29.57*/("""
            """),_display_(/*30.14*/b3/*30.16*/.text(fruitForm("description"), '_label -> "Description")),format.raw/*30.73*/("""
        """),format.raw/*31.9*/("""</fieldset>
        
        <div class="actions">
            <input type="submit" class="btn btn-primary" value="save">
            <a class="btn btn-primary"href=""""),_display_(/*35.46*/routes/*35.52*/.Application.list()),format.raw/*35.71*/("""">cancel</a>
        </div>
        
    """)))}),format.raw/*38.6*/("""
    """),format.raw/*39.5*/("""</div>
    <hr>
    <footer> </footer>
""")))}))
      }
    }
  }

  def render(fruitForm:Form[Fruit]): play.twirl.api.HtmlFormat.Appendable = apply(fruitForm)

  def f:((Form[Fruit]) => play.twirl.api.HtmlFormat.Appendable) = (fruitForm) => apply(fruitForm)

  def ref: this.type = this

}


}

/**/
object addfruit extends addfruit_Scope0.addfruit
              /*
                  -- GENERATED --
                  DATE: Fri Jul 01 03:24:01 EEST 2016
                  SOURCE: C:/Users/OL4ik/Desktop/play-ebean-example-master/play-ebean-example-master/app/views/addfruit.scala.html
                  HASH: 8b30ebf5937ecfc4e35f4b85a2a7952b1f49f4c4
                  MATRIX: 756->1|926->25|954->44|981->82|1008->84|1019->88|1057->90|1088->95|1580->561|1590->563|1659->623|1699->625|1744->643|1795->667|1806->669|1870->712|1911->726|1922->728|1984->769|2025->783|2036->785|2114->842|2150->851|2344->1018|2359->1024|2399->1043|2471->1085|2503->1090
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|38->8|55->25|55->25|55->25|55->25|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|65->35|65->35|65->35|68->38|69->39
                  -- GENERATED --
              */
          