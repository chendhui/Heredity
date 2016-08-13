package com;
import java.lang.String;
import java.lang.Integer;
public class I2B {
	String s;
	public String i2B(int i){
		s=Integer.toBinaryString(i);
		while(s.length()<3){
			s="0"+s;
		}
		return s;
	} 
}
