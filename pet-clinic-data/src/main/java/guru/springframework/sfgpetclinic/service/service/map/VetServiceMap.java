package guru.springframework.sfgpetclinic.service.service.map;

import guru.springframework.sfgpetclinic.service.model.Vet;
import guru.springframework.sfgpetclinic.service.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }
}
