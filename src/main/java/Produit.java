public class Produit{
    private String nom;
    private int quantitestock;
    private double prixunit;
    public Produit(String nom, int quantitestock, double prixunit){
        this.nom =nom;
        this.quantitestock = quantitestock;
        this.prixunit =prixunit;
    }

//getters
public String getNom(){
    return nom;
}

public int  getQuantitestock(){
    return quantitestock;
}

public double  getPrixunit(){
    return prixunit;
}

//Annotation 
@Override
public String toString(){
    return "Produit{"+
         "nom='"+ nom +",quantitestock ="+quantitestock+",prixunit ="+prixunit+"}";
        }
}