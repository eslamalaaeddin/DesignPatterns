package ProxyPattern;

public class BookParserProxy implements IBookParser{
    private BookParser bookParser;
    private String book;

    public BookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if (bookParser == null) bookParser = new BookParser(book);
        return bookParser.getNumberOfPages();
    }
}
