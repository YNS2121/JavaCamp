package kodlama.io.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
		@Id
		@GeneratedValue
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
        
        public Product() {}
        
        public Product(int id, int category, String productName, double unitPrice, short unitsInStock,
				String quantitiyPerUnit) {
			super();
			this.id = id;
			this.category = category;
			this.productName = productName;
			this.unitPrice = unitPrice;
			this.unitsInStock = unitsInStock;
			this.quantitiyPerUnit = quantitiyPerUnit;
		}
        
        
        
        
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCategory() {
			return category;
		}
		public void setCategory(int category) {
			this.category = category;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public short getUnitsInStock() {
			return unitsInStock;
		}
		public void setUnitsInStock(short unitsInStock) {
			this.unitsInStock = unitsInStock;
		}
		public String getQuantitiyPerUnit() {
			return quantitiyPerUnit;
		}
		public void setQuantitiyPerUnit(String quantitiyPerUnit) {
			this.quantitiyPerUnit = quantitiyPerUnit;
		}
		
        
          
}
