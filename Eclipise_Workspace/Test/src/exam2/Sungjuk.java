package exam2;

public class Sungjuk {

	private String name[] = { "홍길동", "강호동", "유재석", "박명수" };
	private int krScore[] = { 60, 70, 80, 90 };
	private int enScore[] = { 75, 80, 55, 100 };

	public String[] getName() {
		return name;
	}

	public int[] getKrScore() {
		return krScore;
	}

	public int[] getEnScore() {
		return enScore;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public void setKrScore(int[] krScore) {
		this.krScore = krScore;
	}

	public void setEnScore(int[] enScore) {
		this.enScore = enScore;
	}

	public int sumKrScore() {
		int sum = 0;
		for (int i = 0; i < krScore.length; i++) {
			sum += krScore[i];
		}
		return sum;
	}

	public int sumEnScore() {
		int sum = 0;
		for (int i = 0; i < enScore.length; i++) {
			sum += enScore[i];
		}
		return sum;
	}

}
