class Base {
	String name = "ȫ�浿";
}

class Derived extends Base {
	String name = "��ö��";
	
	String getLocalName() {
		String name = "�迵��";
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
