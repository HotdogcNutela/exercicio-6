package br.ufscar.dc.dsw.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.ufscar.dc.dsw.InitialValues;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model, Locale locale){
        model.addObject("initialValues", new InitialValues());
        return "index";
    }
}
