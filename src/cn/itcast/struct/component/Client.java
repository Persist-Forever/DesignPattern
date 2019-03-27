package cn.itcast.struct.component;
/**
 * 客户端
 * */
public class Client {
	public static void main(String[] args) {
		BranchMarket rootM = new BranchMarket("总店");
		BranchMarket aBranch = new BranchMarket("分店1");
		JoinMarket aJoin = new JoinMarket("加盟店1");
		JoinMarket bJoin = new JoinMarket("加盟店2");
		
		//分店1下两个加盟店
		aBranch.add(aJoin);
		aBranch.add(bJoin);
		//总店下有分店1
		rootM.add(aBranch);
		
		rootM.payByCard();
	}
}
