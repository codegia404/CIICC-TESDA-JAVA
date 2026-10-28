public class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;

        System.out.println("title        :" +title );
        System.out.println("Author       :" +author);
        System.out.println("Year Publish :" +yearPublished);
        System.out.println("Price        :" +price);
        System.out.println();

    }

}
