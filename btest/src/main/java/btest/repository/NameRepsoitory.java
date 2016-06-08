package btest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import btest.domain.Name;

@Transactional(readOnly = true)
public interface NameRepsoitory extends CrudRepository<Name, Long> {
	
	List<Name> findByName(String name);
	List<Name> findAgeByName(String name);
	long removeByName(String name);

}
