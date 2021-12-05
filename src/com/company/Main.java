package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//2.1
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));

        System.out.println("");
//2.2
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));

        System.out.println("");

//2.3
        System.out.println("3: " + isAvgWhole(new int[]{1, 2, 3, 4}));

        System.out.println("");
//2.4
        for (int n : cumulativeSum(new int[]{1, 2, 3})) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n : cumulativeSum(new int[]{1, -2, 3})) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n : cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("");
//2.5
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));

        System.out.println("");
//2.6
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));

        System.out.println("");
//2.7
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));

        System.out.println("");
//2.8
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));

        System.out.println("");
//2.9
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));

        System.out.println("");
//2.10
        for(int i=0; i<7; i++){
            System.out.println(boxSeq(i));
        }

        System.out.println("");
//3.1
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));

        System.out.println("");
//3.2
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));

        System.out.println("");
//3.3
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));

        System.out.println("");
//3.4
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("Ada"));
        System.out.println(flipEndChars("z"));

        System.out.println("");
//3.5
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5C5Z"));
        System.out.println(isValidHexCode("#CD5C&C"));
        System.out.println(isValidHexCode("CD5C5C"));

        System.out.println("");
//3.6
        System.out.println(same(new int[]{1, 3, 4, 4, 4},new int[]{2, 5, 7}));
        System.out.println(same(new int[]{9, 8, 7, 6},new int[]{4, 4, 3, 1}));
        System.out.println(same(new int[]{2},new int[]{3, 3, 3, 3, 3}));

        System.out.println("");
//3.7
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(5));
        System.out.println(isKaprekar(297));

        System.out.println("");
//3.8
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));

        System.out.println("");
//3.9
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));

        System.out.println("");
//3.10
        System.out.println(rightTriangle(3, 4, 5));
        System.out.println(rightTriangle(145, 105, 100));
        System.out.println(rightTriangle(70, 1304, 110));

        System.out.println("");
}

//2.1
    public static String repeat(String s, int n){
        String repS = "";
        for(char ch : s.toCharArray()){
        for(int i=0; i<n; i++){
            repS+=ch;
        }
    }
    return repS;
    }
//2.2
    public static int differenceMaxMin(int s[]){
        int minS = s[0];
        int maxS = s[0];
        for(int n : s){
            if(n>maxS){
                maxS = n;
            }
            if(n<minS){
                minS = n;
            }
        }
        return maxS-minS;
    }

//2.3
    public static boolean isAvgWhole(int[] mas) {
        int sum = 0;
        int num = 0;
        for (int i : mas) {
            sum += i;
            num++;
        }
        return (sum % num == 0);
    }

//2.4
    public static int[] cumulativeSum(int arr[]) {
        int[] arrL = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arrL[i] = sum;
        }
        return arrL;
    }
//2.5
    public static int getDecimalPlaces(String s){

        return (s.indexOf('.') > -1) ? s.length() - s.indexOf('.') - 1 : 0;
    }
//2.6
    public static int Fibonacci(int a) {
        int x = 0;
        int y = 1;
        for (int i = 1; i <= a; i++) {
            int h = x + y;
            x = y;
            y = h;
        }
        return y;
    }
//2.7
    public static boolean isValid(String s) {
        return s.length()<=5 && s.matches("[0-9]*");}

//2.8
public static boolean isStrangePair(String s1, String s2) {
    if (s1=="" & s2=="") return false ;
    return (s1.length()>0 && s2.length()>0)? s1.charAt(0)==s2.charAt(s2.length()-1) && s2.charAt(0)==s1.charAt(s1.length()-1) : false;

}
//2.9
        public static boolean isPrefix(String word, String prefix) {
            String new_prefix = prefix.replace("-", "");
            String new_word = "";
            for (int i = 0; i < new_prefix.length(); i++)
                new_word = new_word + word.charAt(i);
            return new_word.equals(new_prefix);
        }

        public static boolean isSuffix(String word, String suffix) {
            String new_suffix = suffix.replace("-", "");
            String new_word = "";
            for (int i = new_suffix.length(); i > 0; i--)
                new_word = new_word + word.charAt(word.length() - i);
            return new_word.equals(new_suffix);
        }
//2.10
    public static int boxSeq(int n) {
        int res = 0;
        for(int i=1; i<=n; i++){
            if(i%2 > 0) res+=3;
            else res-=1;
        }
        return res;
    }
//3.1
    public static int solutions(int a, int b, int c) {
        if(b==0 && c==0 && a!=0) return 1;
        if(a!=0 && b!=0 && c==0) return 2;
        if(a!=0 && b==0 && c!=0){
            if(a*c > 0) return 0;
            else return 2;
        }
        int d = b*b-4*a*c;
        if(d >0 ) return 2;
        if(d == 0) return 1;
        return 0;
    }
//3.2
    public static int findZip(String s) {
        int firstIndex = s.indexOf("zip");
        return s.indexOf("zip", firstIndex+1);
    }
//3.3
public static boolean checkPerfect(int x) {
    int y = 0;
    for (int i = 1; i < x; i++) {
        if (x % i == 0) {
            y = y + i;
        }

    }
    return x == y;
}
//3.4
    public static String flipEndChars(String s) {
        if(s.length()<2) return "Incompatible.";
        if(s.charAt(0)==s.charAt(s.length()-1)) return "Two's a pair.";
        return s.charAt(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0);

    }
//3.5
    public static boolean isValidHexCode(String s) {
        if(s.length()!=7) return false;
        if(s.charAt(0)!='#') return false;
        for(char ch : s.substring(1,s.length()).toCharArray()){
            ch=Character.toUpperCase(ch);
            if(!((ch>='A' && ch<='F')||((ch>='0' && ch<='9')))) return false;
        }
        return true;

    }
//3.6
    public static boolean same(int[] arr1, int[] arr2 ) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int n  : arr1){
            s1.add(n);
        }
        for(int n  : arr2){
            s2.add(n);
        }
        return s1.size() == s2.size();
    }
//3.7
    public static boolean isKaprekar(int n) {
        String s = String.valueOf(n*n);

        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2, s.length());
        return (s1.length()!=0)? Integer.parseInt(s1)+Integer.parseInt(s2) == n : Integer.parseInt(s2) == n;

    }
//3.8
    public static String longestZero(String s) {
        String[] sArr = s.split("1");
        if(sArr.length == 0) return "";

        Arrays.sort(sArr);
        return (sArr[sArr.length-1].length()>0) ? sArr[sArr.length-1] : "";

    }
//3.9
    public static int nextPrime(int n) {
        BigInteger bigInteger = BigInteger.valueOf(n);
        if(bigInteger.isProbablePrime((int) Math.log(n))) return n;

        while(true){
            n+=1;
            bigInteger = BigInteger.valueOf(n);
            if(bigInteger.isProbablePrime((int) Math.log(n))) return n;
        }
    }
//3.10
    public static boolean rightTriangle(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        return arr[0]*arr[0]+arr[1]*arr[1] == arr[2]*arr[2];
    }
}