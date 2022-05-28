package assignment;

public class Students {

	public int getStudentInfo(int id) {
		return id;
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("This is student info" + id + name);
	}
	
	public void getStudentInfo(String email, Float phoneNumber) {
		System.out.println("This is student info" + email + phoneNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students std = new Students();
		System.out.println(std.getStudentInfo(1234));
		std.getStudentInfo(12345, "Suganya");
		std.getStudentInfo("test@gmail.Com@", 123456789F);
				
	}
}
