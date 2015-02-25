package br.unicesumar.ads2015.Disciplina;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Disciplina")
public class DisciplinaController {
    private List<Disciplina> disciplinas;
    
    public DisciplinaController(){
        disciplinas = new ArrayList<>();
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public Disciplina getDisciplina(){
        return null;
    }
    
    @RequestMapping(method = RequestMethod.DELETE)
    public void excluirDisciplina(){
    }
}
