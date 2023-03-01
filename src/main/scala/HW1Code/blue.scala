package HW1Code

class blue(lightBulb: LightBulb) extends States(lightBulb: LightBulb){

  override def next_color(): Unit = {
    lightBulb.state = new Off(lightBulb)
  }

  override def what_color(): Unit = {
    lightBulb.color = "blue"
  }
}
