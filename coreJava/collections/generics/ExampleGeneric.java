package collections.generics;


// Defining a Generic class

// public class Box<T> {
//     private T data;

//     public Box(T data) {
//         this.data = data;
//     }

//     public T getData() {
//         return data;
//     }
// }

// Using a Generic class

// Box<String> stringBox = new Box<>("Hello");
// String data = stringBox.getData();


class ObjectExample{
    private Object var1;

    public ObjectExample(Object var1) {
        this.var1 = var1;
    }

    public Object getVar1() {
        return var1;
    }
    
}

// The type parameters naming conventions is important!

// The naming conventions are as follows:

// T - Type
// E - Element
// K - Key
// N - Number
// V - Value

// this is a basic Generic class of single variable
class Generic<T>{
    private T var ;

    public Generic(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }


}

public class ExampleGeneric {
    public static void main(String[] args){
         

        // this String class only can accept String type of data to process and execute
        String str = "Hello";
        System.out.println(str+"\n");


        // -----------------------------------------------------------------------------------------------------------------------//

        ObjectExample str1 = new ObjectExample("Object");
        System.out.println((String) str1.getVar1() +"\n");
        // the above code works as like as generic but their some exceptions on type casting , type safety , etc;

        // ObjectExample nums = new ObjectExample("Object");
        // System.out.println((Integer) nums.getVar1() +"\n"); // casting exception

        // output for above two lines code:- 
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        // at collections.generics.ExampleGeneric.main(ExampleGeneric.java:67)


        // -----------------------------------------------------------------------------------------------------------------------//
        // for to avoid the above cases generic will;

        System.out.println("-----------------\nGerenric examples\n-----------------");


        // reduces the type casting time;
        // type safety it only accepts only gerneric specified type only other than that it never accepts 
        // and gives the compile time error;

        Generic<String> string = new Generic<>("World");
        System.out.println(string.getVar());

        Generic<Integer> integer = new Generic<>(234);
        System.out.println(integer.getVar());

        Generic<Double> doubletype = new Generic<>(6543.654);
        System.out.println(doubletype.getVar());

    }
}




// output :- 
// Hello
// 
// Object
// 
// -----------------
// Gerenric examples
// -----------------
// World
// 234
// 6543.654




// Generics in Java allow you to create classes, interfaces, and methods that operate with type parameters. They provide a way to create reusable and type-safe code by allowing you to specify the data types that a class or method can work with. Generics were introduced in Java 5 to enhance type safety and reusability in the Java language.

// Here are some key points about generics in Java:

// 1. **Type Parameters**: Generics use type parameters, which are placeholders for actual data types. Type parameters are defined using angle brackets `<T>`, `<E>`, `<K>`, or any valid Java identifier.

// 2. **Class Generics**: You can create generic classes by adding type parameters to the class declaration. These type parameters can then be used as data types within the class.

//    Example of a generic class:
//    ```java
//    public class Box<T> {
//        private T data;

//        public Box(T data) {
//            this.data = data;
//        }

//        public T getData() {
//            return data;
//        }
//    }
//    ```

// 3. **Method Generics**: You can also create generic methods within non-generic classes. These methods use type parameters to work with different data types.

//    Example of a generic method:
//    ```java
//    public static <T> T findMax(List<T> list) {
//        T max = list.get(0);
//        for (T item : list) {
//            if (item.compareTo(max) > 0) {
//                max = item;
//            }
//        }
//        return max;
//    }
//    ```

// 4. **Type Safety**: Generics provide compile-time type safety. They allow you to catch type-related errors at compile time rather than at runtime.

//    ```java
//    Box<String> box = new Box<>("Hello");
//    String data = box.getData(); // No need for casting, type is known at compile time
//    ```

// 5. **Wildcards**: You can use wildcards (`?`) to create more flexible generic classes and methods that work with unknown types.

//    Example of a generic method with a wildcard:
//    ```java
//    public static double sum(List<? extends Number> numbers) {
//        double total = 0.0;
//        for (Number number : numbers) {
//            total += number.doubleValue();
//        }
//        return total;
//    }
//    ```

// 6. **Bounded Type Parameters**: You can specify bounds on type parameters, limiting the types that can be used as arguments.

//    Example of a bounded type parameter:
//    ```java
//    public class DataProcessor<T extends Number> {
//        // Class can work with any type that extends Number
//    }
//    ```

// Generics are widely used in Java to create reusable and type-safe code for collections, data structures, algorithms, and more. They help reduce the need for explicit type casting and enhance code readability and maintainability.



// Generics in Java offer several advantages and some disadvantages. Here are the pros and cons of using generics:

// **Pros of Generics:**

// 1. **Type Safety**: Generics provide strong compile-time type checking. This means that the compiler can catch type-related errors at compile time rather than at runtime. This helps in preventing runtime ClassCastException errors and improves program reliability.

// 2. **Code Reusability**: Generics allow you to create classes, methods, and data structures that can work with different data types. This promotes code reusability and reduces the need to write duplicate code for different data types.

// 3. **Cleaner Code**: Generics can make your code more readable and maintainable by eliminating the need for explicit type casting in many situations. It also reduces the risk of introducing bugs due to type casting errors.

// 4. **Collection Framework**: Generics are extensively used in Java's Collection Framework, enabling you to create collections (e.g., lists, sets, maps) that are type-safe. This ensures that you cannot accidentally insert an incorrect type of object into a collection.

// 5. **Performance**: Generics often result in better performance compared to using Object types and casting. This is because the compiler can optimize the generated bytecode when it knows the specific data types involved.

// **Cons of Generics:**

// 1. **Complex Syntax**: Generics can introduce complex syntax, especially when dealing with wildcard types, bounded type parameters, or nested generics. This complexity can make the code harder to understand for beginners.

// 2. **Code Verbosity**: Generics can sometimes make code more verbose, particularly when you need to specify type parameters explicitly. This verbosity can reduce code readability.

// 3. **Backward Compatibility**: Before generics were introduced in Java 5, existing code relied on raw types and casting. Adding generics to legacy code can be challenging, and in some cases, it may not be straightforward.

// 4. **Limitations on Primitive Types**: Generics in Java do not work directly with primitive types (e.g., `int`, `char`). You need to use wrapper classes (e.g., `Integer`, `Character`) for these types, which can add some overhead.

// 5. **Learning Curve**: Understanding and effectively using generics may have a learning curve, especially for programmers new to Java or those not familiar with generic programming concepts.

// In summary, while generics provide significant benefits in terms of type safety, code reuse, and cleaner code, they also introduce some complexity and verbosity. The decision to use generics should be based on the specific needs of your program and the trade-offs involved in terms of code readability and maintainability.