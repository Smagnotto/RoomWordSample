package br.com.saraiva.roomwordsample

import android.app.Application
import br.com.saraiva.roomwordsample.di.dbModule
import br.com.saraiva.roomwordsample.di.uiModule
import br.com.saraiva.roomwordsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(
                listOf(
                    dbModule,
                    uiModule,
                    viewModelModule
                )
            )
        }
    }
}