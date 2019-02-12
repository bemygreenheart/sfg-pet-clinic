package guru.springframework.sfgpetclinic.service.service;

import guru.springframework.sfgpetclinic.service.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(Long id);

}
