package readjson;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class TextJson {

	public static void main(String[] args) {
		JSONObject employeeDetails = new JSONObject();
		employeeDetails.put("firstname", "Meera");
		employeeDetails.put("lastname", "UI");
		employeeDetails.put("website", "javaport.in");
		
		JSONObject employeeObject = new JSONObject();
		employeeObject.put("employee", employeeObject);
		
		//Second Employee
		JSONObject employeeDetails2 = new JSONObject();
		employeeDetails2.put("firstname", "Brain");
		employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");
        
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
         
        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        //Write JSON file
        
        try(FileWriter file = new FileWriter("employees.json"))
        {
        //we can write any JSONArray or JSONObject
        file.write(employeeList.toJSONString());
        file.flush();
        }
        catch(IOException e)
        {
        	e.printStackTrace();
        }
	}
}
