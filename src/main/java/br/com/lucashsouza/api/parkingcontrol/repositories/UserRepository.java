package br.com.lucashsouza.api.parkingcontrol.repositories;

import br.com.lucashsouza.api.parkingcontrol.models.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<SystemUser, UUID> {

    Optional<SystemUser> findByUsername(String username);
}
