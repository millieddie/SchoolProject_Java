import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hit_and_Blow_02 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//4桁の数字
			//4桁の数字は重複はない
			//数字は0〜9
			//乱数で決める：答えになる
		int[] num = new int[10];
		int[] chk = new int[10];
		//0〜9までの数値生成用のnumと、numが重複していないか確認するためのチェック用にchkを作成
		int i=0;
		while(i<num.length)
		{
			int chknum = (int)(Math.random()*10);
			//chknumで0〜9までの整数生成
			if(chk[chknum]==0)
			{
				num[i] = chknum;
				chk[chknum]=1;
				i=i+1;
				//chknumとnum[i]の数字が重複していなければ、1をchkリストに入れていく
			}
		}
		
		ArrayList<Integer> num10 = new ArrayList<Integer>();
		//num10という上で作った乱数を入れるための箱をArrayListで作成
		for(i=0; i<num.length; i++)
		{
			num10.add(num[0]);
			num10.add(num[1]);
			num10.add(num[2]);
			num10.add(num[3]);
			//上で作った乱数の上4桁だけをnum10リストに追加
		}
		
		String num4;
		//num4という文字列を作成
		num4 = String.valueOf(num10);
		//上で入れた数字入りのリスト(num10)を文字列にする
		//でもこの状態だとリストがそのまま文字列になっている状態
		num4 = num4.substring(0,11);
		//とりあえずその文字列から最初の数字〜4桁目の数字まで入っている部分を抜き出す
		//[9, 8, 3, 5　←　でも抜き出しても今はこのような状態。数字だけの状態にしたい。
		String str = num4.replaceAll("[^0-9]", "");
		//上記で今ある文字列から数字だけを抜き取る
		System.out.println("ヒットアンドブロー："+str);
		//4桁の数字のみになったので、ここで回答を表示する
		
		//その後4桁の数字を入力する
			//桁があっていた場合：ヒット
			//桁が合ってないけど数字はある場合：ブロー
			//答え：「1234」
			//入力：「1546」→結果：1ヒット1ブロー
			//4ヒットになるまで続ける
		
		System.out.println("4桁の数値を入力してください>>");
		String str2 = br.readLine();
		//自分の4桁回答が文字列str2
		int [] myans = new int[4];
		//myansという4つの空箱を作成
		for(int x=0; x<myans.length; x++)
		{
			myans[x]=Integer.parseInt(String.valueOf(str2.charAt(x)));
			//str2をcharAtで取り出し、文字列から整数に変換する
		}
			
		int hit = 0;
		int brow = 0;
		for(int j=0; j<4; j++) //乱数で生成された4桁番号のforループ
		{
			for(int k=0; k<4; k++) //自分で入れた4桁番号のforループ
			{
				if(myans[j]==num[k]) 
				{
					brow++;
					break;
					//もしmyans(乱数生成数字)の中にnum(自分で入れた数字)が同じものが含まれていれば、browとしてカウント後にbreak
				}
			}
			if(num[j] == myans[j])
			{
				hit++;
				//もしnum(自分で入れた数字)と同じ列にmyans(乱数生成数字)で同じ数字が含まれていれば、hitとしてカウント
			}
		}
		System.out.println(hit+"ヒット");
		System.out.println(brow+"ブロー");		
	}

}
