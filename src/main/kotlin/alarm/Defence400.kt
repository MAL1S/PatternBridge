package alarm

class Defence400() : Alarm {

    override val name: String = "Защита-400"
    override val sensor: Sensor = Sensor.DOOR_OPENING

    override fun startRing() {
        println("Defence-400 started")
    }

    override fun stopRing() {
        println("Defence-400 stopped")
    }
}