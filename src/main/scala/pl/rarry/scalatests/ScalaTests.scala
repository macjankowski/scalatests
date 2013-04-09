package pl.rarry.scalatests

/**
 * @author Maciej Jankowski
 *
 */
class ScalaTests {

  lazy val getName: String = getString match {
    case None => return ""
    case Some(str) => return str
  }

  def getString: Option[String] = Some("abc")
}