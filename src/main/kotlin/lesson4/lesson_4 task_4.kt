fun main() {

    val arms = 5
    val press = 5
    val legs = 6
    val back = 6

    val day_of_the_train = 6

    println(
        """
        Упражнения для рук:    ${day_of_the_train == arms}    
        Упражнения для ног:    ${day_of_the_train == legs} 
        Упражнения для спины:  ${day_of_the_train == back}  
        Упражнения для пресса: ${day_of_the_train == press}
        
    """.trimIndent()
    )
}