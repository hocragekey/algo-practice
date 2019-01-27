import java.util.Scanner;

public class MissingNumberArray {

    /*
        Missing Number Array

        https://practice.geeksforgeeks.org/problems/missing-number-in-array/0
    */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int ntests = sc.nextInt(), cnt = 0;

        while (cnt < ntests) {
            int len = sc.nextInt(), sum = 0, asum = 0;

            for (int i = 1; i <= len; i++) {
                sum+=i;
            }

            for (int x = 0; x < len-1; x++) {
                asum += sc.nextInt();
            }

            System.out.println(sum - asum);

            cnt++;
        }
    }

}