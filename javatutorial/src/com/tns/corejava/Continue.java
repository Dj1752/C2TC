package com.tns.corejava;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int x=0;
      do {
	          x++;
	          System.out.println("x " + x);
	          if(++x<5) 
	        	  continue;
	        	  x++;
	        	  System.out.println("x " + x);
	          
        }while(++x<10);
	}

}
