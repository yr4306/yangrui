import java.util.*;

class Book {
    int id;
    String title;
    String genre;

    public Book(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', genre='" + genre + "'}";
    }
}

class LibrarySystem {
    private List<Book> bookList = new ArrayList<>();
    private Set<String> genreSet = new HashSet<>();
    private Map<Integer, Book> bookMap = new HashMap<>();

    public void addBook(Book book) {
        bookList.add(book);
        genreSet.add(book.genre);
        bookMap.put(book.id, book);
    }

    public void removeBooksByKeyword(String keyword) {
        Iterator<Book> it = bookList.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.contains(keyword) || b.genre.contains(keyword)) {
                it.remove();
                bookMap.remove(b.id);
            }
        }

        // 重建流派集合
        genreSet.clear();
        for (Book b : bookList) {
            genreSet.add(b.genre);
        }
    }

    public void displayStatus() {
        System.out.println("图书列表：" + bookList);
        System.out.println("流派集合：" + genreSet);
        System.out.println("ID映射：" + bookMap);
    }
}