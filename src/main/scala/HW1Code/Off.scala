package HW1Code

class Off (lightBulb: LightBulb) extends States(lightBulb: LightBulb){
  override def next_color(): Unit = {
    lightBulb.state = new red(lightBulb)
  }

  override def what_color(): Unit = {
    lightBulb.color = "Dark"
  }
}
