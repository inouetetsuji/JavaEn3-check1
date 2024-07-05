package check1;

public class Main {

	public static void main(String[] args) {
		//ここの変数は成功パターン、失敗パターンに合わせて書き換えてください。
			String account = "student";
			String password = "1234";
				
		//インスタンス化、コンストラクタで自動実行
			Login human = new Login(account,password);
				
		//ログインが出来るかを確認する。
			human.loginCheck();
				
		//アカウント名を確認する
			System.out.println("アカウント名は:"+human.getAccount()+"です");
	}
}

