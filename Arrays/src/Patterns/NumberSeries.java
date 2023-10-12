package Patterns;

public class NumberSeries {

    private static void seriesPrint(int range) {
        int sign = 1; 
        double value = 1.0; 
        System.out.print(" 1 ");
        
        for (int i = 0; i <= range; i++) {
        	
            int denominator = 2 * i + 1;
            
            if (denominator <= range) {
                System.out.print((sign == 1 ? " + " : " - ") + "1/" + denominator);
                value += sign * 1.0 / denominator; 
                sign *= -1; 
            } 
        }
        System.out.print(" : "+value);
    }

    public static void main(String[] args) {
        seriesPrint(10); 
    }
}
