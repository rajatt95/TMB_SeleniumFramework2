/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.exceptions;

@SuppressWarnings("serial")
public class InvalidRemoteWebDriverURLException extends FrameworkException {

	public InvalidRemoteWebDriverURLException(String message) {
		super(message);
	}

	public InvalidRemoteWebDriverURLException(String message, Throwable cause) {
		super(message, cause);
	}

}
