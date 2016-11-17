
class ReturnTest{
	
	public static void main(String args[]) throws Exception{
		
		int a = 1, b = 2;
		
		Result res_main = new Result();
		
		res_main = calc(a, b);
		res_main.print();
		
	}
	
	// class
	public static class Result{
		int sum = 0, mul = 0;
		
		private void set (int a, int b){
			sum = a;
			mul = b;
		}
		
		private void print (){
			System.out.println("Sum is "+sum);
			System.out.println("Mul is "+mul);
		}
	}
	
	// method
	public static Result calc(int a, int b){
		
		int sum = a + b;
		int mul = a * b;
		
		Result res = new Result();
		
		res.set(sum, mul);
		
		return res;
	}

}