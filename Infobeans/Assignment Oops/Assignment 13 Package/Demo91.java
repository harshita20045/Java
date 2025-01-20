package com.finals;
import com.specifiers.Test;
import com.checking.Test2;
import com.checking.Test3;
import com.specifiers.Alpha;

public class Demo91 
{
    public static void main(String[] args) 
	{
        Test t = new Test();
        System.out.println("Public variable: " + t.pub);
      //  System.out.println("Protected variable : " + t.getPro());
     //   System.out.println("Protected variable : " + t.pro());
     //   System.out.println("Protected variable : " + t.pri());
     //   System.out.println("Private variable : " + t.getPri());

        Alpha a= new Alpha();
        a.display();

        Test2 t2 = new Test2();
        t2.accessMember();

        Test3 t3 = new Test3();
        t3.accessMember1();
    }
}
