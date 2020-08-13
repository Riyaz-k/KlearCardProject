package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateReport(String str) {
		File file = new File(System.getProperty("user.dir")+ "\\Report\\JvmReport");
		Configuration config = new Configuration(file, "Klear Card App");
		
		config.addClassifications("Platform", "Windows");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Environment", "testing");
			
		List<String> list = new ArrayList<String>();
		list.add(str);
		ReportBuilder builder = new ReportBuilder(list, config);
		builder.generateReports();
	}
	

}
