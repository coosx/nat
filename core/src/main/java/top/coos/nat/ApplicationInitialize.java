package top.coos.nat;

import org.slf4j.Logger;

import top.coos.nat.factory.LogFactory;

public class ApplicationInitialize {

	static Logger log = LogFactory.get();

	public static void initialize(Class<?> clazz) {

		log.info(clazz + " initialize start");

		log.info(clazz + " initialize end");
	}
}
