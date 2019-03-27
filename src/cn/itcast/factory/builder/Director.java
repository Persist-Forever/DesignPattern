package cn.itcast.factory.builder;
/**
 * 导演类
 * */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}
