
public class ArrayClass {

	public static void main(String[] args) {
		// 1D array
        int[] values = {3, 5, 2343};
        
        // Only need 1 index to access values.
        System.out.println(values[2]);
        
        
        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";
        
        // Access an array element and print it.
        System.out.println(words[2]);
        
        
        int[] nums = new int[1];
        nums[0] = 1;
        System.out.println(nums[0]);
        
        
        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        
        // Iterate through an array
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
        
        Integer[] arr_int = {11,22,33,44,55};
//        arr_int[0]=123;
        System.out.println(arr_int[0]);
        
        for(Integer i: arr_int) {
        	System.out.println(i);
        }
        System.out.println(arr_int.length);	
        
        
        
        
      
        
        

	}

}
