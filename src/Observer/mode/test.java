package Observer.mode;

public class test {
    public static void main(String[] args) {
        ISubject center = new JobCenter();
        IObserve haigui =new Haigui();

        ((Haigui) haigui).setSubject(center);
        
        University uOne= new University();
        uOne.setSubject(center);

    //    center.setMessage("IBM公司需要java程序员");
        center.notify();
    }
}
