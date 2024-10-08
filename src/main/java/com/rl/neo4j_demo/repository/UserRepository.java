package com.rl.neo4j_demo.repository;


import com.rl.neo4j_demo.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, Long> {
}
