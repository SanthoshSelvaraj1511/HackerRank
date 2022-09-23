package hackerRank;

import java.util.Scanner;

public class outputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();

            System.out.println();
            int x=sc.nextInt();
            System.out.println(s1+"      "+x);
        }
        System.out.println("================================");

    }
}

