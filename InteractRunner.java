import javax.sound.midi.Soundbank;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            String last = "no";
            boolean start = true;
            while (!exit.equals("yes")) {
                if(start==false) {
                System.out.println("Take result : yes/no ");
                last = reader.next();}

                String first = "";
                if(last.equals("no")){
                calc.cleanResult();
                System.out.println("enter first arg : ");
                first = reader.next();}
                if(last.equals("yes")){
                first = "" + calc.getResult();
                calc.cleanResult();}

                System.out.println("enter second arg : ");
                String second = reader.next();
                System.out.println("enter operation : ");
                String oper = reader.next();
                if(oper.equals("+")) {calc.sum(Double.parseDouble(first),Double.parseDouble(second));}
                if(oper.equals("-")) {calc.subtraction(Double.parseDouble(first),Double.parseDouble(second));}
                if(oper.equals("*")) {calc.multiplication(Double.parseDouble(first),Double.parseDouble(second));}
                if(oper.equals("/")) {calc.division(Double.parseDouble(first),Double.parseDouble(second));}
                if(oper.equals("^")) {calc.exponentiation(Double.parseDouble(first),Double.parseDouble(second));}

                System.out.println("Result : " + calc.getResult());


                System.out.println("Exit : yes/no ");
                exit = reader.next();
                start = false;

            }

        } finally {
            reader.close();
            }
    }
}


