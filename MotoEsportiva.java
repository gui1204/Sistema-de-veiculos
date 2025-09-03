public final class MotoEsportiva extends Moto {

    public MotoEsportiva(String nome, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("A moto esportiva " + getNome() + " está a " + getVelocidadeMaxima() + " Km/h!!!");
    }
}
