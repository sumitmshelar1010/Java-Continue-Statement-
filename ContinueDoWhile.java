package MainPackage.JavaBasics.continuestatement;

public class ContinueDoWhile {
    public static void main(String[] args){
        int a=0;
        do { if (a==5){a++; continue;}
            System.out.println(a);a++;}
        while (a<=10);}
    }
