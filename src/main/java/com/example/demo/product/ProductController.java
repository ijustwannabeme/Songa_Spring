package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 나, 컨트롤러야~
@RestController
public class ProductController {

    //"사용자 요청을 던지면" 그걸 받아서 요청에 맞는 메소드를 실행시킨다.
    //그에 맞는 로직을 수행할수 있도록 서비스한테 시킨다.
    private ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //상품 조회
    //받고 싶은거 ? 상품

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public String findProduct(@PathVariable("id") int id) {
        return productService.findProduct(id);
    }

    @PostMapping(value = "/save")
    public String save(@RequestParam(value = "name") String productName) {
        productService.save(productName);
        return "save completed";
    }

}
