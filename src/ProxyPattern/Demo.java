package ProxyPattern;

public class Demo {
    public static void main(String[] args) {
        BookParserProxy bookParserProxy = new BookParserProxy("Lord Of The Rings");
        bookParserProxy.getNumberOfPages();
    }
}
