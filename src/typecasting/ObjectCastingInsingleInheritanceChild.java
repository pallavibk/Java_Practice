package typecasting;

public class ObjectCastingInsingleInheritanceChild extends ObjectCastingInsingleInheritanceParent{
	void test2()
	{
		System.out.println("CHILD:test2()");
	}
	void fun()
	{
		System.out.println("Inside child fun() it is  overidden");
	}
	
	
	public static void main(String[] args) {
		System.out.println("********* CHILD class object ********");
		ObjectCastingInsingleInheritanceChild obj=new ObjectCastingInsingleInheritanceChild();
		obj.test2();
		obj.test1();
		obj.fun();
		System.out.println("********* parent class object ********");
		ObjectCastingInsingleInheritanceParent obj1=new ObjectCastingInsingleInheritanceParent();
		obj1.test1();
		obj1.fun();
		System.out.println("********* storing child class object inside parent or Auto upcasting(child class features are hidden)*************");
		ObjectCastingInsingleInheritanceParent obj3=new ObjectCastingInsingleInheritanceChild();
		obj3.test1();
		//obj3.test2(); get compile time error
		obj3.fun();// AS it is overiden function in  child class so it display child class overiden fun(); method not the parent class fun();
		System.out.println("********* storing parent class object inside child or Explicit doncasting(to make child class featuresvisible)*******");
		ObjectCastingInsingleInheritanceChild obj4=(ObjectCastingInsingleInheritanceChild) obj3;
		obj4.test1();
		obj4.test2();// get compile time error
		obj3.fun();// AS it is overiden function in  child class so it display child class overiden fun(); method not the parent class fun();
	
	}

}
