public class Modell {
    public static void main(String[] args) {
        Grodman g = new Grodman();
        Inte_Grodman i = new Inte_Grodman();
        Ramus r = new Ramus();
        Konrad k = new Konrad();

        System.out.println(r.playAgainst(k));

        System.out.println(g.playAgainst(i));

        System.out.println(k.playAgainst(k));
    }
}
