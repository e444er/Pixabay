package com.e444er.pixabay.data.repository

import com.e444er.pixabay.common.toDomainModel
import com.e444er.pixabay.data.network.ApiService
import com.e444er.pixabay.domain.model.ImageModel
import com.e444er.pixabay.domain.repository.ImageRepository

class ImageRepositoryImpl(
    private val api: ApiService
) : ImageRepository {
    override suspend fun getSearchImage(query: String): List<ImageModel> {
        return try {
            api.getSearchImage(
                key = "31899084-510a99fc01f856f9947334fd1",
                query
            ).hits.map { it.toDomainModel() }
        } catch (e: java.lang.Exception) {
            throw Exception(e)
        }
    }
}