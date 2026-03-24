public class Main
{
    public static void main (String[] args)
    {



                Book[] books = new Book[3];

                books[0] = new Book("Harry Potter", "J.K. Rowling", 500, true);
                books[1] = new Book("Atomic Habits", "James Clear", 300, true);
                books[2] = new Book("The Alchemist", "Paulo Coelho", 200, true);


                System.out.println("All books:");
                for (int i = 0; i < books.length; i++) {
                    books[i].printInfo();
                    System.out.println();
                }



                System.out.println("Borrowing first book...\n");
                books[0].borrow();

                books[0].printInfo();
                System.out.println();


                Reader[] readers = new Reader[2];

                readers[0] = new Reader("Vedika", "Jain", 101, 0);
                readers[1] = new Reader("Aarav", "Sharma", 102, 0);


                System.out.println("Readers:");
                for (int i = 0; i < readers.length; i++) {
                    readers[i].printData();
                    System.out.println();
                }


                System.out.println("Reader 1 borrows a book...\n");
                readers[0].increaseBorrowedCount();

                readers[0].printData();

                Reader r1=new Reader("Vedika", "Jain", 101, 0);

        Library library = new Library(books);

        library.borrowBook("Harry Potter", r1);
        library.returnBook("Harry Potter", r1);

    }
}