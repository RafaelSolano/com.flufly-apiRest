package com.flufly.web.web.controller;

import com.flufly.web.domain.Product;
import com.flufly.web.domain.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @GetMapping("/all")
  @Operation(summary = "Obtener todos los Productos")
  @ApiResponses(value = @ApiResponse(responseCode = "200", description = "OK"))
  public ResponseEntity<List<Product>> getAll(){
    return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  @Operation(summary = "Obtener un Producto por Id")
  @ApiResponses(value = @ApiResponse(responseCode = "200", description = "OK"))
  public ResponseEntity<Product>getProduct(@PathVariable("id") int producId){
    return productService.getProduct(producId).map(
            product ->  new ResponseEntity<>(product, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

  }

  @PostMapping("/save")
  @Operation(summary = "Crear un Producto ")
  @ApiResponses(value = @ApiResponse(responseCode = "201", description = "CREATED"))
  public ResponseEntity <Product> save (@RequestBody  Product product){
    return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
  }

  @PutMapping("/update")
  public ResponseEntity<Product> update(@RequestBody Product product, @RequestHeader HttpHeaders headers){

    if(!productService.existsById(product.getProductId())){
      return ResponseEntity.notFound().build();
    }
    Product result = productService.save(product);
    return ResponseEntity.ok(result);
  }

  @DeleteMapping("delete/{id}")
  @Operation(summary = "Eliminar un Producto ")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "OK"),
          @ApiResponse(responseCode = "404", description = " Product NOT FOUND")})
  public  ResponseEntity delete (@PathVariable("id") int productId){
    if (productService.delete(productId)){
      return new ResponseEntity(HttpStatus.OK);
    }else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }



}
