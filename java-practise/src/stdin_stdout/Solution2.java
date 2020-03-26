package stdin_stdout;

import java.util.Scanner;

/*
 * 42
 * 3.1415
 * Welcome to HackerRank's Java tutorials!
*/
public class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}