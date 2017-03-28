package example

import com.amazonaws.services.lambda.runtime.Context
import io.circe.generic.auto._
import io.github.yeghishe.lambda._

case class Name(name: String)
case class Greeting(message: String)

class MyHandler extends Handler[Name, Greeting] {
  def handler(name: Name, context: Context): Greeting = {
    logger.info(s"Name is $name")
    Greeting(s"Hi ${name.name}. Have a nice day!")
  }
}
