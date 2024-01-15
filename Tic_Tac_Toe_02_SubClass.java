import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tic_Tac_Toe_02_SubClass {

	//表を作る
		String rowLine = "-+-+-";
		String row1 = "1|2|3";
		String row2 = "4|5|6";
		String row3 = "7|8|9";

	//表を出す
	void Rows()
	{
		System.out.println(row1);
		System.out.println(rowLine);
		System.out.println(row2);
		System.out.println(rowLine);
		System.out.println(row3);
	}
	
	//質問
	public void Questions() throws IOException 
	{
		//質問1
		System.out.println("変更したい番号を入力してください>>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();	
		CharSequence input_num = (CharSequence)num ;
		if(num.matches(row1)||num.matches(row2)||num.matches(row3))
		{
			;
		}
		else
		{
			System.out.println("別の数値を入力してください。");
			return;
		}
		
		//質問2
		System.out.println("どちらの記号に変更しますか？　○ / × >>");
		System.out.println("○の場合は M 、×場合は B を入力してください>>");
		String choice = br.readLine();	
		if(choice.contains("M"))
		{
			choice = "○";
		}
		else if(choice.contains("B"))
		{
			choice = "×";
		}
		else
		{
			System.out.println("別の記号を入力してください。");
			return;
		}
		CharSequence input_choice = (CharSequence)choice ;
		
		//表の中身を変える
		if(row1.contains(input_num))
		{
			row1 = row1.replace(input_num, input_choice); 
		}
		else if(this.row2.contains(input_num))
		{
			row2 = row2.replace(input_num, input_choice); 
		}
		else if(this.row3.contains(input_num))
		{
			row3 = row3.replace(input_num, input_choice); 
		}
		else
		{
			;
		}
	}

	//結果を確認する
	boolean ChkResults()
	{
		if(row1.charAt(0)==row1.charAt(2) && row1.charAt(0)==row1.charAt(4))
		{
			System.out.println(row1.charAt(0) +"の勝ち");
			return true;
		}
		else if(row2.charAt(0)==row2.charAt(2) && row2.charAt(0)==row2.charAt(4))
		{
			System.out.println(row2.charAt(0) +"の勝ち");
			return true;
		}
		else if(row3.charAt(0)==row3.charAt(2) && row3.charAt(0)==row3.charAt(4))
		{
			System.out.println(row3.charAt(0) +"の勝ち");
			return true;
		}
		else if(row1.charAt(0)==row2.charAt(0) && row1.charAt(0)==row3.charAt(0))
		{
			System.out.println(row1.charAt(0) +"の勝ち");
			return true;
		}
		else if(row1.charAt(2)==row2.charAt(2) && row1.charAt(2)==row3.charAt(2))
		{
			System.out.println(row1.charAt(2) +"の勝ち");
			return true;
		}
		else if(row1.charAt(4)==row2.charAt(4) && row1.charAt(4)==row3.charAt(4))
		{
			System.out.println(row1.charAt(4) +"の勝ち");
			return true;
		}
		else if(row1.charAt(0)==row2.charAt(2) && row1.charAt(0)==row3.charAt(4))
		{
			System.out.println(row1.charAt(0) +"の勝ち");
			return true;
		}
		else if(row1.charAt(4)==row2.charAt(2) && row1.charAt(4)==row3.charAt(0))
		{
			System.out.println(row1.charAt(4) +"の勝ち");
			return true;
		}
		else
		{
			return false;
		}
	}
}
