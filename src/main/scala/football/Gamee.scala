package football

class Gamee {
  var homeScore: Int = 0
  var awayScore: Int = 0

  var state: State = new BeforeState(this)

  def start(): Unit = {
    println("Let the game begin")
    state.start()
  }
  def loseBall(): Unit = {
    println("The ball is taken away by the opposing team")
    state.loseBall()
  }
  def endHT(): Unit = {
    println("And the half is over, what a astonishing half")
    state.endHT()

  }
}
