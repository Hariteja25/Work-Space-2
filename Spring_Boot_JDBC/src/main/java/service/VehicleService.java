package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.vehicleDao;
import dto.Product;

@Service
public class VehicleService {
	
	@Autowired
	private vehicleDao vehicledao;
	
	@Transactional
	public List<Product> getAllVehicles(){
		return vehicledao.getAllVehicles();
		
	}

	@Transactional
	public Product getprobyId(int id) {
		
		return vehicledao.getprobyId(id);
	}


	@Transactional
	public void deletevehicle(int id) {
	 vehicledao.deletevehicle(id);
	}

	public boolean addvehicle(Product v) {
		if (vehicledao.vehicleExists(v.getModel(), v.getBrand())) {
			return false;
		} else {
			vehicledao.addvehicle(v);
			return true;
		}
		
	}
	
	
	public void updateVehicle(Product vehicle) {
		vehicledao.updateVehicle(vehicle);
	}


}
