package MenusList;

import CommanFunction.ExcelRead;
import CommanFunction.WriteExcel;

public class RW {

	public ExcelRead data = new ExcelRead("C:\\Users\\Arati\\workspace\\MenusJibeTesting\\Excel\\ReadWrite.xlsx"); // Read excel path

	public WriteExcel write_data = new WriteExcel("C:\\Users\\Arati\\workspace\\MenusJibeTesting\\Excel\\ReadWrite.xlsx");



	public String url = data.getData(0, 1, 1); // get the url from excel sheet

	public String Dashboard = data.getData(0, 2, 1); // Comman page when any error oc




}
