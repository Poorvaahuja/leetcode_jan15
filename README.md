# leetcode_jan15
LEETCODE PROBLEMS
## Q1 Find players with zero of one losses
You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.
Return a list answer of size 2 where:
answer[0] is a list of all players that have not lost any matches.
answer[1] is a list of all players that have lost exactly one match.
The values in the two lists should be returned in increasing order.
Note:
You should only consider the players that have played at least one match.
The testcases will be generated such that no two matches will have the same outcome.

<img width="412" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan15/assets/122693422/ca1642aa-35f2-44c3-b32e-07792c417960">

## Q2 Image smoother
An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down the average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother). If one or more of the surrounding cells of a cell is not present, we do not consider it in the average (i.e., the average of the four cells in the red smoother).
<img width="423" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan15/assets/122693422/217ed861-e7b1-494e-8855-12973d1b6d0a">

## Q3 Minimum moves to equal array elements
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
In one move, you can increment or decrement an element of the array by 1.
Test cases are designed so that the answer will fit in a 32-bit integer.

<img width="418" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan15/assets/122693422/83b28718-d551-4952-9806-25b2171a813d">

## Q4 Random point in non overlapping rectangles
You are given an array of non-overlapping axis-aligned rectangles rects where rects[i] = [ai, bi, xi, yi] indicates that (ai, bi) is the bottom-left corner point of the ith rectangle and (xi, yi) is the top-right corner point of the ith rectangle. Design an algorithm to pick a random integer point inside the space covered by one of the given rectangles. A point on the perimeter of a rectangle is included in the space covered by the rectangle.
Any integer point inside the space covered by one of the given rectangles should be equally likely to be returned.
Note that an integer point is a point that has integer coordinates.
Implement the Solution class:
Solution(int[][] rects) Initializes the object with the given rectangles rects.
int[] pick() Returns a random integer point [u, v] inside the space covered by one of the given rectangles.
