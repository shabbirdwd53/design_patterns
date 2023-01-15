package com.dailycodebuffer.command;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Command is a behavioral design pattern that turns a request into a stand-alone object that contains all
 * information about the request. This transformation lets you pass requests as a method arguments, delay
 * or queue a request’s execution, and support undoable operations.
 *
 * Reference: https://refactoring.guru/design-patterns/command
 * 			  https://www.baeldung.com/java-command-pattern
 */

@SpringBootApplication
public class CommandApplication {

	public static void main(String[] args) {
		TextFileOperationExecutor textFileOperationExecutor
				= new TextFileOperationExecutor();
		textFileOperationExecutor.executeOperation(
				new OpenTextFileOperation(new TextFile("file1.txt")));
		textFileOperationExecutor.executeOperation(
				new SaveTextFileOperation(new TextFile("file2.txt")));
	}

}
