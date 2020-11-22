package com.osa.learning.english.repo;

import com.osa.learning.english.model.persistence.WordEntity;
import org.springframework.data.repository.CrudRepository;

public interface WordRepository extends CrudRepository<WordEntity, Long> {
}
