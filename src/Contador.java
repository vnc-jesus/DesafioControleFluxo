import java.util.Scanner;

public class Contador {
    public static void main(String[]args){
        var leitura = new Scanner(System.in);
        System.out.println("Informe dois parâmetros: ");
        int primeiro = leitura.nextInt();
        int segundo = leitura.nextInt();

        try {
            if (segundo < primeiro){
                throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro.");
            }
            for (int i = primeiro; i <= segundo; i++){
                System.out.println(i);
            }

        } catch (IllegalArgumentException erro) {
            System.out.println("Erro: "+erro.getMessage());
        } catch (Exception erro){
            System.out.println("Erro inesperado: "+ erro.getMessage());
        }

    }
}