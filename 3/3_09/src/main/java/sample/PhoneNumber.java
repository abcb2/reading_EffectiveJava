package sample;

public class PhoneNumber {
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;
	public PhoneNumber(int areaCode, int prefix, int lineNumber){
		this.areaCode = (short)areaCode;
		this.prefix = (short)prefix;
		this.lineNumber = (short)lineNumber;
	}
	@Override
	public int hashCode(){
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + prefix;
		result = 31 * result + lineNumber;
		return result;
	}
}
