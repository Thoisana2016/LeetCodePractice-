package problems;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long l1 = -9223372036854775808L; long l2 = 9223372036854775807L;
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                if(x >= -32768 && x <= 32767){
                    System.out.println("* short");
                }
                if(x >= -2147483648 && x <= 2147483647){
                    System.out.println("* int");
                }
                if(x >= l1 && x <= l2){
                    System.out.println("* long");
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
