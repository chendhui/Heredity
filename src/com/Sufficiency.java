package com;
import java.lang.String;
public class Sufficiency {
	public double ZSuf(String f){
		int a=0,b=0;
		double sum=0;
		char aa;
		for(int i=0;i<6;i++){
			System.out.println(f.charAt(i));
			aa=f.charAt(i);
			if(i<3){
				if(aa!='0'){
				a+=(int)Math.pow(2, 2-i);}}
			else{
				if(aa!='0'){
				b+=(int)Math.pow(2, 5-i);}}
		}
		System.out.println(a+"       "+b);
		//System.out.println(2^4);
		sum=a*a+b*b;
		System.out.println(sum);
		return sum;
	}
}
