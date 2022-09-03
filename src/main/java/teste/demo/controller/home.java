package teste.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import teste.demo.model.Pessoa;

@Controller
public class home {
    
@GetMapping ("home")
public String home(Model model) {
    Pessoa pessoa = new Pessoa();
    pessoa.setNome(nome:"Rayanne");
    pessoa.setSobrenome(sobreNome:"Dutra");
    System.out.println("-------------->" + pessoa.getsobreNome());
    model.addAttribute(attributeName:"p",pessoa);
    return "index";
}

