package com.trainginmug.abstraction;

public class ProductServImpl implements IProductService{


    //we can't have super()
    @Override
    public void addProduct(Product product){
        System.out.println("Product is Successfully added to the MySQL database!");
    }

    @Override
    public void getProduct(int id) {
        System.out.println("Fetching the product from MySQL database with ID : " + id);
        System.out.println("Product Price : " + PRODUCT_PRICE);
    }
}
