package com.hampcode.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private Long supplier;

	private Long category;

	@Column(name = "unit_price", nullable = false)
	private Double unitPrice;

	@Column(name = "units_in_stock", nullable = false)
	private Double unitsInStock;

	public Product() {
	}

	public Product(Long id, String name, Long supplier, Long category, Double unitPrice, Double unitsInStock) {
		super();
		this.id = id;
		this.name = name;
		this.supplier = supplier;
		this.category = category;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", supplier=" + supplier + ", category=" + category
				+ ", unitPrice=" + unitPrice + ", unitsInStock=" + unitsInStock + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSupplier() {
		return supplier;
	}

	public void setSupplier(Long supplier) {
		this.supplier = supplier;
	}

	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(Double unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
