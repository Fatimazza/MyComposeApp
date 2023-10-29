package io.github.fatimazza.mycomposeapp.data.mars

import io.github.fatimazza.mycomposeapp.model.MarsPhoto
import io.github.fatimazza.mycomposeapp.network.MarsApiService

/**
 * Repository that fetch mars photos list from marsApi.
 */
interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

/**
 * Network Implementation of Repository that fetch mars photos list from marsApi.
 */
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}
