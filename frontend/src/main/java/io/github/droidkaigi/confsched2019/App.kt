package io.github.droidkaigi.confsched2019

import android.app.Application
import com.facebook.stetho.Stetho
import com.jakewharton.threetenabp.AndroidThreeTen
import io.github.droidkaigi.confsched2019.session.model.SessionActionCreator
import kotlinx.coroutines.experimental.launch

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        Stetho.initializeWithDefaults(this);

        launch {
            SessionActionCreator().load(applicationContext)
        }
    }
}