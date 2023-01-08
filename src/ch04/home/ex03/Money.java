package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int price = 30_000;
		int tot = 0; //º’ø° ¡Â µ∑
		int tmp = 0; //≤®≥Ω µ∑ (temp/)
		
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000; //√÷¥Ò∞™ 3∏∏ø¯ √÷º⁄∞© √µø¯
			System.out.println(tmp);
			tot += tmp;
		}
		
		System.out.printf("\n%dø¯¿ª ≤®≥¬¥Ÿ.", tot);
		/*
		int money = 0;
		int sum = 0;
		
		while(sum < 30000) {
			money = ((int)(Math.random() * 30) + 1) * 1000;
			sum += money;
			System.out.println(money);
		}
		
		System.out.printf("%dø¯¿ª ≤®≥¬Ω¿¥œ¥Ÿ.", sum);
		*/
	}
}
/* (∑£¥˝)
∞˙¡¶] 3∏∏ø¯¬•∏Æ π∞∞«∞™¿ª ƒ°∑Ô∂Û.
¡ˆ∞©ø° 5∏∏ø¯±«¿∫ æ¯¥Ÿ.
≤®≥Ω µ∑¿« ±«(¡æ∑˘)¿ª ±∏∫∞«œ¡ˆ æ ¥¬¥Ÿ.

¡ˆ∞©ø°º≠ ¡ˆ∆Û∏¶ ø©∑Øπ¯ ≤®≥Ω¥Ÿ.

«—π¯ ≤®≥Ω µ∑¿« «’∞Ë¥¬ 3∏∏ø¯ ¿Ã«œ¿Ã¥Ÿ.
≤®≥æ∂ß∏∂¥Ÿ ≤®≥Ω±›æ◊¿ª √‚∑¬«—¥Ÿ.
---

12000
2000
6000
10000

30000ø¯¿ª ≤®≥¬Ω¿¥œ¥Ÿ.
*/