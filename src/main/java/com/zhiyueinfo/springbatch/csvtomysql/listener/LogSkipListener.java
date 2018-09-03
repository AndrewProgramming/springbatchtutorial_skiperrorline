package com.zhiyueinfo.springbatch.csvtomysql.listener;

import com.zhiyueinfo.springbatch.csvtomysql.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.SkipListener;

/**
 * @author Tobias Flohre
 */
public class LogSkipListener implements SkipListener<User, User> {

  private static final Log LOGGER = LogFactory.getLog(LogSkipListener.class);

  public void onSkipInProcess(User user, Throwable throwable) {
    LOGGER.info("User was skipped in process: " + user + ".", throwable);
  }

  public void onSkipInRead(Throwable arg0) {
    LOGGER.info("User was skipped in read: " +arg0);

  }

  public void onSkipInWrite(User arg0, Throwable arg1) {
  }

}
