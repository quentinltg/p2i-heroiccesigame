import java.util.ArrayList;
import java.util.List;

public class HeroicCesiGame {
}

class Amulette{
    private int mana;

    public Amulette(int mana){
        this.mana = mana;
    }

    public int getMana(){
        return mana;
    }

    public void setMana(int mana){
        this.mana = mana;
    }
}



abstract class Personnage {
    protected String Nom;
    protected int pv;
    protected int pa;

    public Personnage(String Nom, int pv, int pa) {
        this.Nom = Nom;
        this.pv = pv;
        this.pa = pa;
    }

    public void affiche(){

    }

    public void attaque(){

    }


}

class Mage extends Personnage {
    public int pm;
    private Amulette amulette;

    public Mage(String nom,int pv_init, int pa_init, int pm_init){
        super(nom, pv_init, pa_init);
        this.pm = pm_init;
    }

    @Override
    public void affiche(){
        System.out.println("Nom : " + Nom);
        System.out.println("PV : " + pv);
        System.out.println("PA : " + pa);
        System.out.println("PM : " + pm);
        System.out.println("Mana de l'amulette : " + amulette.getMana());
    }

    @Override
    public void attaque(){

    }
}