import java.util.Scanner;

public class Demo01 {
	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�Ҹզ��Z: ");
		int score = input.nextInt();
		int count = 0;
		System.out.println("�[���e�����Z: " + score );
		while(score < 60 ){
			score++;
			count++;
		}
		System.out.println("�[���᪺���Z:" + score );
		System.out.println("�@�[�F" + count + "�� ! ");
	}
}
