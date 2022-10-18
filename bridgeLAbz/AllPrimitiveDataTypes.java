package bridgeLAbz;

public class AllPrimitiveDataTypes {
	int numbers;// which has a value range from 0 to 32,767.
	byte a;// 8-bit, It can have a value of (-128) to 127
	boolean isTrime;// It have two types of values, which are 'true' and 'false'.
	long phonNumber;// It is a 64-bit.
	float num;// we must end the value with an f.
	double D;// we must end the value with a d.
	char ch = 'A';// range of 0 to 65,535(16-bit).
	short s = 25;// range of -32,768 to 32,767,

	void dataTypeCheck(int number) {
		System.out.println("it is int data type " + number);
	}

	void dataTypeCheck(byte a) {
		System.out.println("it is byte data type " + a);
	}

	void dataTypeCheck(boolean isPrime) {
		System.out.println("it is boolean data type " + true);
	}

	void dataTypeCheck(long phonenumber) {
		System.out.println("it is long data type " + phonenumber);
	}

	void dataTypeCheck(float num) {
		System.out.println("it is float data type " + num);
	}

	void dataTypeCheck(double D) {
		System.out.println("it is int data type " + D);
	}

	public static void main(String[] args) {
		AllPrimitiveDataTypes obj = new AllPrimitiveDataTypes();
		obj.dataTypeCheck(4);
		obj.dataTypeCheck(false);
		obj.dataTypeCheck(2.5f);
		obj.dataTypeCheck(12345678);
	}

}
