package day09_practice.resoruant;

public class Mutfak {

    public String yemekler="adana kebap ,urfaciger, kus basi, kusleme";
    public String araSicak="Yayla Corbasi ,mercimek, corba";
    public String tatlilar="baklava ,sutlac, gullac, kazandibi, kunefe";
    public String icecekler="ayran ,salgam, kola";

    public Mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
this.yemekler=adanakebap;
this.araSicak=mercimek;
this.tatlilar=kunefe;
this.icecekler=salgam;

    }

    public Mutfak() {
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}
