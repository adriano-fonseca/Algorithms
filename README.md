# Algorithms Test Sample

This projects presents some algorithms tests that I have resolved across some technical tests. I hope this can help some one to approach this kind of question. 

# How to use

All questions resolved has your own Junit Test File with the cases of use that should be passing. Just execute them.



# Problems solved


**1.** Write a function that accepts an array of non-negative integers and returns the second largest integer in the array. Return -1 if there is no second largest.
The signature of the function is 
**int f(int[ ] a)** 

Examples:

| if the input array is | return |
|-----------------------|--------|
| {1, 2, 3, 4}          |   3    |
| {4, 1, 2, 3}          |   3    |
| {1, 1, 2, 2}          |   1    |
| {1, 1}                |  -1    |
| {1}                   |  -1    |
| {}                    |  -1    |

**2.** Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers. The function should return X - Y

The signature of the function is:
**int f(int[ ] a)**


Examples:

| if input array is | return |
|-------------------|--------|
|{1}	            |    1   |
|{1, 2}	            |   -1   |  
|{1, 2, 3}	        |    2   |
|{1, 2, 3, 4}	    |   -2   |
|{3, 3, 4, 4}	    |   -2   |
|{3, 2, 3, 4}	    |    0   |
|{4, 1, 2, 3}	    |   -2   |
|{1, 1}	            |    2   |
|{}	                |    0   |

**3.** Write a function that accepts a character array, a zero-based start position and a length. It should return a character array containing containing length characters starting with the start character of the input array. The function should do error checking on the start position and the length and return null if the either value is not legal.
The function signature is: 
**char[ ] f(char[ ] a, int start, int len)**

Examples

| if input parameters are |	    return     |
|-------------------------|----------------|
|{'a', 'b', 'c'}, 0, 4	  |      null      |
|{'a', 'b', 'c'}, 0, 3	  | {'a', 'b', 'c'}|
|{'a', 'b', 'c'}, 0, 2	  | {'a', 'b'}     |
|{'a', 'b', 'c'}, 0, 1	  | {'a'}          |
|{'a', 'b', 'c'}, 1, 3	  |      null      |
|{'a', 'b', 'c'}, 1, 2	  | {'b', 'c'}     |
|{'a', 'b', 'c'}, 1, 1	  | {'b'}          | 
|{'a', 'b', 'c'}, 2, 2	  |      null      |
|{'a', 'b', 'c'}, 2, 1	  |     {'c'}      |
|{'a', 'b', 'c'}, 3, 1	  |      null      |
|{'a', 'b', 'c'}, 1, 0	  |       {}       |
|{'a', 'b', 'c'}, -1, 2	  |      null      |
|{'a', 'b', 'c'}, -1, -2  |      null      |
|{}, 0, 1	              |      null      |


**4.** Write a function that accepts an array of non-negative integers and returns the second smallest integer in the array. Return -1 if there is no second smallest.
The signature of the function is 
**int f(int[ ] a)** 

Examples:

| if the input array is | return |
|-----------------------|--------|
| {4, 1, 6, 2, 3, 5}    |   2    |
| {5, 2, 3, 4}          |   3    |
| {4, 1, 2, 3}          |   2    |
| {1, 1, 2, 2}          |   2    |
| {1, 1}                |  -1    |
| {1}                   |  -1    |
| {}                    |  -1    |


**5.** Write a function that accepts an array of non-negative integers and returns the third largest integer in the array. Return -1 if there is no third largest.
The signature of the function is 
**int f(int[ ] a)** 

Examples:

| if the input array is | return |
|-----------------------|--------|
| {1, 2, 3, 4}          |   2    |
| {4, 1, 2, 3}          |   2    |
| {1, 1, 2, 2}          |  -1    |
| {1, 1, 2 ,2, 3}       |   1    |
| {1, 1, 2 , 3, 5, 5}   |   2    |
| {1,1}                 |  -1    |
| {1, 1, 1, 1}          |  -1    |
| {1}                   |  -1    |
| {}                    |  -1    |

**6. Check if Array is Stepped with at least three occcurences each**

3 An array is defined to be stepped if it is in ascending order and there are 3 or more occurrences of each distinct value in the array. Note that ascending order means a[n]<=a[n+1]. It does not mean a[n] (this is strictly ascending). Write a function named isStepped that returns 1 if its array argument is stepped, otherwise return 0.

If you are programming in Java or C#, the signature is
int isStepped(int[ ] a)

If you are programming in C or C++, the signature is
int isStepped(int a[ ], int len) where len is the number of elements in the array.

Examples

| If the array is	return     |   reason  |
|------------------------------|-----------|
|{1, 1, 1, 5, 5, 5, 5, 8, 8, 8}|	1	It is in ascending order. The distinct values of the array are 1, 5, 8 and there are three or more occurrences of each of these values.|
|{1, 1, 5, 5, 5, 5, 8, 8, 8}   |	0	Even though it is in ascending order, there are only two occurrences of the value 1. |
|{5, 5, 5, 15}	0	           |Even though it is in ascending order, there is only one occurrence of the value 15. |
|{3, 3, 3, 2, 2, 2, 5, 5, 5}   |	0	It is not in ascending order |
|{3, 3, 3, 2, 2, 2, 1, 1, 1}   |	0	It is not in ascending order |
|{1, 1, 1}	                   |   1	  It is in ascending order and there are three or more occurrences of each distinct value. In this case there is only one distinct value. |
|{1, 1, 1, 1, 1, 1, 1}	       |   1	It is in ascending order and there are three or more occurrences of each distinct value. In this case there is only one distinct value. |


**7. Equivalent Arrays**

2 Write a function named equivalentArrays that has two array arguments and returns 1 if the two arrays contain the same values (but not necessarily in the same order), otherwise it returns 0. **Your solution must not sort either array or a copy of either array! Also you must not modify either array, i.e., the values in the arrays upon return from the function must be the same as when the function was called.**

 Note that the arrays do not have to have the same number of elements, they just have to have one of more copies of the same values.

If you are programming in Java or C#, the function prototype is int equivalentArrays(int[ ] a1, int[ ] a2)

If you are programing in C or C++, the function prototype is int equivalentArrays(int a1[ ], int a2[ ], int len1, int len2) where len1 is the number of elements in a1 and len2 is the number of elements in a2.

**Hint: If your solution compares the length of the first array with the length of the second array or vice versa, you have misunderstood the problem!! Your solution does not need to determine which array is bigger!**

Examples:

| if a1 is	and a2 is                    |	return |
|----------------------------------------|---------|
| {0, 1, 2}	{2, 0, 1}	                 | 1 (because both arrays contain the values 0, 1, 2) |
| {0, 1, 2, 1}	{2, 0, 1}	             | 1 (because both arrays contain the values 0, 1, 2) |
| {2, 0, 1}	{0, 1, 2, 1}	             | 1 (because both arrays contain the values 0, 1, 2) |
| {0, 5, 5, 5, 1, 2, 1}	{5, 2, 0, 1}	 | 1 (because both arrays contain the values 0, 1, 2, 5) |
| {5, 2, 0, 1}	{0, 5, 5, 5, 1, 2, 1}	 | 1 (because both arrays contain the values 0, 1, 2, 5) |
| {0, 2, 1, 2}	{3, 1, 2, 0}	         | 0 (the value 3 is not in the first array) |
| {3, 1, 2, 0}	{0, 2, 1, 0}	         | 0 (the value 3 is not in the second array)|
| {1, 1, 1, 1, 1, 1} {1, 1, 1, 1, 1, 2}	 | 0 (the value 2 is not in the first array) |
| {}	{3, 1, 1, 1, 1, 2}	             | 0 (3 is not in the first array.)          |
| {}	{}	                             | 1 (not possible to find a counterexample) |


**8. Has Array N Different Values**

1 Write a function named hasNValues which takes an array and an integer n as arguments. It returns true if all the elements of the array are one of n different values.

If you are writing in Java or C#, the function signature is
int hasNValues(int[ ] a, int n)

If you are writing in C or C++, the function signature is
int hasNValues(int a[ ], int n, int len) where len is the length of a

**Note that an array argument is passed by reference so that any change you make to the array in your function will be visible when the function returns. Therefore, you must not modify the array in your function! In other words, your function should have no side effects.**

Examples

| if a is	if n is	return             |                                                                         |
|--------------------------------------|-------------------------------------------------------------------------|
| {1, 2, 2, 1}	2	                   | 1 (because there are 2 different element values, 1 and 2)               |
| {1, 1, 1, 8, 1, 1, 1, 3, 3}	3      | 1 (because there are 3 different element values, 1, 3, 8)               |
| {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} 10   | 1 (because there are 10 different element values)                       |
| {1, 2, 2, 1}	3	                   | 0 (because there are 2 different element values, not 3 as required)     |
| {1, 1, 1, 8, 1, 1, 1, 3, 3}	2      |	0 (because there are 3 different element values, not 2 as required)  |
| {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}	20 |	0 (because there are 10 different element values, not 20 as required)|

**Hint: There are many ways to solve this problem. One way is to allocate an array of n integers and add each unique element found in the array parameter to it. If you add n elements to the array, return 1, otherwise return 0.**


## Lessons Codility

**1. Lesson 1 Binary Gap**

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }
that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

Assume that:

N is an integer within the range [1..2,147,483,647].
Complexity:

expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1).

**2. Lesson 2 Odd Occurrences in Array** 

A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Assume that:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

**3. SolutionCyclicRotationLesson**

A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

Write a function:

class Solution { public int[] solution(int[] A, int K); }
that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [-1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.


