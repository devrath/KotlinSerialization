package com.demo.code.manualencoding

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Address (
    @SerialName("address")
    val address: String,
    @SerialName("pinCode")
    val pinCode:Int
)