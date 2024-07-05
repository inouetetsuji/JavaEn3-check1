package check1;

import java.util.HashMap;
import java.util.Map;

import check1An.Message;


public class Login {
	private Map<String, String> map;
	private String[] goodAccount = { "student", "society", "Freelance" };
	private String[] goodPassword = { "1234", "1111", "2222" };

	private String account = "";
	private String password;

	/*
	 * 問題② ログインを実行するためのコンストラクタを作成してください。 引数は無しで、アカウントとパスワードに空文字("")を代入してください
	 * また、コンストラクタの処理でinitialization()メソッドを実行してください
	 */
	public Login() {
		this.account = "";
		this.password = "";
		initialization();
	}
	/*
	 * 問題③ ログインを実行するためのコンストラクタをオーバーロードして作成してください。 引数はString accountとString
	 * passwordを作成し、クラスに格納しましょう。 また、コンストラクタの処理でinitialization()メソッドを実行してください
	 * ヒント、thisを上手く使ってクラス変数に格納しましょう。
	 */
	public Login(String account, String password) {
		this.account = account;
		this.password = password;
		initialization();
	}
	/*
	 * 問題④ アカウント名を取得するためのgetterメソッドを作成してください
	 */
	public String getAccount() {
		return this.account;
	}
	// ログインを確認するためのメソッド
	public void loginCheck() {

		System.out.println(Message.ME001);

		// アカウント、パスワードが正しく登録できているかを確認するためのboolean
		boolean accountBoolean;
		boolean passwordBoolean;

		// アカウント、パスワードを確認する
		accountBoolean = checkAccount(this.account);
		if (accountBoolean) {
			passwordBoolean = checkPassword(this.password);
		} else {
			passwordBoolean = false;
		}
		// ログインが完了したかを確認するメソッド
		if (accountBoolean && passwordBoolean) {
			System.out.println(Message.ME006);
		} else {
			System.out.println(Message.EE003);
		}
	}


/*
 * 問題⑤アカウントがmapの中に存在するかを確認する「checkAccount」メソッドを以下の条件で作成してください。
 * ・メソッドはprivateを指定すること
 * ・アカウントが存在する場合はtrue、アカウントが存在しない場合はfalseを返却すること
 * ・ME002、ME003、EE001を使って処理の開始、処理した結果を出力してください。
 * ヒント、Mapはキー取得を行い、存在しない場合はnullを返却します。
 */
private boolean checkAccount(String account) {
	System.out.println(Message.ME002);

	String s = this.map.get(account);
	if (s != null) {
		System.out.println(Message.ME003);
		return true;
	} else {
		System.out.println(Message.EE001);
		return false;
	}
}

/*
 * 問題⑥パスワードが入力されたアカウントに対して、正しいパスワードが入力されているかを判定する
 * ・メソッドはprivateを指定すること
 * 「checkPassword」メソッドを以下の条件で作成してください。
 * ・パスワードがあっている場合はtrue、パスワードが間違っている場合はfalseを返却すること
 * ・ME004、ME005、EE002を使って処理の開始、処理した結果を出力してください。
 * ヒント、クラスが保持しているアカウントを使ってパスワードを取得すると良いでしょう。
 * 
 */
	private boolean checkPassword(String password) {
		System.out.println(Message.ME004);
		String checkPassword = this.map.get(account);
	if (password != null && password.equals(checkPassword)) {
		System.out.println(Message.ME005);
		return true;
	} else {
		System.out.println(Message.EE002);
		return false;
	}
}
// ログイン出来るパスワードを予め実行するメソッド
private void initialization() {
	map = new HashMap<String, String>();
	map.put(goodAccount[0], goodPassword[0]);
	map.put(goodAccount[1], goodPassword[1]);
	map.put(goodAccount[2], goodPassword[2]);
}

}