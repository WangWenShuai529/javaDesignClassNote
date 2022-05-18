package Observer.homework;
//天气的消息实体
public class WeatherInfo {
	private String time;
	private String weather;
	private String info;

	public WeatherInfo(String time,String weather, String info){
		this.time = time;
		this.weather = weather;
		this.info = info;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public boolean equals(Object obj) {
		WeatherInfo info = (WeatherInfo) obj;
		return info.time==this.time&&info.weather.equals(this.weather);
	}
}
