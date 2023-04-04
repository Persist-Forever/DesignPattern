package cn.itcast.factory.abstractfactory;
/**
 * Intel工厂
 * */
public class IntelFactory implements AbstractFactory {

	@Override
	public Cpu createCPU(int pin) {
		return new IntelCpu(pin);

	}

	@Override
	public Mainboard createMainboard(int pin) {
		return new IntelMainboard(pin);

	}

}
