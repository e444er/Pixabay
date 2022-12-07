package com.e444er.pixabay.presentation

import com.e444er.pixabay.domain.model.ImageModel

data class ImageState(
    val isLoading: Boolean = false,
    val data: List<ImageModel>? = null,
    val error: String = ""
)