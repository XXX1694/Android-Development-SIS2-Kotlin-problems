class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val sorted = nums.sorted()
        return nums.map { num ->
            sorted.indexOf(num)
        }.toIntArray()
    }
}

// Сортируем array, потом даем опирацию .map{} и проходимся по каждому элементу nums
// Смотрим его индекс то есть позицию в sorted array
// например после сортировки он 3ий значит перед ним есть 2 числа которые меньше
// вот так создаем лист и конвертируем обратно в IntArray
