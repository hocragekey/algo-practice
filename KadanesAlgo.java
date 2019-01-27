public class KadanesAlgo {

    /*
        Kadane's Alogrithm

        https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
    */
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        int ntests = sc.nextInt(), cnt = 0;

        while (cnt < ntests) {
            int length = sc.nextInt();
            int[] arr = new int[length];

            for (int x = 0; x < length; x++) {
                arr[x] = sc.nextInt();
            }
            
            int rmax = arr[0], cmax = arr[0];
            for (int i = 1; i < arr.length; i++) {
                int current = arr[i];
                rmax += current;

                if(rmax > cmax) {
                    cmax = rmax;
                }
            }

            System.out.println("Max for test case: " + cmax);
            cnt++;
        }
        
        
    }

}