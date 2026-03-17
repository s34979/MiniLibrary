public class Main
{
    public static void main (String[] args)
    {
        Book b1= new Book("Harry Potter", "J.K. Rowling", 500, true);
        Book b2= new Book("Atomic Habits", "James Clear", 300, true);
        Book b3= new Book("The Alchemist", "Paulo Coelho", 200, true);

        b1.printInfo();
        System.out.println();

        b1.borrow();
        b1.printInfo();
        System.out.println();

        b1.returnBook();
        b1.printInfo();

    }
}