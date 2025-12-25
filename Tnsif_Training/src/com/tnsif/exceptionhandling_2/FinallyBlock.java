package com.tnsif.exceptionhandling_2;

public class FinallyBlock {

		   public static void main(String args[]) {
		      int a[] = new int[7];
		      try {
		         System.out.println("Access element three :" + a[9]);
		      } catch (ArrayIndexOutOfBoundsException e) {
		         System.out.println("Exception thrown  :" + e);
		      }finally {
		         a[0] = 67;
		         System.out.println("First element value: " + a[0]);
		         System.out.println("The finally statement is executed");
		      }
		   }
		}