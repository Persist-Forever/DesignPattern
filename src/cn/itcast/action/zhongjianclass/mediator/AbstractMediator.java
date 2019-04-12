package cn.itcast.action.zhongjianclass.mediator;

public abstract class AbstractMediator {
	
	protected AbstractColleague A;
	protected AbstractColleague B;
	
	public AbstractMediator(AbstractColleague a, AbstractColleague b) {
		super();
		A = a;
		B = b;
	}
	
	//A同事影响B同事
	public abstract void AaffectB();
	//B同事影响A同事
	public abstract void BaffectA();
		
}
