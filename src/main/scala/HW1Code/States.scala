package HW1Code

abstract class States (lightBulb: LightBulb) {

  def next_color(): Unit
  def what_color(): Unit
}
