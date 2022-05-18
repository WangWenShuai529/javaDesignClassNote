package Observer.mode;

public interface ISubject {
    void addObserve(IObserve observe);
    void deleteObserve(IObserve observe);
    void notifyObserve(IObserve observe);
}
