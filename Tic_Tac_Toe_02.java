import java.io.IOException;

public class Tic_Tac_Toe_02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		HomeWork_No2_Sub work = new HomeWork_No2_Sub();
		
		//表を出す
		work.Rows();
		
		//質問
		for(int i=0; i<9; i++)
		{
			work.Questions();
			work.Rows();
			if(work.ChkResults()==true)
			{
				System.out.println("--- 最終結果表 ---");
				work.Rows();
				break;
			}
		}
	}
}
