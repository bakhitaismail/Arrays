fun main() {
    val names = arrayOf("Bakhita", "Aisha", "Bella", "Naima")
    println(names.contentToString())
    capitalCities()
    maths()
    println(secondNames().contentToString())

}
fun capitalCities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { x ->
        println(x.capitalize())

    }

}
fun maths() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sum = numbers[2]+numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    var add = numbers.sortedArray()
    println(add.contentToString())



}
fun secondNames(): Array<String> {
    var nouns = arrayOf("Ismail", "Iddi", "Awino")
    return nouns
}