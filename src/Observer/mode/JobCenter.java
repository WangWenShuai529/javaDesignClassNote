package Observer.mode;


import java.util.ArrayList;

import java.util.List;

public class JobCenter implements ISubject {
    private String message="";
    private List<IObserve> objList =new ArrayList<IObserve>();//存放观察者
    
    @Override
    public void addObserve(IObserve observe) {
        if(!objList.contains(observe))
              objList.add(observe);
    }

    @Override
    public void deleteObserve(IObserve observe) {
        if(!objList.contains(observe))
        objList.remove(observe);
    }

    @Override
    public void notifyObserve(IObserve observe) {
        for (IObserve obs:objList){
            obs.hearTelPhone(message);
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
