package com.avocadochif.wear.weather.di.modules

import com.avocadochif.wear.weather.networking.OpenWeatherMapRequest
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.scopes.ServiceScoped
import retrofit2.Retrofit

@Module
@InstallIn(ServiceComponent::class)
object ServiceModule {

    @Provides
    @ServiceScoped
    fun provideOneCallAPIService(retrofit: Retrofit): OpenWeatherMapRequest.OneCallAPI {
        return retrofit.create(OpenWeatherMapRequest.OneCallAPI::class.java)
    }

}