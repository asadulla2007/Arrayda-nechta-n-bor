package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array = {12, 21, 36, 12, 24, 85, 12, 30, 25};
        int count = 0;
        int n = 12;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        System.out.println(count);

    }













    }
}
