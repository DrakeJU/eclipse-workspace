package Class0919.Exec;

import Class0919.Logic.TimeLogic;

public class TimeExec {

	public static void main(String[] args) throws Exception  {
		TimeLogic ob = new TimeLogic();
		System.out.println(ob.getTimeFormat("","dd/MM/yyyy hh:mm:ss"));
		System.out.println(ob.getTimeFormat("201709190", "dd/MM/yyyy hh:mm:ss"));
	}

}
