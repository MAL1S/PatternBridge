package data.repository

import alarm.Alarm


interface AlarmRepository {

    fun getModels(): List<Alarm>
}