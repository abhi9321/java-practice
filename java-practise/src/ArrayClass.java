
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
        
        
        // multi dimensional arrays
        
        Integer[][] matrix = new Integer[3][3];

        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[1][0] = 30;
        matrix[1][1] = 40;
        
        System.out.println(matrix[0][1]);
        for(int row=0; row < matrix.length; row++) {
            for(int col=0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            
            System.out.println();
        }
        
        // other example
        String[][] my_array = {{"a1","b1"},{"a2","b2"}};
        
        for (int row=0; row < my_array.length; row++) {
        	for (int col=0; col < my_array[row].length; col++) {
        		System.out.print(my_array[row][col] + "\t");
        		
        	}
        	System.out.println();
        }
        
        
        
        
      
        
        

	}

}
