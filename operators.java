class Operators{
	public static void main(String []a){
		
		int value1 = 5, value2 = 4, value3;
		System.out.println("Pre increment : " + ++value1);
		System.out.println( "Post increment : " + value1++);
		System.out.println("Pre decrement : " + --value1);
		System.out.println("Post decrement : " + value1--);
		System.out.println( " Bit wise (or) : " + (value1|value2));
		System.out.println("Bit wise (and) : " + (value1^value2));
		System.out.println(" Bit wise(not) : " + (~value1));
		System.out.println("Arithmatic Operators (+)  : " + (value1+value2));
		System.out.println("Arithmatic Operators (-)  : "+ (value1-value2));
		
	}
}