package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.service.model.Owner;
import guru.springframework.sfgpetclinic.service.model.Pet;
import guru.springframework.sfgpetclinic.service.model.PetType;
import guru.springframework.sfgpetclinic.service.service.OwnerService;
import guru.springframework.sfgpetclinic.service.service.PetService;
import guru.springframework.sfgpetclinic.service.service.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.service.service.map.PetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1= new Owner();
        owner1.setFirstName("Jaha");
        owner1.setLastName("Nazarov");
        owner1.setId(23L);

        Pet cat= new Pet();
        cat.setId(67L);
        cat.setOwner(owner1);
        PetType pett1=new PetType();
        pett1.setName("cat");
        cat.setPetType(pett1);

        Owner owner2= new Owner();
        owner2.setId(34L);
        owner2.setFirstName("Ahadjon");
        owner2.setLastName("Abduhalilov");

        Pet dog= new Pet();
        dog.setId(34L);
        dog.setOwner(owner2);
        PetType pett2= new PetType();
        pett2.setName("dog");
        dog.setPetType(pett2);

        System.out.println("All data have been loaded.....");

    }
}
