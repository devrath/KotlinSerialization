# KotlinSerialization
This repository describes how to use kotlin serialisation library in android applications

[![Kotlin Stable](https://kotl.in/badges/stable.svg)](https://kotlinlang.org/docs/components-stability.html)
[![JetBrains official project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)


<div align="center">
    
| Topics |
| ------ |
| [```𝚆𝚑𝚊𝚝 𝚒𝚜 𝚂𝚎𝚛𝚒𝚊𝚕𝚒𝚣𝚊𝚝𝚒𝚘𝚗 𝚊𝚗𝚍 𝙴𝚗𝚌𝚘𝚍𝚒𝚗𝚐```]() |
| [```𝚆𝚑𝚊𝚝 𝚒𝚜 𝙳𝚎-𝚂𝚎𝚛𝚒𝚊𝚕𝚒𝚣𝚊𝚝𝚒𝚘𝚗 𝚊𝚗𝚍 𝙳𝚎𝚌𝚘𝚍𝚒𝚗𝚐```]() |
| [```𝙲𝚘𝚗𝚟𝚎𝚛𝚝𝚒𝚗𝚐 𝚊 𝙼𝚘𝚍𝚎𝚕 𝚌𝚕𝚊𝚜𝚜 𝚒𝚗𝚝𝚘 𝚊 𝙹𝚂𝙾𝙽 𝚜𝚝𝚛𝚒𝚗𝚐```]() |
| [```𝚄𝚜𝚒𝚗𝚐 @𝚃𝚛𝚊𝚗𝚜𝚒𝚎𝚗𝚝 𝚊𝚗𝚗𝚘𝚝𝚊𝚝𝚒𝚘𝚗 𝚒𝚗 𝚖𝚘𝚍𝚎𝚕```]() |
| [```𝙿𝚛𝚘𝚟𝚒𝚍𝚒𝚗𝚐 𝚝𝚑𝚎 𝚠𝚊𝚛𝚗𝚒𝚗𝚐 𝚏𝚘𝚛 𝚊 𝚙𝚛𝚘𝚙𝚎𝚛𝚝𝚢 𝚘𝚏 𝚖𝚘𝚍𝚎𝚕 𝚝𝚑𝚊𝚝 𝚒𝚜 𝚗𝚘𝚝 𝚜𝚎𝚛𝚒𝚊𝚕𝚒𝚣𝚎𝚍```]() |
| [```𝙰𝚍𝚍𝚒𝚗𝚐 𝚊 𝚍𝚎𝚏𝚊𝚞𝚕𝚝 𝚟𝚊𝚕𝚞𝚎 𝚏𝚘𝚛 𝚊 𝚖𝚘𝚍𝚎𝚕 𝚙𝚛𝚘𝚙𝚎𝚛𝚝𝚢 𝚒𝚏 𝚝𝚑𝚎 𝚙𝚛𝚘𝚙𝚎𝚛𝚝𝚢 𝚒𝚜 𝚗𝚘𝚝 𝚙𝚛𝚎𝚜𝚎𝚗𝚝 𝚒𝚗 𝚝𝚑𝚎 𝙰𝙿𝙸 𝚛𝚎𝚜𝚙𝚘𝚜𝚎```]() |

</div>




## `𝚆𝚑𝚊𝚝 𝚒𝚜 𝚂𝚎𝚛𝚒𝚊𝚕𝚒𝚣𝚊𝚝𝚒𝚘𝚗 𝚊𝚗𝚍 𝙴𝚗𝚌𝚘𝚍𝚒𝚗𝚐`
* An `Object` in a computer memory consists of binary data that a computer can directly use it.
* `Serialization` is the process of reducing the `object` into its primitive structure like `integer`,`array`,`etc` in a manner that preserves that structure.
* `Encoding` is a process of converting a serialized object into a `output format` by following a specific set of rules.
* `Class Object` **`-----serialization---->`** `Machine readable binary structure` **`-----encoding---->`** `Json/Xml structure`
* `Class { int x, int y }` **`---->`** `{11011101,10011111}` **`---->`** `{"x":12312,"y":12233}`
* After the serialization, We view it as a human redable format.

## `𝚆𝚑𝚊𝚝 𝚒𝚜 𝙳𝚎-𝚂𝚎𝚛𝚒𝚊𝚕𝚒𝚣𝚊𝚝𝚒𝚘𝚗 𝚊𝚗𝚍 𝙳𝚎𝚌𝚘𝚍𝚒𝚗𝚐`
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

## `𝙿𝚛𝚘𝚟𝚒𝚍𝚒𝚗𝚐 𝚝𝚑𝚎 𝚠𝚊𝚛𝚗𝚒𝚗𝚐 𝚏𝚘𝚛 𝚊 𝚙𝚛𝚘𝚙𝚎𝚛𝚝𝚢 𝚘𝚏 𝚖𝚘𝚍𝚎𝚕 𝚝𝚑𝚊𝚝 𝚒𝚜 𝚗𝚘𝚝 𝚜𝚎𝚛𝚒𝚊𝚕𝚒𝚣𝚎𝚍`
* Sometimes in a nested model hierarcy, There comes the scenario that one of the property is not initilized.
* A useful property of Kotlinx is if you have nested data classes and haven’t defined any of them with @Serializable, the IDE will give you an error.
<p align="center">
<a><img src="https://github.com/devrath/KotlinSerialization/blob/main/Assets/kotlinxError.png"></a>
</p>

## `𝙰𝚍𝚍𝚒𝚗𝚐 𝚊 𝚍𝚎𝚏𝚊𝚞𝚕𝚝 𝚟𝚊𝚕𝚞𝚎 𝚏𝚘𝚛 𝚊 𝚖𝚘𝚍𝚎𝚕 𝚙𝚛𝚘𝚙𝚎𝚛𝚝𝚢 𝚒𝚏 𝚝𝚑𝚎 𝚙𝚛𝚘𝚙𝚎𝚛𝚝𝚢 𝚒𝚜 𝚗𝚘𝚝 𝚙𝚛𝚎𝚜𝚎𝚗𝚝 𝚒𝚗 𝚝𝚑𝚎 𝙰𝙿𝙸 𝚛𝚎𝚜𝚙𝚘𝚜𝚎`
* If you have a field that’s in the data class but not in the API, it simply returns null… OR if you set a default value on it, it will remain that default value.
* This is one of the defining traits of Kotlinx Serialization. With most of the other json parsers, even if you set a default value like with the above code, if name were not to be found in the API, they would be null. In Kotlinx, it defaults back to the default value.
```kotlin
@Serializable
data class StudentInfo(
    val studentName: String,
    val studentAge: Int = 21,
)
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

