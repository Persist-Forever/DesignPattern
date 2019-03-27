package cn.itcast.struct.component;
/**
 * 加盟店：没有分店了
 * */
public class JoinMarket extends Market{
	
	public JoinMarket(String s){
		this.name = s;
	}
	
	@Override
	public void add(Market m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Market m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payByCard() {
		System.out.println("在   " + name + "  消费，积分已经加入会员卡上了。。。");
	}

}
