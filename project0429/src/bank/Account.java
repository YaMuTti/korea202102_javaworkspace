package bank;

//���¸� �����غ���!!
//�ڹٴ�, Ŭ������ ���� ����� �����ϹǷ� ���Ȼ� ������ �ʾҶ� ������ �߻��Ҽ��ֱ�
//������ �̸� �����ϱ� ���� ���������ڴ� ����ó���� �����Ѵ�..
//�ڹ��� ���� ó���� ������ ���� �� 4�ܰ�� �����ȴ�..
/*
	(����)		��Ӱ��� or ������Ű��		���� ��Ű����				���� ���ٰ���
	public	<	 protected		<		 default			<		 private
*/
public class Account{
	String bankName="�������";
	String master="��Ʈ��";
	private int balance=5000; //��� �޼��常 �� ������ ������ �� �ִ�...
	String num="084-45678-01";
	
	//�����Ϳ� ���� ���� ������ ��������, ������ ����ڵ� ������� ���ϰ� �Ǿ����Ƿ�,
	//������ ����ڰ� ������ �� �ִ� � ��ġ�� ����������!!
	public void setBalance(int balance){
		this.balance=balance;
	}

	//���� ��ȯ�޾� �� �� �ִ� �޼��� ���� (return�� �ִ� �޼���)
	public int getBalance(){
		return balance;
	}

	public void setMaster(String master){
		this.master = master;
	}
	public void getMaster(){
		return master;
	}

	//bankName
	public void setBankName(String bankName){//�����(���ۿ�) setter
		this.bankName = bankName;
	}

	public String getBankName(){
		return bankName;
	}

	public void setNum(String num){
		this.num=num
	}

	public String getNum(){
		return num;
	}

}
