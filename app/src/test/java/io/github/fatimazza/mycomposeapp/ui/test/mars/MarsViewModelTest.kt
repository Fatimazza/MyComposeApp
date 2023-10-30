package io.github.fatimazza.mycomposeapp.ui.test.mars

import io.github.fatimazza.mycomposeapp.ui.mars.MarsUiState
import io.github.fatimazza.mycomposeapp.ui.mars.MarsViewModel
import io.github.fatimazza.mycomposeapp.ui.test.mars.fake.MarsFakeDataSource
import io.github.fatimazza.mycomposeapp.ui.test.mars.fake.MarsFakeNetworkPhotosRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class MarsViewModelTest {

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = MarsFakeNetworkPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success("Success: ${MarsFakeDataSource.photosList.size} Mars " +
                        "photos retrieved"),
                marsViewModel.marsUiState
            )
        }
}
