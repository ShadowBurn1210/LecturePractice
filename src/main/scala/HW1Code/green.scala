package HW1Code

class green (lightBulb: LightBulb) extends States(lightBulb: LightBulb){
  override def next_color(): Unit = {
    lightBulb.state = new blue(lightBulb)
  }

  override def what_color(): Unit = {
    lightBulb.color = "green"
  }
}
