package Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dto.Product;
import util.ErrorEnum;
import util.UserException;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;

	//@Transactional
	public void addProduct(Product p) throws UserException {
		if (dao.isProductExists(p.getTitle()))throw new UserException(ErrorEnum.ERRO4.getErrorCode(), ErrorEnum.ERRO4.getMsg());
		dao.saveProduct(p);
	}

	
	
	public List<Product> getProducts() {
		return dao.getAllProducts();
	}

	public void updateProduct(Product p) throws UserException {
		dao.updateProduct(p);

	}
}
