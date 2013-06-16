/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transformers;

/**
 *
 * @author ^O^
 */
public class BToD {
    private int dec=0;
    private String bin;
    public void setBin(String bi){
        bin=bi;
    }
    public String getBin(){
        return bin;
    }
    public int getShowBiDec(){
        BToD();
        return dec;
    }
    private void BToD(){
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='1'){
                int fuel=bin.length()-1-i;
                dec+=Math.pow(2, fuel);
            }
        }
    }
}

