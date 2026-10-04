# 125. Valid Palindrome

- **Category:** Strings
- **Language:** Java
- **Problem:** [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)
- **Solution:** [Solution.java](Solution.java)

## Approach

Keep only letters and digits, build the reverse, and compare ignoring case.

## Complexity

- **Time:** O(n²) because of repeated string concatenation
- **Space:** O(n) peak auxiliary space
