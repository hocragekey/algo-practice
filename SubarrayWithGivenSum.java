import java.io.IOException;
import java.util.Scanner;

public class SubarrayWithGivenSum {
    /*
        Subarray With Given Sum

        https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0/?ref=self
    */
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int ntests = Integer.parseInt(br.readLine()), cnt = 0;

        while (cnt < ntests) {
            String[] t = br.readLine().split(" ");
            int len = Integer.parseInt(t[0]), sum = Integer.parseInt(t[1]); 
            String[] arr = br.readLine().split(" ");
            int[] a = new int[len];
            

            Boolean f = false;
            int s = 0, e = 0, rsum = Integer.parseInt(arr[s]);
            while(!f && s < len && e <= len) {
                if(rsum > sum) {
                    rsum -= Integer.parseInt(arr[s]);
                    s++;
                } else {
                    rsum += Integer.parseInt(arr[e]);
                    e++;
                }
                
                if(rsum == sum) {
                    System.out.println(s+1 + " " + e);
                    f = true;
                    break;
                }
            }

            if(!f) {
                System.out.println("-1");
            }

            cnt++;
        }
    }
}