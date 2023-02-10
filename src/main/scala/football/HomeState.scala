package football

class HomeState (game: Gamee) extends State (game: Gamee){
  override def start(): Unit = {
    println("Game already is in progress")
  }

  override def loseBall(): Unit = {
    println("Ball lost")
    game.state = new AwayState(game)

  }

  override def score(): Unit = {
    println("Gooooooooooaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallllllllllllllllllllllllllllllll")
    game.homeScore += 1
    game.state = new AwayState(game)

  }

  override def endHT(): Unit = {
    println("the half is over")
  }
}
