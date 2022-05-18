public class Employe implements Cloneable{
    private String nom, prenom;
    int matricule;
    private double salaire;
    private Departement departement;
    public static enum Departement{
        ACHAT(2000),COMMERCIAL(3000), INFORMATIQUE(5000), RH(2000);
        private final int primAnnuelle;
        Departement(int primAnnuelle){
            this.primAnnuelle=primAnnuelle;
        }

    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getMatricule() {
        return matricule;
    }

    public Employe(String n, String p , int m, double s, Departement d){
        nom=n;
        prenom=p;
        matricule=m;
        salaire=s;
        departement=d;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Employe){
            return this.matricule==((Employe) o).matricule;
        }
        return false;
    }
    @Override
    public Employe clone(){
        try{
            return (Employe) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("erreur de clonage");
        }
        return null;
    }
    public void afficherPrimeDepartement(){
        for (Departement d:
                departement.values()) {
            System.out.println(departement.primAnnuelle);
        }
    }

}
