package cn.itcast.struct.xiangyuan;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
        FlyWeight fly = factory.factory(new Character('a'));
        fly.operation("First Call");
        
        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");
        
        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
	    
	}
}
