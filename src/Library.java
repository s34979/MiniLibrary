public class Library
{

        Book[] books;

        public Library(Book[] books) {
            this.books = books;
        }

        public void borrowBook(String title, Reader reader) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getTitle().equals(title) && books[i].isAvailable()) {
                    books[i].borrow();
                    reader.increaseBorrowedCount();
                    return;
                }
            }
        }

        public void returnBook(String title, Reader reader) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getTitle().equals(title)) {
                    books[i].returnBook();
                    reader.decreaseBorrowedCount();
                    return;
                }
            }
        }
    }

