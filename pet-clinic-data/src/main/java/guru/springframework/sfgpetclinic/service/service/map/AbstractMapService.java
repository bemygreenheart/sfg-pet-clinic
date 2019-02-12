package guru.springframework.sfgpetclinic.service.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map= new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    public T save(ID id, T object){
        map.put(id, object);
        return object;
    }
    public T findById(ID id){
        return map.get(id);
    }

    public void deleteById(ID id){
        map.remove(id);
    }
    public void delete(T object){
        map.entrySet().removeIf(entity ->entity.equals(object));
    }

}
