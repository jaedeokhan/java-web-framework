class Base {
	String name = "È«±æµ¿";
}

class Derived extends Base {
	String name = "ÀÌÃ¶¼ö";
	
	String getLocalName() {
		String name = "±è¿µÈñ";
		return name;
	}
	String getThisName() {
		return this.name;
	}
	String getSuperName() {
		return super.name;
	}
}


public class ThisSuperTest {
	
	public static void main(String[] args) {
		
		Derived derived = new Derived();
		System.out.println("method name : " + derived.getLocalName());
		System.out.println("this.name : " + derived.getThisName());
		System.out.println("super.name : " + derived.getSuperName());
	}
	
}
