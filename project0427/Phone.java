class Phone{

	int price=5000;
	String name="G21";
	static String company="Samsung"; //static�� '��������' �̶� ���� �����ڶ� �Ҹ���
														//static���� ����� ����, �޼���� new�Ҷ�
														//�ش� �ν��Ͻ��� �Ҽӵ��� �ʴ´�.. ���� ����Ŭ������
														//�����ϰ� �ȴ�. ���� static���� ����� ���������
														//Ư���� Ŭ���� ������ �Ѵ�..

	public void ring(){
		System.out.println("���� �����");
	}
	public static void main(String[] args){
		//String c = commpany; //Ŭ������ ������ Ŭ���������� �̷��� �����ϴ°Ŵ�!!
		Phone p1 = new Phone();
		p1.company="LG";

		company="Motor";

		phone p2 = new Phone();
		p2.company="Sambo";

		System.out.println(p1.company);
	}
}