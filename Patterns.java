package Patterns;

public class Patterns {

	public static void main(String[]  args) {
		// TODO Auto-generated method stub
		Patterns obj = new Patterns();
//		obj.Patterns_1();
//		obj.Patterns_1_2();
//		obj.Patterns_1_3();
//		obj.Patterns_1_4();
//		obj.Patterns_1_5();
//		obj.Patterns_1_6();
//		obj.Patterns_2();
//		obj.Patterns_2_2();
//		obj.Patterns_2_3();
//		obj.Patterns_2_4();
//		obj.Patterns_2_5();
//		obj.Patterns_3();
//		obj.Patterns_3_2();
//		obj.Patterns_3_3();
//		obj.Patterns_3_4();
//		obj.Patterns_3_5();
//		obj.Patterns_4();
//		obj.Patterns_4_2();
//		obj.Patterns_4_3();
//		obj.Patterns_4_4();
//		obj.Patterns_4_5();
	}

	private void Patterns_4_5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int i=row;i<=5;i++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

	private void Patterns_4_4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int i=5;i>=row;i--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_4_3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int i=row;i<=5;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_4_2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int i=5;i>=row;i--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int i=5;i>=row;i--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void Patterns_3_5() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row-1;col++) {
				System.out.print("  ");
			}
			for(int i=6-row;i>=1;i--) {
				System.out.print(i+" ");
				}
			System.out.println();
		}
	}

	private void Patterns_3_4() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row-1;col++) {
				System.out.print("  ");
			}
			for(int i=1;i<=6-row;i++) {
				System.out.print("1 ");
				}
			System.out.println();
		}
	}

	private void Patterns_3_3() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row-1;col++) {
				System.out.print("  ");
			}
			for(int i=1;i<=6-row;i++) {
				System.out.print(row+" ");
				}
			System.out.println();
		}
	}

	private void Patterns_3_2() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row-1;col++) {
				System.out.print("  ");
			}
			for(int i=1;i<=6-row;i++) {
				System.out.print(i+" ");
				}
			System.out.println();
		}
	}

	private void Patterns_3() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int i=1;i<=6-row;i++) {
				System.out.print("* ");
				}
			System.out.println();
		}
	}

	private void Patterns_2_5() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_2_4() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

	private void Patterns_2_3() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_2_2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void Patterns_1_6() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_1_5() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

	private void Patterns_1_4() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_1_3() {
		// TODO Auto-generated method stub
		int b=1;
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=b;col--) {
				System.out.print(col+" ");
			}
			b++;
			System.out.println();
		}
	}

	private void Patterns_1_2() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void Patterns_1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}


}
