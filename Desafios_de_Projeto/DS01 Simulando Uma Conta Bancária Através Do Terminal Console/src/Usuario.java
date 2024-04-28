public class Usuario {
    int conta;
    int agencia;
    String nome;
    double saldo;
    double deposito;
    double saque;
    

    // Metodos 
    public void depositar(){
       saldo = saldo + deposito;
    }
    public void sacar(){
        saldo = saldo - saque;
    }    
    public void visualizarExtrato(){
        System.out.println("Seu saldo atual é de " + saldo);
    }    
}
