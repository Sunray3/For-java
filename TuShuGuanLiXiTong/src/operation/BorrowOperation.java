package operation;
import com.book.Book;
import  com.book.BookList;
public class BorrowOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("输入借阅的书名");
        String name = scan.next();
        int i = 0;
        Book book = null;
        for (; i < bookList.getUsedSize(); i++) {
            book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUsedSize()){
            System.out.println("没有这本书");
            return;
        }
        book = bookList.getBook(i);
        if(book.isBorrowed()){
            System.out.println("此书已被借出");
        }else{
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}
