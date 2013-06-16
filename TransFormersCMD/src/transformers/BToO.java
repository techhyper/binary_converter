/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transformers;

/**
 *
 * @author ^O^
 */
public class BToO {
    private int oct=0;
    private String bin,show="";
    public void setBin(String bi){
        bin=bi;
    }
    public String getBin(){
        return bin;
    }
    public String getShowBiOct(){
        BToO();
        return show;
    }
    private void BToO(){
        for(int i=bin.length()-1;i>=0;i--){            
                if(bin.charAt(i)=='1'){
                    int fuel=bin.length()-1-i;
                    oct+=Math.pow(2, fuel);
                }
                if(i==bin.length()-3){
                    show=String.valueOf(oct)+show;
                    bin=bin.substring(0, bin.length()-3);
                    oct=0;
                }            
        }
        if(oct!=0)
            show=oct+show;

    }
}
