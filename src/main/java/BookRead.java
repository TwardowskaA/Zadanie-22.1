import java.sql.SQLException;

public class BookRead {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        BookDao dao = new BookDao();
        Book book = dao.read(12345676);
        System.out.println(book);
        dao.close();
    }
}
