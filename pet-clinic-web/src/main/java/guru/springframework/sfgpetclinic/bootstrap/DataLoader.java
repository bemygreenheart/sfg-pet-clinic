package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.service.model.Owner;
import guru.springframework.sfgpetclinic.service.model.Pet;
import guru.springframework.sfgpetclinic.service.model.PetType;
import guru.springframework.sfgpetclinic.service.service.OwnerService;
import guru.springframework.sfgpetclinic.service.service.PetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, PetService petService) {
        this.ownerService = ownerService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1= new Owner();
        owner1.setFirstName("Jaha");
        owner1.setLastName("Nazarov");
        owner1.setId(23L);

        ownerService.save(owner1);

        Pet cat= new Pet();
        cat.setId(67L);
        cat.setOwner(owner1);
        PetType pett1=new PetType();
        pett1.setName("cat");
        cat.setPetType(pett1);

        petService.save(cat);

        Owner owner2= new Owner();
        owner2.setId(34L);
        owner2.setFirstName("Ahadjon");
        owner2.setLastName("Abduhalilov");

        ownerService.save(owner2);

        Pet dog= new Pet();
        dog.setId(34L);
        dog.setOwner(owner2);
        PetType pett2= new PetType();
        pett2.setName("dog");
        dog.setPetType(pett2);

        petService.save(dog);

        System.out.println("All data have been loaded.....");

    }
}
