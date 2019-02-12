package guru.springframework.sfgpetclinic.service.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private Owner owner;
    private PetType petType;
    private LocalDate birthDate;

    public Pet() {
    }

    public Pet(Owner owner, PetType petType, LocalDate birthDate) {
        this.owner = owner;
        this.petType = petType;
        this.birthDate = birthDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
