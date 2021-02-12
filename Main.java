package com.company;

import java.util.Scanner;

class Main
{
    public static void main (String[] args)
    {
        String string;
       Scanner scanner = new Scanner(System.in);
       string = scanner.next();
       if(string != null && string.length()%2!=0) {
           int k,n = string.length();
           k=n/2;
           System.out.println("val:"+ k);
           for (int i=1;i<=k+1;i++) {
               for (int j=i;j<n;j++)
                    System.out.print(" ");
               System.out.println(string.substring(k,k+i));
           }
           for (int i=1;i<=k;i++) {

               for (int j=i+k+1;j<n;j++)
                   System.out.print(" ");
               System.out.println(string.substring(k,n)+string.substring(0,i));
           }
       }
       else {
           System.out.println("Invalid String Format : "+string);
       }
    }
}

