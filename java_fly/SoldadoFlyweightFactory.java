public class SoldadoFlyweightFactory {

private static SoldadoFlyweight soldado = null; public static SoldadoFlyweight criar() {
if (soldado == null)
soldado = new SoldadoCompartilhado();

return soldado;
}
}

