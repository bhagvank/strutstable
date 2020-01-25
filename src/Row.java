
import java.util.Vector;
public class Row
{



  private static int colsize;

  private Column[] columns;

  public void setColumns(Column[] columns)
  {
    System.out.println("SetColumns");
    this.columns = columns;

  }

  public void setColumn(int i, Column column)
  {

	  System.out.println("setting"+ i+"th column"+column);

  }

  public Column[] getColumns()
  {

    return null;

  }


  public Column getColumns(int i)
  {
   System.out.println("Column"+i);
   System.out.println("Colsize"+colsize);

   if(columns == null)
   {

      columns= new Column[colsize];

   }
   if(columns[i] == null)
   {

    columns[i] = new Column();
   }
   return columns[i];
  }

  public int getColsize()
   {
	   return colsize;
   }

  public static void setColsize(int size)
  {
	  colsize = size;
  }

}