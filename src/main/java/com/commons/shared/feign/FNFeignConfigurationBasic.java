package com.commons.shared.feign;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface FNFeignConfigurationBasic<M, K> {

  @PostMapping("save")
  M insert(@RequestBody M model) throws Exception;

  @GetMapping("getLogin/{email}")
  M getByEmail(@PathVariable("email") String email);

  @PutMapping("update")
  M update(@RequestBody M model);

  @DeleteMapping("delete/{primaryKey}")
  Boolean deleteById(@PathVariable("primaryKey") K primaryKey);
}
