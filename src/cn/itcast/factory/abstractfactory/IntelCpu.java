package cn.itcast.factory.abstractfactory;

public class IntelCpu implements Cpu{
	//cpu引脚数
	private int pins = 0;
	public  IntelCpu(int pins) {
		this.pins = pins;
	}
	
	@Override
	public void calculate() {
		System.out.println("IntelCpu 引脚数："+pins);
		
	}

}
