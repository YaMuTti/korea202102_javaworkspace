package animal.birds;

class UseDuck{

	public static void main(String[] args){
		//���� �Ѹ����� �޸𸮿� �ø���(�ν��Ͻ� ����) canSwim �޼��带 ȣ��
		Duck d = new Duck("white");
		d.canSwim();

		Bird b = new Bird();
		b=d;

	}
}