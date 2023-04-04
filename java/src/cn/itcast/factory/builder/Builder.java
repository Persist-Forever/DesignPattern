package cn.itcast.factory.builder;
/**
 * 抽象建造者
 * */
public interface Builder {
	
	public void buildPart1();
	public void buildPart2();
	public Product retrieveResult();
}
