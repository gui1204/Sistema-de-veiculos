public non-sealed class Carro extends VeiculoTerrestre {

    public Carro(String nome, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("O carro " + getNome() + " está a " + getVelocidadeMaxima() + " Km/h!!!");
    }

    public final void tipoDeCombustivel() {
        System.out.println("O carro usa gasolina.");
    }
}
