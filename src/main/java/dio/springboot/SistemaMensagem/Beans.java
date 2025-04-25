package dio.springboot.SistemaMensagem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//marcando a classe como uma classe de configuracao
//o spring vai procurar metodos com @bean e registrar os objetos retornadaos na aplication

//C@Scope("prototype"): indica que cada vez que o bean for usado, será criado um novo objeto
//@Qualifier("..."): dá um nome específico para cada bean, para sabermos qual injetar depois
@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    @Qualifier("noreply")
    public Remetente remetenteNoreply() {
        System.out.println("CRIANDO Remetente NOREPLY");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@gmail.com");
        remetente.setNome("Remetente DIO NoReply");
        return remetente;
    }

    @Bean
    @Scope("prototype")
    @Qualifier("techTeam")
    public Remetente remetenteTechTeam(){
        System.out.println("CRIANDO Remetente TECH TEAM");
        Remetente remetente = new Remetente();
        remetente.setEmail("techteam@gmail.com");
        remetente.setNome("Remetente DIO Tech Team");
        return remetente;
    }

}
