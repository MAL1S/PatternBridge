package data.repository

import car.Audi
import car.Volkswagen


class CarSource: CarRepository {

    override fun getModels() = listOf(
        Audi(),
        Volkswagen()
    )
}