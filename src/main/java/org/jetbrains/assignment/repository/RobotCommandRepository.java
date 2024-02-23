package org.jetbrains.assignment.repository;

import org.jetbrains.assignment.model.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface RobotCommandRepository extends JpaRepository<Command, BigInteger> {
}
