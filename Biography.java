package BookStore;

public class Biography extends TextBook{
    String about;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    Biography() {
        super();
        about = "";
    }

    Biography(String title, String subject, String about, int year, double price){
        super(title, subject, year, price);
        this.about = about;
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
        System.out.println("Tentang: " + about);
    }
}
