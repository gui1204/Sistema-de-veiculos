import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculo = new ArrayList<>();


        veiculo.add(new Carro("Golf GTI", 110));
        veiculo.add(new Moto("Titan 160", 130));
        veiculo.add(new MotoEsportiva("BMW F1200", 210));

        for (Veiculo v : veiculo) {
            v.exibirInfo(); // Nome e velocidade
            v.mover();      // Ação específica
            System.out.println(); // Só pra dar uma linha em branco
        }



 }
    }
