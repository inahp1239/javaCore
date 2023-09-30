package anonymousinnerclass.main;

import anonymousinnerclass.base.Door;

public class Main {
    public static void main(String[] args){
        Door door = new Door();
        if(door.getLock().isUnlocked("qwerty")){
            System.out.println("Door is open , come in.");
        }else{
            System.out.println("Door is closed , come again.");
        }
    }
}
