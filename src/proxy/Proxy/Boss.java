package proxy.Proxy;
//具体对象:老板
public class Boss implements Employee {
	

	@Override
	public String hearPhone(String aString) {
		return aString+"老板接电话";
	}
	
}
