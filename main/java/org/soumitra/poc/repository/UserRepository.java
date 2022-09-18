package org.soumitra.poc.repository;

import org.soumitra.poc.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {

}
