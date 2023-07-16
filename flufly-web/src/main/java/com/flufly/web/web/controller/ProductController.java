package com.flufly.web.web.controller;

import com.flufly.web.domain.Product;
import com.flufly.web.domain.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
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

}
