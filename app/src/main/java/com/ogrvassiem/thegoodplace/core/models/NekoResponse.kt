package com.ogrvassiem.thegoodplace.core.models

import retrofit2.http.GET
import retrofit2.http.Query

import com.google.gson.annotations.SerializedName

data class NekoResponse(
    @SerializedName("items")
    val items: List<ImageItem>,

    @SerializedName("limit")
    val limit: Int,

    @SerializedName("offset")
    val offset: Int,

    @SerializedName("total")
    val total: Int
)

data class ImageItem(
    @SerializedName("id")
    val id: Int,

    @SerializedName("id_v2")
    val idV2: String,

    @SerializedName("image_url")
    val imageUrl: String,

    @SerializedName("sample_url")
    val sampleUrl: String,

    @SerializedName("image_size")
    val imageSize: Int,

    @SerializedName("image_width")
    val imageWidth: Int,

    @SerializedName("image_height")
    val imageHeight: Int,

    @SerializedName("sample_size")
    val sampleSize: Int,

    @SerializedName("sample_width")
    val sampleWidth: Int,

    @SerializedName("sample_height")
    val sampleHeight: Int,

    @SerializedName("source")
    val source: String?,

    @SerializedName("source_id")
    val sourceId: String?,

    @SerializedName("rating")
    val rating: String,

    @SerializedName("verification")
    val verification: String,

    @SerializedName("hash_md5")
    val hashMd5: String,

    @SerializedName("hash_perceptual")
    val hashPerceptual: String,

    @SerializedName("color_dominant")
    val colorDominant: List<Int>,

    @SerializedName("color_palette")
    val colorPalette: List<List<Int>>,

    @SerializedName("duration")
    val duration: Double?,

    @SerializedName("is_original")
    val isOriginal: Boolean,

    @SerializedName("is_screenshot")
    val isScreenshot: Boolean,

    @SerializedName("is_flagged")
    val isFlagged: Boolean,

    @SerializedName("is_animated")
    val isAnimated: Boolean,

    @SerializedName("artist")
    val artist: Int?,

    @SerializedName("characters")
    val characters: List<Character>,

    @SerializedName("tags")
    val tags: List<Tag>,

    @SerializedName("created_at")
    val createdAt: Double,

    @SerializedName("updated_at")
    val updatedAt: Double
)

data class Tag(
    @SerializedName("id")
    val id: Int,

    @SerializedName("id_v2")
    val idV2: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("sub")
    val sub: String,

    @SerializedName("is_nsfw")
    val isNsfw: Boolean
)

data class Character(
    @SerializedName("id")
    val id: Int,

    @SerializedName("id_v2")
    val idV2: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("aliases")
    val aliases: List<String>,

    @SerializedName("description")
    val description: String,

    @SerializedName("ages")
    val ages: List<Int>,

    @SerializedName("height")
    val height: Double?, // Используйте другой тип, если известен (например, Int)

    @SerializedName("weight")
    val weight: Double?, // Используйте другой тип, если известен (например, Int)

    @SerializedName("gender")
    val gender: String,

    @SerializedName("species")
    val species: String,

    @SerializedName("birthday")
    val birthday: String?, // Можно использовать Date или другой подходящий тип

    @SerializedName("nationality")
    val nationality: String,

    @SerializedName("occupations")
    val occupations: List<String>
)