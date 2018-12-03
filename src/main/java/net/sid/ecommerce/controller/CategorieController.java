package net.sid.ecommerce.controller;

import net.sid.ecommerce.entities.Categorie;
import net.sid.ecommerce.service.ICategorieService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Controller
@RequestMapping(value="/categorie")
public class CategorieController implements HandlerExceptionResolver {
    @Autowired
    private ICategorieService categorieService;

    @RequestMapping(value="/save")
    public Categorie saveCategorie(@Valid Categorie categorie, MultipartFile file) throws IOException {
        if(!file.isEmpty()){
            BufferedImage bi = ImageIO.read(file.getInputStream());
            categorie.setPhoto(file.getBytes());
            categorie.setNomPhoto(file.getOriginalFilename());
        }
        return categorieService.ajouterCategorie(categorie);
    }

    @RequestMapping(value = "photo", produces= MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getPhotoCategorie(Long idCategorie) throws IOException {
        Categorie categorie = categorieService.getCategorie(idCategorie);
        return IOUtils.toByteArray(new ByteArrayInputStream(categorie.getPhoto()));
    }

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {
        return null;
    }
}
