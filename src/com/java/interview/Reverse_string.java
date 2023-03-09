package com.java.interview;

public class Reverse_string {
	
	public static void main(String[] args) {
        String s = "alpha123beta123";
        String alpha = "";
        String num = "";

        // Separate alpha and numeric characters
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
            } else {
                alpha += s.charAt(i);
            }
        }

        // Combine the alpha and numeric strings in the desired order
        String result = num.substring(0, 3) + alpha + num.substring(3);

        System.out.println(result);
    }


}
