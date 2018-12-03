package net.sid.ecommerce.controller;

import net.sid.ecommerce.entities.Categorie;
import net.sid.ecommerce.entities.Produit;
import net.sid.ecommerce.service.IProduitService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.validation.Valid;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


@Controller
@RequestMapping(value="/produit")
public class ProduitController {
    @Autowired
    private IProduitService produitService;

    @RequestMapping(value="/save")
    public Produit saveProduit(@Valid Produit produit, MultipartFile file) throws IOException {
        Produit prod = null;
        if(!file.isEmpty()){
            String path = System.getProperty("java.io.tmpdir");
            produit.setPhoto(file.getOriginalFilename());
             prod = produitService.ajouterProduit(produit);
            file.transferTo(new File(path+"/"+"PROD_"+produit.getIdProduit()+"_"+file.getOriginalFilename()));
        }else{
              prod = produitService.ajouterProduit(produit);
        }
        return prod;
    }

    @RequestMapping(value = "photo", produces= MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getPhotoProduit(Long idProduit) throws IOException {
        Produit produit = produitService.getProduit(idProduit);
        File f = new File(System.getProperty("java.io.tmpdir")+"/"+"PROD_"+produit.getIdProduit()+"_"+produit.getPhoto());
        return IOUtils.toByteArray(new FileInputStream(f));
    }


}
