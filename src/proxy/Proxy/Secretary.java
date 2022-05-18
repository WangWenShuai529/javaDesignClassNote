package proxy.Proxy;
//代理对象
public class Secretary implements Employee {
	Employee object = new Boss();
	@Override
	public String hearPhone(String aString) {
		if(aString.equals("chifan")){
			System.out.println("老板出差了");
			return "";
		}
		else if(aString.equals("qingke")){
			System.out.println("老板出差了");
			return "";
		}else{
			
			System.out.println("object.hearPhone(aString):"+object.hearPhone(aString));
			System.out.println("调用目标对象后的操作");
			return object.hearPhone(aString);
		}
		
		
	}
	
}
