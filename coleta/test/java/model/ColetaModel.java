package model;

import com.google.gson.annotations.Expose;
import lombok.Data;

@Data
public class ColetaModel {
    @Expose(serialize = false)
    private Long idColeta;
    @Expose
    private String nomeColeta;
    @Expose
    private String enderecoColeta;
    @Expose
    private String dataColeta;
}
