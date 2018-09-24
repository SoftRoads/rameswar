class Tringle{
	
	float base, height;
	
	
	
	void setData(){
		base = 6f;
		height = 2.5f;

		}
	void area(){
		
		float area = (1f/2f)*base*height;
		System.out.println(" Base of tringle  ="+ base +"\n"+" height of tringle = "+ height +"\n area of tringle is= "+ area);
		}
		

}

class Shape{
	public static void main(String []a){
		
		Tringle tringle1 = new Tringle();
		tringle1.setData();
		tringle1.area();

	}
}