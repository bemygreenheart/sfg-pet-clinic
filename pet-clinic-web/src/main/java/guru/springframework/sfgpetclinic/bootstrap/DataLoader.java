package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.service.model.Owner;
import guru.springframework.sfgpetclinic.service.model.Pet;
import guru.springframework.sfgpetclinic.service.model.PetType;
import guru.springframework.sfgpetclinic.service.model.Vet;
import guru.springframework.sfgpetclinic.service.service.OwnerService;
import guru.springframework.sfgpetclinic.service.service.PetService;
import guru.springframework.sfgpetclinic.service.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1= new Owner();
        owner1.setFirstName("Jaha");
        owner1.setLastName("Nazarov");

        ownerService.save(owner1);

        Pet cat= new Pet();
        cat.setOwner(owner1);
        PetType pett1=new PetType();
        pett1.setName("cat");
        cat.setPetType(pett1);

        petService.save(cat);

        Owner owner2= new Owner();
        owner2.setFirstName("Ahadjon");
        owner2.setLastName("Abduhalilov");

        ownerService.save(owner2);

        Pet dog= new Pet();
        dog.setOwner(owner2);
        PetType pett2= new PetType();
        pett2.setName("dog");
        dog.setPetType(pett2);

        petService.save(dog);

        Vet vet1= new Vet();
        vet1.setFirstName("Laziz");
        vet1.setLastName("Ibrohimov");

        Vet vet2= new Vet();
        vet2.setFirstName("Bahodirjon");
        vet2.setLastName("Rahimov");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("All data have been loaded.....");

    }
}
