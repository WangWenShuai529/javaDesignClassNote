package Observer.mode;

import javax.lang.model.util.ElementScanner6;

public class Haigui implements IObserve{
   private ISubject subject;

    

    public ISubject getSubject() {
        return subject;
    }


    public void setSubject(ISubject subject) {
        this.subject = subject;
        this.subject.addObserve(this);
    }



    @Override
    public void hearTelPhone(String msg) {
    //    System.out.println("msg:"+msg);
    //    if(msg.contains("IBM") || msg.contains("school")){
    //     System.out.println("我是海归:"+msg);
    //    }
    //    else if(msg.contains("student")){
    //     System.out.println("我是学生:"+msg);
    //    }else{
    //     System.out.println("其他的就业:"+msg);
    //    }
        

       System.out.println("msg:"+msg);
        System.out.println("我是海归:"+msg);
       
    }
    
}
