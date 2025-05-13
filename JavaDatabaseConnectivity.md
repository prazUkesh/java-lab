# JDBC Java Database Connectivity
- JDBC is used to connect java applications to the database and make connection.

### Steps Involved
1. Load te database driver
`` Class.forName("drivername");``
2. Create Connection to the data base
``  Connection con-DriverManager.getConnection(url, username, password); ``
3. create SQL query and execute it
```
  String sql='any query";
  Statement st = con.createStatement();
st.execute(sql); //throws SQLException
 ```
4. Close the connection
`` con.close();`` // throws SQLExecution

`` mysql -u root``
creating databasem table and fileds
```

create database bca3;
use bca3;
create table student(
  id int primary key,
  name VARCHAR(50),
  faculty VARCHAR(20)
);

```

```
// updating
String sql = "update student set faculty='BIM" where ID = 101";
// deleting
String sql = "delete from student where id=102";
```

```
import java.sql.*;

public class InsertClass{
    public static void main(String[] args) {
        String url="url goes here";
        String username = "";
        String password = "";

        try{
            Class.forName("com.mysql, jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username,password);
            String sql="insert into student(id,name,faculty) value(102,'hari','BCA')";
            Statement st = con.createStatement();
            st.execute(sql);
            con.close();

        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
```
