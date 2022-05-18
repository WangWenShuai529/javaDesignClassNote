package Observer.book;

public class test {
    public static void main(String[] args) {
        ISubject center = new RealSubject();
        IObserve customer =new CustomerOne();

        center.addObserve(customer);
        // center.getBook(customer);
        
        customer.setBookName("三国演义");
        customer.setBookPeople("罗贯中");
        customer.setBookProduct("北京出版社");
        System.out.println( center.toString());
       
        customer.update("book name");
    }
}
