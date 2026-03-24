public class Reader
{
        private String firstName;
        private String lastName;
        private int cardNumber;
        private int borrowedCount;

    public Reader(String firstName, String lastName, int cardNumber, int borrowedCount)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;
    }
    public void printData()
    {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Borrowed Books: " + borrowedCount);
    }
    public void increaseBorrowedCount()
    {
        borrowedCount++;
        System.out.println("Book borrowed. Total now: " + borrowedCount);
    }
    public void decreaseBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
            System.out.println("Book returned. Total now: " + borrowedCount);
        } else {
            System.out.println("No books to return.");
        }
    }
}
