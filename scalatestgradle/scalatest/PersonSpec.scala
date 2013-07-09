import collection.mutable.Stack
import org.scalatest._
import org.scalatest.matchers._
import org.gradle.Person
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PersonSpec extends FlatSpec with ShouldMatchers {
  
  "A Person" should "have a name" in {
    val person:Person = new Person("test")
    "test" should be === person.getName()
  }
}