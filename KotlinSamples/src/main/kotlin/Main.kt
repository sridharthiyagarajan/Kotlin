fun main(args: Array<String>) {
    // my first kotlin program!
    println("Hello World!")

    // Invoking a function to understand print methods.
    learnPrintMethods("Tata Altroz!", 1);

    // Invoking a function to understand comments.
    learnComments()

    //Invoking a function to understand variables.
    learnVariables()

    // Invoking a function to understand data types.
    learnDataTypes()

    // Invoking a function to learn operators.
    learnOperators()

    // Invoking a function to learn strings.
    learnStrings()

    // Invoking a function to learn conditional statements.
    learnConditionalStatements()

    // Invoking to learn parent and child class.
    learnParentAndChildClass()
}

fun learnPrintMethods(carName: String, noOfCars: Int) {
    println("<========== learnPrintMethods ==========>")

    println("Given car name in a new line: ".plus(carName))
    println("2")
    print("Given car name in the same line is $carName. ")
    print(" Does it to go next line ? NO!")
    println()
    println(3+7)
    println("Total --> ".plus(3+7))
    println("Number of $carName cars I have is/are: $noOfCars")
}

fun learnComments() {
    println("<========== learnComments ==========>")
    // This is single line comment.

    /*
    This
    is
    multiple
    lines
    comments.
     */
}

fun learnVariables() {
    println("<========== learnVariables ==========>")

    var x = 1
    x = 10

    var y: Int = 2
    y = 7

    var z = x + y
    var a: Int = x + y

    println("Value of z: $z")
    println("Value of a $a")

    val b = "John"
    println("Hello $b")

    val c: Int = 10
    println("Value of c is $c")
}

fun learnDataTypes() {
    println("<========== learnDataTypes ==========>")

    var a: Byte = 1
    var b: Short = 2
    var c: Int = 3
    var d: Long = 4
    var e: Float = 5.0F
    var f: Double = 5.0
    var g: Char = 'g'
    var h: Boolean = true
    var i: String = "I am learning!"
    var j: Array<String> = arrayOf("Apple", "Orange")
    if("Apple" in j) {
        println("Apple is present")
    } else {
        println("Apple is not present")
    }
    println("Size of fruits: ${j.size}")
    var k: Float = 2E10F
    var l: Double = 2E3
    var m: Int = a.toInt()
    var n: String = "a"
    var o: CharArray = n.toCharArray()
}

fun learnOperators() {
    println("<========== learnOperators ==========>")

    var a: Int = 5 + 2
    var b: Int = 5 - 2
    var c: Int = 5 * 2
    var d: Int = 5 / 2
    var e: Int = 5 % 2

    var f = 1
    // Other assignments
    f += 2
    f *= 10
    f-=1
    f/=2
    f%=3
    println("Value of f is $f")

    var m: Boolean = a > b
    var n: Boolean = a < b
    var o: Boolean = a != b
    var p: Boolean = a == b
    var q: Boolean = a >= b
    var r: Boolean = a <= b
    var s: Boolean = a <= b && a < b
    var t: Boolean = a>=b || a > b
    var u: Boolean = !(a > b)
}

fun learnStrings() {

    println("<========== learnStrings ==========>")

    var a: String = "Sridhar Thiyagarajan!"
    var b = "Hello World"
    println("Length of a is ${a.length}")
    println("First letter of my name is ".plus(a[0]))
    println("Comparison of two strings $a and $b is ".plus(a.compareTo(b)))
    println(a.uppercase())
    println(b.lowercase())
    println("Index of second name is ${a.indexOf("Thiyagarajan")}")
}

fun learnConditionalStatements() {
    println("<========== learnConditionalStatements ==========>")

    var a = 1
    var b = 2
    var c = 10

    if(a > b) {
        println("a is greater with the value $a")
    } else if (b > c) {
        println("b is greater with the value $b")
    } else {
        println("c is greater by default with the value $c")
    }

    var x = if( a > b) { 10 } else { 20 }

    println(x)

    var a1 = arrayOf(1,2,3,4,5,6)

    for(x in a1) {
        println(x)
    }

    for(num in 1..5) {
        println(num)
    }

    for(x in a1) {

        if(x==4) {
            println("Will be broken here --> $x")
            break
        } else {
            println("Before continue --> $x")
            continue
            println("After continue --> $x")
        }
    }

    var r1 = when (a) {
         1 -> "one"
         2 -> "two"
        else -> "none"
    }
    println(r1)

    var x1 = 10
    while (x1 > 2) {

        println(x1)
        x1--
    }

    var x2 = 10
    do  {

        println(x2)
        x2--
    } while(x2 > 20)
}

fun learnParentAndChildClass() {
    println("<========== learnParentAndChildClass ==========>")

    var apple = Apple("apple", 10)
    apple.printFruitName()
    apple.numOfFruits(apple.count)
}