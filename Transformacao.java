public class Transformacao extends Humano implements SuperSaiadin, Saiadin1, Saiadin2, Saiadin3 {


    public Transformacao (String nome, int idade) {
            super (nome, idade);
    }


    @Override
    public void kamehameha1() {
        System.out.println("Primeira Transformação");
        poder();
        System.out.println("aaaaaaaaaahhhhhhhhhhhh!");

    }

    @Override
    public void kamehameha2() {
        System.out.println("Segunda Transformação");
        poder();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!");

    }

    @Override
    public void kamehameha3() {
        System.out.println("Terceira Transformação");
        poder();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!");

    }

    @Override
    public void poder() {

        System.out.println("kamehameha");

    }
}
