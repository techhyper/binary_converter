/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transformers;

/**
 *
 * @author ^O^
 */
public class DToB {
    private String bin;
    private int dec;
    public void setDec(int dc){
       dec=dc;
    }
    public int getDec(){
        return dec;
    }
    public String getShowDecBin(){
        DToB();
        return bin;
    }
    private void DToB(){
        bin="";
        while(dec!=0){
            if(bin.length()%5==0)
                bin=""+bin;
                bin=(dec%2)+bin;
                dec=dec/2;
        }
        }
    }


