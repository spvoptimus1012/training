package com.ey.builder;

public class Computer {
	
	    private String cpu;

	    private int ram;

	    private int hdd;

	    private String gpu;

	    private int ssd;

	 

	    

	    private Computer(String cpu, int ram, int hdd, String gpu, int ssd) {

	        this.cpu = cpu;

	        this.ram = ram;

	        this.hdd = hdd;

	        this.gpu = gpu;

	        this.ssd = ssd;

	    }

	 

	    public static class Builder {

	        private String cpu;

	        private int ram;

	        private int hdd;

	        private String gpu;

	        private int ssd;

	 

	        public Builder() {

	           

	        }

	 

	        public Builder setCpu(String cpu) {

	            this.cpu = cpu;

	            return this;

	        }

	 

	        public Builder setRam(int ram) {

	            this.ram = ram;

	            return this;

	        }

	 

	        public Builder setHdd(int hdd) {

	            this.hdd = hdd;

	            return this;

	        }

	 

	        public Builder setGpu(String gpu) {

	            this.gpu = gpu;

	            return this;

	        }

	 

	        public Builder setSsd(int ssd) {

	            this.ssd = ssd;

	            return this;

	        }

	 

	        public Computer build() {

	            return new Computer(cpu, ram, hdd, gpu, ssd);

	        }

	    }

	 

	    @Override

	    public String toString() {

	        return "Computer [cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + ", gpu=" + gpu + ", ssd=" + ssd + "]";

	    }
}

	 

	   

	   

	   

	 

	   

	    

