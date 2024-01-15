import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hit_and_Blow_01 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//4桁の数字
			//4桁の数字は重複はない
			//数字は0〜9
			//乱数で決める：答えになる
		int[] num = new int[10];
		int[] chk = new int[10];
		int i=0;
		while(i<num.length)
		{
			int chknum = (int)(Math.random()*10);
			if(chk[chknum]==0)
			{
				num[i] = chknum;
				chk[chknum]=1;
				i=i+1;
			}
		}
		ArrayList<Integer> num10 = new ArrayList<Integer>();
		for(i=0; i<num.length; i++)
		{
			//System.out.print(num[i]);
			num10.add(num[0]);
			num10.add(num[1]);
			num10.add(num[2]);
			num10.add(num[3]);
		}
		//num[i]を文字列→4桁抽出
		//System.out.print("-------");
		String num4;
		num4 = String.valueOf(num10);
		num4 = num4.substring(0,11);
		String str = num4.replaceAll("[^0-9]", "");
		System.out.println("ヒットアンドブロー："+str);
		
		//その後4桁の数字を入力する
			
			//桁が合ってないけど数字はある場合：ブロー
			//答え：「1234」
			//入力：「1546」→結果：1ヒット1ブロー
			//4ヒットになるまで続ける
		System.out.println("4桁の数値を入力してください>>");
		String str2 = br.readLine();
		int [] myans = new int[4];
		for(int x=0; x<myans.length; x++)
		{
			myans[x]=Integer.parseInt(String.valueOf(str2.charAt(x)));
		}
			//桁があっていた場合：ヒット
		int hit = 0;
		int brow = 0;
		for(int j=0; j<4; j++) //生成された4桁番号
		{
			for(int k=0; k<4; k++) //自分で入れた4桁番号
			{
				if(myans[j]==num[k]) 
				{
					brow++;
					break;
				}
			}
			if(num[j] == myans[j])
			{
				hit++;
			}
		}
		System.out.println(hit+"ヒット");
		System.out.println(brow+"ブロー");
		// TODO 自動生成されたメソッド・スタブ

	}

}
