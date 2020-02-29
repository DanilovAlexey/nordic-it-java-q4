package com.example;

import java.util.Scanner;

public class Frame {

	public static void main(String[] args) {		
		var scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        String message = scanner.next();

        System.out.println(drawFrame(height, width, message));
        scanner.close();
	}
	
	 public static String drawFrame(int height, int width, String message) {
		 	var result = "";

	        if (height < 3) {
	            return "Ошибка";
	        }

	        if (width - message.length() < 2) {
	            return "Ошибка";
	        }
	       
	        for (var i = 1; i <= height; i++) {
	            for (var n = 1; n <= width; n++) {
	                if (i > 1 && i < height) {
	                    if (n == 1 || n == width) {
	                        result += "*";
	                    } else {
	                        if (i == (height / 2 + height % 2) && n == (((width - message.length()) / 2)) + 1) {
	                            result += message;
	                            n+= message.length() - 1;
	                        } else {
	                            result += " ";
	                        }
	                    }
	                } else {
	                    result += "*";
	                }
	            }
	            result += "\n";
	        }
	        return result;
	    }

}
