package com.sttalis.missaokids.config;

import com.sttalis.missaokids.entity.Usuario;
import com.sttalis.missaokids.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class CargaDeDados {
    @Value("${ADMIN_LOGIN:admin}")
    private String adminLogin;

    @Value("${ADMIN_SENHA:admin123}")
    private String adminSenha;

    @Bean
    public CommandLineRunner executar(UsuarioRepository repository, PasswordEncoder codificador) {
        return args -> {
            if (repository.findByLogin(adminLogin).isEmpty()){
                Usuario admin = new Usuario();
                admin.setLogin(adminLogin);

                admin.setSenha(codificador.encode(adminSenha));
                admin.setPerfil("ROLE_ADMIN");
                admin.setResponsavel(null);

                repository.save(admin);
                System.out.println(">>> ADMIN CRIADO COM SUCESSO <<<" + adminLogin);
            }
        };
    }

}