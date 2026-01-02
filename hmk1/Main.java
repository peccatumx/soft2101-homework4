import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start + 1; i < end; i++) {
	    if (i % 2 == 0) {
        System.out.println(i);
   	 }
	}


        sc.close();
    }
}

