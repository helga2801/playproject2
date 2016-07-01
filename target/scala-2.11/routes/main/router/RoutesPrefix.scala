
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/OL4ik/Desktop/play-ebean-example-master/play-ebean-example-master/conf/routes
// @DATE:Fri Jul 01 04:09:47 EEST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
