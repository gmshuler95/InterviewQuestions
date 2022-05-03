##### Problem Statement
Given an integer, write a function to sum each individual digit in the integer.

###### Example
Input: 1234
Output: 10

##### Approach
- Write an ExtractDigit() function able to extract singular digits from a multi-digit number (ex. extract the first digit from 1234 -> returns 4)
- Write a NumberLength() function to find the number of digits in a given integer. 
- Write a sumDigits() function that runs a for loop according to the digit length and within the for loop extracts each digit and adds the singular digit to the running sum