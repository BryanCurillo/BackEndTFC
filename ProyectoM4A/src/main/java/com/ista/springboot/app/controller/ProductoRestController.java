package com.ista.springboot.app.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ista.springboot.app.models.entity.ImageModel;
import com.ista.springboot.app.models.entity.Producto;
import com.ista.springboot.app.models.services.I.IProductoService;

@RestController
@RequestMapping("/api")
public class ProductoRestController {
	@Autowired
	public IProductoService productoService;


	// LISTAR
	@GetMapping("/Producto")
	public List<Producto> index() {
		return productoService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/Producto/{id}")
	public Producto show(@PathVariable Long id) {
		return productoService.findById(id);
	}

	// GUARDAR
	@PostMapping("/Producto")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {

		return productoService.save(producto);
	}
	//---------------------------------------\
	
	@PostMapping(value={"/Producto"}, consumes= {MediaType.MULTIPART_FORM_DATA_VALUE})
	@ResponseStatus(HttpStatus.CREATED)
	public Producto addNewProduct(@RequestBody Producto producto,
									@RequestPart("imageFile")MultipartFile[]file) {

//		return productoService.save(producto);
		
		try {
			Set<ImageModel> images = uploadImage(file);
			producto.setProductImages(images);
			return productoService.save(producto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public Set<ImageModel> uploadImage (MultipartFile[] multipartFiles) throws IOException{
		
		Set<ImageModel> imageModels = new HashSet<>();
		for(MultipartFile file: multipartFiles) {
			ImageModel imageModel= new ImageModel(
					file.getOriginalFilename(),
					file.getContentType(),
					file.getBytes()
					);
			imageModels.add(imageModel);
		}
		return imageModels;
	}
	//-------------------------------------------/

	// EDITAR
	@PutMapping("/Producto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {

		Producto productoACTUAL = productoService.findById(id);
		productoACTUAL.setProdDescripcion(productoACTUAL.getProdDescripcion());
		productoACTUAL.setProdFoto(productoACTUAL.getProdFoto());
		productoACTUAL.setProdId(productoACTUAL.getProdId());
		productoACTUAL.setProdIdCategoria(productoACTUAL.getProdIdCategoria());
		productoACTUAL.setProdNombre(productoACTUAL.getProdNombre());
		productoACTUAL.setProdPrecio(productoACTUAL.getProdPrecio());

		return productoService.save(productoACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/Producto/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		productoService.delete(id);
	}	

	
	
}
