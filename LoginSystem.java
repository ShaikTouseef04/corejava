package javacore;
class Login{
	void login(String email, String password) {
		System.out.println("Login using email");
	}
	void login(int phone,int otp) {
		System.out.println("Login using phone");
	}
}

public class LoginSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l = new Login();
		l.login("touseef04@gmail.com","1234");
		l.login(12345,1254);

	}

}
