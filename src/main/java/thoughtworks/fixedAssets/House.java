package thoughtworks.fixedAssets;

import java.text.DecimalFormat;

public class House extends Space {
	public static final String symbol = "2";
	public static final int level = 2;
	protected int upgradeFunds;
	protected int passToll;
	
	public House(int positionNumber){
		super(positionNumber);
		this.upgradeFunds = super.getUpgradeFunds();
		this.passToll = super.getPassToll() * Integer.parseInt(
				new DecimalFormat("0").format(Math.pow(2, level)));
	}
	
	public int getUpgradeFunds(){
		return this.upgradeFunds;
	}
	
	public int getPassToll(){
		return this.passToll;
	}
}
