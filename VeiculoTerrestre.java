public sealed class VeiculoTerrestre extends Veiculo permits Carro,Moto {

    public VeiculoTerrestre(String nome, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
    }

    @Override
    public void mover() {
    }
}

