//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fighter l[] = new Fighter[6];
        l[0] = new Fighter("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Fighter("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Fighter("Sanpshadow", "EUA", 35, 1.65f, 80.6f, 12, 2, 1);
        l[3] = new Fighter("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Fighter("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Fighter("Nedaart", "EUA", 30,1.81f, 105.7f, 12, 2, 4);

        Fight UEC01 = new Fight();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
    }
}