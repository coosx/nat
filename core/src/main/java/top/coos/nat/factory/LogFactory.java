package top.coos.nat.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LogFactory {

	public static Logger get(Class<?> clazz) {

		Logger logger = LoggerFactory.getLogger(clazz);
		return logger;
	}

	public static Logger get(String className) {

		Logger logger = LoggerFactory.getLogger(className);
		return logger;
	}

	/**
	 * @return 获得日志，自动判定日志发出者
	 */
	public static Logger get() {

		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		return get(stackTrace[2].getClassName());
	}

}
