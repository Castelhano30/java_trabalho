public interface Usuario {
    void enviarMensagem(String mensagem);

    void receberMensagem(String mensagem);
}

// Implementação do Usuário
class UsuarioImpl implements Usuario {
    private String nome;
    private ChatMediator mediador;

    public UsuarioImpl(String nome, ChatMediator mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}