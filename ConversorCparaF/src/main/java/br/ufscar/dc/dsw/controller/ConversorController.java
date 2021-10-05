package br.ufscar.dc.dsw.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.ufscar.dc.dsw.InitialValues;

@Controller
public class ConversorController {
    @GetMapping("/results")
    public String formIndex(Model model, Locale locale){
        model.addObject("initialValues", new InitialValues());
        return "index";
    }

    @PostMapping("/results")
    public String submitValues(@ModelAttribute InitialValues initialValues, Model model, Locale locale){
        model.addAttribute("initialValues", initialValues);
        return "results";
    }
}
