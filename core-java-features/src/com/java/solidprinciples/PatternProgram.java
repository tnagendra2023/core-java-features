package com.java.solidprinciples;

public class PatternProgram {
    /** Print below pattern
     * 2
     * 4 4
     * 6 6 6
     * 8 8 8 8
     * 10 10 10 10 10
     * */
    public static void main(String[] args) {
        int n=10;
        int count=1;
        for(int i=2;i<=n;i=i+2){
            for(int j=count;i>j;j++){
                System.out.print(i+" ");
            }
            count++;
            System.out.println();
        }

    }
}
