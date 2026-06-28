import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest{
    @Test
    public void testAjouter produit(){
        Stock stock= new Stock();
        Produit produit = new produit ("clavier",5,15000);
        stock.ajouterproduit (produit);
        assertEquals(1,stock.getproduit().size());
        } 
        @Test
        public void testRetirerproduit(){
            Stock stock = new Stock();
            produit produit = new produit ("souris",5,5000);
            Stock.ajouterproduit(produit);
            Stock.retirerproduit(produit);
            assertEquals (0,stock.getproduits().size());
        }
        @Test
        public void testStockvide AuDepart(){
            Stock stock = new Stock();
            assertEquals(0,stock.getproduit().size());
        }
}