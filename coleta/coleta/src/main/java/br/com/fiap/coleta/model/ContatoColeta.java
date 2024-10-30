package br.com.fiap.coleta.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tbl_contatocoleta")
public class ContatoColeta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "SEQ_CONTATO"
    )
    @SequenceGenerator(
            name = "SEQ_CONTATO",
            sequenceName =  "SEQ_CONTATO",
            allocationSize = 1
    )
    private Long id;
    private String nome;
    private String endereco;
    @Column(name = "data_coleta")
    private LocalDate dataColeta;


}
