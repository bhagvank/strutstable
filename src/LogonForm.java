import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


public class LogonForm extends ActionForm
{


  private String username;

  private String password;

  private String errors;

  public String getUsername()
  {

    return username;

  }


  public void setUsername(String username)
  {

   this.username = username;

  }


  public void setPassword(String password)
  {

   this.password = password;

  }


  public String getPassword()
  {

   return password;

  }

  public String getErrors()
  {

	  return errors;

  }

  public void setErrors(String errors)
  {

	  this.errors = errors;
  }

  public ActionErrors validate(ActionMapping mapping,
                                   HttpServletRequest request) {

          ActionErrors errors = new ActionErrors();
          if ((username == null) || (username.length() < 1))
              errors.add("username", new ActionError("error.username.required"));
          if ((password == null) || (password.length() < 1))
              errors.add("password", new ActionError("error.password.required"));

          return errors;

    }

}