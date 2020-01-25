
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


public class LogonAction extends Action
{

    public ActionForward perform(ActionMapping mapping,
   				 ActionForm form,
   				 HttpServletRequest request,
   				 HttpServletResponse response)
   	throws IOException, ServletException {


       LogonForm logonForm = (LogonForm) form;

       System.out.println(logonForm);

       System.out.println(logonForm.getUsername());
       System.out.println(logonForm.getPassword());

       if(logonForm.getUsername().equals("test") && logonForm.getPassword().equals("test"))
       {

         //TableForm tform = new TableForm();
         //tform.setRowsize(2);

         //tform.getRows(0).setColsize(2);
         //tform.getRows(1).setColsize(2);


         //request.getSession().setAttribute("tableForm",tform);

         TableForm.setRowsize(2);
         Row.setColsize(2);

         return mapping.findForward("success");



       }
       else
       {

		 ActionErrors errors = new ActionErrors();
		 errors.add("password",
                new ActionError("error.password.mismatch"));

                saveErrors(request, errors);

         //logonForm.setErrors("LoginError");

         return mapping.findForward("failure");


       }

     }

}