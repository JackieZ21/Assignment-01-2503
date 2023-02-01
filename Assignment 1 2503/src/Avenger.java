public class Avenger implements Comparable<Avenger> {
	private String alias;
	private String lastName;
	private int frequency;
	private int order;

	public Avenger(String alias, String lastName) {
		this.alias = alias;
		this.lastName = lastName;
		this.frequency = 1;
		this.order = 0;
	}

	public String getAlias() {
		return alias;
	}

	public String getLastName() {
		return lastName;
	}

	public int getFrequency() {
		return frequency;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public void increaseFrequency() {
		frequency++;
	}

	@Override
	public int compareTo(Avenger o) {
		if (this.frequency == o.frequency) {
			if (this.order < o.order) {
				return -1;
			} else if (this.order > o.order) {
				return 1;
			} else {
				return 0;
			}
		} else if (this.frequency < o.frequency) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return this.alias + " " + this.lastName + " " + this.frequency;
	}
}
