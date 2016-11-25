/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author andra
 */
public class koneksi {
public Connection con;
    public Statement stat;

    public void konek(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/peminjaman","root","");
            stat=con.createStatement();
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null, "Not Connect "+x.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
}
