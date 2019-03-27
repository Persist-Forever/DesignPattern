package cn.itcast.struct.xiangyuan;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<Character,FlyWeight> files = new HashMap<>();
	    
    public FlyWeight factory(Character state){
        //先从缓存中查找对象
    	FlyWeight fly = files.get(state);
        if(fly == null){
            //如果对象不存在则创建一个新的FlyWeight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的FlyWeight对象添加到缓存中          
            files.put(state, fly);
        }
        return fly;
    }
}
