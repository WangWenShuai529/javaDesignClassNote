package Observer.homework;

// 人类
public class Person  implements Client {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void getWeather(WeatherInfo info) {
        // TODO Auto-generated method stub
        
    }
    
}
