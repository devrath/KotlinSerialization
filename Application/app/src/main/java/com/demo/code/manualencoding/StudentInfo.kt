package com.demo.code.manualencoding

import android.os.Build
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.Json

@Serializable
data class StudentInfo(
    @SerialName("name")
    val studentName: String,
    @SerialName("age")
    val studentAge: Int,
    @SerialName("address")
    val address: Address
)

fun main() {
    val lollipop = StudentInfo("Ramesh", 21,Address(
        address = "address", pinCode = 123
    ))
    println(lollipop)

    val json = Json.encodeToString(StudentInfo.serializer(), lollipop)
    println(json)
}
