import java.util.Scanner;
public class CalculaTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double totalCompra = scanner.nextDouble();

        System.out.println("Digite o valor recebido: R$ ");
        double valorRecibido = scanner.nextDouble();

        double troco = valorRecibido - totalCompra;

        if(valorRecibido < totalCompra){
            System.out.println("Valor recebido insuficiente");
            return;
        }

        System.out.println("Troco: R$ " + troco );

        System.out.println("Notas e moedas do troco: ");
        calcularNotasEMoedas(troco);

        scanner.close();
    }
    public static void calcularNotasEMoedas(double troco){
        double[] valores = {10, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.1, 0.05, 0.01};
        String[] nomes = {"Nota de R$ 100", "Nota de R$ 50", "Nota de R$ 20", "Nota de R$ 10",
                "Nota de R$ 5", "Nota de R$ 2", "Nota de R$ 1", "Moeda de R$ 0.50",
                "Moeda de R$ 0.25", "Moeda de R$ 0.10", "Moeda de R$ 0.05", "Moeda de R$ 0.01"};

        for(int i = 0; i < valores.length; i++){
            int quantidade = (int) (troco / valores[i]);
            if(quantidade > 0){
                System.out.println(quantidade + " " + nomes[i]);
                troco -= quantidade * valores[i];
            }
        }
    }
}
