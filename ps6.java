public class ps6 {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i=3;
		long l=87933;
		float f=19.57F;
		double d=60.7D;
		char c='d';
		boolean b2=true;
		
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=b2;
		
		System.out.println("............Printing object........");
		System.out.println("Byte object"+ byteobj);
		System.out.println("Short object"+ shortobj);
		System.out.println("Integer object"+ intobj);
		System.out.println("Long object"+ longobj);
		System.out.println("Float object"+ floatobj);
		System.out.println("Double object"+ doubleobj);
		System.out.println("Character object"+ charobj);
		System.out.println("Boolean object"+ booleanobj);
		
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean booleanvalue=booleanobj;
		
		System.out.println("............Printing values........");
		System.out.println("Byte value"+ bytevalue);
		System.out.println("Short value"+ shortvalue);
		System.out.println("Integer value"+ intvalue);
		System.out.println("Long value"+ longvalue);
		System.out.println("Float value"+ floatvalue);
		System.out.println("Double value"+ doublevalue);
		System.out.println("Character value"+ charvalue);
		System.out.println("Boolean value"+ booleanvalue);
	}

}
