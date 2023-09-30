package anonymousinnerclass.base;

public class Door {

    // this a instance of a class with a private access modifier 
    //and it is having a anonymous inner class of type of Lock
    //(which is a user defined data type) 
    //which contains a abstract method it takes a string;
    private Lock lock = new Lock(){

        // in this anonymous inner class we are creating a method body;
    

        @Override
        public boolean isUnlocked(String key){
            if(key.equals("qwerty")){
                return true;
            }else{
                return false;
            }
        }
    };

    // with this getter method we can return the lock class and use the lock class methods;

    public Lock getLock(){

        // with this return lock we can access the lock class methods ;
        return lock;
    }
}
