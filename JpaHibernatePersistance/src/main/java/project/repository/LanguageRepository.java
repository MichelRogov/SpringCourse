package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.model.user.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
