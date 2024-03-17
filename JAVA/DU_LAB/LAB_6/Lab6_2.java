import java.lang.String;

class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return null;
    }

    public String display() {
        return "Author Name: " + authorName;
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String display() {
        return super.display() + "\nTitle: " + title;
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String display() {
        return super.display() + "\nTitle: " + title;
    }
}

public class Lab6_2 {
    public static void main(String[] args) {
        Book book = null;
        if (args.length >= 2) {
            String authorName = args[0];
            String title = args[1];
            if (args.length == 3 && args[2].equalsIgnoreCase("book")) {
                book = new BookPublication(authorName, title);
            } else if (args.length == 3 && args[2].equalsIgnoreCase("paper")) {
                book = new PaperPublication(authorName, title);
            } else {
                book = new BookPublication(authorName, title);
            }
        }

        if (book != null) {
            System.out.println(book.display());
        } else {
            System.out.println("Please input author name and title.");
        }
    }
}