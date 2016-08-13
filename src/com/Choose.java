package com;

import java.util.Random;
import java.lang.String;
public class Choose {
	
	double [] a=new double [4];
	String [] st=new String [4];
	public String [] zs(String [] s){
		int Zsum=0;
		Sufficiency suf=new Sufficiency();
		for(int i=0;i<4;i++){
			System.out.println(s[i]);
			Zsum+=suf.ZSuf(s[i]);
		}
		System.out.println(Zsum);
		a[4-1]=1.0;
		for(int j=0;j<4-1;j++){
			
			a[j]=suf.ZSuf(s[j])/Zsum;
			a[4-1]-=a[j];
		}
		for(int k=0;k<4;k++){
			System.out.println(a[k]);
		}
		Random rand=new Random();
		
		for(int i=0;i<4;i++){
			double m=rand.nextDouble();
			if(m<a[0])
				st[i]=s[0];
			if(a[0]+a[1]>m&&m>=a[0])
				st[i]=s[1];
			if(a[0]+a[1]+a[2]>m&&m>=a[0]+a[1])
				st[i]=s[2];
			if(a[0]+a[1]+a[2]<=m)
				st[i]=s[3];
		}
		return st;
	}
	
}
