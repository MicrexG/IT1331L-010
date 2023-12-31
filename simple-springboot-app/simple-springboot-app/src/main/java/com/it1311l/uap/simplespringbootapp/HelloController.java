package com.it1311l.uap.simplespringbootapp;
import java.io.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{

	@GetMapping("/sayHello")
	public String sayHello()
	{
		return "Hello World";
	}
	
	@GetMapping("/sort")
	public int[] sortInteger() {
	    int numberarray[] = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};
	    int n = numberarray.length;

	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (numberarray[j] < numberarray[j + 1]) { 
	                
	                int temp = numberarray[j];
	                numberarray[j] = numberarray[j + 1];
	                numberarray[j + 1] = temp;
	            }
	        }
	    }

	    return numberarray;
	}

}



