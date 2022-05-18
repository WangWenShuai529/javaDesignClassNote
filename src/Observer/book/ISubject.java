package Observer.book;
// 主题
public interface ISubject {
    void addObserve(IObserve observe);
    void deleteObserve(IObserve observe);
    void notifyObserve(IObserve observe);
    void updateWeather(String info);//主题内容更新
}
