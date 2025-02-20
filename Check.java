import java.util.Scanner;
public class Check{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter username: ");
		String inputUsername = sc.next();

		System.out.print("Enter password: ");
		String inputPassword = sc.next();

		if (inputUsername.equals(UserInfo.correctUsername) && inputPassword.equals(UserInfo.correctPassword)){
			System.out.print("True");
		}else{
			System.out.print("False");
		}

	}
} 