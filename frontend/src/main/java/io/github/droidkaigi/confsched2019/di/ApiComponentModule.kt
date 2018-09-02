package io.github.droidkaigi.confsched2019.di

import android.app.Application
import dagger.Module
import dagger.Provides
import io.github.droidkaigi.confsched2019.session.data.api.ApiComponent
import io.github.droidkaigi.confsched2019.session.data.api.SessionApi
import kotlinx.coroutines.experimental.CommonPool
import javax.inject.Singleton

@Module
object ApiComponentModule {
    @JvmStatic
    @Provides
    @Singleton
    fun provideItemStore(application: Application): SessionApi {
        return ApiComponent.builder()
                .context(application)
                .coroutineContext(CommonPool)
                .build()
                .sessionApi()
    }
}