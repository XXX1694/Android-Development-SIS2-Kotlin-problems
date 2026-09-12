class Solution {
    fun firstUniqChar(s: String): Int {
        val frequencies = s.groupingBy {it}.eachCount()
        return s.indexOfFirst {frequencies[it]==1}
    }
}

// Создаем переменную frequencies и туда засовываем результат s.groupingBy {it}
// Он берет стринг и по каждой char создает Map а eachCount()
// Так мы получаем мапу с буквами и сколько раз они встречаются
// А потом при return берем первый индекс где буква встречается только в единственном экземпляре (если нет то -1)
