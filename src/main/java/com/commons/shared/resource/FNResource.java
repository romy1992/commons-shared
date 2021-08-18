package com.commons.shared.resource;

import com.commons.shared.mapper.FNMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(
    origins = {
      "http://localhost:4200",
      "http://localhost:8100",
      "http://localhost:8200",
      "http://localhost:8101",
      "http://localhost:8201"
    })
public abstract class FNResource<M, K, E, R extends JpaRepository<?, ?>, C extends FNMapper> {

  @Autowired protected R repository;

  @Autowired protected C mapper;

  @PostMapping(value = "save/entity")
  public abstract M insert(@RequestBody M model);

  @GetMapping("get/entity/{primaryKey}")
  public abstract M getById(@PathVariable("primaryKey") K primaryKey);

  @PutMapping("update/entity")
  public abstract M update(@RequestBody M model);

  @DeleteMapping("delete/entity/{primaryKey}")
  public abstract boolean deleteById(@PathVariable("primaryKey") K primaryKey);

  @GetMapping(value = "getAll/entities/{id}")
  public abstract List<M> getAll(@PathVariable("id") K primaryKey);

  @PostMapping("search")
  public abstract List<M> search(M model);
}
