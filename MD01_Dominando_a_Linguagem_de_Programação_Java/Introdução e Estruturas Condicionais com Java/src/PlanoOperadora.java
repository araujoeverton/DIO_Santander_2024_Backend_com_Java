public class PlanoOperadora {
    public static void main(String[] args) throws Exception {
        String plano= "M";

        switch (plano) {
            case "T":
                System.out.println("5GB Youtube");
            break;
            case "M":
                System.err.println("Whats e instagram grátis");
            case "B":
                System.out.println("100 minutos para ligações");
        
            default:
                break;
        }

    }
}
