public class ExemploForArray {
    public static void main(String[] args) {
        String nomes [] = {"Ethelberto", "Ribeiro", "Mello", "Neto"};

        for (int x=0; x < nomes.length; x++) {
            System.out.print(nomes[x] + " ");
        }
        // varendo diretamente o array
        for(String nome : nomes) {
            System.out.print(nome + " ");
        }
        // break e continue
        for (int y=0; y<10; y++){
            if (y == 2)
                continue;
            else if (y == 7) 
                break;
            
            System.out.println("y = " + y);
            
        }
        // while (condição){ ... }
        // do { ... } while(condição)
    }
}
