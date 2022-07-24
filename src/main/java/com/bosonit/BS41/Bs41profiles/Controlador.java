package com.bosonit.BS41.Bs41profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @Autowired
    MyConfiguracion myConfiguracion;

    @Autowired
    private Perfiles perfiles;

    @Value("${spring.profiles.active}")
    private String profileValue;

    @Value("${url}")
    private String url;

    @Value("${password}")
    private String password;

    @GetMapping("/parametros")
    public String parametros(){
        return "Mis parametro son URL : "+url+"\n PASSWORD : "+password;
    }
    @GetMapping("/miconfiguracion")
    public String configuracion() {
        return "Mi configuracion es valor1: "
                + myConfiguracion.getValor1()
                + ", valor2: "
                + myConfiguracion.getValor2();
    }
    @GetMapping("/perfil")
    public String retornaPerfil() {
        perfiles.myFunction();
        return profileValue;
    }
}
