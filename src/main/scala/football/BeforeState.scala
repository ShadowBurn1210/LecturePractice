package football

class BeforeState (game:Gamee) extends State (game: Gamee){
  override def start(): Unit = {
    println("And we are under way")
    game.state = new HomeState(game)
  }

  override def loseBall(): Unit = {
    println("Can't lose ball before game starts")
  }

  override def score(): Unit = {
    println("Can't score before game starts ")
  }

  override def endHT(): Unit = {
    println("Can't end half before the game starts")
  }
}
