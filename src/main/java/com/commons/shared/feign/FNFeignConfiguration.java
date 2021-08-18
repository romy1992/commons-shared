package com.commons.shared.feign;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface FNFeignConfiguration<M, K> {

  @PostMapping("{type}/save/entity")
  M insert(@PathVariable("type") String type, @RequestBody M model) throws Exception;

  @GetMapping("{type}/get/entity/{primaryKey}")
  M getById(@PathVariable("type") String type, @PathVariable("primaryKey") K primaryKey);

  @PutMapping("{type}/update/entity")
  M update(@PathVariable("type") String type, @RequestBody M model);

  @DeleteMapping("{type}/delete/entity/{primaryKey}")
  M deleteById(@PathVariable("type") String type, @PathVariable("primaryKey") K primaryKey);

  @GetMapping("{type}/getAll/entities")
  List<M> getAll(@PathVariable("type") String type);

  @PostMapping("{type}/search")
  List<M> search(@PathVariable("type") String type, @RequestBody M model);
}
