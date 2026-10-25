# Android Development SIS 2: Kotlin Problems

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=flat-square&logo=leetcode&logoColor=black)

Independent study assignment (SIS 2) for an Android development course at university: five LeetCode problems solved in idiomatic Kotlin, each with a short explanation in comments.

## Problems

| File | Problem | Approach |
|------|---------|----------|
| `leetcode104.kt` | Maximum Depth of Binary Tree | Recursion: `1 + max(left, right)` |
| `leetcode242.kt` | Valid Anagram | Compare letter-frequency maps (`groupingBy` + `eachCount`) |
| `leetcode387.kt` | First Unique Character in a String | Frequency map, then `indexOfFirst` with count 1 |
| `leetcode1365.kt` | How Many Numbers Are Smaller Than the Current Number | Sort once, answer is the index in the sorted array |
| `leetcode1480.kt` | Running Sum of 1d Array | `map` with a running accumulator |

Each file contains a `Solution` class in the LeetCode submission format, so it can be pasted into the LeetCode editor as is.
