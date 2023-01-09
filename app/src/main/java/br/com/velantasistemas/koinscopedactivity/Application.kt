package br.com.velantasistemas.koinscopedactivity

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(androidContext = this@Application)
            modules(Modules.instance)
        }
    }
}
