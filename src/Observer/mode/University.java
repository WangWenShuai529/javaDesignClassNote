package Observer.mode;

public class University implements IObserve{
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
       System.out.println("msg:"+msg);
   
        System.out.println("我是学生:"+msg);

        
    }
    
}
