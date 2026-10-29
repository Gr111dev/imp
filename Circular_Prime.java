import java.util.*;
public class Circular_Prime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String num;
        
        System.out.print("Enter the number :");
        num=in.next();
        int num1=Integer.parseInt(num);
        int l=0,p=0;
        while(num1!=0)
        {
            int k=0;
            int num3=Integer.parseInt(num);
            System.out.println(num3);
            //to check if the num is prime
            for(int i=1;i<=num3;i++)
            {
            if(num3%i==0)
                k++;
            }
            //to increase the value of l when num is prime
            if(k==2)
                l++;
            //to get count of how many times does loop have ran    
            p++;
            
            int temp = Integer.parseInt(num.substring(num.length()-1));
            num = Integer.toString(temp).concat(num.substring(0,num.length()-1));
            num1/=10;
        }
        //to check if the num is circular prime
        if(p==l)
        {
            System.out.println("Hence "+num+" is a circular prime number");
        }
        else
        {
            System.out.println("Hence "+num+" is not a circular prime number");
        }
    }
}
/*
 * +-----------------------------------------------------------+
 * |                    Variable Table                         |
 * +-----------------------------------------------------------+
 * |   Varible   |    Data Type   |        Description         |
 * +-------------+----------------+----------------------------+
 * |    num      |     String     |     To store the number    |
 * |    num1     |      int       |   To store the number in   |
 * |             |                |       interger form        |
 * |    num3     |      int       | To convert in interger form|
 * |     k       |      int       |       for increment        |
 * |     p       |      int       |       for increment        |
 * |     l       |      int       |       for increment        |
 * |     k       |      int       |   for storing last digit   |
 * +-----------------------------------------------------------+
 */





/*
 * ## Algorithm: Circular Prime Number (ISC Class 12)

1. Start.
2. Input a number as a string `num`.
3. Convert `num` into an integer and store it in `num1`. Initialize `l = 0` and `p = 0`.
4. Repeat Steps 5 to 10 while `num1 != 0`.
5. Initialize `k = 0`. Convert `num` into an integer `num3` and display it.
6. Check whether `num3` is prime by counting its factors from 1 to `num3`. Increment `k` for every factor found.
7. If `k == 2`, increment `l` by 1.
8. Increment `p` by 1 to count the number of circular permutations checked.
9. Extract the last digit of `num` and place it at the beginning to generate the next circular permutation.
10. Divide `num1` by 10 using integer division.
11. If `p == l`, display that `num` is a circular prime number; otherwise, display that `num` is not a circular prime number.
12. Stop.
 */