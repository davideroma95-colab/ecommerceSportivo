package it.valueson.sportECommerce.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private String description;
	private Date insertDate;
	private Date suppressionDate;
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private List<StoreProduct> storeProducts = new ArrayList<>();
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private List<ProductOrder> productOrders = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getSuppressionDate() {
		return suppressionDate;
	}

	public void setSuppressionDate(Date suppressionDate) {
		this.suppressionDate = suppressionDate;
	}

	public List<StoreProduct> getStoreProducts() {
		return storeProducts;
	}

	public void setStoreProducts(List<StoreProduct> storeProducts) {
		this.storeProducts = storeProducts;
	}

	public List<ProductOrder> getProductOrders() {
		return productOrders;
	}

	public void setProductOrders(List<ProductOrder> productOrders) {
		this.productOrders = productOrders;
	}
}
