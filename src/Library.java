public class Library {

    String name;
    int year;
    Book[] books;
    // constructor
    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available");
        /* The data type of what we're iterating trough is book object "for every book in my array
        of books takes each book, call the books"*/
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
}
