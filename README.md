<img src="https://github.com/devrath/devrath/blob/master/images/kotlin_logo.png" align="right" title="Kotlin Logo" width="120">

# KotlinSerialization  π§β
This repository describes how to use kotlin serialisation library in android applications

[![Kotlin Stable](https://kotl.in/badges/stable.svg)](https://kotlinlang.org/docs/components-stability.html)
[![JetBrains official project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)


<div align="center">
    
| Topics |
| ------ |
| [```ππππ ππ ππππππππ£πππππ πππ π΄πππππππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%9A%86%F0%9D%9A%91%F0%9D%9A%8A%F0%9D%9A%9D-%F0%9D%9A%92%F0%9D%9A%9C-%F0%9D%9A%82%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%92%F0%9D%9A%8A%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%A3%F0%9D%9A%8A%F0%9D%9A%9D%F0%9D%9A%92%F0%9D%9A%98%F0%9D%9A%97-%F0%9D%9A%8A%F0%9D%9A%97%F0%9D%9A%8D-%F0%9D%99%B4%F0%9D%9A%97%F0%9D%9A%8C%F0%9D%9A%98%F0%9D%9A%8D%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90) |
| [```ππππ ππ π³π-ππππππππ£πππππ πππ π³πππππππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%9A%86%F0%9D%9A%91%F0%9D%9A%8A%F0%9D%9A%9D-%F0%9D%9A%92%F0%9D%9A%9C-%F0%9D%99%B3%F0%9D%9A%8E-%F0%9D%9A%82%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%92%F0%9D%9A%8A%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%A3%F0%9D%9A%8A%F0%9D%9A%9D%F0%9D%9A%92%F0%9D%9A%98%F0%9D%9A%97-%F0%9D%9A%8A%F0%9D%9A%97%F0%9D%9A%8D-%F0%9D%99%B3%F0%9D%9A%8E%F0%9D%9A%8C%F0%9D%9A%98%F0%9D%9A%8D%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90) |
| [```πΊπππππππππππππ£πππππ ππππππππ ππππ’ ππ’πππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%99%BA%F0%9D%9A%98%F0%9D%9A%9D%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%82%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%92%F0%9D%9A%8A%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%A3%F0%9D%9A%8A%F0%9D%9A%9D%F0%9D%9A%92%F0%9D%9A%98%F0%9D%9A%97-%F0%9D%9A%9C%F0%9D%9A%9E%F0%9D%9A%99%F0%9D%9A%99%F0%9D%9A%98%F0%9D%9A%9B%F0%9D%9A%9D%F0%9D%9A%9C-%F0%9D%9A%96%F0%9D%9A%8A%F0%9D%9A%97%F0%9D%9A%A2-%F0%9D%9A%9D%F0%9D%9A%A2%F0%9D%9A%99%F0%9D%9A%8E%F0%9D%9A%9C) |    
| [```πΊπππππππππππππ£πππππ ππππππππ π πππ πΌππππ πππ πΆπππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%99%BA%F0%9D%9A%98%F0%9D%9A%9D%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%82%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%92%F0%9D%9A%8A%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%A3%F0%9D%9A%8A%F0%9D%9A%9D%F0%9D%9A%92%F0%9D%9A%98%F0%9D%9A%97-%F0%9D%9A%8C%F0%9D%9A%98%F0%9D%9A%96%F0%9D%9A%99%F0%9D%9A%8A%F0%9D%9A%9B%F0%9D%9A%8E%F0%9D%9A%8D-%F0%9D%9A%A0%F0%9D%9A%92%F0%9D%9A%9D%F0%9D%9A%91-%F0%9D%99%BC%F0%9D%9A%98%F0%9D%9A%9C%F0%9D%9A%91%F0%9D%9A%92-%F0%9D%9A%8A%F0%9D%9A%97%F0%9D%9A%8D-%F0%9D%99%B6%F0%9D%9A%9C%F0%9D%9A%98%F0%9D%9A%97) |
| [```π²πππππππππ π πΌππππ πππππ ππππ π πΉππΎπ½ ππππππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%99%B2%F0%9D%9A%98%F0%9D%9A%97%F0%9D%9A%9F%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%9D%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90-%F0%9D%9A%8A-%F0%9D%99%BC%F0%9D%9A%98%F0%9D%9A%8D%F0%9D%9A%8E%F0%9D%9A%95-%F0%9D%9A%8C%F0%9D%9A%95%F0%9D%9A%8A%F0%9D%9A%9C%F0%9D%9A%9C-%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%9D%F0%9D%9A%98-%F0%9D%9A%8A-%F0%9D%99%B9%F0%9D%9A%82%F0%9D%99%BE%F0%9D%99%BD-%F0%9D%9A%9C%F0%9D%9A%9D%F0%9D%9A%9B%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90) |
| [```ππππππππππππ ππππππππππ ππ πΉπππ ππππππ πππππ ππππππππππππππ£ππππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%9A%83%F0%9D%9A%9B%F0%9D%9A%8A%F0%9D%9A%97%F0%9D%9A%9C%F0%9D%9A%8F%F0%9D%9A%98%F0%9D%9A%9B%F0%9D%9A%96%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90-%F0%9D%9A%8C%F0%9D%9A%98%F0%9D%9A%95%F0%9D%9A%95%F0%9D%9A%8E%F0%9D%9A%8C%F0%9D%9A%9D%F0%9D%9A%92%F0%9D%9A%98%F0%9D%9A%97-%F0%9D%9A%9D%F0%9D%9A%98-%F0%9D%99%B9%F0%9D%9A%9C%F0%9D%9A%98%F0%9D%9A%97-%F0%9D%9A%9C%F0%9D%9A%9D%F0%9D%9A%9B%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90-%F0%9D%9A%9E%F0%9D%9A%9C%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90-%F0%9D%9A%94%F0%9D%9A%98%F0%9D%9A%9D%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%82%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%92%F0%9D%9A%8A%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%A3%F0%9D%9A%8A%F0%9D%9A%8B%F0%9D%9A%95%F0%9D%9A%8E) |
| [```πππππ @πππππππππ ππππππππππ ππ πππππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%9A%84%F0%9D%9A%9C%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90-%F0%9D%9A%83%F0%9D%9A%9B%F0%9D%9A%8A%F0%9D%9A%97%F0%9D%9A%9C%F0%9D%9A%92%F0%9D%9A%8E%F0%9D%9A%97%F0%9D%9A%9D-%F0%9D%9A%8A%F0%9D%9A%97%F0%9D%9A%97%F0%9D%9A%98%F0%9D%9A%9D%F0%9D%9A%8A%F0%9D%9A%9D%F0%9D%9A%92%F0%9D%9A%98%F0%9D%9A%97-%F0%9D%9A%92%F0%9D%9A%97-%F0%9D%9A%96%F0%9D%9A%98%F0%9D%9A%8D%F0%9D%9A%8E%F0%9D%9A%95) |
| [```πΏππππππππ πππ π ππππππ πππ π ππππππππ’ ππ πππππ ππππ ππ πππ ππππππππ£ππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%99%BF%F0%9D%9A%9B%F0%9D%9A%98%F0%9D%9A%9F%F0%9D%9A%92%F0%9D%9A%8D%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90-%F0%9D%9A%9D%F0%9D%9A%91%F0%9D%9A%8E-%F0%9D%9A%A0%F0%9D%9A%8A%F0%9D%9A%9B%F0%9D%9A%97%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90-%F0%9D%9A%8F%F0%9D%9A%98%F0%9D%9A%9B-%F0%9D%9A%8A-%F0%9D%9A%99%F0%9D%9A%9B%F0%9D%9A%98%F0%9D%9A%99%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%9D%F0%9D%9A%A2-%F0%9D%9A%98%F0%9D%9A%8F-%F0%9D%9A%96%F0%9D%9A%98%F0%9D%9A%8D%F0%9D%9A%8E%F0%9D%9A%95-%F0%9D%9A%9D%F0%9D%9A%91%F0%9D%9A%8A%F0%9D%9A%9D-%F0%9D%9A%92%F0%9D%9A%9C-%F0%9D%9A%97%F0%9D%9A%98%F0%9D%9A%9D-%F0%9D%9A%9C%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%92%F0%9D%9A%8A%F0%9D%9A%95%F0%9D%9A%92%F0%9D%9A%A3%F0%9D%9A%8E%F0%9D%9A%8D) |
| [```π°πππππ π πππππππ πππππ πππ π πππππ ππππππππ’ ππ πππ ππππππππ’ ππ πππ πππππππ ππ πππ π°πΏπΈ ππππππππ```](https://github.com/devrath/KotlinSerialization/blob/main/README.md#%F0%9D%99%B0%F0%9D%9A%8D%F0%9D%9A%8D%F0%9D%9A%92%F0%9D%9A%97%F0%9D%9A%90-%F0%9D%9A%8A-%F0%9D%9A%8D%F0%9D%9A%8E%F0%9D%9A%8F%F0%9D%9A%8A%F0%9D%9A%9E%F0%9D%9A%95%F0%9D%9A%9D-%F0%9D%9A%9F%F0%9D%9A%8A%F0%9D%9A%95%F0%9D%9A%9E%F0%9D%9A%8E-%F0%9D%9A%8F%F0%9D%9A%98%F0%9D%9A%9B-%F0%9D%9A%8A-%F0%9D%9A%96%F0%9D%9A%98%F0%9D%9A%8D%F0%9D%9A%8E%F0%9D%9A%95-%F0%9D%9A%99%F0%9D%9A%9B%F0%9D%9A%98%F0%9D%9A%99%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%9D%F0%9D%9A%A2-%F0%9D%9A%92%F0%9D%9A%8F-%F0%9D%9A%9D%F0%9D%9A%91%F0%9D%9A%8E-%F0%9D%9A%99%F0%9D%9A%9B%F0%9D%9A%98%F0%9D%9A%99%F0%9D%9A%8E%F0%9D%9A%9B%F0%9D%9A%9D%F0%9D%9A%A2-%F0%9D%9A%92%F0%9D%9A%9C-%F0%9D%9A%97%F0%9D%9A%98%F0%9D%9A%9D-%F0%9D%9A%99%F0%9D%9A%9B%F0%9D%9A%8E%F0%9D%9A%9C%F0%9D%9A%8E%F0%9D%9A%97%F0%9D%9A%9D-%F0%9D%9A%92%F0%9D%9A%97-%F0%9D%9A%9D%F0%9D%9A%91%F0%9D%9A%8E-%F0%9D%99%B0%F0%9D%99%BF%F0%9D%99%B8-%F0%9D%9A%9B%F0%9D%9A%8E%F0%9D%9A%9C%F0%9D%9A%99%F0%9D%9A%98%F0%9D%9A%97%F0%9D%9A%9C%F0%9D%9A%8E) |
| [```πππ πππ πππππππππππ ππ πππ ππππππ ππππ ππ πππ πππ  ππ'π ππππππππππ π πππ ππππππππ```](https://github.com/devrath/KotlinSerialization) |    

</div>

<div align="center">

| **`Output`** |
| ----------- |
| <img src="https://github.com/devrath/fluffy-okhttp-interceptors/blob/main/assets/demo.gif" width="220" height="460"/> |

</div>




## `ππππ ππ ππππππππ£πππππ πππ π΄πππππππ`
* An `Object` in a computer memory consists of binary data that a computer can directly use it.
* `Serialization` is the process of reducing the `object` into its primitive structure like `integer`,`array`,`etc` in a manner that preserves that structure.
* `Encoding` is a process of converting a serialized object into a `output format` by following a specific set of rules.
* `Class Object` **`-----serialization---->`** `Machine readable binary structure` **`-----encoding---->`** `Json/Xml structure`
* `Class { int x, int y }` **`---->`** `{11011101,10011111}` **`---->`** `{"x":12312,"y":12233}`
* After the serialization, We view it as a human redable format.

## `ππππ ππ π³π-ππππππππ£πππππ πππ π³πππππππ`
* The input data which is in human redable form which is `json/xml` is `deserialized` into `primitives` and then `decoded` into objects. 
* `Json/Xml structure` **`-----deserialization---->`** `Primitives` **`-----decoding---->`** `Class Object`.
<p align="center">
<a><img src="https://github.com/devrath/KotlinSerialization/blob/main/Assets/SerilizationDeDiagram.png"></a>
</p>

## `πΊπππππππππππππ£πππππ ππππππππ ππππ’ ππ’πππ`
* There are support for primitive data types `Boolean`,`Byte`,`Short`,`Int`,`Long`,`String`,`Double`,`Char`
* Other types include `List`,`enum`,`set`,`pair` etc

## `πΊπππππππππππππ£πππππ ππππππππ π πππ πΌππππ πππ πΆπππ`
| **`Moshi`** | **`Gson`** | **`KotlinSerialization`** |
| ----- | ---- | ------------------- |
| Uses code genaration | Uses reflection | Uses code generation, compiler plugin is used instead of annotation |
| Faster runtime performance | Slow runtime performance | Good runtime performance |
| Increased build time | build time is not increased | Fast build time |
* Moshi has more advanced features and provides a lower-level JSON API for maximum control
* Kotlin Serialization is also used in KMP(Kotlin Multi Platform)
* Kotlin Serialization is also compatible with unsigned integer types, value classes and sealed classes out-of-the-box.
* Kotlin Serialization is slightly better than Moshi and much better than GSON, But the due to teh extra kotlin powered language syntax sugar, this library is a good choice to use in development.

## `π²πππππππππ π πΌππππ πππππ ππππ π πΉππΎπ½ ππππππ`
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

## `πππππ @πππππππππ ππππππππππ ππ πππππ`
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
    val data = StudentInfo("Ramesh", 21)
    println(data)

    val json = Json.encodeToString(StudentInfo.serializer(), data)
    println(json)
}
```
* Output
```
// Observe the isMale property is not serialized and printed as string
StudentInfo(studentName=Ramesh, studentAge=21) //Printing the student model
{"name":"Ramesh","age":21} //Printing the json string
```

## `ππππππππππππ ππππππππππ ππ πΉπππ ππππππ πππππ ππππππππππππππ£ππππ`
* We have used list collection as example, But we can use for many other collections similarly.

```kotlin
@Serializable
data class StudentInfo(
    val studentName: String,
    val studentAge: Int = 21,
)

fun main() {
    val student1 = StudentInfo("Ramesh", 21)
    val student2 = StudentInfo("Suresh", 21)
    val student3 = StudentInfo("Monica", 21)
    val student4 = StudentInfo("Peter", 21)
    val student5 = StudentInfo("Antony", 21)
    val studentList = listOf(student1,student2,student3,student4,student5)

    val studentsSerializer = ListSerializer(StudentInfo.serializer())
    val json = Json.encodeToString(studentsSerializer, studentList)
    println(json)
}
```

```kotlin
[{"studentName":"Ramesh"},{"studentName":"Suresh"},{"studentName":"Monica"},{"studentName":"Peter"},{"studentName":"Antony"}]
```


## `πΏππππππππ πππ π ππππππ πππ π ππππππππ’ ππ πππππ ππππ ππ πππ ππππππππ£ππ`
* Sometimes in a nested model hierarcy, There comes the scenario that one of the property is not initilized.
* A useful property of Kotlinx is if you have nested data classes and havenβt defined any of them with @Serializable, the IDE will give you an error.
* Sometimes its good to have this warning, but in other case it forces the class inferred to be annotated as serializable. 
<p align="center">
<a><img src="https://github.com/devrath/KotlinSerialization/blob/main/Assets/kotlinxError.png"></a>
</p>

## `π°πππππ π πππππππ πππππ πππ π πππππ ππππππππ’ ππ πππ ππππππππ’ ππ πππ πππππππ ππ πππ π°πΏπΈ ππππππππ`
* If you have a field thatβs in the data class but not in the API, it simply returns nullβ¦ OR if you set a default value on it, it will remain that default value.
* This is one of the defining traits of Kotlinx Serialization. With most of the other json parsers, even if you set a default value like with the above code, if name were not to be found in the API, they would be null. In Kotlinx, it defaults back to the default value.
```kotlin
@Serializable
data class StudentInfo(
    val studentName: String,
    val studentAge: Int = 21,
)
```


## **`πππππππ`** β
If you feel like support me a coffee for my efforts, I would greatly appreciate it.</br>
<a href="https://www.buymeacoffee.com/devrath" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/yellow_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>

## **`π²πππππππππ`** πββοΈ
Read [contribution guidelines](CONTRIBUTING.md) for more information regarding contribution.

## **`π΅πππππππ`** βοΈ 
Feature requests are always welcome, [File an issue here](https://github.com/devrath/KotlinSerialization/issues/new).

## **`π΅πππ ππππ πππππππ ππππππ`** ? β€οΈ
Support it by clicking the β­ button on the upper right of this page. βοΈ

## **`π»ππππππ`** ![Licence](https://img.shields.io/github/license/google/docsy) :credit_card:
This project is licensed under the Apache License 2.0 - see the [LICENSE](https://github.com/devrath/KotlinSerialization/blob/main/LICENSE) file for details


<p align="center">
<a><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
</p>

