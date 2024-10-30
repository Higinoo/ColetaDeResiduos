package br.com.fiap.coleta.service;


import br.com.fiap.coleta.model.ContatoColeta;
import br.com.fiap.coleta.repository.ColetaRepository;
import jakarta.validation.groups.ConvertGroup;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ColetaService {

    @Autowired
    private ColetaRepository coletaRepository;

    public ContatoColeta salvar(ContatoColeta nome){
        return coletaRepository.save(nome);
    }

    public ContatoColeta buscarPorID(Long id){
        var coletaOptional = coletaRepository.findById(id);
            if (coletaOptional.isPresent()) {
                return coletaOptional.get();
            } else {
                throw new RuntimeException("Contato nao existe!");
            }
    }

    public void excluir(Long id){
        coletaRepository.deleteAllById(Collections.singleton(id));
    }

    public ContatoColeta buscarPorNome(String nome) {
        return coletaRepository.findByNome(nome);
    }
}
