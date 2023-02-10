package football


abstract class State (game: Gamee) {
  def start()
  def loseBall()
  def score()
  def endHT()
}
