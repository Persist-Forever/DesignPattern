package cn.itcast.struct.component;
/**
 * 总店抽象
 * */
public abstract class Market {
	public String name;
	//可以添加分店
	public abstract void add(Market m);
	//可以删除分店
	public abstract void remove(Market m);
	//公司指责：积分
	public abstract void payByCard();
}
