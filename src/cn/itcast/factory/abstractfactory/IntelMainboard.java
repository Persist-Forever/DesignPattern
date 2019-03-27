package cn.itcast.factory.abstractfactory;

public class IntelMainboard implements Mainboard {
	//cpu 插槽的孔数
	private int cpuHolds = 0;
	
	public IntelMainboard(int cpuHolds) {
		super();
		this.cpuHolds = cpuHolds;
	}

	@Override
	public void installCPU() {
		System.out.println("Intel主板的插槽孔数是:"+cpuHolds);
	}

}
