package football

class AwayState (game: Gamee) extends State (game: Gamee){
  override def start(): Unit = {
    println("Game already is in progress")
  }

  override def loseBall(): Unit = {
    println("Ball lost")
    game.state = new HomeState(game)
  }

  override def score(): Unit = {
    println("Gooooooooooaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallllllllllllllllllllllllllllllll")
    game.awayScore += 1
    game.state = new HomeState(game)
  }

  override def endHT(): Unit = {
    println("the half is over")
  }
}
