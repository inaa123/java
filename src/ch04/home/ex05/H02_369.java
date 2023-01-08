package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
		int tens = 0;
		int ones = 0;
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0 && tens % 3 == 0) System.out.print("Â¦");
			if(ones != 0 && ones % 3 == 0) System.out.print("Â¦");
			
			if(i % 10 == 0) System.out.println();
			
		}
		
		/*
		for(int i = 0; i <= 9; i++) {
			for(int j = 1; j <=9; j++) {
				if(i == 0) {
					if(j % 3 == 0) System.out.printf("%d%s ",j, "Â¦");
					else System.out.print(j + " ");
					
				} else if(i >= 1){
					if(i % 3 == 0 && j % 3 == 0) System.out.printf("%d%d%s ",i, j, "Â¦Â¦");
					else if(i % 3 == 0 || j % 3 == 0) System.out.printf("%d%d%s ",i, j, "Â¦");
					else System.out.printf("%d%d ", i, j);
				}
			}
		System.out.println();	
		}
		*/
	}
}
/*
 ,°úÁ¦] 369°ÔÀÓÀ» ÇØ¶ó.
 ¼ıÀÚ´Â 1ÀÌ»ó 99ÀÌÇÏÀÌ´Ù.
 10´ÜÀ§·Î ÁÙ¹Ù²ŞÇÑ´Ù.
 1 2 3Â¦ 4 5 6Â¦ 7 8 9Â¦
 11 12 13Â¦ 14 15 16Â¦ 17 18 19Â¦ 20
 21 .....
 91Â¦ 92Â¦ 93Â¦Â¦ 94Â¦ 96Â¦Â¦ 97Â¦ 98Â¦ 99Â¦Â¦
*/