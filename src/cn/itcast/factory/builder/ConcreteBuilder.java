package cn.itcast.factory.builder;
/**
 * 具体建造者
 * 		可以通过这个类得到产品
 * */
public class ConcreteBuilder implements Builder {
	
	private Product product = new Product();
	
	@Override
	public void buildPart1() {
		product.setPart1("产品的第一部分。。。");
	}

	@Override
	public void buildPart2() {
		product.setPart2("产品的第二部分。。。");
	}

	@Override
	public Product retrieveResult() {
		return product;
	}

}
