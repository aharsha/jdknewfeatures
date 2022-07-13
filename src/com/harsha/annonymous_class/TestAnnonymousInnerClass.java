package com.harsha.annonymous_class;

public class TestAnnonymousInnerClass
{

	public static void main(String[] args) 
	{

Polygon p1= new Square();
p1.info();
// here p1 is reffrence of Polygon but holding Square class object
//how to proove p1 is holding Square object
System.out.println(p1.getClass().getName()); //jdk8.Square


Polygon p2 =  new Polygon()
{
		@Override
	public void info()
		{
		System.out.println("opposite sides are same");
	     }
	/*
	 * @Override public void area(int s1, int s2) {
	 * System.out.println("area of rectangle  = "+s1*s2);
	 * 
	 * }
	 */
};
p2.info();





// here p2 is reffrence of Polygon but holding annonymous class object
System.out.println(p2.getClass().getName()); //jdk8.TestAnnonymousInnerClass$1


Polygon p3 =  () ->
{
		
		System.out.println("opposite sides are same");
	     
		
};
	}

}
