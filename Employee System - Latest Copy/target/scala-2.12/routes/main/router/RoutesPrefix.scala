// @GENERATOR:play-routes-compiler
// @SOURCE:D:/CA1Public/CA1PUBLIC/Employee System - Latest Copy/conf/routes
// @DATE:Mon Mar 18 15:47:10 GMT 2019


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
