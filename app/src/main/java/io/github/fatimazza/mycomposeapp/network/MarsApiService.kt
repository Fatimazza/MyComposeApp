package io.github.fatimazza.mycomposeapp.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import io.github.fatimazza.mycomposeapp.model.MarsPhoto
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

/**
 * Use the Retrofit builder to build a retrofit object
 */
private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

/**
 * Retrofit service object for creating api calls
 */
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}