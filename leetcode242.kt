class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return s.groupingBy{it}.eachCount() == t.groupingBy{it}.eachCount()
    }
}

// We check the length, if it does not match then false
// Then we run two functions where we count how many times a specific letter occurs
// And then we compare the two maps where there is a list of letters and how many times they occur
