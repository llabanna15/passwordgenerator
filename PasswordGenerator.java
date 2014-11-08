import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author LoganLabanna 11/8/14
 */

public class PasswordGenerator {
	
public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	int selection;
	int length;
	int character;
	Random random = new Random();
	String password = "";
	
	System.out.println("\t\tPassword Generation Menu");
	System.out.println("*********************************************************");
	System.out.println("*    [1] Lowercase Letters\t\t\t\t*");
	System.out.println("*    [2] Lowercase and Uppercase Letters\t\t*");
	System.out.println("*    [3] Lowercase,Uppercase and Numbers \t\t*");
	System.out.println("*    [4] Lowercase, Uppercase, Numbers, and Punctuation\t*");
	System.out.println("*    [5] Quit\t\t\t\t\t\t*");
	System.out.println("*********************************************************");
	System.out.println("Enter Selection (1-5): ");
	selection = in.nextInt();
	System.out.println("\nPassword Length (1-14): ");
	length = in.nextInt();
	
	if (selection == 5){
		System.out.println( );
	}else if(selection == 1){
		for (int i = 0; i < length; i++){
			character = random.nextInt(25) + 97;
			char letter =(char)character;
			password += letter;
		}
	}else if(selection == 2){
		for (int i = 0; i < length; i++){
			character = random.nextInt(57) + 65;
				while((character >90)&&(character < 97)){
					character = random.nextInt(57) + 65;
				}
			char letter =(char)character;
			password += letter;
		}
	}else if(selection == 3){
		for (int i = 0; i < length; i++){
			character = random.nextInt(74) + 48;
				while((character > 90) && (character < 97)||(character > 57) && (character < 65)){
					character = random.nextInt(74) + 48;
				}
			char letter =(char)character;
			password += letter;
			}
		}else if(selection == 4){
			for (int i = 0; i < length; i++){
				character = random.nextInt(74) + 48;
					while((character > 57) && (character < 65)){
						character = random.nextInt(74) + 48;
					}
				char letter =(char)character;
				password += letter;
			}
		}
	System.out.println(password);
}
}
