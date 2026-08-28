public class Aggregation {
    static void main(String[] args) {

        // Aggregation = represents a "has-a" relationship between objects.
        // one object contains another object as a part of its structure,
        // but the contained objects can exist independently

        Book book1 = new Book("The rencoks", 213);
        Book book2 = new Book("The eafewb", 214);
        Book book3 = new Book("The goofy", 212);

        Book[] books = {book1, book2, book3};


        Library library = new Library("NYW Public Library", 1877, books);
        library.displayInfo();
    }
}
