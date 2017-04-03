scripts custom function spreadsheet tool>script editor
/**
functionss1
@customFunction
*/

function FUU1 (args){
var total=0;
  for (var i=0; i<args.length; i++)  {total = total + parseInt(args[i]); }
  return total; }


/**
functionss2
@customFunction
*/

function FUU2 (args){
  if (args[2]>444) {
    return parseInt(args[7])+parseInt(args[11]);}

  else {return "args[2]<444"}


}

/**
functionss3
@customFunction
*/

function FUU3 (args){
  var myObj = args[4];
if(myObj=="17") {
    return "seventeen";
} else {
    return 1;
}


}



++++++++++++===========================================================================================





package keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	Workbook wbWorkbook;
	Sheet shSheet;

	public void openSheet(String filePath) {
		FileInputStream fs;
		try {
			fs = new FileInputStream(filePath);
			wbWorkbook = Workbook.getWorkbook(fs);
			shSheet = wbWorkbook.getSheet(0);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getValueFromCell(int iColNumber, int iRowNumber) {
		return shSheet.getCell(iColNumber, iRowNumber).getContents();
	}

	public int getRowCount() {
		return shSheet.getRows();
	}

	public int getColumnCount() {
		return shSheet.getColumns();
	}
}
