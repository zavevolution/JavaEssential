package task3;

public class Book {
    Title title;
    Author author;
    Content content;

    void add(Title t, Author a, Content c) {
        title = t;
        author = a;
        content = c;
    }

    void show() {
        title.show();
        author.show();
        content.show();
    }
}

class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.add(new Title(), new Author(), new Content());
        book.show();
    }
}
