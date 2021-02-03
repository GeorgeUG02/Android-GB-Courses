import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class DBExample {
    private static Connection connection;
    private static Statement statement;
    private static String primaryLoad="CREATE TABLE IF NOT EXISTS cats (CatID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,Name TEXT NOT NULL,Color TEXT NOT NULL,Age INTEGER NOT NULL);";
    private static PreparedStatement ps;
    private static String preparedStr="insert into cats(Name,Color,Age) values (?,?,?)";
    private static String updateStr="update cats set Name='Vasya' where color='Green'";
    private static String deleteStr="delete from cats where Name='Vasya'";
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        connect();
        statement=connection.createStatement();
        statement.execute(primaryLoad);
        Cat[] cats ={new Cat("Murzik","White",12),new Cat("Barsik","Black",5),new Cat("Pushok","Green",8)};
        addCats(cats);
        retrieveCats();
        updateCats();
        retrieveCats();
        deleteCats();
        retrieveCats();
        close();
    }

    private static void deleteCats() throws SQLException {
        statement.execute(deleteStr);
    }

    private static void updateCats() throws SQLException {
        statement.execute(updateStr);
    }

    private static void retrieveCats() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from cats");
        ArrayList <Cat> a=new ArrayList<>();
        while(rs.next()){
            Cat cat=new Cat(rs.getString(2),rs.getString(3),rs.getInt(4));
            a.add(cat);
        }
        for (Cat cat:a){
            System.out.println(cat);
        }
    }

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection= DriverManager.getConnection("jdbc:sqlite:Cats.db");
    }

    private static void addCats(Cat[] cats) throws SQLException {
          ps=connection.prepareStatement(preparedStr);
          for (Cat cat:cats){
              ps.setString(1,cat.getName());
              ps.setString(2,cat.getColor());
              ps.setInt(3,cat.getAge());
              ps.executeUpdate();
          }
    }

    private static void close() throws SQLException {
        connection.close();
    }
}
