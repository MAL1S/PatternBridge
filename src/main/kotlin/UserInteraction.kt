import alarm.Alarm
import car.Car
import data.repository.AlarmRepository
import data.repository.CarRepository

class UserInteraction(
    private val carRepository: CarRepository,
    private val alarmRepository: AlarmRepository
) {

    fun startUserInteraction() {
        chooseAlarm()
        val alarm = alarmRepository.getModels()[handleUserInput()]
        chooseCar()
        val car = carRepository.getModels()[handleUserInput()]
        notifyUserAboutChoice(alarm = alarm, car = car)
    }

    private fun chooseCar() {
        println("Выберите модель автомобиля:")
        val models = carRepository.getModels()
        for ((count, i) in models.withIndex()) {
            println("${count+1}. ${i.name}")
        }
    }

    private fun chooseAlarm() {
        println("Выберите модель сигнализации:")
        val models = alarmRepository.getModels()
        for ((count, i) in models.withIndex()) {
            println("${count+1}. ${i.name}")
        }
    }

    private fun handleUserInput(): Int {
        print(">> ")
        return readLine()!!.toInt() - 1
    }

    private fun notifyUserAboutChoice(car: Car, alarm: Alarm) {
        println("Была установлена сигнализация модели \"${alarm.name}\" " +
                "на автомобиль марки \"${car.name}\"")
    }
}