/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transformers;

/**
 *
 * @author ^O^
 */
public class BToH {
    private int hex=0;
    private String bin,show="";
    public void setBin(String bi){
        bin=bi;
    }
    public String getBin(){
        return bin;
    }
    public String getShowBiHex(){
        BToH();
        return show;
    }
    private void BToH(){
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='1'){
                int fuel=bin.length()-1-i;
                hex+=Math.pow(2, fuel);
            }
            if(i==bin.length()-4){
                if(hex==15)
                    show='F'+show;
                else if(hex==14)
                    show='E'+show;
                else if(hex==13)
                    show='D'+show;
                else if(hex==12)
                    show='C'+show;
                else if(hex==11)
                    show='B'+show;
                else if(hex==10)
                    show='A'+show;
                else show=String.valueOf(hex)+show;
                bin=bin.substring(0, bin.length()-4);
                hex=0;
            }
        }
        if(hex!=0)
            show=hex+show;

    }
}
