package car

import car.Car

open class Audi() : Car() {

    override fun startDriving() {
        super.startDriving()
        println("$name started")
    }

    override fun stopDriving() {
        super.stopDriving()
        println("$name stopped")
    }
}