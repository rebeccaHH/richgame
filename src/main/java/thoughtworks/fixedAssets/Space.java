package thoughtworks.fixedAssets;

public class Space {
	public static final String symbol = "0";
	public static final int level = 0;
	protected int positionNumber;
	protected int buyFunds;
	protected int upgradeFunds;
	protected int passToll;
	
	public Space(int positionNumber){
		this.positionNumber = positionNumber;
		if((positionNumber>0 && positionNumber<14)
				||(positionNumber>14 && positionNumber<28)){
			buyFunds = 200;
		}
		else if(positionNumber>28 && positionNumber<35){
			buyFunds = 500;
		}
		else if((positionNumber>35 && positionNumber<49)
				||(positionNumber>49 && positionNumber<63)){
			buyFunds = 300;
		}
		upgradeFunds = buyFunds;
		passToll = buyFunds / 2;
	}
	
	public int getPositionNumber(){
		return positionNumber;
	}
	
	public int getBuyFunds(){
		return buyFunds;
	}
	
	public int getUpgradeFunds(){
		return buyFunds;
	}
	
	public int getPassToll(){
		return passToll;
	}
}
