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
