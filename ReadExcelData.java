package writeExcel;
//zapuskajem dwa konstructora z dataconfig to read excel
import lib.dataconfig;

public class ReadExcelData {

	public static void main(String[] args) {
		dataconfig excel = new dataconfig("C:\\Users\\vkoloyu\\test.xlsx");
		System.out.println (excel.getData(0, 0, 0));
	}

}
