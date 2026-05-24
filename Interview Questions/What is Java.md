**What is Java?**

Java is a high-level, object-oriented programming language used to build scalable and platform-independent applications. It is widely used in backend development, enterprise software, banking systems, and web applications because of its stability, security, and large ecosystem.



**Why is Java platform independent?**

Java is platform independent because Java code is compiled into bytecode, which runs on JVM. Since JVM is available for multiple operating systems, the same Java application can run on Windows, Linux, or Mac without changing the code.



**What is JVM?**

JVM stands for Java Virtual Machine. It is responsible for executing Java bytecode and converting it into machine-level instructions. JVM also handles memory management, garbage collection, and platform independence.



**Difference between JDK, JRE, and JVM?**

JDK is the complete development kit used for writing and compiling Java programs. JRE provides the environment required to run Java applications. JVM is a part of JRE that executes Java bytecode.



Simple hierarchy:

JDK > JRE > JVM



**Difference between = and ==?**

= is an assignment operator used to assign values to variables, while == is a comparison operator used to compare two values.



Example:



int a = 10;

if(a == 10)

QUESTION 6

What are variables?

Professional Humanized Answer



Variables are memory locations used to store data values in a program. Each variable has a datatype that defines what type of data it can store.



**Why are methods important?**

Methods improve code reusability, readability, and maintainability. They help divide large programs into smaller logical units, which makes debugging and scaling easier.



**Difference between for loop and while loop?**

A for loop is generally used when the number of iterations is known, while a while loop is preferred when execution depends on a condition and the number of iterations may not be fixed.



**What is a datatype?**

A datatype defines the type of data a variable can store, such as integer, decimal, character, or boolean values.



**Why is String not primitive in Java?**

String is not a primitive datatype because it is implemented as a class in Java. It provides many built-in methods for string manipulation and behaves like an object.



**What is array?**

An array is a data structure used to store multiple values of the same datatype in contiguous memory locations. Arrays allow efficient access using indexes.



**What are advantages of arrays?**

Arrays provide fast data access using indexes, simple data storage, and better memory management for fixed-size collections of elements.



**What is ArrayIndexOutOfBoundsException?**

This exception occurs when we try to access an array index that does not exist, such as accessing index 5 in an array of size 5 where valid indexes are 0 to 4.



**Difference between == and equals() in String?**

== compares object references or memory locations, while equals() compares actual string content. For string comparison in Java, equals() should generally be used.



**Why String is immutable?**

String is immutable in Java to improve security, performance, thread safety, and memory optimization through the string pool mechanism.



**Why are arrays important in backend development?**

Arrays and collections are used in backend systems for storing and processing records such as users, products, API responses, and database results.



**What is difference between array and ArrayList?**

Arrays have fixed size, while ArrayList is dynamic and can grow automatically. ArrayList also provides many built-in utility methods for easier data manipulation.



**What is class?**

A class is a blueprint used to create objects. It defines properties and behaviors of an entity.



**What is object?**

An object is an instance of a class that contains actual data and can access class methods.



**What is constructor?**

A constructor is a special method used to initialize object values during object creation



**Why use this keyword?**

this refers to the current object and is commonly used to differentiate instance variables from local variables or constructor parameters.



**Why main method is static?**

main() is static because JVM calls it directly without creating object of the class.



**Difference between while and do-while?**

while checks condition before execution, while do-while executes at least once before checking condition.

