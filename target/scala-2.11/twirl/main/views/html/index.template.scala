
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[com.avaje.ebean.PagedList[Fruit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fruits: com.avaje.ebean.PagedList[Fruit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href=" ">Application</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
            </div>
        </div>
    </nav>
    <div class="jumbotron">
        <div class="container">
            <div id="actions">

            </div>
            """),_display_(/*17.14*/if(flash.containsKey("success"))/*17.46*/ {_display_(Seq[Any](format.raw/*17.48*/("""
                """),format.raw/*18.17*/("""<div class="alert-message warning">
                """),_display_(/*19.18*/flash/*19.23*/.get("success")),format.raw/*19.38*/("""
                """),format.raw/*20.17*/("""</div>
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""</div>
    </div>
    <div class="container">
        <h2>StorehouseFruits</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>name</th>
                    <th>sum</th>
                    <th>description</th>

                </tr>
            </thead>
            <tbody>

                """),_display_(/*37.18*/for(fruit <- fruits.getList) yield /*37.46*/ {_display_(Seq[Any](format.raw/*37.48*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td><a href=""""),_display_(/*39.39*/routes/*39.45*/.Application.edit(fruit.id)),format.raw/*39.72*/("""">"""),_display_(/*39.75*/fruit/*39.80*/.name),format.raw/*39.85*/("""</a></td>
                        <td><a href=""""),_display_(/*40.39*/routes/*40.45*/.Application.edit(fruit.id)),format.raw/*40.72*/("""">"""),_display_(/*40.75*/fruit/*40.80*/.sum),format.raw/*40.84*/("""</a>
                        </td>
                        <td><a href=""""),_display_(/*42.39*/routes/*42.45*/.Application.edit(fruit.id)),format.raw/*42.72*/("""">"""),_display_(/*42.75*/fruit/*42.80*/.description),format.raw/*42.92*/("""</a>
                        </td>
                        <td><a class=" btn btn-primary" href=""""),_display_(/*44.64*/routes/*44.70*/.Application.edit(fruit.id)),format.raw/*44.97*/("""">edit</a></td>
                        <td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal-"""),_display_(/*45.116*/fruit/*45.121*/.id),format.raw/*45.124*/("""">delete</button>
                            <div class="modal fade" id="modal-"""),_display_(/*46.64*/fruit/*46.69*/.id),format.raw/*46.72*/("""" role="dialog">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                            <h4 class="modal-title">Remove</h4>
                                        </div>
                                        <div class="modal-body">
                                            <p>Are sure you want to delete?</p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
                                            <button type="button" class="btn btn-primary" onclick="javascript:del("""),format.raw/*58.115*/("""{"""),format.raw/*58.116*/("""urlToDelete:'"""),_display_(/*58.130*/routes/*58.136*/.Application.delete(fruit.id)),format.raw/*58.165*/("""'"""),format.raw/*58.166*/("""}"""),format.raw/*58.167*/(""")">Yes</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <script>
         function del(parameters) """),format.raw/*66.35*/("""{"""),format.raw/*66.36*/("""
             """),format.raw/*67.14*/("""var urlToDelete = parameters.urlToDelete;
             $.ajax("""),format.raw/*68.21*/("""{"""),format.raw/*68.22*/("""
                 """),format.raw/*69.18*/("""url: urlToDelete,
                 type: 'DELETE',
                 success: function(results) """),format.raw/*71.45*/("""{"""),format.raw/*71.46*/("""
                     """),format.raw/*72.22*/("""location.reload();
                 """),format.raw/*73.18*/("""}"""),format.raw/*73.19*/("""
             """),format.raw/*74.14*/("""}"""),format.raw/*74.15*/(""");
         """),format.raw/*75.10*/("""}"""),format.raw/*75.11*/("""
        """),format.raw/*76.9*/("""</script>

                """)))}),format.raw/*78.18*/("""

            """),format.raw/*80.13*/("""</tbody>
        </table>
        <a class="btn btn-primary" href=""""),_display_(/*82.43*/routes/*82.49*/.Application.add()),format.raw/*82.67*/("""">Add</a>

        
    </div>
""")))}),format.raw/*86.2*/("""
        


            """))
      }
    }
  }

  def render(fruits:com.avaje.ebean.PagedList[Fruit]): play.twirl.api.HtmlFormat.Appendable = apply(fruits)

  def f:((com.avaje.ebean.PagedList[Fruit]) => play.twirl.api.HtmlFormat.Appendable) = (fruits) => apply(fruits)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Jul 01 04:08:18 EEST 2016
                  SOURCE: C:/Users/OL4ik/Desktop/play-ebean-example-master/play-ebean-example-master/app/views/index.scala.html
                  HASH: 31c234e6bc3662745605ac36874b1c58c6b5da42
                  MATRIX: 771->1|908->43|935->45|946->49|984->51|1015->56|1483->497|1524->529|1564->531|1609->548|1689->601|1703->606|1739->621|1784->638|1835->658|1871->667|2253->1022|2297->1050|2337->1052|2386->1073|2456->1116|2471->1122|2519->1149|2549->1152|2563->1157|2589->1162|2664->1210|2679->1216|2727->1243|2757->1246|2771->1251|2796->1255|2896->1328|2911->1334|2959->1361|2989->1364|3003->1369|3036->1381|3161->1479|3176->1485|3224->1512|3383->1643|3398->1648|3423->1651|3531->1732|3545->1737|3569->1740|4597->2739|4627->2740|4669->2754|4685->2760|4736->2789|4766->2790|4796->2791|5123->3090|5152->3091|5194->3105|5284->3167|5313->3168|5359->3186|5482->3281|5511->3282|5561->3304|5625->3340|5654->3341|5696->3355|5725->3356|5765->3368|5794->3369|5830->3378|5889->3406|5931->3420|6026->3488|6041->3494|6080->3512|6142->3544
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|53->22|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|73->42|73->42|73->42|73->42|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|89->58|89->58|89->58|89->58|89->58|89->58|89->58|97->66|97->66|98->67|99->68|99->68|100->69|102->71|102->71|103->72|104->73|104->73|105->74|105->74|106->75|106->75|107->76|109->78|111->80|113->82|113->82|113->82|117->86
                  -- GENERATED --
              */
          