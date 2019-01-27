import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class SubarrayWithGivenSum {
    /*
        Equilibrium Point

        https://practice.geeksforgeeks.org/problems/equilibrium-point/0
    */
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int ntests = Integer.parseInt(br.readLine()), cnt = 0;

        while (cnt < ntests) {
            String[] t = br.readLine().split(" ");
            int len = Integer.parseInt(t[0]); 
            String[] arr = br.readLine().split(" ");
            int[] a = new int[len];

            for (int i = 0; i < arr.length; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }

            int lidx = 0, ridx = arr.length-1, lsum = a[0], rsum = a[ridx];
            Boolean eqF = false, eqDNE = false;

            if(arr.length == 1) {
                System.out.println(1);
                return;
            }

            while(!eqF && !eqDNE) {
                if(lsum == rsum && rids - lidx == 2) {
                    eqF = true;
                    break;
                }

                if(ridx - lidx < 2) {
                    eqDNE = true;
                    break;
                }

                if(rsum < lsum) {
                    lidx++;
                    lsum+=a[lidx];
                } else {
                    ridx++;
                    rsum+=a[ridx];
                }
            }

            if(eqDNE) {
                System.out.println(-1);
            } else {
                System.out.println(ridx-lidx+1);
            }

            cnt++;
        }
    }
}