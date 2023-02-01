
/**
 * 
 * @author Jackie Zheng, Jayden Eusebio-Wong, Jordan Mercurio
 * this class is for Avenger 
 * which represents their alias and frequency 
 */
public class Avenger implements Comparable<Avenger> {
	private String alias;
	private String lastName;
	private int frequency;
	private int order;
	
	/**
	 * The constructor for the Avenger class
	 * @param alias The alias of the Avenger
	 * @param lastName The last name of the Avenger 
	 */
	public Avenger(String alias, String lastName) {
		this.alias = alias;
		this.lastName = lastName;
		this.frequency = 1;
		this.order = 0;
	}
	/**
	 * Returns the Avenger's alias
	 * @return the Avenger's alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * get the Avenger's last name
	 * @return Avenger's last name 
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Return the Avenger's frequency
	 * @return the frequency of the Avenger
	 */
	public int getFrequency() {
		return frequency;
	}
	/**
	 * get the Avenger's order
	 * @return The Avenger's order
	 */
	public int getOrder() {
		return order;
	}
	/**
	 * Sets the Avenger order 
	 * @param order the order to set Avenger
	 */
	public void setOrder(int order) {
		this.order = order;
	}
	/**
	 * increase the Avenger's frequency by 1
	 */
	public void increaseFrequency() {
		frequency++;
	}
	/**
	 * Compares the Avenger to the specified Avenger's which is based on their 
	 * frequency and order
	 * Avenger's that have a higher frequency are sorted higher (top of list) and vice versa
	 * @param o the Avenger who is compared
  	 * @return a zero, negative, or a positive integer as this Avenger is  equal to, less than, or greater than the  Avenger specified.
	 */
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
	/**
	 * return the Avenger objects that with alias + last name and frequency in proper formatting
	 */
	@Override
	public String toString() {
		return this.alias + " " + this.lastName + " " + this.frequency;
	}
}
