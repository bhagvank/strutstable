import java.io.IOException;
import java.util.Hashtable;
import java.util.Locale;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.util.MessageResources;


public class TableAction extends Action
{


  public ActionForward perform(ActionMapping mapping,
     				 ActionForm form,
     				 HttpServletRequest request,
     				 HttpServletResponse response)
   	throws IOException, ServletException {



        TableForm aForm = (TableForm) form;

        System.out.println(aForm.getRows(0).getColumns(0).getValue());
        System.out.println("00 processed");
        System.out.println(aForm.getRows(0).getColumns(1).getValue());
        System.out.println(aForm.getRows(1).getColumns(0).getValue());
        System.out.println(aForm.getRows(1).getColumns(1).getValue());
   	    return mapping.findForward("success");











   	}

























}