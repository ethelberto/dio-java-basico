import java.util.InputMismatchException;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("05641030");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e){
            e.printStackTrace();
        }
    
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();

        return "05.641-030";
    }
}
