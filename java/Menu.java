import java.util.Scanner;

public class Menu{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int choose;
		do{
			System.out.println("1.loop");
			System.out.println("2.exit");
			System.out.println("½Ð¿é¤J¿ï¾Ü: ");
			choose = scanner.nextInt();
		}while(choose != 2);
	}
}
