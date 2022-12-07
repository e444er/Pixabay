package com.e444er.pixabay.domain.repository

import com.e444er.pixabay.domain.model.ImageModel

interface ImageRepository {

    suspend fun getSearchImage(query: String): List<ImageModel>
}