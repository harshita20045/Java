package com.checking;

import com.specifiers.Test;

public class Test3 extends Test 
{
    public void accessMember1() 
	{
        System.out.println("Public a: " + pub);
     //   System.out.println("Protected b: " + getPro());
        System.out.println("Protected b: " + pro);
     //   System.out.println("Protected c: " + getPri());
      //  System.out.println("Protected c: " + pri);
		
    }

    public static void main(String[] args) 
	{
        Test3 t = new Test3();
        t.accessMember1();
    }
}
