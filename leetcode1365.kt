class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val sorted = nums.sorted()
        return nums.map { num ->
            sorted.indexOf(num)
        }.toIntArray()
    }
}

// We sort the array, then we apply the .map{} operation and go through each element of nums
// We look at its index, that is, its position in the sorted array
// for example after sorting it is the 3rd, which means before it there are 2 numbers that are smaller
// that is how we create a list and convert it back to IntArray
