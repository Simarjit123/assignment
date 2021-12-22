class evenOrOdd {

	public static void main(String[] args) {
		int x = 1;
		x = x++ + ++x + x++ + ++x + ++x;
		System.out.println("Value of x : " + x);
		boolean isEven =x%2==0;
		System.out.println("value of x is even if remainder is 0:" +isEven);

	}

}