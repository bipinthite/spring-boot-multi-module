package com.example.multimodule.application;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.multimodule.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * DemoApplicationTest.
 *
 * @author Bipin Thite
 */
@SpringBootTest
@SuppressWarnings("PMD.BeanMembersShouldSerialize")
class DemoApplicationTest {

  @Autowired private MyService myService;

  @Test
  void contextLoads() {
    assertThat(myService.message()).isNotNull();
  }
}
