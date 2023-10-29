package io.github.fatimazza.mycomposeapp.data.mars

/**
 * Dependency Injection container at the application level.
 */
interface MarsAppContainer {
    val marsPhotosRepository: MarsPhotosRepository
}

/**
 * Implementation for the Dependency Injection container at the application level.
 *
 * Variables are initialized lazily and the same instance is shared across the whole app.
 */
class DefaultAppContainer : MarsAppContainer {
    override val marsPhotosRepository: MarsPhotosRepository
        get() = TODO("Not yet implemented")

}

