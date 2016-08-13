package com;

import java.util.Random;
import java.lang.String;
public class Variation {
	public String [] var(String [] s){
		Random rand=new Random();
		String [] st=new String [4];
		for(int i=0;i<4;i++){
			int a=rand.nextInt(5);
			 if ((s[i].charAt(a))=='0')
				st[i]=s[i].subSequence(0, a)+"1"+s[i].substring(a+1);
			 else 
				 st[i]=s[i].subSequence(0, a)+"0"+s[i].substring(a+1);
		}
		return st;
	}
}
