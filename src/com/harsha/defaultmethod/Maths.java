package com.harsha.defaultmethod;

public interface Maths 
{
int arithmetic(int v1,int v2);
//int sqr(int n);
default int sqr(int n)
{
	return n*n;
}
static void  info()
{
	System.out.println("doing arithmetic operation ");
}

}
