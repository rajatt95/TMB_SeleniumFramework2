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
public class InvalidPathForExtentReportFileException extends InvalidPathForFilesException {

	public InvalidPathForExtentReportFileException(String message) {
		super(message);
	}

	public InvalidPathForExtentReportFileException(String message, Throwable cause) {
		super(message, cause);
	}

}
