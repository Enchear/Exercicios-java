public class ConversaoNumeroString{
    public static void main(String[] args) {
        Integer i = 10000;
        System.out.println(i.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + i).length()); 
        System.out.println(("" + num2).length()); 
        /*e possivel converter numeros em String usando long,double,short e os outros tipos de numeros.  */
    }
 }

