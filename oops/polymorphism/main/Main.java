package polymorphism.main;

import polymorphism.parent.*;
import polymorphism.phone.*;

class Main{

   // Here we are using both inheritence and polymorphism.

   //  public static void main(String[] args){
   // this phone objects doesn't give any problem while calling the phone brach class using the instance of parent class objects .

   //     Phone nokia = new Nokia("Nokia3310");
   //     System.out.println("\n"+nokia.getModel());
   //     nokia.features();

   //     Phone sam = new Samsung("s10 ultra");
   //     System.out.println("\n"+sam.getModel());
   //     sam.features();
	
	// }



   // their is another way to call this 

      public static void main(String[] args) {

         // this phone objects doesn't give any problem while calling the phone brach class using the instance of parent class objects .

         Phone nokia = new Main().phone(1);
         System.out.println("\n"+nokia.getModel());
         nokia.features();

         Phone samsung = new Main().phone(2);
         System.out.println("\n"+samsung.getModel());
         samsung.features();

      }
	
      public Phone phone(int choice){
         switch(choice){
            case 1: return new Nokia("7 plus");
            case 2: return new Samsung("s20 ultra");
         }
         return null;
      }
    
}