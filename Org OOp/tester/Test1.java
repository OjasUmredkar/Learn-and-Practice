package tester;

import com.app.core.*;

public class Test1 {

	public static void main(String[] args) {
		Emp e=new SalesMgr();
		System.out.println(e.computeSalary());
		System.out.println(e.getClass());//SalesMgr
		
		e=new TempWorker();
		System.out.println(e.computeSalary());
		System.out.println(e.getClass());//TempWorker
		
		Object ref;
		ref=e;
		System.out.println(ref.getClass());//TempWorker
		System.out.println(((Emp) ref).computeSalary());//Object class does not have this methods
		System.out.println(((TempWorker) ref).computeSalary());
		
		if(ref instanceof PermanentWorker ) {
		System.out.println(((PermanentWorker) ref).computeSalary());//class cast Exception
		}
		else {
			System.out.println("Not a permanent worker");
		}
		
		
		
			
		
	}

}
