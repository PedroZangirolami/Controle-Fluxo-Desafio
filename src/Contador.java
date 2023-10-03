import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        //valida se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser menor que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        //realiza o for para imprimir os números com base na variável contagem
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
