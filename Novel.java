package BookStore;

public class Novel extends Book {
    String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    Novel() {
        super();
        genre = "";
    }

    Novel(String title, String genre, int year, double price) {
        super(title, year, price);
        this.genre = genre;
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
        System.out.println("Genre Buku: "+ genre);
    }
}
