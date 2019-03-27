package cn.itcast.factory.builder;
/**
 * 客户端
 * 	建造者模式可以将一个产品的内部表象于产品的生产过程分割开来，
 *  从而可以使一个建造过程生产具有不同的内部表象的产品对象。
 * */
public class client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
}
