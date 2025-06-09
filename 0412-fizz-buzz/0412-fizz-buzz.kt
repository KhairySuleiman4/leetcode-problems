class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val list = mutableListOf<String>()
        for(i in 1..n){
            when{
                i % 3 == 0 && i % 5 == 0 -> list.add("FizzBuzz")
                i % 3 == 0 -> list.add("Fizz")
                i % 5 == 0 -> list.add("Buzz")
                else -> list.add("$i")
            }
        }
        return list
    }
}