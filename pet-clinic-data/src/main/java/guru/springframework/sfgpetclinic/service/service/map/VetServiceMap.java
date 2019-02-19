package guru.springframework.sfgpetclinic.service.service.map;

import guru.springframework.sfgpetclinic.service.model.Vet;
import guru.springframework.sfgpetclinic.service.service.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
