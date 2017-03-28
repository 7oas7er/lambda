import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyHandlerSuite extends FunSuite {

  test("foobar") {
    assert(1 == 1, "test should run")
  }

}
