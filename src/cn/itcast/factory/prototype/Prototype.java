package cn.itcast.factory.prototype;
/**
 * 原型接口
 * */
public interface Prototype {
	public Prototype clone();
	public String getName();
	public void setName(String name);
}
