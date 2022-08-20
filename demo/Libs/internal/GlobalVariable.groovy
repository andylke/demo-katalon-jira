package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object LoginUrl
     
    /**
     * <p></p>
     */
    public static Object LoginUsername
     
    /**
     * <p></p>
     */
    public static Object LoginPassword
     
    /**
     * <p></p>
     */
    public static Object ElementTimeout
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            LoginUrl = selectedVariables['LoginUrl']
            LoginUsername = selectedVariables['LoginUsername']
            LoginPassword = selectedVariables['LoginPassword']
            ElementTimeout = selectedVariables['ElementTimeout']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
