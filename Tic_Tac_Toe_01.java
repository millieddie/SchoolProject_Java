import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tic_Tac_Toe_01 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		String rowLine = "-+-+-";
		String row1 = "1|2|3";
		String row2 = "4|5|6";
		String row3 = "7|8|9";
		
		System.out.println(row1);
		System.out.println(rowLine);
		System.out.println(row2);
		System.out.println(rowLine);
		System.out.println(row3);
		
		for(int i=0; i<9; i++)
		{
			System.out.println("変更したい番号を入力してください>>");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int num = Integer.parseInt(str);
		
			System.out.print("どちらの記号に変更しますか？　○ / × >>");
			String choice;
			choice = br.readLine();		
				if(num>0)
				{
					switch(num)
					{
						case 1:
							row1 = row1.replace("1", choice);
							break;
						case 2:
							row1 = row1.replace("2", choice);
							break;
						case 3:
							row1 = row1.replace("3", choice);
							break;
						case 4:
							row2 = row2.replace("4", choice);
							break;
						case 5:
							row2 = row2.replace("5", choice);
							break;
						case 6:
							row2 = row2.replace("6", choice);
							break;
						case 7:
							row3 = row3.replace("7", choice);
							break;
						case 8:
							row3 = row3.replace("8", choice);
							break;
						case 9:
							row3 = row3.replace("9", choice);
							break;
					}
					
					//横の並びが同じ場合
					if(row1.charAt(0)==row1.charAt(2) && row1.charAt(0)==row1.charAt(4))
					{
						System.out.println(row1.charAt(0) +"の勝ち");
						break;
					}
					else if(row2.charAt(0)==row2.charAt(2) && row2.charAt(0)==row2.charAt(4))
					{
						System.out.println(row2.charAt(0) +"の勝ち");
						break;
					}
					else if(row3.charAt(0)==row3.charAt(2) && row3.charAt(0)==row3.charAt(4))
					{
						System.out.println(row3.charAt(0) +"の勝ち");
						break;
					}
					else
					{
						;
					}
					
					//縦の並びが同じ場合
					if(row1.charAt(0)==row2.charAt(0) && row1.charAt(0)==row3.charAt(0))
					{
						System.out.println(row1.charAt(0) +"の勝ち");
						break;
					}
					else if(row1.charAt(2)==row2.charAt(2) && row1.charAt(2)==row3.charAt(2))
					{
						System.out.println(row1.charAt(2) +"の勝ち");
						break;
					}
					else if(row1.charAt(4)==row2.charAt(4) && row1.charAt(4)==row3.charAt(4))
					{
						System.out.println(row1.charAt(4) +"の勝ち");
						break;
					}
					else
					{
						;
					}
					
					//斜めの並びが同じ場合
					if(row1.charAt(0)==row2.charAt(2) && row1.charAt(0)==row3.charAt(4))
					{
						System.out.println(row1.charAt(0) +"の勝ち");
						break;
					}
					else if(row1.charAt(4)==row2.charAt(2) && row1.charAt(4)==row3.charAt(0))
					{
						System.out.println(row1.charAt(4) +"の勝ち");
						break;
					}
					else
					{
						;
					}
					System.out.println(row1);
					System.out.println(rowLine);
					System.out.println(row2);
					System.out.println(rowLine);
					System.out.println(row3);
				}
				
		}
		System.out.println("--- 最終結果表 ---");
		System.out.println(row1);
		System.out.println(rowLine);
		System.out.println(row2);
		System.out.println(rowLine);
		System.out.println(row3);
	}
}
