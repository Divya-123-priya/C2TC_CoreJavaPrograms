package com.tnsif.oopsconcept;

public class EncapsulationDemo {

	    //instance variable
		private String name;
		private int age;
		private int jersyNo;
		private double height;
		
		
		//getters and setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getJersyNo() {
			return jersyNo;
		}
		public void setJersyNo(int jersyNo) {
			this.jersyNo = jersyNo;
		}
		
		public double getHeight() {
			return height;
		}
		public void setHeight(double d) {
			this.height = d;
		}
		
		@Override
		public String toString() {
			return "EncapsulationDemo [name=" + name + ", age=" + age + ", jersyNo=" + jersyNo + ",height="+height+"]";
		}

		
		
}
