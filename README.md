[学习笔记](https://github.com/xu9449/JAVA/wiki) 
1. Document your assumptions   
2. Explain your approach and how you intend to solve the problem  
3. Provide code comments where applicable  
4. Explain the big-O run time complexity of your solution. Justify your answer  
5. Identify any additional data structures you used and justfy why you use them  
6. Only provide your best anser to each part of the question
  
基础课   
取整
Is Prime Number （JAVA） 
string concatenation  
取反 补码加1  
arithmetic shift right  
logical shift right (not consider anything, just fills in from the left with 0s)  
Type Conversion
哥德巴赫猜想 （JAVA） 
3. Array
Calculate the maximum value of an array  (Java)
增强for循环 
for ( 声明语句 : 表达式）//声明新的局部变量，该变量的类型必须和数组元素的类型匹配，作用于限定在循环语句块，其值与此时数组元素的值相等。）  
Integer.MIN_VALUE;  
max = (max > i) ? max : i  
  
为什么（串行）搜索极限是nlogn  
N个元素的N！种可能排列只需要log(n!)就排查完了 log(n!)~nlogn
   https://www.zhihu.com/question/24516934   
为什么堆排比快排快  

   （并行）搜索极限是O(log^2n)  Bitonic sorter 和 Batcher odd-even mergesort    

   
   
   
      
试听01   
1.Sorting Alogorithms  
  1.1 Selection Sort （JAVA）  
    1.1.2 Fibonacci （JAVA）  
    1.1.3 Use 3 stacks to implement sorting   
  1.2 Merge Sort （JAVA） 
    1.2.1 e.g. A1B2C3D4 -> ABCD 1234 (JAVA)
    1.2.2 e.g. ABCD1234 -> A1B2C3D4 (JAVA)  
  1.3 Quick Sort
     
      
6.Heap & Graph Search Algorithm   
  6.1 introduce Heap (binary heap)  
  Build a heap Java: [minheap](https://github.com/xu9449/JAVA-Algorithm/blob/master/Laioffer%20Code/minHeap)
    6.1.1 insert ()  
    6.1.2 pop () 
    无论插入或删除都从队尾做文章  
    6.1.3 update（）不太常见  
    heapify(heapsort)(java)
    slower than quicksort, its worst-case(O(n log n) , in-place algorith, but it is  not a stable sort.  
   Q1. Find the smallest k elements from an unsorted array of size n. (Java)  
   O(nlogn)    
   min heap vs. max heap  
   
   
