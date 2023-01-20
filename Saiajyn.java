package tipos;

public class Saiajyn {




    private String cabelo;
    private String poder;
    private String nome;


    public Saiajyn(String cabelo, String poder, String nome) {
        this.cabelo = cabelo;
        this.poder = poder;
        this.nome = nome;
    }

    public Saiajyn() {

    }



    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void cabelo () {


        System.out.println("loirão");
    }

    public static void poder () {


        System.out.println("kamehamehaaaaaaaaaa");

    }
    public static void nome () {

        System.out.println("O meu nome?");
    }

    public void visuDoPoder () {

        System.out.println(poder);
    }





}
