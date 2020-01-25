import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


public class ProfileForm extends ActionForm
{

  private String firstName;

  private String lastName;

  private String middleName;


  public void setFirstName(String firstName)
  {

	  this.firstName = firstName;
  }
  public void setLastName(String lastName)
  {

	  this.lastName = lastName;
  }
  public void setMiddleName(String middleName)
  {

	  this.middleName = middleName;
  }

  public String getFirstName()
  {
	  return firstName;
  }
public String getLastName()
  {
	  return lastName;
  }
public String getMiddleName()
  {
	  return middleName;
  }
}