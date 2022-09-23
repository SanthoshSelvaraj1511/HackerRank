package hackerRank;

import java.util.Scanner;

public class hackerRank3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the input:");
        int N = scanner.nextInt();

        if(N%2!=0 ) {
            System.out.println(" wierd");
        }
        else if(N>=2&& N%2==0 &&N<=5){
            System.out.println("print not wired");
        }
        else if(N>=6 && N%2!=0 &&N<=20){
            System.out.println("print wired");
        }

        else
            System.out.println("print not wired");
        scanner.close();
    }
}

