
package combox;

import com.mycompany.viveropensamiento.conexionbd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class combobox {
    public void rellenarcombo(String tabla, String valor, JComboBox combo){
        String sql = "SELECT * FROM " + tabla;
        Statement St;
        //conexionbd con = new conexionbd();
        Connection con = conexionbd.conectar();
        combo.removeAllItems();
        combo.addItem("Seleccione:");
        try{
            St = con.createStatement();
            ResultSet rs = St.executeQuery(sql);
            while (rs.next()){
                
                combo.addItem(rs.getString(valor));
            }
                
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Errot" + e.toString());
            
        }
    }
    
}
