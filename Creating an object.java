/*
For creating object we need new keyword , after creating object , now object is actually occupying memory inside heap memory 
so we have 2 types of memory in java 1 Stack memory , 2 Heap memory
when we create object like Student st = new Student(); 
then Student st ; is reference , which is actually stored in stack memory like table 

Name Value
st   @194wu
age    5

for primitive data types we actual store value in stack memory
so here value is actual address of memory in heap.

st = new Student();
if we assing new object then this reference will be pointing to new address where new object of student is there in heap , and old student object has no reference 
so now it is eligible for Java Garbage collector , because old student object is now garbage;
or we can st = null , by doing student object will be null in stack memory value , so it has also no referance in heap memory , so it is also eligible for garbae collectionin java.
*/
