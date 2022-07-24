package com.bosonit.BS41.Bs41profiles;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
@Data
public class Perfil2 implements Perfiles{

    @Value("${perfil2}")
    @Override
    public void myFunction(){
        System.out.println("perfil2");
    }
}
