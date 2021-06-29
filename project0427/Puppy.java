/*강아지를 정의한다*/
class Puppy{
	int age=5;

	public void setAge(){
		age=3;
	}

	public static void main(String[] args){
		//강아지의 나이를 3세로 변경한 후, 나이를 출력해본다
		//Puppy d1 = new Puppy();
		//d1.age=3;
		//System.out.println(d1.age);

		Puppy p = new Puppy(); //강아지 1마리의 인스턴스를 생성...
		//즉 위의 과제를 수행하려면, 생물학적으로 강아지가 태어나야 가능하다...
		p.setAge(); //나이 변경 메서드 호출
		System.out.println(p.age);
	}
}


