package med.voll.api.medico;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record DadosListagemMedico(Long id,
                                  String nome,
                                  String email,
                                  String crm,
                                  Especialidade especialidade) {

    public DadosListagemMedico(Medico medico){
        this(   medico.getId(),
                medico.getNome(),
                medico.getEmail(),
                medico.getCrm(),
                medico.getEspecialidade());
    }

}
