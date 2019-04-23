fun main (){

    val

        x = 2  //get a value of x which is not changeable, put here x value and chq


    when (x){


        in 1..20 -> {
            println("X lies in 1 to 20")
            print("And the ans is - ")
            print(x)
        }

        else -> {
            println("Value is unknown")
            println("I don't knw the value of x")
        }
    }

}