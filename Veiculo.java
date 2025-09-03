public abstract class Veiculo {
    private String nome;
    private int velocidadeMaxima;

    public Veiculo(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public abstract void mover();

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }
}
