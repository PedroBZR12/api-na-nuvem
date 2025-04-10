package me.dio.api_na_nuvem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.api_na_nuvem.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
