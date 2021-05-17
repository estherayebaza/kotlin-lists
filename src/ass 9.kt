fun main() {
    println(
        myLists(
            listOf(
                "uganda",
                "kenya",
                "tanzania",
                "Rwanda",
                "Sudan",
                "burundi",
                "Nigeria",
                "SouthSudan",
                "Ghana",
                "Malawi"
            )
        )
    )
    sortPeople()
    anotherSimilarList()

    println(averageAndHeight(listOf(20.50, 60.55, 70.550, 65.50, 72.80, 98.80)))
    var carsList = listOf(
        Car("UGA 349D", 1100),
        Car("UGK 267E", 1200),
        Car("UGF 209F", 1500),
        Car("KDA 397F", 1000)
    )
    println(car(carsList))

}

//Qn 1
fun myLists(countries: List<String>): List<String> {
    var thisList = mutableListOf<String>()
    for (x in countries) {
        if (countries.indexOf(x) % 2 == 0) {
            thisList.add(x)
        }
    }
    return thisList
}

//question2
data class AverageAndTotal(var averageHeight: Double, var totalHeight: Double)

fun averageAndHeight(height: List<Double>): AverageAndTotal {

    var avgHeight = height.average()
    var totalHeight = height.sum()

    return AverageAndTotal(avgHeight, totalHeight)
}

//question3
data class Person(var name: String, var age: Int, var height: Double, var weight: Int)

fun sortPeople() {
    var people = listOf(
        Person("Phionah", 21, 100.35, 60),
        Person("Gide", 23, 120.31, 55),
        Person("Esther", 18, 130.05, 56),
        Person("Sincere", 16, 90.00, 50)
    )

    var descendingSortedPeople = people.sortedByDescending { person -> person.age }
    println(descendingSortedPeople)
}

//Question4
fun anotherSimilarList() {
    var people = mutableListOf(
        Person("Phionah", 21, 100.35, 60),
        Person("Gide", 23, 120.31, 55),
        Person("Esther", 18, 130.05, 56),
        Person("Sincere", 16, 90.00, 50)
    )
    people.addAll(
        listOf(
            Person("JANE", 32, 140.00, 70),
            Person("Janet", 22, 145.45, 65)
        )
    )
    println(people)
}

//Question five
data class Car(var registration: String, var mileage: Int)

fun car(cars: List<Car>): Int {
    var totalMileage = 0
    cars.forEach { car ->
        totalMileage += car.mileage
    }
    var avg = totalMileage / cars.count()
    return avg
}


