/*현실의 사물을 표현하기 위함이 아니라, 단지 실행부를 두기 위한
Dummy 클래스*/

class UseDuck{
	public static void main(String[] args){
		//하드디스크에 컴파일되어 있는 기계오리를 메모리에 살아 숨쉬게 해보자!!
		//즉 실행해서 메모리에 올리자!!!
		//d1이라는 변수명으로 오리 1마리를 메모리에 올리기
		int x=7;
		Duck d1 = new Duck();

		//자바가상머신상의 주소값을 담고 잇다는 것을 증명해보자!!
		System.out.println("d1이 담고 있는 오리 인스턴스의 주소값은"+d1);

		//d1은 결국, 실제 오리 자체를 담고 있는게 아니라, Heap영역에 생성된
		//오리 인스턴스의 주소값을 담고 있다, 즉 오리를 가리키고 있다.
		//오리를 참조하고 있다고 하여, reference 변수라 한다
	}
}