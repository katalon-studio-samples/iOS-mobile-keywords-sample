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
    public static Object currentProjDir
     
    /**
     * <p></p>
     */
    public static Object appsPath
     
    /**
     * <p></p>
     */
    public static Object dragAndDropAppsBundleId
     
    /**
     * <p></p>
     */
    public static Object dragAndDropAppsOSVersion
     
    /**
     * <p></p>
     */
    public static Object dragAndDropAppsDeviceWidth
     
    /**
     * <p></p>
     */
    public static Object dragAndDropAppsDeviceHeight
     
    /**
     * <p></p>
     */
    public static Object isExistingDragAndDropAppsStarted
     
    /**
     * <p></p>
     */
    public static Object isSimulator
     
    /**
     * <p></p>
     */
    public static Object isIpadSimulator
     
    /**
     * <p></p>
     */
    public static Object GradeCalcAppsPath
     
    /**
     * <p></p>
     */
    public static Object isIphoneSimulator
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            currentProjDir = selectedVariables['currentProjDir']
            appsPath = selectedVariables['appsPath']
            dragAndDropAppsBundleId = selectedVariables['dragAndDropAppsBundleId']
            dragAndDropAppsOSVersion = selectedVariables['dragAndDropAppsOSVersion']
            dragAndDropAppsDeviceWidth = selectedVariables['dragAndDropAppsDeviceWidth']
            dragAndDropAppsDeviceHeight = selectedVariables['dragAndDropAppsDeviceHeight']
            isExistingDragAndDropAppsStarted = selectedVariables['isExistingDragAndDropAppsStarted']
            isSimulator = selectedVariables['isSimulator']
            isIpadSimulator = selectedVariables['isIpadSimulator']
            GradeCalcAppsPath = selectedVariables['GradeCalcAppsPath']
            isIphoneSimulator = selectedVariables['isIphoneSimulator']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
