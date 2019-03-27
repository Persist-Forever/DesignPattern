package cn.itcast.factory.prototype;

public class ConcretePrototype2 implements Prototype {
	private String name;
	@Override
	public Prototype clone() {
		ConcretePrototype2 prototype2 = new ConcretePrototype2();
		prototype2.setName(name);
		return prototype2;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return "Now in prototype2,name=" + this.name;
	}
}
