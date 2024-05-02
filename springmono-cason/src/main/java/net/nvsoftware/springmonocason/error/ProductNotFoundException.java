package net.nvsoftware.springmonocason.error;

public class ProductNotFoundException extends  RuntimeException{
    public ProductNotFoundException(String msg) {
        super(msg);
    }
}
