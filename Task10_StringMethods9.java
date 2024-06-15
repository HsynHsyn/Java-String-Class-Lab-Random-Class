package Preparing.Day22_String_Class_Cont_Lab;

public class Task10_StringMethods9 {
    public static void main(String[] args) {

        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }

    public static boolean frontAgain(String str) {

        String first2 = str.substring(0,2);
        String last2 = str.substring(str.length()-2);
        return first2.equals(last2);
    }
}

/*
Given a string, return true if the first 2 chars in the string also appear at
the end of the string, such as with "edited".
frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */