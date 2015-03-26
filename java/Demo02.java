import java.util.Scanner;
public class Demo02 {
		public static void main( String[] args ){
			int classNum = 3;
			int stuNum = 4;
			double avg = 0;
			Scanner input = new Scanner( System.in );
			for( int i = 1; i <= classNum; i++){
				double sum = 0;
				System.out.println("請輸入第" + i + "班的成績");
				for(int j = 1; j <= stuNum; j++){
					System.out.println("請輸入第" + j + "位學生的成績");
					int score = input.nextInt();
					sum+=score;
				}
				avg = sum/stuNum;
				System.out.println("第" + i + "班平均分: " + avg );

			}
		}
}
