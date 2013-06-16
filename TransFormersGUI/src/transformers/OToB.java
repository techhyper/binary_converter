/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transformers;

/**
 *
 * @author ^O^
 */
public class OToB {
    private String oct,bin,show="";
    public void setOct(String oc){
       oct=oc;
    }
    public String getOct(){
        return oct;
    }
    public String getShowOctBin(){
        OToB();
        return show;
    }
    private void OToB(){
        for(int i=oct.length()-1;i>=0;i--){      
           if(oct.charAt(i)=='0')
               bin="000";
           else if(oct.charAt(i)=='1')
               bin="001";
           else if(oct.charAt(i)=='2')
               bin="010";
           else if(oct.charAt(i)=='3')
               bin="011";
           else if(oct.charAt(i)=='4')
               bin="100";
           else if(oct.charAt(i)=='5')
               bin="101";
           else if(oct.charAt(i)=='6')
               bin="110";
           else if(oct.charAt(i)=='7')
               bin="111";
           show=bin+show;
        }      
    }
}


