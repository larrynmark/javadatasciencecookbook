package agile.coach.larry.javadatasciencecookbook.chapter3;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.math3.stat.Frequency;

public class FrequencyStats {

	public static void main(String[] args) {
		double[] values = { 32, 39, 14, 98, 45, 44, 45, 34, 89, 67, 0, 15, 0, 56, 88 };
		FrequencyStats freqTest = new FrequencyStats();
		freqTest.getFreqStats(values);
	}

	public void getFreqStats(double[] values) {
		Frequency freq = new Frequency();
		for (int i = 0; i < values.length; i++) {
			freq.addValue(values[i]);
		}

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " : " + freq.getCount(values[i]));
		}
		
		System.out.println("===========");
		
		Set<Double> set = new HashSet<Double>();
		
		for (int i = 0; i < values.length; i++) {
			set.add(values[i]);
		}
	
		for (double val : set) {
			System.out.println(val + " : " + freq.getCount(val));
		}
		
	}
}
