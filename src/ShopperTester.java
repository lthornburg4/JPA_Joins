import java.util.List;

import controller.ShopperHelper;
import model.Shopper;

public class ShopperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopper bill = new Shopper("Bill");
		Shopper jane = new Shopper("Jane");
		
		ShopperHelper sh = new ShopperHelper();
		
		sh.insertShopper(bill);
		sh.insertShopper(jane);
		
		List<Shopper> allShoppers=sh.showAllShoppers();
		for(Shopper a: allShoppers) {
			System.out.println(a.toString());
		}

	}

}
