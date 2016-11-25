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
public class Filter1 extends PlainDocument {

  public static final String numeric = "0123456789";
  public static final String huruf = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXXYZ";
  protected String acceptedChars = null;
  protected boolean negativeAccepted = false;
    private int max;

  public Filter1(String acceptedchars,int n) {
    acceptedChars = acceptedchars;
        max=n;
  }

  public void setNegativeAccepted(boolean negativeaccepted) {
    if (acceptedChars.equals(numeric) || (acceptedChars.equals(huruf))){
      negativeAccepted = negativeaccepted;
      acceptedChars += "-";
    }

  }

    @Override
  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null)
      return;

    for (int i = 0; i < str.length(); i++) {
      if (acceptedChars.indexOf(str.valueOf(str.charAt(i))) == -1)
        return;
    }

    if (negativeAccepted && str.indexOf("-") != -1) {
      if (str.indexOf("-") != 0 || offset != 0) {
        return;
      }
    }

        if(max==0)  {
            super.insertString(offset, str, attr);
        }
        else {
            int Panjangmasuk=str.length();
            int PanjangMax = getLength();
            if( (Panjangmasuk+PanjangMax)> max) {

            }
            else super.insertString(offset, str, attr);
        }

  }

}
