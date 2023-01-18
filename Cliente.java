public class Cliente {


    private String name;
    private int rg;

    private String time;

    private int altura;

    private int peso;

    public Cliente() {
        this.name = name;
        this.rg = rg;
        this.time = time;
        this.altura = altura;
        this.peso = peso;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
            }


    public void info(){

        System.out.println("Então seu nome é " + name + " e o número do seu RG é " + rg);

    };



}
