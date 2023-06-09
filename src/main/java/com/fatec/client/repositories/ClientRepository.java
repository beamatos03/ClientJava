package com.fatec.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
