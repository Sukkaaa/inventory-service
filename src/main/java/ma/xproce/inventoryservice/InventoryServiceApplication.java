package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import ma.xproce.inventoryservice.service.CreatorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication  {

    public static void main(String[] args) {

        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner startDAO(CreatorRepository creatorRepository){
        return args -> {
            Creator creator = new Creator();
            creator.setNom("Pewds");
            creator.setEmail("PewDiePie@gmail.com");
        };
    }
    @Bean
    public CommandLineRunner startService(CreatorManager creatorManager){
        return args -> {
            Creator creator= new Creator();
            creator.setNom("Pewds");
            creator.setEmail("PewDiePie@gmail.com");

        };
    }
}
