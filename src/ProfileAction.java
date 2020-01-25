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

import org.apache.struts.actions.DispatchAction;


public class ProfileAction extends DispatchAction
{

  public ActionForward edit(ActionMapping mapping,
     				 ActionForm form,
     				 HttpServletRequest request,
     				 HttpServletResponse response)
     	throws IOException, ServletException {

       return mapping.findForward("edit");


   }
   public ActionForward save(ActionMapping mapping,
        				 ActionForm form,
        				 HttpServletRequest request,
        				 HttpServletResponse response)
        	throws IOException, ServletException {

          return mapping.findForward("show");


   }

}
