package com.hwua.dao.mybatis.mappers;

import java.util.List;

import com.hwua.entity.Product;

public interface ProductMapper {
	void add(Product pro);
	List<Product> findProduct();
}
