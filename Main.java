import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        boolean b = true;
        int r = 0;
        for (int i = 0; i < n; i++) {
            ar[i] =  sc.nextInt();
            if (ar[i] % 2 == 0){
                ar[i] = ar[i]/2;
            } else {
                b = false;
            }
        }
        if (b == true) {
            r++;
        }
        while (b) {
        for (int i = 0; i < n; i++) {
            if (ar[i] % 2 == 0){
                ar[i] = ar[i]/2;
            } else {
                b = false;
            }
        }
        if (b == true) {
            r++;
        }
        }
        System.out.println(r);
    }
}
