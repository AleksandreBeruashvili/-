fun main(){

    //create objects
    val vec1 = My3DVector(1.0 , 3.0 , 5.0 )
    val vec2 = My3DVector(2.0 , 4.0 , 6.0)


    //let's check
    println("scalar prodact is " + vec1.scalar_prodact(vec2))
    println("vector prodact is " + vec1.vector_prodact(vec2))


}


class My3DVector(var x : Double , var y : Double , var z :Double){

    fun scalar_prodact (second : My3DVector) : Double {

        return x*second.x + y*second.y + z*second.z
    }

    fun vector_prodact (second: My3DVector) : String {

        return "(${y*second.z-z*second.y} ; ${z*second.x-x*second.z} ; ${x*second.y-y*second.x})"

    }
}