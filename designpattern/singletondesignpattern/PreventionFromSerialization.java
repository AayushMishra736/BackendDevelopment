package com.designpattern.singletondesignpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable 
{
    public static Singleton obj = new Singleton();
      
    private Singleton() 
    {
    }
     
    protected Object readResolve()
    {
        return obj;
    }
}
public class PreventionFromSerialization {

	public static void main(String[] args) {
		 try
	        {
	            Singleton instance1 = Singleton.obj;
	            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file10.text"));
	            out.writeObject(instance1);
	            out.close();
	          

	            ObjectInput in = new ObjectInputStream(new FileInputStream("file10.text"));
	            Singleton instance2 = (Singleton) in.readObject();
	            in.close();
	          
	            System.out.println("instance1 hashCode:- "
	                                           + instance1.hashCode());
	            System.out.println("instance2 hashCode:- "
	                                           + instance2.hashCode());
	        } 
	          
	        catch (Exception e)
	        {
	            e.printStackTrace();	
	        }

	}

}
