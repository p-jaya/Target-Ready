package com.targetindia;

public class NumToWords {

    static String ones[] = {"", "one ", "two ", "three ", "four ",
            "five ", "six ", "seven ", "eight ",
            "nine ", "ten ", "eleven ", "twelve ",
            "thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ",
            "nineteen " };

    static String tens[] = { "", "", "twenty ", "thirty ", "forty ",
            "fifty ", "sixty ", "seventy ", "eighty ",
            "ninety " };


    public static String numToWords(int num, String s){
        String ans="";
        if(num>19){
            ans += tens[num/10] + ones[num%10];
        }
        else{
            ans += ones[num];
        }

        if(num>0)ans += s;
        return ans;
    }

    public static String inWords(int num) {
        String result="";

        result += numToWords((num/10000000), "crore ");
        result += numToWords(((num/100000)%100), "lakh ");
        result += numToWords(((num/1000)%100), "thousand ");
        result += numToWords(((num/100)%10), "hundred ");
        result += numToWords((num%100), "");

        return result;
    }



    public static  void main(String[] args) {
        System.out.println(inWords(101));   //verified with the examples given in the assignement
    }
}
