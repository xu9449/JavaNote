[TimeTable](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/TimeTable)  
[学习笔记](https://github.com/xu9449/JAVA/wiki) 
1. Document your assumptions   
2. Explain your approach and how you intend to solve the problem  
3. Provide code comments where applicable  
4. Explain the big-O run time complexity of your solution. Justify your answer  
5. Identify any additional data structures you used and justfy why you use them  
6. Only provide your best anser to each part of the question

# 目录  
---   
## 专题
### 基础知识 
### Array [1](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/Array) 
### Sorting & Partitioning [2](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/01-Sorting-Algorithm) . 

Given a sorted array from 0, 1, 2, 3...to n, and there is only one missing number in it, how to find it?   
[经典例题](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/%E7%BB%8F%E5%85%B8%E4%BE%8B%E9%A2%981)  
  
Given an array stored in Stack1, how to sort the numbers by using additional two stacks  
[Using one temp stack](https://www.geeksforgeeks.org/sort-stack-using-temporary-stack/)  
  


## Practice Class 01     
final 修饰的是reference reference不能指向其他东西，只能修改指向的内容。  
[Array vs object](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/Array-vs-object)

## Recursion I & Binary Search  
### 题目
[Fibonachi sequence](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/Fibonacci-sequence)  
  
Example question: [how to calculate a^b](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/how-to-calculate-a%5Eb)
int 是 primitive type， 不可能是null。  
考虑括号里是小于还是小于等于的时候，考虑只有一个元素的时候。检查base case  
  
[Classic Binargy Search](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/Classic-Binary-Search)  
  
[Search in Sorted Matrix I](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/Search-In-Sorted-Matrix-I) . 
  
[First Ocurrance](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/First-Occurence)  
  
[Last Ocurrance](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/Last-Occur)
  
[Variant 1.1 how to find an element in the array that is clsest to the target number? ](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/variant-1.1.-how-to-find-an-element-in-the-array-that-is-closest-to-the-target-number%3F)  
  
[Variant 1.2 return the index of the index of the first occurrence of an element](https://github.com/xu9449/Interesting-Algorithm-_-Java/wiki/Variant-1.2-return-the-index-of-the-first-occurrence-of-an-element)  
  
Variant 1.4 return how to find closest k elements in the array that is closest to a target number?  
step1: binary search  
step2: 谁小移谁  
Time = O(log (n) + k)  
Solution 2 : optimization O (log n + log k)  
Binarey Search Variant 2.0 :孙老师面试题     
### 关于 binary search中 left <= right | < right | < right - 1 的探讨  
最后一位如果向右找 不写right = mid + 1 容易达不到    
classic binary tree 用的是 <= right   
如果是 是 +1 的情况，一定要写成<= ， 否则达不到最后一个数  
所以我们所说的 < right -1 ;其实是留两个数，然后通过最后的减法来算出来哪个比较靠近。


## Queue & Stack   

Question 1 How could we implement a queue by using two stacks?  
Worst caseTime = O ( 2n + 1) = O (n)
Amortized time complexity 
  
Question 2: How to implement tht min() function when using stack with time cimplexity O(1):
Solution 1 : we keep the contents from stack1 and stack2 in synchronization    
  
Follow up question : 
Assume there are a lot of duplicate elements in the input, how to optimize the space usage of stack2 ?  
  
Question 3 How to sort numbers with tree （two) stacks   ?

Question 4 How to use multiple Stacks to implement a dequeue?  
follow up : use 3 stacks to improve the time complexity of pop() operation.  
 
