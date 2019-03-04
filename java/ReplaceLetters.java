package com.stackroute;
import java.util.Scanner;

public class ReplaceLetters {
    public static String replaceLtr(String str){
        str = str.replace("d","f");
        str = str.replace("i","t");
        return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        replaceLtr(str);
    }
}
