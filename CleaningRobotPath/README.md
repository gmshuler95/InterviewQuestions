There is a cleaning robot which is cleaning a rectangular grid of size N x M, represented by array R consisting of N strings. The robot starts cleaning in the top-left corner, facing rightwards. It moves in a straight line for as long as it can. When it encounters an 'x' it cannot moved forward and always rotates 90 degress clockwise and tries to move forward again until it encounters another obstacle, and so on. Dots in the string '.' represent empty squares and 'x's represent obstacles (robot cannot move through). Each square that the robot occupied at least once is considered clean.

["...x.."]
["....xx"]
["..x..."]

A robot starts at (0,0) facing rightwards and moves to (0,2), where it turns due to the obstacle at (0,3). Then it goes down from (0,2) to (1,2), where it changes directions again because of another obstacle. Next it goes left from (1,2) to (1,0) where it turns once because of the grid boundary. Then it moves and turns once more back to (0,0).  It continues in this cycle indefinitely. It has achieved 6 clean squares.

Write a function that given an array R consisting of N strings, each at length M, representing the grid, returns the number of clean squares.

public int solution(String[] R)

Assume
-N and M are integers within range 1-20
-top left cell is always empty
-String R only contains '.' and 'x' characters