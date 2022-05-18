package Observer.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUse {
	public static void main(String args[]){
		//创建主题
		WeatherService service = WeatherService.instance;
		//添加观察者
		service.addClient(new ClientWeatherServer());
		service.addClient(new ClientTravelServer());
		// 实例化人类王先生
		Person wang = new Person("wang");
		service.addClient(wang);
		//更新主题

		Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
        String retStrFormatNowDate = sdFormatter.format(nowTime);
		// System.out.println("retStrFormatNowDate:"+retStrFormatNowDate);
		service.updateWeather(new WeatherInfo(retStrFormatNowDate, "晴转大雨","预报日期:明天，天气状况:晴转大雨,台风影响福建﹐最高温度:32。最低温度:20.旅游项目:黄山5日游﹐旅游价格信息:价格: 5000/人."));
		service.updateWeather(new WeatherInfo(retStrFormatNowDate, "暴雨","预报日期:后天，天气状况:台风登陆福建,暴雨﹐最高温度:26，最低温度:19.旅游项目:香港3日游﹐旅游价格信息:价格:9O00/人."));
	}
}