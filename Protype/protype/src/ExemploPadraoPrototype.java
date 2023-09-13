public class ExemploPadraoPrototype {
    public static void main(String[] args) {
        try {
            Forma cloneCirculo = CacheDeFormas.getForma("Círculo");
            System.out.println("Forma: " + cloneCirculo.getId());
            cloneCirculo.desenhar();

            Forma cloneRetangulo = CacheDeFormas.getForma("Retângulo");
            System.out.println("Forma: " + cloneRetangulo.getId());
            cloneRetangulo.desenhar();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
