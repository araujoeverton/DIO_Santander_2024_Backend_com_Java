public class ExemploForArray {
    public static void main(String[] args) throws Exception {
        String alunos [] = {"Felipe", "Jonas", "Diego", "Lucas", "Maria", "Julia" };
        
        for(String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }

        /*
        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);
        }
        */
    }
}
