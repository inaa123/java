package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; //byte10 -> int 10 promotion,casting
		i = (int)b; // casting, promotion 
		System.out.println(i); //promotion�Ǵ� �Ŵ� Overflow�߻� x
		
		//overflow�߻��ϴ� ���
		int i2 = 300;
		byte b2 = (byte)i2;//i2�� byte ĳ���ÿ����� ��� ĳ���ø��ϰ��� �����ؼ� b2�� ����.
		System.out.println(b2); //������ ���� : overflow
	}
}
