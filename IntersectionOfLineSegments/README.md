# Intersection of Line Segments

Problem Statement:
Given two straight line segments (represented as a start point and an end point), compute the point of intersection, if any.

My approach:
- Generate an equation for both line segments
- Find out where in infinite space the lines intersect based on their equations. If the line segments are parallel and never intersect return null
- Check if this intersection point is anywhere on the finite line segments given. If so return the Point. If not return null

Steps:
- Define a LineSegment class with two instance variables: startPoint and endPoint both of type Point
- Define a Point class with two instance variable: x and y both of double double
- Implement a LineSegment class method to generate the equation coefficients for the line segment
- Implement a LineSegment class method to check if a Point is within the LineSegment. Where the Point is an argument
- Implement a Line Segment class method to find the intersection with another LineSegment, where the second LineSegment is an argument. This is done by generating Equation coefficients for both line segments, finding out where the line segments intersect in infinite space, assessing if this intersection point is within the finite line segments, and returning the intersection Point if true and null if false.