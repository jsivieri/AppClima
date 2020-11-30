package com.joao.appclima

class Currently {
    var time = 0
    var summary: String? = null
    var icon: String? = null
    var nearestStormDistance = 0
    var nearestStormBearing = 0
    var precipIntensity = 0.0
    var precipIntensityError = 0.0
    var precipProbability = 0.0
    var precipType: String? = null
    var temperature = 0.0
    var apparentTemperature = 0.0
    var dewPoint = 0.0
    var humidity = 0.0
    var pressure = 0.0
    var windSpeed = 0.0
    var windGust = 0.0
    var windBearing = 0
    var cloudCover = 0
    var uvIndex = 0
    var visibility = 0
    var ozone = 0.0
}