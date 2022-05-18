package Observer.book;


import java.util.ArrayList;

import java.util.List;

public class RealSubject implements ISubject {
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
            obs.update(message);
        }
    }

    @Override
    public void updateWeather(String info) {
        // TODO Auto-generated method stub
        
    }


    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<IObserve> getObjList() {
        return objList;
    }

    public void setObjList(List<IObserve> objList) {
        this.objList = objList;
    }

  

   
   



}
