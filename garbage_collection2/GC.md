GC is the automatic JVM process:  
收回不再使用的object的memory  
Reclaim the memory  

What's the benifit of GC?  
reclaims the memory, automatically. 
reduce the concern of gc 

High level - steps of GC   
--scanning heap memory,  
--identifying objects in use & not in use,  
--deleting the unused objects,  
--and defragmenting heap (optionally) .
  
Heap: part of JVM memory   
dynamic memory allocation for Application Java objects  
What is heap?
It is a JVM memory, it is used for dynamic memory allocation for Application Java objects and System classes  

HEAP Layout  （<= JDK 7)  
Young Generation  ：新生态    
eden:
SurvivorSpace:  
Old Generation ：老生态  
Permanent Generation: 元生态  
Terminology  
GC Roots  
Mark 


Garbage Collectors:  
Serial Collector(单核 32位）:  
Single thread  
Minor GC  
FUll GC  

Parallel Collector    （After JDK11)  
更快，更好  多核  
  
The Mostly Concurrent CollectorsL G1    
minimal pauses   
smaller region: 某些小region garbage比较多，可以直接收回  
 

The Mostly Concurrent Collectors: CMS  
