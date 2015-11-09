package mfc_dbcrawler;

import java.util.concurrent.Callable;

import com.marketflip.shared.products.MF_Product;

public class MFC_DatabaseCrawler implements Callable<Boolean> {
	private MF_Product product;
	
	// Construct with a product to insert into database
	public MFC_DatabaseCrawler(MF_Product product) {
		this.product = product;
	}

	@Override
	public Boolean call() throws Exception {
		insert(product);
		return true;
	}

	private void insert(MF_Product product2) {
		// TODO Move to JUnit System.out.println("Inserted to DB: " + product.toString());		
	}

}
