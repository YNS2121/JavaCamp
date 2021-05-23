package kodlama.io.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="products")
public class Product {
	
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="product_id")
        private int id;
		
		@Column(name="category_id")
        private int category;
		
		@Column(name="product_name")
        private String productName;
		
		@Column(name="unit_price")
        private double unitPrice;
		
		@Column(name="units_in_stock")
        private short unitsInStock;
		
		@Column(name="quantitiy_per_unit")
        private String quantitiyPerUnit;
        
       
		}
        
        
        
        
		
		
        
          

