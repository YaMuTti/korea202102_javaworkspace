package animal.birds;

public class Duck extends Bird{
	String name="난 오리";
	String color;

	public Duck(String color){
		super(color);
	}

	//수영이 가능함
	public void canSwim(){
		System.out.println("수영을 잘합니다");
	}
}