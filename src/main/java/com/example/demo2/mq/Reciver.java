package com.example.demo2.mq;

import com.example.demo2.vo.UserVO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Reciver {

  @RabbitListener(queues = "queue")
  public void process(String str){
    System.out.println("Receive:"+str);
  }

  @RabbitListener(queues = "queue")
  public void processVO(UserVO userVO){
    System.out.println("Receive:"+userVO);
  }
}
