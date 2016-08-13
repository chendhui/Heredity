package com;

import java.util.Random;
import java.lang.String;
public class Intersect {
	
	public String [] inter(String [] sr){
		Random ran=new Random();
		String [] s=new String [4];
			int a=ran.nextInt(4)+1;
			s[0]=sr[0].substring(0, a)+sr[1].substring(a);
			s[1]=sr[1].substring(0, a)+sr[0].substring(a);
			int b=ran.nextInt(4)+1;
			s[2]=sr[2].substring(0, b)+sr[3].substring(b);
			s[3]=sr[3].substring(0, b)+sr[2].substring(b);
			return s;
	}
}
