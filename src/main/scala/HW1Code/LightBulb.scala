package HW1Code


class LightBulb() {
  var state : States = new Off(this)
  var color: String = ""

  def next_color(): Unit = {
    state.next_color()
  }

  def what_color(): Unit = {
    state.what_color()
  }
}
