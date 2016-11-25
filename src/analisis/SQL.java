/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analisis;
import sql.koneksi;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author andra
 */
public class SQL {
koneksi koneksi=new koneksi();

    public int bnyTransaksi(){
        int jml=0;
        try{
            koneksi.konek();
            ResultSet set=koneksi.stat.executeQuery("select count(no_transaksi) from tbl_transaksi ");
            while(set.next()){
                jml=set.getInt("count(no_transaksi)");
            }
            set.close();
            koneksi.stat.close();
            koneksi.con.close();
        }
        catch(Exception z) { JOptionPane.showMessageDialog(null, z.getMessage());}
        return jml;
    }

    public int c2(String a,String b){
        int jml=0;
        try{
            koneksi.konek();
            ResultSet set=koneksi.stat.executeQuery("select COUNT(DISTINCT no_transaksi)as ddd from tbl_transaksi_det "+
                                                    "where "+
                                                    "no_transaksi in ( select no_transaksi from tbl_transaksi_det where kode_buku='"+a+"') "+
                                                    "and "+
                                                    "no_transaksi in ( select no_transaksi from tbl_transaksi_det where kode_buku='"+b+"')");
            while(set.next()){
                jml=set.getInt("ddd");
            }
            set.close();
            koneksi.stat.close();
            koneksi.con.close();
        }
        catch(Exception x){JOptionPane.showMessageDialog(null, x.getMessage());}
        return jml;
    }


    public int c3(String a,String b,String c){
        int jml=0;
        try{
            koneksi.konek();
            ResultSet set=koneksi.stat.executeQuery("select count(DISTINCT no_transaksi) from tbl_transaksi_det "+
                                                    "where "+
                                                    "no_transaksi in ( select no_transaksi from tbl_transaksi_det where kode_buku='"+a+"') "+
                                                    "and "+
                                                    "no_transaksi in ( select no_transaksi from tbl_transaksi_det where kode_buku='"+b+"') "+
                                                    "and "+
                                                    "no_transaksi in ( select no_transaksi from tbl_transaksi_det where kode_buku='"+c+"')");
            while(set.next()){
                jml=set.getInt("count(DISTINCT no_transaksi)");
            }
            set.close();
            koneksi.stat.close();
            koneksi.con.close();
        }
        catch(Exception z){JOptionPane.showMessageDialog(null, z.getMessage());}
        return jml;
    }
}
