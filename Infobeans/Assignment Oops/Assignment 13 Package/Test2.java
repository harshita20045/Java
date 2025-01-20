package com.checking;
import com.specifiers.Test;
public class Test2 
{
    public void accessMember() 
	{
        Test t = new Test();
        System.out.println("Public variable: " + t.pub);
		//System.out.println("Protected variable: " + t.getPro());
	//	System.out.println("Protected variable: " + t.pro());  error
		//System.out.println("Protected variable: " + t.pri()); error
		//System.out.println("Private variable: " + t.getPri());
    }

    public static void main(String[] args) 
	{
        Test2 t2 = new Test2();
        t2.accessMember();
    }
}
