package Observer.book;

import javax.lang.model.util.ElementScanner6;

public class CustomerOne implements IObserve{
   private ISubject subject;

   private String bookName;
   private String bookPeople;
   private String bookProduct;

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
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPeople() {
        return bookPeople;
    }

    public void setBookPeople(String bookPeople) {
        this.bookPeople = bookPeople;
    }

    public String getBookProduct() {
        return bookProduct;
    }

    public void setBookProduct(String bookProduct) {
        this.bookProduct = bookProduct;
    }

    @Override
    public String toString() {
        return "RealSubject [bookName=" + bookName + ", bookPeople=" + bookPeople + ", bookProduct=" + bookProduct
                +"]";
    }


}
