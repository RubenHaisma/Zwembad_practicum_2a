public class Zwembad {

    private double breedte;
    private double lengte;
    private double diepte;
    private double inhoud;

    public Zwembad(double breedte, double diepte, double lengte) {
        setBreedte(breedte);
        setDiepte(diepte);
        setLengte(lengte);
    }

    public Zwembad() {
    }

    public double getBreedte() {
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double inhoud() {
        double inhoud = (breedte*lengte*diepte);
        return inhoud;
    }

    public String toString() {
        return "breedte: " + breedte + ", lengte: " + lengte + ", diepte: " + diepte;
    }
}
