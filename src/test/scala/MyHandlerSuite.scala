import example._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyHandlerSuite extends FunSuite {

  test("Given name string shall be returned in greeting message") {
    def namestr = "foobar"
    assert(new MyHandler().handler(new Name(namestr), null).message.contains(namestr), "Greeting does not contain " + namestr)
  }

}
