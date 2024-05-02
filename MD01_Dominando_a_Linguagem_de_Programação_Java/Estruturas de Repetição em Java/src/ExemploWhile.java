public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        double mesada = 50.00;
        double doce = 1.50;
        int contador = 0; // Inicializando o contador
            
        while (mesada >= doce) {
            mesada = mesada - doce;
            contador++; // Incrementando o contador
            System.out.println("Valor da mesada é " + mesada);
        }
            
            System.out.println("Foram comprados " + contador + " doces.");
        }

         /* 
        String sigla = "M";
       
        switch (sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");

        }
        */
 }