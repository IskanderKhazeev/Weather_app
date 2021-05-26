package com.geekbrains.weitherapp


object Repository {
    private val weatherList: List<Weather> = listOf(Weather("Moscow", 15))
    fun getWeatherList():List<Weather>{
        return weatherList
    }



}