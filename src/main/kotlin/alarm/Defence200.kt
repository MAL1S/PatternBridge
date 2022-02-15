package alarm

class Defence200(): Alarm {

    override val name: String = "Защита-200"
    override val sensor: Sensor = Sensor.MOTION

    override fun startRing() {
        println("Defence-200 started")
    }

    override fun stopRing() {
        println("Defence-200 stopped")
    }
}