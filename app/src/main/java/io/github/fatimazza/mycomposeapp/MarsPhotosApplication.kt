package io.github.fatimazza.mycomposeapp

import android.app.Application
import io.github.fatimazza.mycomposeapp.data.mars.DefaultAppContainer
import io.github.fatimazza.mycomposeapp.data.mars.MarsAppContainer

class MarsPhotosApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: MarsAppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
