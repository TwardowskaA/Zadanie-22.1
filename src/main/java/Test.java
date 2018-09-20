import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Book book = new Book(1, "ABCD", "XYZ", 1994, 12345676);
        BookDao dao = new BookDao();
        dao.save(book);
        Book book1 = new Book(1,"CDEF","ABC",1234,123124524);
        dao.update(book1);
        dao.read(123124524);
        dao.delete(1);
        dao.close();
    }
}