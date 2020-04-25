package com.example.lesson17;

import java.util.Map;
import com.google.common.collect.ImmutableMap;;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, String> a = ImmutableMap.of("1", "1");
    	
    	System.out.println( a );
    }
}
