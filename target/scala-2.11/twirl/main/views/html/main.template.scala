
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title> Application</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png")),format.raw/*11.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*12.105*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.at("stylesheets/main.css")),format.raw/*13.94*/("""">
        <script type='text/javascript' src='"""),_display_(/*14.46*/routes/*14.52*/.Assets.at("javascripts/index.js")),format.raw/*14.86*/("""'></script>
            <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>

        <section id="main">
            """),_display_(/*23.14*/content),format.raw/*23.21*/("""
        """),format.raw/*24.9*/("""</section>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.at("lib/jquery/jquery.js")),format.raw/*25.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.at("lib/bootstrap/js/bootstrap.js")),format.raw/*26.72*/("""" type="text/javascript"></script>



    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Jul 01 03:24:01 EEST 2016
                  SOURCE: C:/Users/OL4ik/Desktop/play-ebean-example-master/play-ebean-example-master/app/views/main.scala.html
                  HASH: 7cd1477b631aae1223868300c7daae8c09954e15
                  MATRIX: 741->1|851->16|879->18|1215->327|1230->333|1283->365|1366->421|1381->427|1448->472|1531->528|1546->534|1601->568|1676->616|1691->622|1746->656|2065->948|2093->955|2129->964|2189->997|2204->1003|2259->1037|2343->1094|2358->1100|2422->1143
                  LINES: 27->1|32->1|34->3|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26
                  -- GENERATED --
              */
          