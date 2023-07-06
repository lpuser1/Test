package myprogram.myprogram;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Employee {
	int eid;
	int depno;
	String ename;
	String job;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(depno);
		System.out.println(ename);
		System.out.println(job);
		System.out.println();
	}
	

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eid=1;
		emp1.depno=10;
		emp1.ename="dave";
		emp1.job="emp";
		
		emp1.display();	

	}

}
