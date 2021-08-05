package ProxyPattern;

public class BookParser implements IBookParser{
    private String book;

    public BookParser(String book) {
        this.book = book;
        System.out.println("Now, I am called");
        //EXPENSIVE OPERATIONS
    }

    @Override
    public int getNumberOfPages() {
        return 0;
    }
}
