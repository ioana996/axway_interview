package com.axway.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.axway.restservice.entity.Vertex;
import org.springframework.data.rest.core.annotation.RestResource;

//@RepositoryRestResource(path = "/vertices")
@RestResource(exported = false)
public interface VertexRepository extends JpaRepository<Vertex, Integer> {

}
