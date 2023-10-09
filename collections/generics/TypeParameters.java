package collections.generics;


// The type parameters naming conventions is important!

// The naming conventions are as follows:

// T - Type
// E - Element
// K - Key
// N - Number
// V - Value


// Acutally their is no such Type that can reprasents the some thing in java;

// it need only a reference type variable to reprasent its nature of data type to need to store that's all;

class Parameters<A>{
    private A var ;

    public A getVar() {
        return var;
    }

    public Parameters(A var) {
        this.var = var;
    }
    
}

class Para<a>{
    private a var ;

    public a getVar() {
        return var;
    }

    public Para(a var) {
        this.var = var;
    }
    
}

public class TypeParameters {
    public static void main(String[] args){
        Parameters<Integer> p = new Parameters<>(55);
        System.out.println(p.getVar());

        Para<String> p1 = new Para<>("Their is no such type of parameters naming conventions");
        System.out.println(p1.getVar());
    }
}

// output :-
// 55
// Their is no such type of parameters naming conventions