package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
	int x = 10; //decimal
	System.out.println(Integer.toBinaryString(x)); //������, (����)Ÿ���� String
	
	x = 012; // octal, �׳� 12�� ������ 12, �����Ϸ����� 8�������� �˸��� ���� �Ǿտ� 0�� ����
	System.out.println(Integer.toBinaryString(x));
	
	x = 0xA; //hexa 16���� 
	System.out.println(Integer.toBinaryString(x));
	
	x = 0b1010; // binary ������
	System.out.println(Integer.toBinaryString(x));
	
	x = 1_234_567; //���� õ���� ���� �� ,�� �ƴ�  _������. ���ͷ����� _��밡������~
	System.out.println(x + 1);
	
	double y = 1e1; // 1 * 10�� 1�� , ������ ��Ÿ���� double���
	System.out.println(y);
	}
}
