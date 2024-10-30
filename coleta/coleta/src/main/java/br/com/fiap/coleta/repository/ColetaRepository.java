package br.com.fiap.coleta.repository;

import br.com.fiap.coleta.model.ContatoColeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColetaRepository extends JpaRepository<ContatoColeta, Long> {

    ContatoColeta findByNome(String nome);
}
