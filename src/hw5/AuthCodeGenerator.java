package hw5;

public class AuthCodeGenerator {

	public static void main(String[] args) {
		AuthCodeGenerator test = new AuthCodeGenerator();
		System.out.println(test.genAuthCode());
	}

	// 生成驗證碼的方法
	public char[] genAuthCode() {
		// 定義包含字母和數字的字串
		String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		// 創建一個長度為8的字符數組來存儲生成的驗證碼
		char genAut[] = new char[8];
		// 使用隨機數生成驗證碼
		for (int array = 0; array < genAut.length; array++) {
			// 使用 Math.random() 生成 0 到 1 之間的隨機數，乘以字串的長度後強制轉換為整數，以獲取字串中的隨機字符
			genAut[array] = s.charAt((int) (Math.random() * s.length()));

		}
		return genAut; // 返回生成的驗證碼數組
	}

}
