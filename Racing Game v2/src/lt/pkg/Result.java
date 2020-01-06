package lt.pkg;

import java.util.ArrayList;

public class Result {

	private ArrayList<String> placements;
	private ArrayList<Integer> hours;

	public Result() {
		this.placements = new ArrayList<String>();
		this.hours = new ArrayList<Integer>();
	}

	public void record(String car, int hour) {
		if (!this.placements.contains(car)) {
			this.placements.add(car);
			this.hours.add(hour);
		}
	}

	public void printResult() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Result:");
		for (int i = 0; i < this.placements.size(); i++) {
			System.out.println((i + 1) + "# " + this.placements.get(i) + " in " + this.hours.get(i) + " hours");
		}
	}

}
