package ch05.ex01.case04;

public class User { //�־������� �� ��� ����
	private String name;
	
	public void setName(String name) { //�Ķ���ͷ� �־��ΰ��� �ƴѰ�� ���� ����
		char familyName = name.charAt(0);
		
		if(familyName == '최')
			this.name = name; //yes�� ���
		else this.name = "��������?"; //����ó��. �����ٲ�
	}
	
	//�б�
	public String getName() { //����Ÿ���� void�� �ƴϸ� ������ ���� -> �̷��� ����Ÿ���� �޼ҵ� ��ä�ȿ� �־����.
		return this.name;
	}
	
}
