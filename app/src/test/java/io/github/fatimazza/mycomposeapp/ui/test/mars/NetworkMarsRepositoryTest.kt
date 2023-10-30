package io.github.fatimazza.mycomposeapp.ui.test.mars

import io.github.fatimazza.mycomposeapp.data.mars.NetworkMarsPhotosRepository
import io.github.fatimazza.mycomposeapp.ui.test.mars.fake.MarsFakeApiService
import io.github.fatimazza.mycomposeapp.ui.test.mars.fake.MarsFakeDataSource
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkMarsRepositoryTest {

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() {
        val repository = NetworkMarsPhotosRepository(
            marsApiService = MarsFakeApiService()
        )
        assertEquals(MarsFakeDataSource.photosList, repository.getMarsPhotos())
    }
}
