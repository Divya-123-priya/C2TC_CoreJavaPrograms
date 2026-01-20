package com.tnsif.lambdaexpression;

class MyCubeImpl implements Cube
{
	@Override
	public int getCube(int no) {
		return no*no*no;
	}
}

public class UsingOldWay {
	public static void main(String[] args) {
		//1. Using object of implementable class
		Cube obj=new MyCubeImpl();
		System.out.println("Cube is "+obj.getCube(3));

		//2. Using Anonymous class
		Cube cubeObj=new Cube() {	
			@Override
			public int getCube(int no) {				
				return no*no*no;
			}
		};
		System.out.println("Cube is "+cubeObj.getCube(5));				
	}
}

