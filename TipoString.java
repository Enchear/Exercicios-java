public class TipoString{
    public static void main(String[] args) {
        System.out.println("Olá pessoal". charAt(2));
        String s ="boa tarde";
        s= s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s +"!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));


        var nome= "Pedro";
        var sobrenome= "Santos";
        var idade= 23;
        var salario= 1234.987;
        System.out.println("Nome\n"+ nome +"\nsobrenome\n"+ sobrenome +"\nidade\n" +idade+"\nSalario\n" +salario);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %2f.", nome,sobrenome,idade,salario);

        String frase= String.format("O senhor %s %s tem %d anos e ganha R$ %2f.", nome,sobrenome,idade,salario);
        System.out.println(frase);
        System.out.println("frase qualquer".contains("qual"));
        System.out.println("frase qualquer".indexOf("qual"));
        System.out.println("frase qualquer".substring(6));
        System.out.println("farse qualquer".substring(6,8));

    }
}