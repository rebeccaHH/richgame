package thoughtworks.functionClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Input {
	public static String getString(){
		BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));
		try {
			return stdin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int getInteger() {
		while (true) {
			try {
				return Integer.parseInt(getString());
			} catch (Exception e) {
				System.out.println("请输入数字");
			}
		}
	}

	public static boolean isIntegerInArea(int number, int min, int max) {
		if(number > max || number < min){
			System.out.println("请输入" + min + "~" + max + "以内的数字");
			return false;
		}
		else{
			return true;
		}
	}
	
	public static boolean isInputCommandEquals(String command){
		return getString().equalsIgnoreCase(command);
	}
	
	public static boolean isInputAnInteger(String input){
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			System.out.println("请输入数字");
			return false;
		}
	}
	
	public static boolean isInputAnIntegerInArea(String input, int min, int max){
		return isInputAnInteger(input) && isIntegerInArea(Integer.parseInt(input), min, max); 
	}
	
	public static int throwDice() {
		return new Random().nextInt(5) + 1;
	}

	public static boolean isInputAnIntegerInArea(String parameter, int setrange) {
		return isInputAnIntegerInArea(parameter, -setrange, setrange);
	}
}
