import car.Audi
import car.Car
import car.Volkswagen
import data.repository.AlarmSource
import data.repository.CarSource

fun main(args: Array<String>) {

    val userInteraction = UserInteraction(
        alarmRepository = AlarmSource(),
        carRepository = CarSource()
    )
    userInteraction.startUserInteraction()
}