package Class0914.Exec;

public abstract class MyAbsClass {

	// �߻� �޼ҵ带 ���� �ϴ� Ŭ����
	// ��ü�� ������ �� ����.
	// abstract �޼ҵ�� private �Ǵ�  static�� �� �� ����.
	// (static �޼ҵ�� ��ü���̵� ȣ�� �Ǵ� �޼ҵ� �̹Ƿ� body�� ���� �Ǿ�� �Ѵ�.)
	
	int myInt;
	public abstract void noAction(); //x1 �߻�޼ҵ�
	
	public int getMyInt() {
		return myInt;
	}	
	//MyabsClass ab = new MyAbsClass(); ��ü�� �����Ҽ����� ��
}