import org.apache.struts.action.ActionForm;

import java.util.Vector;
public class TableForm extends ActionForm
{

 private static int rowsize;

 private Row[] rows;


 public Row getRows(int i)
 {

   System.out.println("Row"+i);
   System.out.println("Rowsize"+rowsize);

   if(rows == null)
   {
    rows = new Row[rowsize];
   }
   if(rows[i] == null)
   {
    rows[i] = new Row();
   }

   return rows[i];

 }

  public Row[] getRows()
 {

	 return null;
 }

 public void setRows(Row[] rows)
 {

	 System.out.println("SetRows");

	// this.rows=rows;
 }

 public static void setRowsize(int size)
 {

	 rowsize = size;
 }

 public int getRowSize()
 {
	 return rowsize;
 }




}