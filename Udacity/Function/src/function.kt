import java.util.*

fun main(args: Array<String>){

    println("Hello, world")

    fun dayOfWeek(){
        println("What day is it today?")
        println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    }

    dayOfWeek()
}