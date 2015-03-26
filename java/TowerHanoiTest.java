// towerofHanoi( dishs, from, temp, destination )


public class TowerHanoiTest
{
	static void towerofHanoi(int dishs, int peg1, int peg2, int peg3 )
	{
		if(dishs == 1 )
			System.out.println("盤子從" + peg1 + "搬到" + peg3);
		else{
			//把 n-1 dishs 移到 peg2 用 peg3當暫存
 			towerofHanoi(dishs-1, peg1, peg3, peg2);

			System.out.println("盤子從" + peg1 + "搬到" + peg3);
			//把 n-1 dishs 移到 peg3 用 peg2當暫存
			towerofHanoi(dishs-1, peg2, peg1, peg3);
		}
	}

	public static void main( String[] args )
	{
		towerofHanoi(5, 1, 2, 3 );
	}
}
