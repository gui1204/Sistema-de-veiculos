public sealed class Moto extends VeiculoTerrestre permits MotoEsportiva {

    public Moto(String nome, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("A moto " + getNome() + " está a " + getVelocidadeMaxima() + " Km/h!!!");
    }
}
