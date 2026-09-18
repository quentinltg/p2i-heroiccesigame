public class Item {

    private double prix;
    private double tva;

    public Item(){
        this.prix = 0;
        this.tva = 0;
    }

    public Item(double prix, double tva) {
        this.prix = prix;
        this.tva = tva;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {}

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getPrixTTC(){
        return prix*(1+tva);
    }

    public static void main(String[] args) {
        Item item = new Item(1,1);
        System.out.println(item.getPrix());

    }
}