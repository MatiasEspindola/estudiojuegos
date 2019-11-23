package com.sistemasng.juegos.juegos;

import com.sistemasng.juegos.juegos.models.services.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JuegosApplication {

    @Autowired
    private IUploadFileService uploadFileService;

    public static void main(String[] args) {
        SpringApplication.run(JuegosApplication.class, args);
    }
    
     public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
       // uploadFileService.deleteAll();
        uploadFileService.init();
    }

}
