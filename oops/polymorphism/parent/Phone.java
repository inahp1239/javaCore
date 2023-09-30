package polymorphism.parent;

public class Phone{

    private String model;


// this is a parameterised constructer which can need to be passed of string type of a model name and stores in the local variable model.
    public Phone(String model){
        this.model = model;
    }

    public void features(){
        System.out.println("feature phone");
    }

    public String getModel(){
        return model;
    }

}