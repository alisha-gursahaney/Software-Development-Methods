import java.util.Comparator;

public class CompareByWinsLossesChamps implements Comparator<BasketBallTeam> {
	
	public int compare(BasketBallTeam a, BasketBallTeam b){
		return 0;
	
	public int compareTo(CompareByWinsLossesChamps other) {
		// int nameCompare = this.name.compareTo(other.toString());
		// if (nameCompare != 0) {
			// return nameCompare;
		// }
		int winsCompare = BasketBallTeam.this.numberOfWins.compareTo(other.BasketBallTeam.getNumberOfWins());
		return winsCompare;
		}
		
	public int compareTo(CompareByWinsLossesChamps other) {
		int lossCompare = BasketBallTeam.this.numberOfLosses.compareTo(other.BasketBallTeam.getNumberOfLosses());
		return lossCompare;
		}
	}
	}

