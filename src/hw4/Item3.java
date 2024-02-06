package hw4;

public class Item3 {

	public static void main(String[] args) {
//		有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//		(提示：字元比對，String方法)
		
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int a = 0 , e = 0 , i = 0 , o = 0 , u = 0 ;
		// 搜尋字串陣列中的每個字串
		for (int math1 = 0 ; math1 < planet.length ; math1++ ) {
			// 搜尋當前字串中的每個字元
			for(int math2 = 0 ; math2 < planet[math1].length() ; math2++) {
				// 獲取當前字元
				char plarray = planet[math1].charAt(math2);
				// 使用 switch 來比對字元並統計每個母音的出現次數
				switch(plarray) {
				
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
					break;
				
				}
			}
			
		}
		int alltatal = a + e + i + o +u;
		System.out.printf("a=%d, e=%d, i=%d, o=%d, u=%d ,總共=%d",a, e, i, o, u, alltatal );
	
		//=========================================================================================//
		// 八大行星的名稱
		//String planet[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		// 母音陣列，含母音字元
		//String vowel[] = { "a", "e", "i", "o", "u" };
		// 計算母音的總數
		//int total = 0;
		
		// for-each迴圈，搜尋字串陣列中的每個字串
		//for (String pla : planet) {
			// 搜尋字串陣列中的每個字元
			//for (int math1 = 0; math1 < pla.length(); math1++) {
				// 獲得當前字元
				//char plarray = pla.charAt(math1);
				// for-each迴圈，搜尋母音陣列中的每個字串
				//for (String vow : vowel) {
					// 搜尋母音字串中的每個字元
					//for (int math2 = 0; math2 < vow.length(); math2++) {
						// 獲得當前母音字元
						//char vowarray = vow.charAt(math2);
						// 如果字串中的字元中有包含母音陣列中的字元total+1
						//if (plarray == vowarray)
							//total++;
					//}

				//}

			//}
		//}
		//System.out.print("total="+total);
	}
}
