package data.repository

import car.Car

interface CarRepository {
    
    fun getModels(): List<Car>
}