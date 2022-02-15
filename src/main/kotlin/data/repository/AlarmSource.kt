package data.repository

import alarm.Defence200
import alarm.Defence400
import alarm.Sensor

class AlarmSource: AlarmRepository {

    override fun getModels() = listOf(
        Defence200(),
        Defence400()
    )
}