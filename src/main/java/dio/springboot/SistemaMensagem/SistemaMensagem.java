package dio.springboot.SistemaMensagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//component torna a classe um bean gerenciado pelo spring
//@Autowired: Diz ao spring: "Injete essa dependência aqui para mim!".
//É a forma de fazer injeção de dependência por atributo.

public class SistemaMensagem {
    private Remetente noreply;
    private Remetente techTeam;

    @Autowired
    public SistemaMensagem(@Qualifier("noreply") Remetente noreply,
                           @Qualifier("techTeam") Remetente techTeam) {
        this.noreply = noreply;
        this.techTeam = techTeam;
    }


    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas() {;
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Elite");

    }

}
