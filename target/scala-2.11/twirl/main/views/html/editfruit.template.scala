
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editfruit_Scope0 {
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

class editfruit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Fruit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, fruitForm: Form[Fruit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    """),format.raw/*8.5*/("""<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href=" ">Edit Form</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
            </div>
        </div>
    </nav>
    <div class="jumbotron">
        <div class="container">
            <h2>Edit fruit</h2>
        </div>
    </div>
    <div class="container">

    """),_display_(/*24.6*/b3/*24.8*/.form(action = routes.Application.doEdit(id), 'method -> "post")/*24.72*/ {_display_(Seq[Any](format.raw/*24.74*/("""
         """),format.raw/*25.10*/("""<fieldset>
            """),_display_(/*26.14*/b3/*26.16*/.text(fruitForm("name"), '_label -> "Name")),format.raw/*26.59*/("""
            """),_display_(/*27.14*/b3/*27.16*/.text(fruitForm("sum"), '_label -> "Sum")),format.raw/*27.57*/("""
            """),_display_(/*28.14*/b3/*28.16*/.text(fruitForm("description"), '_label -> "Description")),format.raw/*28.73*/("""
        """),format.raw/*29.9*/("""</fieldset>
        
        <div class="actions">
            <input type="submit" class="btn btn-primary" value="save">
            <a class="btn btn-primary"href=""""),_display_(/*33.46*/routes/*33.52*/.Application.list()),format.raw/*33.71*/("""">cancel</a>
        </div>

    """)))}),format.raw/*36.6*/("""
    """),format.raw/*37.5*/("""</div>
    <hr>
    <footer> </footer>
""")))}),format.raw/*40.2*/("""
    

"""))
      }
    }
  }

  def render(id:Long,fruitForm:Form[Fruit]): play.twirl.api.HtmlFormat.Appendable = apply(id,fruitForm)

  def f:((Long,Form[Fruit]) => play.twirl.api.HtmlFormat.Appendable) = (id,fruitForm) => apply(id,fruitForm)

  def ref: this.type = this

}


}

/**/
object editfruit extends editfruit_Scope0.editfruit
              /*
                  -- GENERATED --
                  DATE: Fri Jul 01 03:38:14 EEST 2016
                  SOURCE: C:/Users/OL4ik/Desktop/play-ebean-example-master/play-ebean-example-master/app/views/editfruit.scala.html
                  HASH: 827bc98768c49518a6ec9254e487ec82b7ae0a8f
                  MATRIX: 763->1|943->35|971->54|998->92|1025->94|1036->98|1074->100|1105->105|1598->572|1608->574|1681->638|1721->640|1759->650|1810->674|1821->676|1885->719|1926->733|1937->735|1999->776|2040->790|2051->792|2129->849|2165->858|2359->1025|2374->1031|2414->1050|2478->1084|2510->1089|2580->1129
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|38->8|54->24|54->24|54->24|54->24|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|59->29|63->33|63->33|63->33|66->36|67->37|70->40
                  -- GENERATED --
              */
          