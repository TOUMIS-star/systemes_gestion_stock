public class Fournisseur{
    private String nom;
    private String prenom ;
    private String telephone;
    public Fournisseur(String nom, String prenom, String telephone){
        this.nom =nom;
        this.prenom = prenom;
        this.telephone =telephone;
    }

//getters

public String getNom(){
    return nom;
}

public String  getPrenom(){
    return prenom;
}

public String  getTelephone(){
    return telephone;
}

//Annotation 
@Override
public String toString(){
    return "Fournisseur{"+
         "nom='"+nom+",prenom ="+prenom+",telephone ="+telephone+"}";
       }
}