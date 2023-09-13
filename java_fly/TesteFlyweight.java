import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TesteFlyweight {
public static void main(String[] args) { Random r = new Random();
  List<Soldado> soldados = new ArrayList<>();
  
  int numeroSoldados = r.nextInt(50) + 50; // Cria de 50 a 99 soldados List<Soldado> soldados = new ArrayList();

for (int i = 0; i < numeroSoldados; i++)

  soldados.add(new Soldado(r.nextInt(100), r.nextInt(100)));

for (Soldado s : soldados) s.renderizar();

for (Soldado s : soldados)
s.mover(-2+r.nextInt(5), r.nextInt(3));
}
}

