package collections.arraylist;

import java.util.ArrayList;

class intWrapper{
    int intValue ;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }


}

class Boxing {
    public static void main(String[] args) {
        // by default auto boxing and unboxing ;
		ArrayList<Integer> studentNumbers = new ArrayList<>();
		studentNumbers.add(25); //Autoboxing
		System.out.println(studentNumbers.get(0)); // auto unboxing  

        // with our own int wrapper class and boxing and unboxing;
        ArrayList<intWrapper> list = new ArrayList<>();
		list.add(new intWrapper(12)); // boxing
		System.out.println(list.get(0).getIntValue());// unboxing



        ArrayList<Double> demoList = new ArrayList<>();
		demoList.add(25.5);  
		//demoList.add(new Double(25.2)); 
		demoList.add(Double.valueOf(10.0)); //This is done while autoboxing
		//System.out.println(demoList.get(0));
		System.out.println(demoList.get(1).doubleValue()); //This is done while unboxing
	}
}
