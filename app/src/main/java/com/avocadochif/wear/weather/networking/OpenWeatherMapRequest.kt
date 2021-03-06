package com.avocadochif.wear.weather.networking

import com.avocadochif.wear.weather.entity.response.OneCallWeatherResponse
import com.avocadochif.wear.weather.networking.consts.OpenWeatherMapRoutes.ONE_CALL_WEATHER
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface OpenWeatherMapRequest {

    /////////////////////////////////////////////////////////
    ///////////////////// ONE CALL API //////////////////////
    /////////////////////////////////////////////////////////

    interface OneCallAPI {

        @POST(ONE_CALL_WEATHER)
        suspend fun getOneCallWeather(
            @Query("lat") latitude: Double,
            @Query("lon") longitude: Double,
            @Query("exclude") exclude: String,
            @Query("appid") appID: String
        ): Response<OneCallWeatherResponse>

    }

}