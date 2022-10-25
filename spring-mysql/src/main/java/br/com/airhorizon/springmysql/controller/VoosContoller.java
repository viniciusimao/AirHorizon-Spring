package br.com.airhorizon.springmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.com.airhorizon.springmysql.Db.Servicos;
import br.com.airhorizon.springmysql.entidades.Voos;

@Controller
public class VoosContoller {
    @Autowired
    private Servicos servico;

    @GetMapping({"/voos","/"})
    public String ListagemVoos(Model modelo){
        modelo.addAttribute("voos", servico.listagem());
        return "voos";
    }


    @GetMapping("/voos/cadastra")
    public String createFormVoos(Model modelo){
        Voos voo =  new Voos();
        modelo.addAttribute("voos", voo);
        return "cadastroVoos";
    }

    @PostMapping("/voos")
    public String guardarVoos(@ModelAttribute("voos") Voos voos){
        servico.guardarVoos(voos);
        return "redirect:/destino";
    }

    @GetMapping("/voos/cadastroVoos/{id}")
    public String formeDeEditar(@PathVariable Long id, Model model){
        model.addAttribute("voos", servico.procurarID(id));
        return "castroVoos";
    }
    
    @PostMapping("/voos/{id}")
    public String atualizar(@PathVariable Long id, @ModelAttribute("voos") Voos voos, Model model){
        Voos voosExtend = servico.procurarID(id);
        voosExtend.setLocalVoo(voos.getLocalVoo());
        voosExtend.setCliVoo(voos.getCliVoo());
        voosExtend.setNameCli(voos.getNameCli());
        
        servico.atualizarVoos(voosExtend);
        return "redirect:/destino";
    }

    @GetMapping("/voos/{id}")
    public String deletar(@PathVariable Long id){
        servico.deleteVoos(id);
        return "redirect:/destino";
    }
}

    
