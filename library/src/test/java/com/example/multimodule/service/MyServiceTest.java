package com.example.multimodule.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * MyServiceTest.
 *
 * @author Bipin Thite
 */
@SpringBootTest("service.message=Hello")
@SuppressWarnings("PMD.BeanMembersShouldSerialize")
public class MyServiceTest {

  @Autowired private MyService myService;

  @Test
  public void contextLoads() {
    assertThat(myService.message()).isNotNull();
  }

  @SpringBootApplication
  static class TestConfiguration {}
}
