/*�������� �����Ѵ�*/
class Puppy{
	int age=5;

	public void setAge(){
		age=3;
	}

	public static void main(String[] args){
		//�������� ���̸� 3���� ������ ��, ���̸� ����غ���
		//Puppy d1 = new Puppy();
		//d1.age=3;
		//System.out.println(d1.age);

		Puppy p = new Puppy(); //������ 1������ �ν��Ͻ��� ����...
		//�� ���� ������ �����Ϸ���, ������������ �������� �¾�� �����ϴ�...
		p.setAge(); //���� ���� �޼��� ȣ��
		System.out.println(p.age);
	}
}


