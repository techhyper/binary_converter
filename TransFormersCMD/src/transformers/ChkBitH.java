/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transformers;

/**
 *
 * @author ^O^
 */
public class ChkBitH {
    private String input;
    private int output;
    public void setInput(String in){
        input=in;
        input=input.toUpperCase();
    }
    public String getInput(){
        return input;
    }
    public int getOutput(){
        Chk();
        return output;
    }
    public void Chk(){
       for(int l=input.length()-1;l>=0;l--){
           if(input.charAt(l)=='0')
               output=1;
           else if(input.charAt(l)=='1')
               output=1;
           else if(input.charAt(l)=='2')
               output=1;
           else if(input.charAt(l)=='3')
               output=1;
           else if(input.charAt(l)=='4')
               output=1;
           else if(input.charAt(l)=='5')
               output=1;
           else if(input.charAt(l)=='6')
               output=1;
           else if(input.charAt(l)=='7')
               output=1;
           else if(input.charAt(l)=='8')
               output=1;
           else if(input.charAt(l)=='9')
               output=1;
           else if(input.charAt(l)=='A')
               output=1;
           else if(input.charAt(l)=='B')
               output=1;
           else if(input.charAt(l)=='C')
               output=1;
           else if(input.charAt(l)=='D')
               output=1;
           else if(input.charAt(l)=='E')
               output=1;
           else if(input.charAt(l)=='F')
               output=1;
           else {
               output=0;
               l=0;
           }
       }
    }
}
