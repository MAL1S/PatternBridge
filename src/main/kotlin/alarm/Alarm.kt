package alarm

enum class Sensor {
    IMPACT,
    TILT,
    MOTION,
    DOOR_OPENING,
    HOOD_OPENING
}

interface Alarm {

    val sensor: Sensor
    val name: String

    fun startRing()

    fun stopRing()
}