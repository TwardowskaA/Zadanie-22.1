import java.sql.SQLException;

public class BookUpdate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        BookDao dao = new BookDao();
        Book book= dao.read(12345676);
        book.setTitle("Fajna książka");
        dao.update(book);
        dao.close();

    }
}
