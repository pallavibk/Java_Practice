package polymorphism;

public class sample {
	
	//program to sho ho to call method if its return type is object
	
	shape createshape()
	{
		int ch=3;
		if(ch==1)
		{
			circle c=new circle();
			return c;
		}
		else if(ch==2)
		{
			Rectangle r=new Rectangle();
			return r;
		}
		else if(ch==3)
		{
			Square s=new Square();
			return s;
		}
		else
		{
			shape sh=new shape();
			return sh;
		}
	}

	public static void main(String[] args) {
		
		sample s=new sample();
	shape ref=s.createshape();
	ref.draW();
		
	}

}
