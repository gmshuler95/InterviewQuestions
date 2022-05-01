# String Rotation

Problem Statement:
Assume you have a method isSubstring() which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubtring()

Example: "waterbottle" is a rotation of "erbottlewat"

My approach:

Brute Force:
- Loop through each letter in the rotate string and check if the successive sequence of letters matches the original string. If a letter didn't match, the loop continued until finding a match or the for loop terminated

Only one call of isSubstring:
- Concatenate the rotated string with itself:
"erbottlewat" + "erbottlewat"
If the rotated string is truly a rotation of the original string, the original string character sequence will be formed in the middle of the concatenated string. Then the isSubstring method can find the original word with only one call. The isStringRotation() method will then return the result from isSubstring()

Note: the isSubstring() method was also coded by me utilizing Regex