package util;
Class UseObject{
	public static void main(String[] args){
		ObjectTest ot = new ObjectTest();
		String str="monkey";
		
		//ot.test();
		boolean result = ot.equals(str);
		System.out.println(result);
	}

}