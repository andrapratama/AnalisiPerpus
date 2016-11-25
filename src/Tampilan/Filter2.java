/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tampilan;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author FUCK_HIM
 */
public class Filter2 extends PlainDocument{
    
    int max;
    public Filter2(int n){
        max=n;
    }


    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(str==null) return;

        if ((getLength() + str.length()) <= max) {
            super.insertString(offs, str, a);
        }
    }


}
