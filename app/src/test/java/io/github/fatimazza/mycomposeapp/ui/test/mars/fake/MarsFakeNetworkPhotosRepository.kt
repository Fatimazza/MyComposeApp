package io.github.fatimazza.mycomposeapp.ui.test.mars.fake

import io.github.fatimazza.mycomposeapp.data.mars.MarsPhotosRepository
import io.github.fatimazza.mycomposeapp.model.MarsPhoto

class MarsFakeNetworkPhotosRepository : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return MarsFakeDataSource.photosList
    }
}
