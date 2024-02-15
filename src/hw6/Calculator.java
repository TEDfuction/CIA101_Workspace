package hw6;

public class Calculator {
	// CalException 如果 x 和 y 同時為 0、y 為負值，則拋出 CalException 異常。
	public int powerXY(int x, int y) throws CalException {
		// 如果 x 和 y 同時為 0，拋出異常
		if (x < 0 && y < 0) {
			throw new CalException("0的0次方沒有意義");
		// 如果 y 為負值，拋出異常
		} else if (y < 0) {
			throw new CalException("y不能為負數");
		// 輸入正確，計算並返回 x 的 y 次方
		} else {
			return (int) Math.pow(x, y);
		}

	}
}
