import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit p){
        produits.add(p);
    }

    public void retirerProduit(Produit p){
        produits.remove(p);
    }

    public List<Produit> getProduits(){
        return produits;
    }
}