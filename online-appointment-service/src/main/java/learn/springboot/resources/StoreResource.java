package learn.springboot.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.springboot.models.Store;
import learn.springboot.models.Stores;

@RestController
@RequestMapping("/stores")
public class StoreResource {

	@RequestMapping("/{postCode}")
	public Stores getCatalog(@PathVariable("postCode") Integer postCode) {
		Stores sc = new Stores();
		
		Store store = new Store();
		store.setName("Papatoetoe");
		
		List<Store> stores = Collections.singletonList(store);
		
		sc.setStores(stores);
		return sc;
	}
}
