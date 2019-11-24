package user;
import com.book.BookList;
import operation.IOperation;

public abstract class User {
    public String name;
    //IOperation-->实现了这个接口的类都可以存放进去
    public IOperation[] operations;
    // 根据用户选项执行操作
    public void doOperation(int choice,BookList bookList){
        operations[choice].work(bookList);
    }
    public abstract int  menu();
}
