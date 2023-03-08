import kotlin.time.times

fun main() {
var car=Cars("subaru","legacy","white",40)
    car.carry(50)
    car.identity()
    println( car.calculatePakingFees(10))

    var bus = Bus("minibus","Double-decker","yellow",60)
    bus.carry(80)
    bus.identity()
    println(bus.maxTripFare(400.5))
    println( car.calculatePakingFees(20))

}

//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)
open class Vehicles(var make: String,var model: String,var color: String,var capacity: Int){
    fun carry(people:Int){
        var x=people-capacity
        if (people<=capacity)
            println("carrying $people passengers")
        else
            println("over capacity by $x people")
    }
    fun identity(){
        println("I am a white subaru legacy")
    }
    fun calculatePakingFees(hours:Int): Int{
        var multiply = hours * 20
        return multiply


    }
}

class Cars(make: String, model: String, color: String,capacity: Int):Vehicles(make, model, color, capacity){


}
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//rip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)

//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.

class Bus( make: String, model: String, color: String,capacity: Int) :Vehicles(make, model, color, capacity){
fun maxTripFare(fare:Double):Double {
    var trip = fare.times((capacity))
    return fare

}
}
    fun calculatePakingFees(hours:Int): Int {
        val multiply = hours*200
        return multiply
    }



