package generic_Lab;

/**Computes the average of a set of data values
 * **/
public class DataSetGen <T extends Measurable> // we have to change this part of the program to make it GENERIC 
{
	private double sum;
	private T maximum;
	private int count;	
/**Construct an empty data set 
 * **/
	public DataSetGen() {
		sum=0;
		count=0;
		maximum=null;
	}
	/*Add a data value to the data set 
	 @param x data value* **/
	public void add(T x) {// replace Measurable for T 
		sum=sum+x.getMeasure();
		if(count==0||maximum.getMeasure()<x.getMeasure())
			maximum=x;
		count++;
	}
/** Get the average of the added data 
 * @return the average or 0 if no data has been added**/
	public double getAverage() {
		if(count==0)return 0;
		else return sum/count;
	}
/**Get the largest of the added data 
 * @return the maximum or 0 if no data has been added**/
	public T getMaximum() {  // replace Measurable for T
		return maximum;
	}
}

