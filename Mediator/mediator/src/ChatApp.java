public class ChatApp {
    public static void main(String[] args) {
        ChatMediator mediador = new ChatMediatorImpl();

        Usuario usuario1 = new UsuarioImpl("Felipe", mediador);
        Usuario usuario2 = new UsuarioImpl("Guilherme", mediador);
        Usuario usuario3 = new UsuarioImpl("Igor", mediador);

        mediador.adicionarUsuario(usuario1);
        mediador.adicionarUsuario(usuario2);
        mediador.adicionarUsuario(usuario3);

        usuario1.enviarMensagem("Olá a todos!");
        usuario2.enviarMensagem("Oi, Edgar!");
        usuario3.enviarMensagem("Olá, pessoal!");

    }
}
