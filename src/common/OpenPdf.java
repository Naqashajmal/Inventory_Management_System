
package common;

import connec.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class OpenPdf {
    public static void OpenById(String id){
        try{
            if((new File(InventoryUtils.billPath+id+".pdf")).exists()){
                Process p=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+InventoryUtils.billPath+""+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File doesnot exist");
            }
        }
    
catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
}
