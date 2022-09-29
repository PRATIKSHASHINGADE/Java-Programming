package array;

public class android {
	
	public static void main(String []args) {
		Androidphone[] object = new Androidphone[3] ;
		
		object[0] = new Androidphone(6, "black");
	    object[1] = new Androidphone(4, "blue");
		object[2] = new Androidphone(8 ,"green");
		
        System.out.println("vivo");
		object[0].display();
		
		System.out.println("oppo");
		object[1].display();
		
		System.out.println("lava");
		object[2].display();
	}
}
		
		class Androidphone
		{
	    int RAM;
		String color;
			
		Androidphone(int ram, String c)
			{
				RAM = ram;
				color = c;
			}
			public void display()
			{
				System.out.println("RAM size ="+RAM +" " +" color of Androidphone ="+color);
				System.out.println();
			}
			
		}
		
