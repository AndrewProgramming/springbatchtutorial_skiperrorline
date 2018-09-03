package com.zhiyueinfo.springbatch.csvtomysql;

import com.zhiyueinfo.springbatch.csvtomysql.listener.LogSkipListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvtomysqlApplication {

  private static final Log LOGGER = LogFactory.getLog(LogSkipListener.class);


  public static void main(String[] args) throws Exception {
    SpringApplication.run(CsvtomysqlApplication.class, args);
  }
}
