package BookStore;

public class TextBook extends Book {
    String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public TextBook() {
        super();
        subject = "";
    }

    public TextBook(String title, String subject, int year, double price) {
        super(title, year, price);
        this.subject = subject;
    }

    public double discount(int a, double b){
        int discount = a;
        if(a <= 2020 && a >= 2011){
            discount = 20;
        }else if(a <= 2011){
            discount = 50;
        }
        double didaq = discount * b;
        return didaq;
    }

    public void print() {
        super.print();
        System.out.println("Mapel: " + subject);
    }
}
