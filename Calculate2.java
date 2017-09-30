public class Calculate2 {
    public static void main (String[] args){
        System.out.println("Calculate...");
        if(args[1].equals("+"))
        {
            System.out.println("itog " + (Integer.valueOf(args[0]) + Integer.valueOf(args[2])));
        }
        if(args[1].equals("-"))
        {
            System.out.println("itog " + (Integer.valueOf(args[0]) - Integer.valueOf(args[2])));
        }
        if(args[1].equals("x"))
        {
            System.out.println("itog " + Double.valueOf(args[0]) * Double.valueOf(args[2]));
        }
        if(args[1].equals("/"))
        {
            System.out.println("itog " + Double.valueOf(args[0]) / Double.valueOf(args[2]));
        }

        if(args[1].equals("v"))
        {
            System.out.println("itog " + Math.pow(Integer.valueOf(args[0]),Integer.valueOf(args[2])));
        }


    }
}