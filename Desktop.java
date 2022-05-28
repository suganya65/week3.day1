package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("This is desktop size");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop inhert = new Desktop();
		inhert.computerModel();
		inhert.desktopSize();
	}

}
