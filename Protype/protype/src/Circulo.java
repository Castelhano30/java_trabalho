class Circulo extends Forma {
    Circulo() {
        setId("Círculo");
    }

    @Override
    void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}

class Retangulo extends Forma {
    Retangulo() {
        setId("Retângulo");
    }

    @Override
    void desenhar() {
        System.out.println("Desenhando um retângulo.");
    }
}