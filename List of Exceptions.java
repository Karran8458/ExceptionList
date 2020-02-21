import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class Exceptions {
    
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");
		for(int i = 0; i < myList.size(); i++) 
		{
		try{
			Integer castedValue = (Integer) myList.get(i);
            System.out.println("The message was delivered!");
        } catch (ClassCastException e){
            System.out.println("Hey, uh, so, I ran out of gas..");
            // back-up plan here.
        }
		}
        
    }
}
