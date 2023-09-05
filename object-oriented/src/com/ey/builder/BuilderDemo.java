package com.ey.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		  
	            Computer computer = new Computer.Builder()

	                    .setCpu("Intel Core i7")

	                    .setRam(16)

	                    .setHdd(1000)

	                    .setGpu("NVIDIA GeForce RTX 3070")

	                    .setSsd(512)

	                    .build();

	 

	            System.out.println(computer);

	}

}
