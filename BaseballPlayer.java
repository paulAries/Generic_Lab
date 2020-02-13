package generic_Lab;
/**A baseball player 
 * **/
public class BaseballPlayer implements Measurable {
   private double battingAverage;
   private String name;
   private String team;
   /**Constructs a baseball player with a zero batting average.
    * */
	public BaseballPlayer() {
		battingAverage=0;
		name="";
		team="";
	}
	/** Constructs a baseball player with a given name, team and batting average.
	 @param batavg the batting average
	 @param name player name
	 @param team player's name*/
	public BaseballPlayer(String name,String team,double batavg) {
		battingAverage=batavg;
		this.name=name;
		this.team=team;
	}
	/**Get the name of the player.
	 * @return get the player's name
	 * */
	public String getName() {
		return name;
	}
	/*Get the team of the player.
	 @return the player's team  
	 * */
	public String getTeam() {
		return team;
	}
	/**Get the batting average of the player
	 * @return the batting average
	 * **/
	public double getBattingAverage() {
		return battingAverage;
	}
	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		return battingAverage;
	}

}
