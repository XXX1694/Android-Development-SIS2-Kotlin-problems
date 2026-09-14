class Solution {
    fun firstUniqChar(s: String): Int {
        val frequencies = s.groupingBy {it}.eachCount()
        return s.indexOfFirst {frequencies[it]==1}
    }
}

// We create a variable frequencies and put there the result of s.groupingBy {it}
// It takes the string and by each char creates a Map, and eachCount()
// That is how we get a map with the letters and how many times they occur
// And then at return we take the first index where the letter occurs only in a single instance (if there is none then -1)
