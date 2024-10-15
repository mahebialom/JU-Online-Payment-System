/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dipu;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DIPU
 */
public class JU_Fees_Management {

    public static void main(String[] args) {
        progressbarframe p = new progressbarframe();
        Homepage h=new Homepage();
        p.setVisible(true);
         
        for(int i=1;i<=100;i++)
        {
            try {
                Thread.sleep(10);
                p.ProgressBar.setValue(i);
                if(i%2==0){
                p.pleasewait.setText("Please Wait..");
                }
                else{
                     p.pleasewait.setText("Please Wait...");
                }
                if(i==100){
                p.setVisible(false);
                h.setVisible(true);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(JU_Fees_Management.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                
            } catch (Exception e) {
            }
        }
    }
}
