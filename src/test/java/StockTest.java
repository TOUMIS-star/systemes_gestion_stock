import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StockTest{
    @Test
    public void testAjouterProduit(){
        Stock stock= new Stock();
        Produit p = new Produit("clavier",5,15000);
        stock.ajouterProduit (p);
        assertEquals(1, stock.getProduits().size());
        } 
        @Test
        public void testRetirerProduit(){
            Stock stock = new Stock();
            Produit p = new Produit ("souris",2,5000);
            stock.ajouterProduit(p);
            stock.retirerProduit(p);
            assertEquals (0, stock.getProduits().size());
        }
        @Test
        public void testStockvideAuDepart(){
            Stock stock = new Stock();
            assertEquals(0, stock.getProduits().size());
        }
}