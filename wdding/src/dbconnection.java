

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class dbconnection {
   static  String id;
    public static boolean  login(String username,String password) {
        boolean f=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/weddingPlanner", "root", "12345");
            Statement s = c.createStatement();
           s.execute("select id,username,password from user ");
           ResultSet rs=s.getResultSet();
           while(rs.next()){
               System.out.println(rs.getString(2) +""+rs.getString(3));
               if(rs.getString(2).equals(username)&&rs.getString(3).equals(password)){
                   
                   id=rs.getString(1);
                   f=true;
               }
           }
            s.close();
            c.close();
            System.out.println("added");
        } catch (ClassNotFoundException ex) {
            System.out.println("class error");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return f;
    }
    
    public static void conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/weddingPlanner", "root", "12345");
            Statement s = c.createStatement();
            s.execute("Insert into user values(5,8870780,'AAAA',20,'aaa20-2222','null')");
            s.execute("select * from user");
            ResultSet rs = s.getResultSet();

            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getString(4) + "\t");
                System.out.println(rs.getString(5));
            }
            s.close();
            c.close();
            System.out.println("added");
        } catch (ClassNotFoundException ex) {
            System.out.println("class error");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    // 
    public static void insert(String id,String contactnum, String name, String age, String username, String password) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/weddingPlanner", "root", "12345");
            Statement s = c.createStatement();
            s.execute(String.format("Insert into user values(%s,'%s','%s',%s,'%s','%s')", id,contactnum, name, age, username, password));
            s.close();
            c.close();

            System.out.println("added");
        } catch (ClassNotFoundException ex) {
            System.out.println("class error");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
       try {
        Integer.parseInt(id);    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "invalid id");
        }
        try {
        Integer.parseInt(contactnum);    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "invalid contactnum");
        }
        
        try {
        Integer.parseInt(age);    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "invalid age");
        }
        
                for (int i = 0; i < name.length(); i++) {
            if((name.charAt(i)<'a'&&name.charAt(i)>'z')||(name.charAt(i)<'A'&&name.charAt(i)>'Z')){
                JOptionPane.showMessageDialog(null, "invalid name");
                return;
            }
        }
                
    }

    public static String[] getuserdata() {

        try {
            String S[]=new String[2];
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/weddingPlanner", "root", "12345");
            Statement s = c.createStatement();
            s.execute("select name,contactnum from user where id ="+id);
            ResultSet rs = s.getResultSet();
            rs.next();
            S[0]=rs.getString(1);
            S[1]=rs.getString(2);
            s.close();
            c.close();
            return S;
        } catch (ClassNotFoundException ex) {
            System.out.println("class error");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return null;
    }
    
    
}

