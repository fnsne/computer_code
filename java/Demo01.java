import java.util.Scanner;

public class Demo01 {
	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入考試成績: ");
		int score = input.nextInt();
		int count = 0;
		System.out.println("加分前的成績: " + score );
		while(score < 60 ){
			score++;
			count++;
		}
		System.out.println("加分後的成績:" + score );
		System.out.println("共加了" + count + "次 ! ");
	}
}
