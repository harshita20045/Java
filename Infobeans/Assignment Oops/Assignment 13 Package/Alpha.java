package com.specifiers;
import com.specifiers.Test;

public class Alpha 
{
    public void display() 
	{
        Test t = new Test();
       // System.out.println("Private pri : " + t.getPri());  
        //System.out.println("Private pri : " + t.pri());  error
        System.out.println("Protected pro : " + t.pro);  
        System.out.println("Public pub : " + t.pub);  
    }
}
