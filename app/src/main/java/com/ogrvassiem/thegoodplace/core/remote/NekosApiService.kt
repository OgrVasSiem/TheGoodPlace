package com.ogrvassiem.thegoodplace.core.remote

import com.ogrvassiem.thegoodplace.core.models.NekoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NekoApiService {
    @GET("v3/images")
    suspend fun searchImages(
        @Query("rating") rating: List<String>? = null,
        @Query("is_original") isOriginal: Boolean? = null,
        @Query("is_screenshot") isScreenshot: Boolean? = null,
        @Query("is_flagged") isFlagged: Boolean? = null,
        @Query("is_animated") isAnimated: Boolean? = null,
        @Query("artist") artist: Int? = null,
        @Query("character") characters: List<Int>? = null,
        @Query("tag") tags: List<Int>? = null,
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null
    ): NekoResponse
}
