public class Triangle2{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		for(int i = 1 ; i <= num ; i++){
			for(int j = 0 ; j < num-i; j++)
				System.out.print(" ");
			for(int j = 0 ; j < i ; j++)
				System.out.print("* ");
			System.out.print("\n");
		}
	}
}