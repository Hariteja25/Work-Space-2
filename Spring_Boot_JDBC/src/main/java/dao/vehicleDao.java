package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dto.Product;
import util.ServiceException;
@Transactional
@Repository
public class vehicleDao{
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	public class ArticleRowMapper implements RowMapper<Product> {

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product p=new Product();
			
			p.setId(rs.getInt("id"));
			p.setModel(rs.getString("model"));
			p.setBrand(rs.getString("brand"));
			return p;
		}

	}
	
	public List<Product> getAllVehicles(){
		String sql="Select id,model,brand from Vehicle";
		RowMapper<Product> rowmapper=new ArticleRowMapper();
		return this.jdbctemplate.query(sql,rowmapper);
		
	}

	public Product getprobyId(int id) {
		String sql="Select id,model,brand from Vehicle where id=?";
		
		RowMapper<Product> r=new ArticleRowMapper();
		try {
		Product p=jdbctemplate.queryForObject(sql, r,id);
		return p;
		}
		catch(Exception e) {
			throw new ServiceException("invalid Product ID", "err03");
		}
	}

	public void deletevehicle(int id) {
     String sql="delete from Vehicle where id=?";
		jdbctemplate.update(sql, id);
	}

	public  void addvehicle(Product vehicle) {
		// Add article
				String sql = "INSERT INTO vehicle (id, model, brand) values (?, ?, ?)";
				jdbctemplate.update(sql, vehicle.getId(), vehicle.getModel(), vehicle.getBrand());

				// Fetch article id
				sql = "SELECT id FROM vehicle WHERE model = ? and brand=?";
				int id = jdbctemplate.queryForObject(sql, Integer.class, vehicle.getModel(), vehicle.getBrand());

				// Set article id
				vehicle.setId(id);
			}

	
	
	public boolean vehicleExists(String model, String brand) {
		String sql="select count(*) from vehicle where model=? and brand=?";
		int count=jdbctemplate.queryForObject(sql,Integer.class,model,brand);
		if(count==0) 
			return false;
		else
			return true;
	}
	
	
	
	public void updateVehicle(Product article) {
		String sql = "UPDATE Vehicle SET model=?, brand=? WHERE id=?";
		jdbctemplate.update(sql, article.getId(), article.getModel(), article.getBrand());
	}

}