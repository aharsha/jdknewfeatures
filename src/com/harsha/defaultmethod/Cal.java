package com.harsha.defaultmethod;

public class Cal  implements Maths
{

	@Override
	public int arithmetic(int v1, int v2) 
	{
int v3 = v1+v2;
System.out.println("addition = "+v3);
return v3;
	}
	
	
	public void  info()
	{
		System.out.println("formulas included ");
	}
	

}
