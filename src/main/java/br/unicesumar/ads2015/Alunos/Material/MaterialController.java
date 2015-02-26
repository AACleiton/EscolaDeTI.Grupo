package br.unicesumar.ads2015.Alunos.Material;

import br.unicesumar.ads2015.Alunos.Aluno;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class MaterialController {
private List<Material> material;

    public MaterialController() {
        material = new ArrayList();
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Material> getAlunos(){
        return material;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public void setAlunos(@RequestParam int codigo, @RequestParam String descricao){
        Material livro = new Material(codigo,descricao);
        
        material.add(livro);
    }}
