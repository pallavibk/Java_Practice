package inheritance;

public class SingleInheritanceMainclass {
	public static void main(String[] args) {
		System.out.println("Constructor INVOKING IN INHERITANCE");
		SingleInheritanceParentClass obj = new SingleInheritanceParentClass();
		SingleInheritanceChildClass obj1 = new SingleInheritanceChildClass();
		SingleInheritanceChildClass obj3 = new SingleInheritanceChildClass(4);
		SingleInheritanceChildClass obj4 = new SingleInheritanceChildClass(5);

		System.out.println("STORING THE PARENT CLASS OBJECT IN CHILD CLASS REFERENCE: NOT POSSIBLE");
		// SingleInheritanceChildClass obj5= new SingleInheritanceParentClass();
		System.out.println("STORING THE CHILD CLASS OBJECT IN PARENT CLASS REFERENCE: POSSIBLE");
		SingleInheritanceParentClass obj6 = new SingleInheritanceChildClass();
		System.out.println("**************************");

		System.out.println("varaibles accessing : Parent class : by parent class object :POSSIBLE");

		System.out.println("x=" + obj.x);
		System.out.println("y=" + obj.y);
		System.out.println("u=" + obj.u);
		System.out.println("z=" + obj.z);

		System.out.println("varaibles accessing : child class : by parent class object :NOT POSSIBLE");
		/*
		 * System.out.println("xx="+obj.xx); System.out.println("yy="+obj.yy);
		 * System.out.println("uu="+obj.uu); System.out.println("zz="+obj.zz);
		 */

		System.out.println("varaibles accessing : Parent class : by child class object : POSSIBLE");

		System.out.println("x=" + obj1.x);
		System.out.println("y=" + obj1.y);
		System.out.println("u=" + obj1.u);
		System.out.println("z=" + obj1.z);

		System.out.println("varaibles accessing : child class : by child class object : POSSIBLE");
		System.out.println("xx=" + obj1.xx);
		System.out.println("yy=" + obj1.yy);
		System.out.println("uu=" + obj1.uu);
		System.out.println("zz=" + obj1.zz);

		System.out.println("**************************");

		System.out.println("Method accessing : Parent class : by parent class object :POSSIBLE");
		obj.test1();
		obj.test2();
		System.out.println("Method accessing : child class : by parent class object :NOT POSSIBLE");
		/*obj.test3();
		obj.test4();*/
		System.out.println("Method accessing : Parent class : by child class object :POSSIBLE");
		obj1.test1();
		obj1.test2();
		System.out.println("Method accessing : child class : by child class object :POSSIBLE");
		obj1.test3();
		obj1.test4();
		System.out.println("**************************");

	}
}
