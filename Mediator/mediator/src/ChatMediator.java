import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
    void adicionarUsuario(Usuario usuario);

    void enviarMensagem(String mensagem, Usuario remetente);
}

// Implementação do Mediador
class ChatMediatorImpl implements ChatMediator {
    private List<Usuario> usuarios;

    public ChatMediatorImpl() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        for (Usuario usuario : usuarios) {
            if (usuario != remetente) {
                usuario.receberMensagem(mensagem);
            }
        }
    }
}