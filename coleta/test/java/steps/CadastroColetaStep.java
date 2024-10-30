package steps;

import com.networknt.schema.ValidationMessage;
import io.cucumber.java.bs.A;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import model.ErrorMessageModel;
import org.junit.Assert;
import services.CadastroColetaService;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CadastroColetaStep {

    CadastroColetaStepService cadastroColetaStepService = new CadastroColetaStep()Service();

    @Dado("dados de coleta")
    public void dadosColeta(List<Map<String, String>> rows) {
        for (Map<String, String> columns : rows) {
            cadastroEntregasService.setFieldsDelivery(columns.get("campo"), columns.get("valor"));
        }
    }

    @Quando("requisição de coleta")
    public void requisicaoColeta(String endPoint) {
        cadastroColetaStepServiceServiceService.createDelivery(endPoint);
    }

    @Então("status da coleta")
    public void statusColeta(int statusCode) {
        Assert.assertEquals(statusCode, cadastroColetaStepService.response.statusCode());
    }

    @E("resposta de erro")
    public void respostaErroColeta(String message) {
        ErrorMessageModel errorMessageModel = cadastroEntregasService.gson.fromJson(
                cadastroColetaStepServiceervice.response.jsonPath().prettify(), ErrorMessageModel.class);
        Assert.assertEquals(message, errorMessageModel.getMessage());
    }

    @Dado("recuperacao dados coleta")
    public void recuperacaoDadosColeta() {
        cadastroColetaStepServiceService.retrieveIdDelivery();
    }

    @Quando("requisicao coleta")
    public void envioDeRequisicaoColeta(String endPoint) {
        cadastroColetaStepService.deleteDelivery(endPoint);
    }

    @E("arquivo de registro de coleta")
    public void arquivoRegistroColeta(String contract) throws IOException {
        cadastroColetaStepService.setContract(contract);
    }

    @Então("a resposta da requisição deve estar em conformidade com o contrato selecionado")
    public void aRespostaDaRequisiçãoDeveEstarEmConformidadeComOContratoSelecionado() throws IOException {
        Set<ValidationMessage> validateResponse = cadastroEntregasService.validateResponseAgainstSchema();
        Assert.assertTrue("O contrato está inválido. Erros encontrados: " + validateResponse, validateResponse.isEmpty());
    }
}