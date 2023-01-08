# KotlinSerialization
This repository describes how to use kotlin serialisation library in android applications

[![Kotlin Stable](https://kotl.in/badges/stable.svg)](https://kotlinlang.org/docs/components-stability.html)
[![JetBrains official project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)


## What is Serialization and Encoding
* An `Object` in a computer memory consists of binary data that a computer can directly use it.
* `Serialization` is the process of reducing the `object` into its primitive structure like `integer`,`array`,`etc` in a manner that preserves that structure.
* `Encoding` is a process of converting a serialized object into a `output format` by following a specific set of rules.
* `Class Object` **`-----serialization---->`** `Machine readable binary structure` **`-----encoding---->`** `Json/Xml structure`
* `Class { int x, int y }` **`---->`** `{11011101,10011111}` **`---->`** `{"x":12312,"y":12233}`
* After the serialization, We view it as a human redable format.

## What is De-Serialization and Decoding
* The input data which is in human redable form which is `json/xml` is `deserialized` into `primitives` and then `decoded` into objects. 
* `Json/Xml structure` **`-----deserialization---->`** `Primitives` **`-----decoding---->`** `Class Object`.
<p align="center">
<a><img src="https://github.com/devrath/KotlinSerialization/blob/main/Assets/SerilizationDeDiagram.png"></a>
</p>

## `𝙲𝚘𝚗𝚟𝚎𝚛𝚝𝚒𝚗𝚐 𝚊 𝙼𝚘𝚍𝚎𝚕 𝚌𝚕𝚊𝚜𝚜 𝚒𝚗𝚝𝚘 𝚊 𝙹𝚂𝙾𝙽 𝚜𝚝𝚛𝚒𝚗𝚐`
One of the normal usecases we face is converting `Model` objects into `JSON` string 

* Model object
```kotlin
@Serializable
data class StudentInfo(
    @SerialName("name")
    val studentName: String,
    @SerialName("age")
    val studentAge: Int,
)
```
* Converting the model object to json string
```kotlin
fun main() {
    val studentModel = StudentInfo("Ramesh", 21)
    println(studentModel)

    val json = Json.encodeToString(StudentInfo.serializer(), studentModel)
    println(json)
}
```
* Output
```
StudentInfo(studentName=Ramesh, studentAge=21) //Printing the student model
{"name":"Ramesh","age":21} //Printing the json string
```

## `𝚄𝚜𝚒𝚗𝚐 @𝚃𝚛𝚊𝚗𝚜𝚒𝚎𝚗𝚝 𝚊𝚗𝚗𝚘𝚝𝚊𝚝𝚒𝚘𝚗 𝚒𝚗 𝚖𝚘𝚍𝚎𝚕`
* Marks this property invisible for the whole serialization process, including serial descriptors. Transient properties should have default values.

* Model object
```kotlin
@Serializable
data class StudentInfo(
    @SerialName("name")
    val studentName: String,
    @SerialName("age")
    val studentAge: Int,
    @Transient
    val isMale: Boolean = false
)
```
* Converting the model object to json
```kotlin
fun main() {
    val lollipop = StudentInfo("Ramesh", 21)
    println(lollipop)

    val json = Json.encodeToString(StudentInfo.serializer(), lollipop)
    println(json)
}
```
* Output
```
// Observe the isMale property is not serialized and printed as string
StudentInfo(studentName=Ramesh, studentAge=21) //Printing the student model
{"name":"Ramesh","age":21} //Printing the json string
```





## **`𝚂𝚞𝚙𝚙𝚘𝚛𝚝`** ☕
If you feel like support me a coffee for my efforts, I would greatly appreciate it.</br>
<a href="https://www.buymeacoffee.com/devrath" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/yellow_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>

## **`𝙲𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚎`** 🙋‍♂️
Read [contribution guidelines](CONTRIBUTING.md) for more information regarding contribution.

## **`𝙵𝚎𝚎𝚍𝚋𝚊𝚌𝚔`** ✍️ 
Feature requests are always welcome, [File an issue here](https://github.com/devrath/KotlinSerialization/issues/new).

## **`𝙵𝚒𝚗𝚍 𝚝𝚑𝚒𝚜 𝚙𝚛𝚘𝚓𝚎𝚌𝚝 𝚞𝚜𝚎𝚏𝚞𝚕`** ? ❤️
Support it by clicking the ⭐ button on the upper right of this page. ✌️

## **`𝙻𝚒𝚌𝚎𝚗𝚜𝚎`** ![Licence](https://img.shields.io/github/license/google/docsy) :credit_card:
This project is licensed under the Apache License 2.0 - see the [LICENSE](https://github.com/devrath/KotlinSerialization/blob/main/LICENSE) file for details


<p align="center">
<a><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
</p>

