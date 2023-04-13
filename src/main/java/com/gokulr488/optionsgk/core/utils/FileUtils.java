package com.gokulr488.optionsgk.core.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gokulr488.optionsgk.core.OgkException;

public class FileUtils {

	private static Logger logger = LoggerFactory.getLogger(FileUtils.class);

	public static List<String> readFile(String file) throws OgkException {
		logger.debug("Reading all lines from file {}", file);
		try (BufferedReader buffer = new BufferedReader(new FileReader(file))) {
			List<String> lines = new ArrayList<>();
			while (true) {
				String line = buffer.readLine();
				if (line == null) {
					break;
				}
				lines.add(line);
			}
			return lines;
		} catch (Exception e) {
			logger.error("Unable to Read all lines from file {}", file, e);
			throw new OgkException("Unable to Read all lines from file " + file);
		}
	}

	public static void write(List<String> data, String file) throws OgkException {
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(file))) {
			for (String line : data) {
				buffer.write(line);
				buffer.newLine();
			}
		} catch (Exception e) {
			logger.error("Unable to Write to file {}", file, e);
			throw new OgkException("Unable to Write to file " + file);
		}

	}

}
