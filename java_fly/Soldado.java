public class Soldado implements SoldadoFlyweight {

private int posX; private int posY;
private SoldadoCompartilhado corpo;

public Soldado(int posX, int posY) { 
  this.posX = posX;
  this.posY = posY;
  this.corpo = (SoldadoCompartilhado) SoldadoFlyweightFactory.criar();
}

public void renderizar() { 
  corpo.renderizar(posX, posY); 
}
public void mover(int x, int y) { 
  renderizar(posX + x, posY + y); 
} 
  public void renderizar(int x, int y) {
  posX = x; posY = y;
  corpo.renderizar(posX, posY);
}
}

