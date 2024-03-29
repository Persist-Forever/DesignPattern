package cn.itcast.action.zhongjianclass.mediator;

public class Client {
	 public static void main(String[] args){  
        AbstractColleague collA = new ColleagueA();  
        AbstractColleague collB = new ColleagueB();  
          
        AbstractMediator am = new Mediator(collA, collB);  
          
        System.out.println("==========通过设置A影响B==========");  
        collA.setNumber(1000, am);  
        System.out.println("collA的number值为："+collA.getNumber());  
        System.out.println("collB的number值为A的100倍："+collB.getNumber());  
  
        System.out.println("==========通过设置B影响A==========");  
        collB.setNumber(1000, am);  
        System.out.println("collB的number值为："+collB.getNumber());  
        System.out.println("collA的number值为B的0.01倍："+collA.getNumber());  
          
    }  
}
