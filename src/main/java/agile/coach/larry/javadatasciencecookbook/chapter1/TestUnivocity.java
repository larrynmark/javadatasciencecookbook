package agile.coach.larry.javadatasciencecookbook.chapter1;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import com.univocity.parsers.common.processor.RowListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

public class TestUnivocity {

	public static void main(String[] args) {
		TestUnivocity test = new TestUnivocity();
		test.parseCSV("./testCSV.csv");
	}

	public void parseCSV(String fileName) {
		CsvParserSettings parserSettings = new CsvParserSettings();
		parserSettings.setLineSeparatorDetectionEnabled(true);
		RowListProcessor rowProcessor = new RowListProcessor();
		parserSettings.setProcessor(rowProcessor);
		parserSettings.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(parserSettings);
		parser.parse(new File(fileName));

		List<String[]> rows = rowProcessor.getRows();
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(Arrays.asList(rows.get(i)));
		}
	}
}
