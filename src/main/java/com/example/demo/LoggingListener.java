package com.example.demo;

import java.io.IOException;

import org.apache.activemq.transport.TransportListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Filip Hrisafov
 */
public class LoggingListener implements TransportListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingListener.class);
	@Override
	public void onCommand(Object command) {
		LOGGER.info("On Command: {}", command);
	}

	@Override
	public void onException(IOException error) {
		LOGGER.info("On Exception", error);
	}

	@Override
	public void transportInterupted() {
		LOGGER.info("Transport Interrupted");
	}

	@Override
	public void transportResumed() {
		LOGGER.info("Transport Resumed");
	}
}
