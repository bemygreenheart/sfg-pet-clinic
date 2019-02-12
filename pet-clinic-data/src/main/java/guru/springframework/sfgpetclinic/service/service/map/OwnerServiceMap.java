package guru.springframework.sfgpetclinic.service.service.map;

import guru.springframework.sfgpetclinic.service.model.Owner;
import guru.springframework.sfgpetclinic.service.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
}
