package Observer.book;


public class CustomerTwo implements IObserve{
   private ISubject subject;

    

    public ISubject getSubject() {
        return subject;
    }


    public void setSubject(ISubject subject) {
        this.subject = subject;
        this.subject.addObserve(this);
    }



    @Override
    public void update(String msg) {
       System.out.println("update(String msg) :"+msg);       
    }


    @Override
    public void setBookPeople(String string) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void setBookName(String string) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void setBookProduct(String string) {
        // TODO Auto-generated method stub
        
    }
    
}
