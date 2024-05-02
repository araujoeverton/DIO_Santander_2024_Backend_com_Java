public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo= 26.50;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Seu saldo é R$ "+ saldo);
        }    
        else
            System.out.println("Saldo insuficiente");
    }
}
