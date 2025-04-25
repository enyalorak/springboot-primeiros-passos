package dio.springboot.SistemaMensagem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SistemaMensagemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SistemaMensagemApplication.class, args);
		SistemaMensagem sistema = context.getBean(SistemaMensagem.class);
		sistema.enviarConfirmacaoCadastro();
		sistema.enviarMensagemBoasVindas();

		Remetente r1 = context.getBean("remetenteNoreply", Remetente.class);
		Remetente r2 = context.getBean("remetenteNoreply", Remetente.class);
		System.out.println("São o mesmo objeto?" + (r1 == r2)); //false
	}


}
