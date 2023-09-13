public class SoldadoCompartilhado implements SoldadoFlyweight {

private Object capacete;
private Object arma;

public SoldadoCompartilhado() {

}

@Override
public void renderizar(int x, int y) { System.out.printf("Renderizando soldado em (%d, %d)...\n", x, y);
}
}

