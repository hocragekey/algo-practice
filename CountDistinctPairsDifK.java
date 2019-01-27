import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class CountDistinctPairsDifK {
    /*
        Spirally traversing a matrix

        https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0
    */
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ntests = Integer.parseInt(br.readLine()), cnt = 0;

        while (cnt < ntests) {
            String[] t = br.readLine().split(" ");
            int m = Integer.parseInt(t[0]);
            String[] sarr = br.readLine().split(" ");
            int[] arr = new int[m];

            for (int i = 0; i < m; i++) {
                int temp = Integer.parseInt(sarr[i]);
                arr[i] = Integer.parseInt(sarr[i]);
            }

            String[] strk = br.readLine().split(" "); 
            int k = Integer.parseInt(strk[0]);
            Arrays.sort(arr);
            int count = 0,
                lastp = -999999999;

            for (int j = 0; j < m-1; j++) {
                int cur = arr[j],
                    counter = j+1,
                    next;

                do {
                    next = arr[counter];
                    if(next - cur == k && cur != lastp) {
                        count++;
                        lastp = cur;
                    }

                    counter++;
                } while(next - cur <= k && counter < m);
            }

            System.out.println(count);
            cnt++;
        }
	}



    
}