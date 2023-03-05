package com.ista.springboot.app.controller;

import java.net.MalformedURLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ista.springboot.app.models.entity.Producto;
import com.ista.springboot.app.models.services.I.IProductoService;
import com.ista.springboot.app.models.services.I.IUploadFileService;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@RestController
@RequestMapping("/api")
public class ProductoRestController {
	@Autowired
	public IProductoService productoService ;
	
//	@Autowired 
//	public IUploadFileService uploadFileService;
	
	//LISTAR
	@GetMapping("/Producto")
	public List<Producto> index(){
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
	public Producto create(@RequestBody Producto producto ) {
		
		return productoService.save(producto);
	}

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
	
	
	
	///////////////////////////////
//	@GetMapping
//	public String listMemes(Model model) {
//		try {
//			model.addAttribute("listMemes", productoService.findAll());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "producto/listProductos";
//	}
//	
//	
//	@GetMapping(value = "/uploads/{filename}")
//	public ResponseEntity<Resource> goImage(@PathVariable String filename) {
//		Resource resource = null;
//		try {
//			resource = uploadFileService.load(filename);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		return ResponseEntity.ok()
//				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
//				.body(resource);
//	}
//	
//	
//	
//	@GetMapping("/new")
//	public String newProducto(Model model) {
//		model.addAttribute("producto", new Producto());
//		model.addAttribute("listMemes", productoService.findAll());
//		return "producto/producto";
//	}
//	
//	
//	@PostMapping("/save")
//	public String saveMeme(@Validated @ModelAttribute("producto") Producto producto, BindingResult result, Model model,
//			@RequestParam("file") MultipartFile image, RedirectAttributes flash, SessionStatus status)
//			throws Exception {
//		if (result.hasErrors()) {
//			System.out.println(result.getFieldError());
//			return "meme/meme";
//		} else {
//			if (!image.isEmpty()) {
//				if (producto.getProdId() > 0 && producto.getProdFoto() != null && producto.getProdFoto().length() > 0) {
//					uploadFileService.delete(producto.getProdFoto());
//				}
//				String uniqueFileName = uploadFileService.copy(image);
//				meme.setImage(uniqueFileName);
//			}
//			memeService.save(meme);
//			status.setComplete();
//		}
//		return "redirect:/memes";
//	}
}
