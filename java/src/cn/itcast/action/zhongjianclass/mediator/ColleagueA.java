package cn.itcast.action.zhongjianclass.mediator;

public class ColleagueA extends AbstractColleague{

	@Override
	public void setNumber(int num, AbstractMediator am) {
		this.number = num;
		am.AaffectB();
	}

}
