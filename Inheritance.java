package com.OOBs;

import corejava_basic.Inheritance.A;

public class Inheritance {

	public static void main(String[] args)
	{
		public class DemoInheritance
		{
			
			public static void main(String[]args)

		}
		class A
		{
			void funcA()
			{
				System.out.println("This is class A");
			}
		}

		class B extends A
		{
			void funcB()
			{
				System.out.println("This is class B");
			}
		}
		
		class c extends B
		{
			void funcC()
			{
				System.out.println("This is class C");
			}
		}
		public class Inheritance
		{
		public static void main(String args[])
		{
				c obj = new C();
				obj.funcA();
				obj.funcB();
				obj.funcC();
			}
			
			
		}
			