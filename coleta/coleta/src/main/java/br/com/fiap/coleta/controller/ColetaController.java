package br.com.fiap.coleta.controller;

import br.com.fiap.coleta.model.ContatoColeta;
import br.com.fiap.coleta.service.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/coleta")
public class ColetaController {

    @Autowired
    private ColetaService coletaService;


    @PostMapping("/api/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoColeta salvar(@RequestBody ContatoColeta contatocoleta){
        return coletaService.salvar(contatocoleta);
    }
    @GetMapping("/api/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ContatoColeta buscarPorId(@PathVariable Long id){
        return coletaService.buscarPorID(id);
    }

    @GetMapping("/api/nome")
    @ResponseStatus(HttpStatus.OK)
    public ContatoColeta buscarPorNome(@PathVariable String nome){

        return coletaService.buscarPorNome(nome);
    }

    @DeleteMapping("/deletar")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        coletaService.excluir(id);
    }
}
