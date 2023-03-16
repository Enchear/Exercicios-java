public class NotacaoPonto{
    public static void main(String[] args) {
        String s="bom dia X";
        s = s.toUpperCase();
       
        s.replace("X", "Senhora");
        s= s.toUpperCase();
        s= s.concat("!!!");
        System.out.println(s);
       String x= "Leo".toUpperCase();
       System.out.println(x);

       String y = "Bom dia X".replace("X", "Rani").toUpperCase().concat("!!!");
       System.out.println(y);

       //tipos primitivos não tem o operador "ponto"

       int a=3;
      System.out.println(a);
    }
}