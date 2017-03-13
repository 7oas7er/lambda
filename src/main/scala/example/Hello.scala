package example;

import com.amazonaws.services.lambda.runtime.Context;

object Hello extends App {

  def myHandler(name: String, context: Context): String = {
    context.getLogger().log("-> myHandler(" + name + ")")

    s"Hello $name"
  }

}