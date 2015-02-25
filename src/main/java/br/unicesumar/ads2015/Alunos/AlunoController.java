package br.unicesumar.ads2015.Alunos;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/alunos")
public class AlunoController {
    private List<Aluno> alunos;

    public AlunoController() {
        alunos = new ArrayList();
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Aluno> getAlunos(){
        return alunos;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public void setAlunos(@RequestParam String nome, @RequestParam String ra){
        Aluno estudante = new Aluno(nome,ra);
        
        alunos.add(estudante);
    }
}
