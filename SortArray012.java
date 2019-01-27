import java.util.Scanner;

public class SortArray012 {

    /*
        Sort an array of 0s, 1s and 2s

        https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
    */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int ntests = sc.nextInt(), cnt = 0;

        while (cnt < ntests) {
            int max = sc.nextInt();
            int[] arr = new int[max];

            for (int i = 0; i < max; i++) {
                arr[i] = sc.nextInt();
            }

            int x=0, y=0, z = max-1, i = 0;
            while(y<=z) {
                int t = arr[y];

                if(t > 1) {
                    int q = arr[z];
                    arr[y] = q;
                    arr[z] = t;
                    z--;
                } else if(t < 1) {
                    int q = arr[x], v = arr[y];
                    arr[x] = v;
                    arr[y] = q;
                    x++;
                    y++;
                } else {
                    y++;
                }
            }

            StringBuffer sb = new StringBuffer(max*2);
            for (int h = 0; h < max; h++) {
                sb.append(arr[h] + " ");
            }

            System.out.println(sb.toString());
            
            cnt++;
        }
    }
}