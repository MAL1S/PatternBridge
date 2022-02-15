package car

import alarm.Alarm

abstract class Car(
    private val alarm: Alarm? = null
) {

    private var isRunning = false
    val name: String = javaClass.simpleName

    fun isRunning() = isRunning

    open fun startDriving() {
        isRunning = true
    }

    open fun stopDriving() {
        isRunning = false
    }

    fun activateAlarm() {
        alarm?.startRing()
    }

    fun deactivateAlarm() {
        alarm?.stopRing()
    }
}