public class TiposPrimitivos{
    public static void main(String[] args) {
        // informaçoes do funcionario
        //tipos numericos inteiros

        byte anosDeEmpresa= 23;
        short numerodeVoos= 542;
        int id= 56789;
        long pontosAcumulados= 3_134_967_342L;

        //tipos numericos reais
        float salario= 11_445.44F;
        double vendasAcumuladas=2_991_798_103.01;

        //tipo booleano
        boolean estaDeFerias= false;
        //tipo caracter
        char status='A';

        //dias de empresa
        System.out.println(anosDeEmpresa*365);
        //numeros de viagens
        System.out.println(numerodeVoos /2);
        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + ": ganha ->"+ salario);
        System.out.println("Ferias? "+ estaDeFerias);
        System.out.println("Status: "+status);
        }
}