
import java.sql.*;
import java.util.*;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> list=new ArrayList<>();
        try(Connection con=DBConnection.getConnection()){
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from books");
            while(rs.next()){
                list.add(new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
            }
        }catch(Exception e){e.printStackTrace();}
        return list;
    }

    public void addBook(String title,String author,int copies){
        try(Connection con=DBConnection.getConnection()){
            PreparedStatement ps=con.prepareStatement("insert into books(title,author,copies) values(?,?,?)");
            ps.setString(1,title);
            ps.setString(2,author);
            ps.setInt(3,copies);
            ps.executeUpdate();
        }catch(Exception e){e.printStackTrace();}
    }
}
