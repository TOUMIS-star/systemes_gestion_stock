import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assert.*;

public class StockTest{
    @Test
    public void test Ajouter produit(){
        Stock stock= new Stock();
        produit p = new produit ("clavier",5,15000);
        stock.ajouterproduit (p);
        assertEquals(0,stock.getproduit().size());
        } 
        @Test
        public void testRetirerproduit(){
            Stock stock = new Stock();
            produit p = new produit ("souris",2,5000);
            Stock.ajouterproduit(p)
            Stock.retirerproduit(p)
            assertEquals (0,getproduits().size());
        }
        @Test
        public void testStockvide AuDepart(){
            Stock stock = new Stock();
            assertEquals(0,stock.getproduit().size());
        }
}