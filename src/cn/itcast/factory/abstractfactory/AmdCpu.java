package cn.itcast.factory.abstractfactory;

public class AmdCpu implements Cpu {
	
	private int pins=0;
	
	public AmdCpu(int pins) {
		this.pins = pins;
	}

	@Override
	public void calculate() {
		System.out.println("AMDCpu 引脚数："+pins);
	}

}
