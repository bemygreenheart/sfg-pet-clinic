package guru.springframework.sfgpetclinic.service.service.map;

import guru.springframework.sfgpetclinic.service.model.Pet;
import guru.springframework.sfgpetclinic.service.service.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet,Long> {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

}
