import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Hello, enter your name: ");
		String namae = console.nextLine();
		String firstName = namae.substring(0,namae.indexOf(" "));
		String lastName = namae.substring(namae.indexOf(" ")+1);
		System.out.print(firstName.substring(0,1) +
						". Diddy " +
						lastName.toUpperCase() +
						" " + firstName
						+ "-izzle");
	}
}
