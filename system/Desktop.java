package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("21 inches");
	}
	
	public static void main(String[] args) {
	
		Desktop d = new Desktop();
		d.computerModel();
	}
}
