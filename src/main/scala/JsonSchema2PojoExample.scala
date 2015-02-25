import ExamplePoJo.Example

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule

object JsonSchema2PojoExample extends App {
  val mapper = new ObjectMapper()
  mapper.registerModule(new SimpleModule())

  def loadExample(resource: String) =
    mapper.readValue(getClass.getResource(resource), classOf[Example])

  val example1 = loadExample("example1.json")
  val example2 = loadExample("example2.json")

  println(f"example1.json: ${example1.getFirstName}, ${example1.getLastName}, ${example1.getAge}")
  println(f"example2.json: ${example2.getFirstName}, ${example2.getLastName}, ${example2.getAge}")

}