import java.io.IOException;
import java.util.Scanner;

public class SpirallyTraverseMatrix {
    /*
        Spirally traversing a matrix

        https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0
    */
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ntests = Integer.parseInt(br.readLine()), cnt = 0;

        while (cnt < ntests) {
            String[] t = br.readLine().split(" ");
            int m = Integer.parseInt(t[0]), n = Integer.parseInt(t[1]); 
            String[] arr = br.readLine().split(" ");
            String[][] a = new String[m][n];
            int cm = 0, cn = 0;

            for (int i = 0; i < arr.length; i++) {
                a[cm][cn] = arr[i];

                if(cn == n-1) {
                    cm++;
                    cn=0;
                } else {
                    cn++;
                }
            }

            String dir = "e";
            int xm = 0, yn = 0, xmax = n, xmin = 0, ymax = m, ymin = 0;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(a[xm][yn]);

                switch(dir) {
                    case "e" :
                        if(xm < xmax) {
                            xm++;
                        } else {
                            dir = "s";
                            ymin ++;
                        }
                        break;
                    
                    case "s" :
                        if(yn < ymax) {
                            yn++;
                        } else {
                            dir = "w";
                            xmax--;
                        }
                        break;

                    case "w" :

                        if(xn > xmin) {
                            xm--;
                        } else {
                            dir = "n";
                            ymax--;    
                        }
                        break;

                    case "n" :

                        if(yn > ymin) {
                            yn--;
                        } else {
                            dir = "e";
                            xmin++;
                        }
                }
            }

            cnt++;
        }
    }
}