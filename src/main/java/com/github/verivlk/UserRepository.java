package com.github.verivlk;

import com.github.verivlk.entities.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EntityScan(basePackages = "com.github.verivlk.entities")
@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
