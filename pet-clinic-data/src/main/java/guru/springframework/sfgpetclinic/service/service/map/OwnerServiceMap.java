package guru.springframework.sfgpetclinic.service.service.map;

import guru.springframework.sfgpetclinic.service.model.Owner;
import guru.springframework.sfgpetclinic.service.service.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findByLastName(Long id) {
        return null;
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}
