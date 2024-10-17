package BookStore;

public class Book {
    public String title;
    public int year;
    public double price;


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    public Book() {
       title = "";
       year = 0;
       price = 0; 
    }

    public Book(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
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
        System.out.println("Judul Buku: " + title);
        System.out.println("Tahun Terbit: " + year);
        System.out.println("Harga Buku: " + (price - discount(year,price)) );
    } 
}
