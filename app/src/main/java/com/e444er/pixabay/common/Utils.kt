package com.e444er.pixabay.common

import com.e444er.pixabay.data.model.HitDTO
import com.e444er.pixabay.domain.model.ImageModel

fun HitDTO.toDomainModel(): ImageModel {
    return ImageModel(
        imageUrl = this.largeImageURL
    )
}