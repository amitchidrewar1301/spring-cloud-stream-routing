package com.example.cloudstreamkafkabinder.functional;

import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

@Configuration
public class ConsumeMessageFunction {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConsumeMessageFunction.class);

  @Bean
  public Consumer<Message<String>> consume() {
    return rightToBeForgottenResponseMessage -> {
      System.out.println("Function for consuming the message: " + rightToBeForgottenResponseMessage.toString());
    };
  }

  @Bean
  public Consumer<Message<String>> anotherConsume() {
    return rightToBeForgottenResponseMessage -> {
      System.out.println("Another function for consuming the message: " + rightToBeForgottenResponseMessage.toString());
    };
  }

  @Bean
  public KafkaheaderMapperTest kafkaheaderMapperTest() {
    KafkaheaderMapperTest kafkaheaderMapperTest = new KafkaheaderMapperTest();
    kafkaheaderMapperTest.addTrustedPackages("com.example.cloudstreamkafkabinder.functional");
    kafkaheaderMapperTest.addRawMappedHeader("testKey", true);
    return kafkaheaderMapperTest;
  }

//  @Bean
//  public MessageRoutingCallback customRouter() {
//    return new MessageRoutingCallback() {
//      @Override
//      public FunctionRoutingResult routingResult(Message<?> message) {
//        if (!ObjectUtils.isEmpty(message.getHeaders().get("test-key")) &&
//            message.getHeaders().get("test-key").toString().equalsIgnoreCase("consume")) {
//          return new FunctionRoutingResult("consumeMessage");
//        } else if (!ObjectUtils.isEmpty(message.getHeaders().get("test-key")) &&
//            message.getHeaders().get("test-key").toString().equalsIgnoreCase("anotherConsume")) {
//          return new FunctionRoutingResult("anotherConsumeMessage");
//        }
//        return MessageRoutingCallback.super.routingResult(message);
//      }
//    };
//  }

}
