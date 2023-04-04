package cn.itcast.struct.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 分店和总店功能一样：可以有加盟店
 * */
public class BranchMarket extends Market{
	//加盟店列表
	List<Market> list = new ArrayList<>();
	
	
	
	public BranchMarket(String s) {
		this.name = s;
	}

	@Override
	public void add(Market m) {
		list.add(m);
	}

	@Override
	public void remove(Market m) {
		//没有去做一些判断
		list.remove(m);
	}

	@Override
	public void payByCard() {
		System.out.println("在   " + name + "  消费，积分已经加入会员卡上了。。。");
		for(Market m : list){
			m.payByCard();
		}
	}

}
