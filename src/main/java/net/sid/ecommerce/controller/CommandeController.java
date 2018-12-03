package net.sid.ecommerce.controller;

import net.sid.ecommerce.service.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/commande")
public class CommandeController {
    @Autowired
    private ICommandeService commandeService;
}
