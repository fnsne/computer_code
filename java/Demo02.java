import java.util.Scanner;
public class Demo02 {
		public static void main( String[] args ){
			int classNum = 3;
			int stuNum = 4;
			double avg = 0;
			Scanner input = new Scanner( System.in );
			for( int i = 1; i <= classNum; i++){
				double sum = 0;
				System.out.println("�п�J��" + i + "�Z�����Z");
				for(int j = 1; j <= stuNum; j++){
					System.out.println("�п�J��" + j + "��ǥͪ����Z");
					int score = input.nextInt();
					sum+=score;
				}
				avg = sum/stuNum;
				System.out.println("��" + i + "�Z������: " + avg );

			}
		}
}
