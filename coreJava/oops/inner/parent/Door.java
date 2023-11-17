package inner.parent;



public class Door {

    //this method take a string input and it checks the door is locked or not;
    public boolean isLocked(String key){

        
        // this a local class to a method isLock and it is a anonymous class and it is a abstract class;\

        // this class can be acessed only within this method ;
        class Lock{

            // this method can have a different name ;
            // this method is present in the inner class of Door ;
            public boolean isLocked(String key){
                if(key.equals("qwerty")){
                    return true;
                }else{
                    return false;
                }
            }

        }

        //this line call the inner class Lock and return the value back to the called variable or called line ;
        return new Lock().isLocked(key);
    }
}
