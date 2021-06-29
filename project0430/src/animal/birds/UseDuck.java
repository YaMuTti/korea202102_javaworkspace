package animal.birds;

class UseDuck{

	public static void main(String[] args){
		//오리 한마리를 메모리에 올리고(인스턴스 생성) canSwim 메서드를 호출
		Duck d = new Duck("white");
		d.canSwim();

		Bird b = new Bird();
		b=d;

	}
}