package com.learning.processor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessorController {

  @GetMapping("/status")
  public String getProcessorAppStatus(){
    return "Processor App is working";
  }

  @GetMapping("/")
  public String dummy(){
    return "Processor App is working";
  }

}
