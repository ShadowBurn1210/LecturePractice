package HW1Code

class red (lightBulb: LightBulb) extends States(lightBulb: LightBulb){
  override def next_color(): Unit = {
    lightBulb.state = new green(lightBulb)
  }

  override def what_color(): Unit = {
    lightBulb.color = "red"
  }
}
