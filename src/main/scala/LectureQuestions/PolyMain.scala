package LectureQuestions


class Car(val make: String, val model: String, val year: Int = 1998) {

  def print(): Unit = {
    println("Goes Fast")
  }
}

class Bugati(aModel : String = "Mistral", aYear: Int = 2022) extends Car("Bugati", aModel, aYear) {
  override def print(): Unit = {
    println("Car goes BRUUUUUUUUUUUUUUUUUUUUUUUUMMMMMMMMMMMMMMM")
  }
}


object PolyMain {
  def main(args: Array[String]): Unit = {
    val bob:Car = new Car("Ford", "Focus")
    val veyron: Bugati = new Bugati("Veyron", 2010)
    bob.print()
    veyron.print

  }



}


