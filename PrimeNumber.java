class PrimeNumber{
	public static void main(String []a){
	
		int value = 43, i =2, count =0;
		System.out.println("hello");
		while (value%i == 0){
			count++;
			
		}
		if ( count >=2){
			System.out.println( value + " is  not a prime number");
		}
		else{
			System.out.println( value + " is a prime number");
		}
		
	}
}