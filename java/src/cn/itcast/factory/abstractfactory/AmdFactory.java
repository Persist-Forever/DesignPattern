package cn.itcast.factory.abstractfactory;
/**
 * AMD工厂                    
 * */
public class AmdFactory implements AbstractFactory {

	@Override
	public Cpu createCPU(int pin) {
		
		return new AmdCpu(pin);
	}

	@Override
	public Mainboard createMainboard(int pin) {
		
		return new AmdMainboard(pin);
	}

}
