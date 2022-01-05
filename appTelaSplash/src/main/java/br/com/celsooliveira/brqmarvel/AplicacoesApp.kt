package br.com.celsooliveira.brqmarvel

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AplicacoesApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AplicacoesApp)
        }
    }
}