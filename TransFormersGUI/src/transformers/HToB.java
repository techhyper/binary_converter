/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transformers;

/**
 *
 * @author ^O^
 */
public class HToB {
    private String hex,bin,show="";
    public void setHex(String hx){
       hex=hx;
       hex=hex.toUpperCase();
    }
    public String getHex(){
        return hex;
    }
    public String getShowHexBin(){
        HToB();
        return show;
    }
    private void HToB(){
        for(int i=hex.length()-1;i>=0;i--){
           if(hex.charAt(i)=='0')
               bin="0000";
           else if(hex.charAt(i)=='1')
               bin="0001";
           else if(hex.charAt(i)=='2')
               bin="0010";
           else if(hex.charAt(i)=='3')
               bin="0011";
           else if(hex.charAt(i)=='4')
               bin="0100";
           else if(hex.charAt(i)=='5')
               bin="0101";
           else if(hex.charAt(i)=='6')
               bin="0110";
           else if(hex.charAt(i)=='7')
               bin="0111";
           else if(hex.charAt(i)=='8')
               bin="1000";
           else if(hex.charAt(i)=='9')
               bin="1001";
           else if(hex.charAt(i)=='A')
               bin="1010";
           else if(hex.charAt(i)=='B')
               bin="1011";
           else if(hex.charAt(i)=='C')
               bin="1100";
           else if(hex.charAt(i)=='D')
               bin="1101";
           else if(hex.charAt(i)=='E')
               bin="1110";
           else if(hex.charAt(i)=='F')
               bin="1111";
           show=bin+show;
        }
    }
}
