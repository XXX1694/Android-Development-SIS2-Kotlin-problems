class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return s.groupingBy{it}.eachCount() == t.groupingBy{it}.eachCount()
    }
}

// Проверяем длину если не совпадает то false
// Потом запускаем две функции где считаем сколько раз встречается конкретная буква
// А потом сравниваем две мапы где есть список букв и сколько раз они встречаются
