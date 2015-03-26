// towerofHanoi( dishs, from, temp, destination )


public class TowerHanoiTest
{
	static void towerofHanoi(int dishs, int peg1, int peg2, int peg3 )
	{
		if(dishs == 1 )
			System.out.println("�L�l�q" + peg1 + "�h��" + peg3);
		else{
			//�� n-1 dishs ���� peg2 �� peg3��Ȧs
 			towerofHanoi(dishs-1, peg1, peg3, peg2);

			System.out.println("�L�l�q" + peg1 + "�h��" + peg3);
			//�� n-1 dishs ���� peg3 �� peg2��Ȧs
			towerofHanoi(dishs-1, peg2, peg1, peg3);
		}
	}

	public static void main( String[] args )
	{
		towerofHanoi(5, 1, 2, 3 );
	}
}
