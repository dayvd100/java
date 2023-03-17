public class Poli {
  public static void main(String[] args) {
    animal[] animais = new animal[2];
    animais[0] = new animal();
    animais[1] = new bird();

    for (animal animail : animais) {
      animal.roar();
    }
  }
}