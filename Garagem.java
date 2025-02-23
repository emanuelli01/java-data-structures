import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private List<Carros> carros;

    public Garagem() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carros carro) {
        carros.add(carro);
        System.out.println("Carro com placa " + carro.getPlaca() + " adicionado à garagem.");
    }

    public void removerCarro(String placa) {
        Carros carroParaRemover = null;
        for (Carros carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                carroParaRemover = carro;
                break;
            }
        }
        if (carroParaRemover != null) {
            carros.remove(carroParaRemover);
            System.out.println("Carro com placa " + placa + " removido da garagem.");
        } else {
            System.out.println("Carro com placa " + placa + " não encontrado.");
        }
    }

    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("A garagem está vazia.");
        } else {
            System.out.println("Carros na garagem:");
            for (Carros carro : carros) {
                System.out.println("- Nome: " + carro.getNome() + "| Placa: " + carro.getPlaca() + " | Velocidade Máx: " + carro.getVelocidadeMax() + " km/h");
            }
        }
    }
}

