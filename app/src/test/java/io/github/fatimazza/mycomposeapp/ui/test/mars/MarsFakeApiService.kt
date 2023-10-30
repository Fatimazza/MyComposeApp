package io.github.fatimazza.mycomposeapp.ui.test.mars

import io.github.fatimazza.mycomposeapp.model.MarsPhoto
import io.github.fatimazza.mycomposeapp.network.MarsApiService

class MarsFakeApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return MarsFakeDataSource.photosList
    }
}
