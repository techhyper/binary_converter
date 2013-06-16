/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transformers;

//import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QDecoderStream;
import java.util.Scanner;

/**
 *
 * @author ^O^
 */
public class TransFormersCMD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Quid;
        int ex;
            Scanner key=new Scanner(System.in);
            TransFormersCMD run=new TransFormersCMD();
        do{
            System.out.println("==============================================================");
            System.out.println("");
            run.Trans();
            System.out.println("");
            System.out.println("==============================================================");
            System.out.print("        Press anykey to continue.Press 'Q' to exit: ");
            Quid=key.nextLine();
            Quid=Quid.toUpperCase();
            if(Quid.equals("Q"))
                ex=1;
            else ex=0;

        }
            while(ex==0);
    }
    public void Trans(){
        String Num,NumHex,NumOct,NumBin,NumDec;
        int bsin,bsout,loop=0;        
            Scanner ent=new Scanner(System.in);
         try{
            System.out.print("Enter your number here: ");
            Num=ent.nextLine();
        do{
            System.out.print("Enter your number base: ");
            bsin=ent.nextInt();
            System.out.print("     Enter output base: ");
            bsout=ent.nextInt();
            if((bsin==2&&bsout==2)||(bsin==2&&bsout==8)||(bsin==2&&bsout==10)||(bsin==2&&bsout==16))               
                loop=1;
            else if((bsin==8&&bsout==2)||(bsin==8&&bsout==8)||(bsin==8&&bsout==10)||(bsin==8&&bsout==16))                
                loop=1;
            else if((bsin==10&&bsout==2)||(bsin==10&&bsout==8)||(bsin==10&&bsout==10)||(bsin==10&&bsout==16))                
                loop=1;
            else if((bsin==16&&bsout==2)||(bsin==16&&bsout==8)||(bsin==16&&bsout==10)||(bsin==16&&bsout==16))
                loop=1;
            else {
                System.out.println("**************************************************************");
                System.out.println("Data was wrong input base with numbers '2' '8' '10' '16' only.");
                System.out.println("---------------------|Please try a again|---------------------");
                System.out.println("**************************************************************");
                loop=0;
            }
         }
        while(loop==0);        
            NumOct=Num;
            NumHex=Num;
            NumBin=Num;
            NumDec=Num;
            ChkBitB ChkBin=new ChkBitB();
            ChkBitH ChkHex=new ChkBitH();
            ChkBitO ChkOct=new ChkBitO();
            ChkBitD ChkDec=new ChkBitD();
            BToD BinToDec=new BToD();
            BToH BinToHex=new BToH();
            BToO BinToOct=new BToO();
            DToB DecToBin=new DToB();
            HToB HexToBin=new HToB();
            OToB OctToBin=new OToB();
            if(((bsin==2)&&(bsout==2))||((bsin==8)&&(bsout==8))||((bsin==10)&&(bsout==10))||((bsin==16)&&(bsout==16))){
                    if(((bsin==2)&&(bsout==2))){
                        ChkBin.setInput(NumBin);
                        if(ChkBin.getOutput()==1){
                            System.out.println("Binary answer: "+NumBin);
                        }
                        if(ChkBin.getOutput()==0)
                            System.out.println("Insert binary numbers with '0' or '1' only. ");
                    }
                    else if(((bsin==8)&&(bsout==8))){
                        ChkOct.setInput(NumOct);
                        if(ChkOct.getOutput()==1){
                            System.out.println("Octal answer: "+NumOct);
                        }
                        if(ChkOct.getOutput()==0)
                            System.out.println("Insert octal numbers with '0'  to  '7' only. ");
                    }
                    else if(((bsin==10)&&(bsout==10))){
                        ChkDec.setInput(NumDec);
                        if(ChkDec.getOutput()==1){
                            System.out.println("Decimal answer: "+NumDec);
                        }
                        if(ChkDec.getOutput()==0)
                            System.out.println("Insert decimal numbers with '0' to '9' only. ");
                    }
                    else {
                        ChkHex.setInput(NumHex);
                        if(ChkHex.getOutput()==1){
                        System.out.println("Hexadecimal answer: "+(NumHex=NumHex.toUpperCase()));
                        }
                        if(ChkHex.getOutput()==0)
                        System.out.println("Insert hexadecimal numbers with '0' to 'F' only. ");
                    }
            }
            else if(((bsin==2)&&(bsout==8))){
                    ChkBin.setInput(NumBin);
                    if(ChkBin.getOutput()==1){
                        BinToOct.setBin(NumBin);
                        System.out.println("Octal answer: "+BinToOct.getShowBiOct());
                    }
                    if(ChkBin.getOutput()==0)
                        System.out.println("Insert binary numbers with '0' or '1' only. ");
            }
            else if(((bsin==2)&&(bsout==10))){
                    ChkBin.setInput(NumBin);
                    if(ChkBin.getOutput()==1){
                        BinToDec.setBin(NumBin);
                        System.out.println("Decimal answer: "+String.valueOf(BinToDec.getShowBiDec()));
                    }
                    if(ChkBin.getOutput()==0)
                        System.out.println("Insert binary numbers with '0' or '1' only. ");
            }
            else if(((bsin==2)&&(bsout==16))){
                    ChkBin.setInput(NumBin);
                    if(ChkBin.getOutput()==1){
                        BinToHex.setBin(NumBin);
                        System.out.println("Hexadecimal answer: "+BinToHex.getShowBiHex());
                    }
                    if(ChkBin.getOutput()==0)
                        System.out.println("Insert binary numbers with '0' or '1' only. ");
            }
            else if(((bsin==8)&&(bsout==2))){
                    ChkOct.setInput(NumOct);
                    if(ChkOct.getOutput()==1){
                        OctToBin.setOct(NumOct);
                        System.out.println("Binary answer: "+OctToBin.getShowOctBin());
                    }
                    if(ChkOct.getOutput()==0)
                        System.out.println("Insert octal numbers with '0'  to  '7' only. ");
            }
            else if(((bsin==8)&&(bsout==10))){
                    ChkOct.setInput(NumOct);
                    if(ChkOct.getOutput()==1){
                        OctToBin.setOct(NumOct);
                        BinToDec.setBin(OctToBin.getShowOctBin());
                        System.out.println("Decimal answer: "+String.valueOf(BinToDec.getShowBiDec()));
                    }
                    if(ChkOct.getOutput()==0)
                        System.out.println("Insert octal numbers with '0' to '7' only. ");
            }
            else if(((bsin==8)&&(bsout==16))){
                    ChkOct.setInput(NumOct);
                    if(ChkOct.getOutput()==1){
                        OctToBin.setOct(NumOct);
                        BinToHex.setBin(OctToBin.getShowOctBin());
                        System.out.println("Hexadecimal answer: "+BinToHex.getShowBiHex());
                    }
                    if(ChkOct.getOutput()==0)
                        System.out.println("Insert octal numbers with '0' to '7' only. ");
            }
            else if(((bsin==10)&&(bsout==2))){
                    ChkDec.setInput(NumDec);
                    if(ChkDec.getOutput()==1){
                        int Nd=Integer.parseInt(NumDec);
                        DecToBin.setDec(Nd);
                        System.out.println("Binary answer: "+DecToBin.getShowDecBin());
                    }
                    if(ChkDec.getOutput()==0)
                        System.out.println("Insert decimal numbers with '0' to '9' only. ");
            }
            else if(((bsin==10)&&(bsout==8))){
                    ChkDec.setInput(NumDec);
                    if(ChkDec.getOutput()==1){
                        int Nd=Integer.parseInt(NumDec);
                        DecToBin.setDec(Nd);
                        BinToOct.setBin(DecToBin.getShowDecBin());
                        System.out.println("Octal answer: "+BinToOct.getShowBiOct());
                    }
                    if(ChkDec.getOutput()==0)
                        System.out.println("Insert decimal numbers with '0' to '9' only. ");
            }
            else if(((bsin==10)&&(bsout==16))){
                    ChkDec.setInput(NumDec);
                    if(ChkDec.getOutput()==1){
                        int Nd=Integer.parseInt(NumDec);
                        DecToBin.setDec(Nd);
                        BinToHex.setBin(DecToBin.getShowDecBin());
                        System.out.println("Hexadecimal answer: "+BinToHex.getShowBiHex());
                    }
                    if(ChkDec.getOutput()==0)
                        System.out.println("Insert decimal numbers with '0' to '9'. ");
            }
            else if(((bsin==16)&&(bsout==2))){
                    ChkHex.setInput(NumHex);
                    if(ChkHex.getOutput()==1){
                        HexToBin.setHex(NumHex);
                        System.out.println("Binary answer: "+HexToBin.getShowHexBin());
                    }
                    if(ChkHex.getOutput()==0)
                        System.out.println("Insert hexadecimal numbers with '0'  to  'F' only. ");
            }
            else if(((bsin==16)&&(bsout==8))){
                    ChkHex.setInput(NumHex);
                    if(ChkHex.getOutput()==1){
                        HexToBin.setHex(NumHex);
                        BinToOct.setBin(HexToBin.getShowHexBin());
                        System.out.println("Octal answer: "+BinToOct.getShowBiOct());
                    }
                    if(ChkHex.getOutput()==0)
                        System.out.println("Insert hexadecimal numbers with '0' to 'F' only. ");
            }
            else{
                    ChkHex.setInput(NumHex);
                    if(ChkHex.getOutput()==1){
                        HexToBin.setHex(NumHex);
                        BinToDec.setBin(HexToBin.getShowHexBin());
                        System.out.println("Decimal answer: "+String.valueOf(BinToDec.getShowBiDec()));
                    }
                    if(ChkHex.getOutput()==0)
                        System.out.println("Insert hexadecimal numbers with '0' to 'F' only. ");
            }
        }
         catch(Exception e){
             System.out.println("Data was wrong.Please try a again. ");
         }
    }
}
