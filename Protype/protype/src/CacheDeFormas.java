import java.util.HashMap;
import java.util.Map;

class CacheDeFormas {
    private static Map<String, Forma> mapaDeFormas = new HashMap<>();

    static {
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();

        mapaDeFormas.put(circulo.getId(), circulo);
        mapaDeFormas.put(retangulo.getId(), retangulo);
    }

    static Forma getForma(String id) throws CloneNotSupportedException {
        Forma formaClonada = mapaDeFormas.get(id);
        return (Forma) formaClonada.clone();
    }
}
