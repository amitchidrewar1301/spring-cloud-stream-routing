package com.example.cloudstreamkafkabinder.functional;

import org.springframework.kafka.support.DefaultKafkaHeaderMapper;

public class KafkaheaderMapperTest extends DefaultKafkaHeaderMapper {

  @Override
  public void addRawMappedHeader(String name, boolean toString) {
    super.addRawMappedHeader(name, toString);
  }

  @Override
  public void addTrustedPackages(String... packagesToTrust) {
    super.addTrustedPackages(packagesToTrust);
  }
}
