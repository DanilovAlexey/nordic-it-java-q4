package com.example;

import java.util.Scanner;

public class Kth {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		var input = scanner.nextLong();
		System.out.println(getResult(input));
		
		scanner.close();
					
	}

	public static int getResult(long input) {
		int result = 0;
        var prevRangeLen = 0L;     
        var prevRange = 0L;        

        var cnt = 1L;
        var digits = 1L;

        while (prevRangeLen < input) {
            if (prevRangeLen + (9 * cnt * digits) > input) {
                break;
            }

            prevRangeLen += 9 * cnt * digits;
            prevRange += 9*cnt;

            cnt = cnt * 10;
            digits += 1;
        }       
        prevRangeLen -= 1;
        
		var curRangeLen = prevRangeLen + 1;
		var curRange = prevRange + 1;
			
		var curNumber = (input - curRangeLen) / digits + curRange;
		var curNumberRemain = (input - curRangeLen) % digits;
		
		for (var n = curNumberRemain; n < digits; n++) {
			result = (int)(curNumber % 10);
			curNumber = curNumber / 10;
		}
		
        return result;
	}		
}
