public class ConversaoTiposPrimitivos{
    public static void main(String[] args) {
        
        double a = 1; //conversão impliita
        System.out.println(a); 
        
        float b = (float) 1.123458876368876; //conversão explicita (cast)
        System.out.println(b);

        int c =345; 
        byte d= (byte)c; //conversão explicita (cast)
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e; //conversão explicita (cast)
        System.out.println(f);
    }   
}