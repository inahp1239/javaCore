package inner.main;

import inner.parent.Door;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("enter the passphrase : ");
        String pass = in.nextLine();

        Door door = new Door();
        // System.out.println(door.isLocked("qwerty"));
        if(door.isLocked(pass)){
            System.out.println("Door is open, come in.");
        }else{
            System.out.println("Door is closed, come back again.");
        }
    }

}
