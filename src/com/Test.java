package com;

import java.util.Random;
import java.lang.String;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a");
		Random ran=new Random();
		int [] a=new int [8];
		String  [] s=new String [4];
		for(int i=0;i<7;i++){
			a[i]=ran.nextInt(6)+1;
			System.out.println(a[i]);
		}
		System.out.println("a");
		I2B i2b=new I2B();
		s[0]=i2b.i2B(a[0])+i2b.i2B(a[1]);
		System.out.println(s[0]);
		s[1]=i2b.i2B(a[2])+i2b.i2B(a[3]);
		s[2]=i2b.i2B(a[4])+i2b.i2B(a[5]);
		s[3]=i2b.i2B(a[6])+i2b.i2B(a[7]);
		//System.out.println(s);
		Choose ch=new Choose();
		//Sufficiency su=new Sufficiency();
		Intersect ins=new Intersect();
		Variation var=new Variation();
		for(int i=0;i<300;i++){
			s=ch.zs(s);
			if(ran.nextDouble()<0.1)
			s=ins.inter(s);
			if(ran.nextDouble()<0.1)
			s=var.var(s);
		}
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
	}

}
