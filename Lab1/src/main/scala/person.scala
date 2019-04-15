object Main extends App{

  case class Person(name: String, age: Int){}

  val p = Person("Nuran", 22)

  p match{

    case Person(_, age)  if(age < 12) => println("Child")
    case Person(_, age)  if(age <= 25) => println("Teenager")
    case Person(_, age)  if(age <= 60) => println("Aldult")
    case Person(_, age)  if(age >60) => println("Elderly")
  }

}
