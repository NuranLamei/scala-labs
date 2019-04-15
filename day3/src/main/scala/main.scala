object App extends App {

  // Pattern matching

  def matchTest(x: Int) : String = {
    x match {
      case 1 => "One"
      case 2 => "two"
      case _ => "Many"
    }
  }

  case class Person(name: String, age: Int)

  println(matchPerson(Person("Ahmed", 22)))

  def matchPerson(p: Person): String = p match {
    case x if x.age < 10 => "He is young"
    case _ => "he is old"
  }

  println(matchPerson2(Person("Ahmed", 9)))

  def matchPerson2(p: Person): String = p match {
    case Person(_, age) if age < 10 =>
      "He is young"
    case _ => "He is old"
  }

  println(matchPerson3(Person("Ahmed", 9)))
  println(matchPerson3(3))

  def matchPerson3(p: Any): String = p match {
    case x: Person =>
      "It is person"
    case _ => "UnKnown"
  }

  println(matchPerson4(Person("Ahmed", 9)))
  println(matchPerson4(3))

  def matchPerson4(p: Any): String = p match {
    case x @ Person(_, age) if age < 10 =>
      "It's a person and He is young"
    case _ => "Unknown"
  }


}