import java.sql.SQLException;

public class BookDelete {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        BookDao dao = new BookDao();
        dao.delete(1);
        dao.close();
    }
}
