package com.commons.shared.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public abstract class FNResourceMinor<E, K, R extends JpaRepository<?, ?>> {

  @Autowired public R repository;

  @PostMapping(value = "save/entity")
  public abstract E insert(@RequestBody E model) throws Exception;

  @GetMapping("get/entity/{primaryKey}")
  public abstract E getById(@PathVariable("primaryKey") K primaryKey);

  @PutMapping("update/entity")
  public abstract E update(@RequestBody E model);

  @DeleteMapping("delete/entity/{primaryKey}")
  public abstract boolean deleteById(@PathVariable("primaryKey") K primaryKey);

  @GetMapping(value = "getAll/entities")
  public abstract List<E> getAll();

  @GetMapping("search")
  public abstract List<E> search(E model);
}
