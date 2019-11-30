package testng.testproviders;

/**
 * Created by kaiser_zhao on 2019/10/11.
 */
public class UseCase {
//    public ResourceConstants rc = new ResourceConstants();
//
//    final static String tagTestCase = "testCase";
//    final static String tagTestStepUI = "testStepUI";
//
//    final static String tagImportedCase = "importedCase";
//    final static String tagCasePath = "casepath";
//    final static String tagIdSuffix = "idsuffix";
//
//    final static String tagUseCase = "useCase";
//    final static String tagDescription = "description";
//    final static String tagLoopUseCaseNumber = "loopUseCaseNumber";
//    final static String tagName = "name";
//    final static String tagSameIdentId = "sameIdentId";
//    final static String tagDisableLogs = "disableLogs";
//    final static String tagNumberThreads = "numberThreads";
//    final static String tagMats = "mats";
//    final static String tagtestType = "testType";
//    final static String tagCommonTestsuite = "commonTestsuite";
//
//    final static String tagHitOpenBug = "hitOpenBugs";
//
//
//    static String saveAttributevalue = null;
//    static Map<String, String> saveValues = new HashMap<>();
//
//    static String saveResponseValue = null;
//
//    // Attribut defining the HTTP query
//    String userId;
//    String password;    // if not set, use Admin OIM
//    String testName;
//    String testDescription;
//    String hitOpenBug;
//    String testPrefix;
//    boolean mats;
//    String testType;
//    boolean commonTestsuite;
//    boolean disableLogs;
//    boolean sameIdentId;
//
//    boolean prefixResource;
//    String tenantName;
//    boolean deferred;
//
//    int loopUseCaseNumber;
//    UseCaseHeader usecaseHeader;
//    int numberThreads;
//    String uniqueIdent;
//
//    public UseCase() {
//
//        usecaseHeader = new UseCaseHeader();
//        testPrefix = null;
//        tenantName = null;
//        prefixResource = true;
//
//        deferred = false;
//        testName = null;
//        testDescription = null;
//        hitOpenBug = "NONE";
//
//        mats = false;
//        testType = null;
//        commonTestsuite = false;   // common testsuite for Idaas and oim
//        userId = ResourceConstants.ADMIN_USER;
//        password = ResourceConstants.ADMIN_PASSWORD;
//        loopUseCaseNumber = 1;
//        disableLogs = false;
//        sameTenant = false;
//        sameIdentId = false;
//        numberThreads = 1;
//
//        uniqueIdent = Long.toString(System.currentTimeMillis());
//    }
//
//    public class UseCaseHeader {
//
//        String testName;
//        String testDescription;
//        String hitOpenBug;
//        int numberThreads;
//        int loopUseCaseNumber;
//        boolean mats;
//        String testType;
//        boolean commonTestsuite;
//        boolean sameTenant;
//        boolean sameIdentId;
//        boolean disableLogs;
//        String queryOperation;
//
//        /* ====================================================== */
//        public UseCaseHeader() {
//
//            testName = "";
//            testDescription = "";
//            hitOpenBug = "NONE";
//            numberThreads = 1;
//            loopUseCaseNumber = 1;
//            mats = false;
//            testType = null;
//            commonTestsuite = false;
//            sameTenant = false;
//            disableLogs = false;   // default enable logs
//            sameIdentId = false;
//            queryOperation = null;
//        }
//
//        public boolean isSkipTest() {
//            if (this.hitOpenBug.equals("SKIP")) {
//                return true;
//            }
//            return false;
//        }
//
//        public String getOperation() {
//            return this.queryOperation;
//        }
//
//        public void setOperation(String str) {
//            this.queryOperation = str;
//        }
//
//        public void setSameIdentId(boolean value) {
//            this.sameIdentId = value;
//        }
//
//        public void disableLogs(boolean value) {
//            this.disableLogs = value;
//        }
//
//        public void setTestName(String value) {
//            this.testName = value;
//        }
//
//        public void setTestDescription(String value) {
//            this.testDescription = value;
//        }
//
//        public void setNumberThread(int value) {
//            this.numberThreads = value;
//        }
//
//        public void setSameTenant(boolean value) {
//            this.sameTenant = value;
//        }
//
//        public void setHitOpenBug(String str) {
//            this.hitOpenBug = str;
//        }
//
//        public void setLoopUseCaseNumber(int value) {
//            this.loopUseCaseNumber = value;
//        }
//
//        public void setMATS(boolean str) {
//            this.mats = str;
//        }
//
//        public void setTestType(String str) {
//            str.replaceAll("\\s+","");
//            this.testType = str;
//        }
//
//        public void setCommonTestsuite(boolean str) {
//            this.commonTestsuite = str;
//        }
//
//        public boolean isSameIdentId() {
//            return this.sameIdentId;
//        }
//
//        public boolean isLogsDisabled() {
//            return this.disableLogs;
//        }
//
//        public int getLoopUseCaseNumber() {
//            return this.loopUseCaseNumber;
//        }
//
//        public String getTestName() {
//            return this.testName;
//        }
//
//        public int getNumberThreads() {
//            return this.numberThreads;
//        }
//
//        public String getTestDescription() {
//            return this.testDescription;
//        }
//
//        public boolean isMATS() {
//            return this.mats;
//        }
//
//        public String getTestType() {
//            return this.testType;
//        }
//
//        public boolean isCommonTestsuite() {
//            return this.commonTestsuite;
//        }
//
//        public String getHitOpenBug() {
//            return this.hitOpenBug;
//        }
//
//        public boolean isSameTenant() {
//            return this.sameTenant;
//        }
//
//        public boolean getSameIdentId() {
//            return this.sameIdentId;
//        }
//    }
//    /* ====================================================== */
//
//    public static void setSaveAttributevalue(String value) {
//        saveAttributevalue = value;
//    }
//
//    public static String getSaveAttributevalue() {
//        return saveAttributevalue;
//    }
//
//    public static Map<String, String> getSaveValues() {
//        return saveValues;
//    }
//
//    public static void saveValues(String key, String value) {
//        UseCase.saveValues.put(key, value);
//    }
//
//    public static void setSaveResponseValue(String value) {
//        saveResponseValue = value;
//    }
//
//    public static String getSaveResponseValue() {
//        return saveResponseValue;
//    }
//
//    public void setLoopUseCaseNumber(int value) {
//        this.loopUseCaseNumber = value;
//    }
//
//    public int getNumberThreads() {
//        return this.numberThreads;
//    }
//
//    public void setNumberThread(int value) {
//        this.numberThreads = value;
//    }
//
//    public boolean getSameIdentId() {
//        return this.sameIdentId;
//    }
//
//    public boolean isLogsDisabled() {
//        return this.disableLogs;
//    }
//
//    public void setSameIdentId(boolean value) {
//        this.sameIdentId = value;
//    }
//
//    public void setSameTenant(boolean value) {
//        this.sameTenant = value;
//    }
//
//    public void disableLogs(boolean value) {
//        this.disableLogs = value;
//    }
//
//    public void setUseCaseHeader(UseCaseHeader value) {
//        this.usecaseHeader = value;
//    }
//
//    public UseCase.UseCaseHeader getUseCaseHeader() {
//        return this.usecaseHeader;
//    }
//
//    public void setMATS(boolean str) {
//        this.mats = str;
//    }
//
//    public void setTestType(String str) {
//        this.testType = str;
//    }
//
//    public void setTestName(String value) {
//        this.testName = value;
//    }
//
//    public boolean isMATS() {
//        return this.mats;
//    }
//
//    public String getTestType() {
//        return this.testType;
//    }
//
//    public boolean isSameTenant() {
//        return this.sameTenant;
//    }
//
//    public void setCommonTestsuite(boolean str) {
//        this.commonTestsuite = str;
//    }
//    //
//    // public boolean isCommonResource() {
//    // return this.commonResource;
//    // }
//
//    public boolean isCommonTestsuite() {
//        return this.commonTestsuite;
//    }
//    //
//    // public void setCommonResource(boolean value) {
//    // this.commonResource = value;
//    // }
//
//    public boolean usePrefixResource() {
//        return this.prefixResource;
//    }
//
//    public void setPrefixResource(boolean value) {
//        this.prefixResource = value;
//    }
//
//    public void setHitOpenBug(String str) {
//        this.hitOpenBug = str;
//        if (this.hitOpenBug.contains("DEFERRED")) {
//            this.deferred = true;
//        }
//    }
//
//    public String getHitOpenBug() {
//        return this.hitOpenBug;
//    }
//
//    public boolean isSkipTest() {
//        if (this.hitOpenBug.equals("SKIP")) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean isDeferredTest() {
//        return this.deferred;
//    }
//
//    public int getLoopUseCaseNumber() {
//        return this.loopUseCaseNumber;
//    }
//
//    public String getTenantName() {
//        return this.tenantName;
//    }
//
//    public String getUserId() {
//        return this.userId;
//    }
//
//    public void setUserId(String value) {
//        this.userId = value;
//    }
//
//    public void setUniqueIdent() {
//        this.uniqueIdent = Long.toString(System.currentTimeMillis());
//    }
//
//    public String getPassword() {
//        return this.password;
//    }
//
//    public void setTenantName(String value) {
//        this.tenantName = value;
//    }
//
//    public void setPassword(String value) {
//        this.password = value;
//    }
//
//    public String getTestName() {
//        return this.testName;
//    }
//
//    public String getUniqueIdent() {
//        return this.uniqueIdent;
//    }
//
//    public String getTestPrefix() {
//        return this.testPrefix;
//    }
//
//    public String getTestDescription() {
//        return this.testDescription;
//    }
//
//    public void setTestPrefix(String value) {
//        this.testPrefix = value;
//        return;
//    }
//
//    public void setTestDescription(String value) {
//        this.testDescription = value;
//        return;
//
//    }
//
//    public String removePrefix(String attributs) {
//
//        if (attributs == null) {
//            return attributs;
//        }
//        /*  Prefix all attributes  in the list by ResourceType
//         User.userName, User.name.givenName ...*/
//        String attributsNoPrefix = "";
//        String[] temp = attributs.split(",");
//
//        String curAttrib;
//        for (int i = 0; i < temp.length; i++) {
//            curAttrib = temp[i];
//            String[] tempPrefix = curAttrib.split(":");
//
//            if (!attributsNoPrefix.isEmpty()) {
//                attributsNoPrefix = attributsNoPrefix + ",";
//            }
//            if (tempPrefix.length < 0) {
//                attributsNoPrefix = attributsNoPrefix + curAttrib;
//            } else {
//                attributsNoPrefix = attributsNoPrefix + tempPrefix[tempPrefix.length - 1];
//            }
//        }
//
//        return attributsNoPrefix;
//    }
//
//    public String buildJsonString(String attributs, String resourceType) {
//
//        String scimAttributs = null;
//        /*  Prefix all attributes  in the list by ResourceType
//         User.userName, User.name.givenName ...*/
//
//        if (attributs != null) {
//            // scimAttributs is a String containing SCIM attributes to return
//            // all attributes are separated by ,
//
//            String[] temp = attributs.split(",");
//            String attrLongName = null;
//            for (int i = 0; i < temp.length; i++) {
//
//                attrLongName = resourceType + "." + temp[i];
//                if (scimAttributs != null) {
//                    scimAttributs = scimAttributs.concat(",");
//                    scimAttributs = scimAttributs.concat(attrLongName);
//
//                } else {
//                    scimAttributs = attrLongName;
//                }
//
//            }
//        }
//        return scimAttributs;
//    }
//
//    private static String removeSpace(String value) {
//
//        String newValue;
//        newValue = value.replaceAll("\\s", ""); // renvoie une copie du String
//        newValue = newValue.trim();
//
//        return newValue;
//    }
//
//    public List<TestsCases> extractTestCases(String xmlFile, String uniqueIdent, List<ResourceREST> listResourcesInfo) {
//        List<TestsCases> listTestsCases = new ArrayList<TestsCases>();
//
//        UseCaseHeader header = new UseCaseHeader();
//
//        try {
//            // Parse the file
//            Document doc = parsexml(xmlFile, ResourceConstants.getTestsConfig() + "/testSuiteXmlSchema.xsd");
//
//            NodeList nList = doc.getElementsByTagName(tagUseCase);
//
//            // if the list NodeList is empty, that means this is not a useCase, but only a testCase,
//            // then search about test case."
//            if (nList.getLength() != 0) {
//                // get the name and description of the useCase
//
//                for (int iN = 0; iN < nList.getLength(); iN++) {
//                    Node nNode = nList.item(iN);
//                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                        Element rElement = (Element) nNode;
//                        // System.out.println("Analyse test case : rElement.getTagName(): " + rElement.getTagName());
//                        NodeList ucList = nNode.getChildNodes();
//
//                        for (int j = 0; j < ucList.getLength(); j++) {
//                            Node lsnode = ucList.item(j);
//                            if (lsnode.getNodeType() == Node.ELEMENT_NODE) {
//                                Element elem = (Element) lsnode;
//                                if (elem.getTagName().contains(tagName)) {
//                                    header.setTestName(removeSpace(elem.getTextContent()));
//                                } else if (elem.getTagName().contains(tagDescription)) {
//                                    // System.out.println("Analyse test case : UseCane Descr : " + elem.getTextContent());
//                                    // Remove nre line chars from the description, it causes reporting issues
//                                    header.setTestDescription(elem.getTextContent().replaceAll("[\r\n]+", "").trim());
//                                } else if (elem.getTagName().contains(tagHitOpenBug)) {
//                                    // Don't add hitOpenBugs if the tag value is empty or just whitespace
//                                    if (!elem.getTextContent().matches("^\\s*$"))
//                                        header.setHitOpenBug(elem.getTextContent());
//                                } else if (elem.getTagName().contains(tagMats)) {
//                                    header.setMATS(true);
//                                } else if (elem.getTagName().contains(tagtestType)) {
//                                    header.setTestType(elem.getTextContent());
//                                } else if (elem.getTagName().contains(tagCommonTestsuite)) {
//                                    header.setCommonTestsuite(true);
//                                } else if (elem.getTagName().contains(tagSameTenant)) {
//                                    header.setSameTenant(true);
//                                } else if (elem.getTagName().contains(tagSameIdentId)) {
//                                    header.setSameIdentId(true);
//                                } else if (elem.getTagName().contains(tagDisableLogs)) {
//                                    header.disableLogs(true);
//                                } else if (elem.getTagName().contains(tagNumberThreads)) {
//                                    header.setNumberThread(Integer.parseInt(elem.getTextContent()));
//                                } else if (elem.getTagName().contains(tagLoopUseCaseNumber)) {
//                                    header.setLoopUseCaseNumber(Integer.parseInt(elem.getTextContent()));
//                                } else if (elem.getTagName().contains(tagImportedCase)){
//                                    // If hit tag for imported case
//                                    // 1. get the path of the imported case, and get the idSuffix.
//                                    System.out.println("hit tag <importedCase>===============");
//                                    // The path of the dependent case
//                                    String importedCaseFullPath = "";
//                                    String idSuffix = "";
//                                    NodeList importedCasesList = elem.getChildNodes();
//                                    for (int k = 0; k < importedCasesList.getLength(); k++) {
//                                        Node importedCaseNode = importedCasesList.item(k);
//                                        if (importedCaseNode.getNodeType() == Node.ELEMENT_NODE) {
//                                            Element importedCaseElem = (Element) importedCaseNode;
//
//                                            if(importedCaseElem.getTagName().contains(tagCasePath)){
//                                                System.out.println("hit tag <casepath> ===============");
//                                                String importedCasePath = importedCaseElem.getTextContent();
//                                                // get directory of xmlFile
//                                                File f = new File(xmlFile);
//                                                String importedCaseDir = f.getParent();
//                                                //TODO: the imported case should be in the same directory with the current case.
//                                                importedCaseFullPath = importedCaseDir + "/" +  importedCasePath;
//                                                System.out.println("The path of the imported Case is ===============" + importedCaseFullPath);
//                                            }else if(importedCaseElem.getTagName().contains(tagIdSuffix)){
//                                                System.out.println("hit tag <tagIdSuffix>===============");
//                                                idSuffix = importedCaseElem.getTextContent();
//                                            }
//                                        }
//                                    }
//                                    // 2. Parse the file of the imported case
//                                    Document docImportedCase = parsexml(importedCaseFullPath, ResourceConstants.getTestsConfig() + "/testSuiteXmlSchema.xsd");
//
//                                    // 3. For the imported cases, only deal with tags: tagTestCase, tagTestStepUI, tagTestStepMisc, tagTestStepNonScim
//                                    //  (lsnode from doc, unqiueIdent, header) ---> TestCases
//                                    NodeList importedCaseNodeList = docImportedCase.getElementsByTagName(tagUseCase);
//                                    System.out.println("Number of node <useCase> in the imported case ===============" + importedCaseNodeList.getLength());
//
//                                    // importedCaseNodeList: useCase list from the imported case
//                                    if (importedCaseNodeList.getLength() != 0) {
//                                        for (int iNC = 0; iNC < importedCaseNodeList.getLength(); iNC++) {
//                                            // for each node <useCase>
//                                            Node importedCaseNode = importedCaseNodeList.item(iNC);
//                                            System.out.println("Type of node <useCase> ===============" + importedCaseNode.getNodeType());
//                                            if (importedCaseNode.getNodeType() == Node.ELEMENT_NODE) {
//
//                                                // Deal with the child nodes of <useCase>
//                                                NodeList ucImportedCaseList = importedCaseNode.getChildNodes();
//                                                System.out.println("number of the child nodes of <useCase>===============" + ucImportedCaseList.getLength());
//                                                for (int n = 0; n < ucImportedCaseList.getLength(); n++) {
//                                                    Node childNodeOfImportedUseCaseNode = ucImportedCaseList.item(n);
//                                                    System.out.println("Type of child, it is from node <useCase> from the imported case===============" + childNodeOfImportedUseCaseNode.getNodeType());
//
//                                                    if (childNodeOfImportedUseCaseNode.getNodeType() == Node.ELEMENT_NODE) {
//                                                        Element childElemOfImportedUseCase = (Element) childNodeOfImportedUseCaseNode;
//
//                                                        String uniqueIdent4ImportedCase = idSuffix + "_" + uniqueIdent;
//                                                        System.out.println("uniqueIdent4ImportedCase===============" + uniqueIdent4ImportedCase);
//
//                                                        if (childElemOfImportedUseCase.getTagName().contains(tagTestCase)) {
//                                                            TestCaseREST testCaseRest = new TestCaseREST();
//                                                            listTestsCases.add(testCaseRest.testCaseAnalysis(childNodeOfImportedUseCaseNode, uniqueIdent4ImportedCase, header,
//                                                                    listResourcesInfo));
//                                                        } else if (childElemOfImportedUseCase.getTagName().contains(tagTestStepUI)) {
//                                                            TestStepUI testStepUI = new TestStepUI();
//                                                            listTestsCases.add(testStepUI.testCaseAnalysis(childNodeOfImportedUseCaseNode, uniqueIdent4ImportedCase, header,
//                                                                    listResourcesInfo));
//                                                        } else if (childElemOfImportedUseCase.getTagName().contains(tagTestStepNonScim)) {
//                                                            TestStepNonScim testStepNonScim = new TestStepNonScim();
//                                                            listTestsCases.add(testStepNonScim.testCaseAnalysis(childNodeOfImportedUseCaseNode, uniqueIdent4ImportedCase, header,
//                                                                    listResourcesInfo));
//                                                        } else if (childElemOfImportedUseCase.getTagName().contains(tagTestStepMisc)) {
//                                                            TestStepMisc testStepMisc = new TestStepMisc();
//                                                            listTestsCases.add(testStepMisc.testCaseAnalysis(childNodeOfImportedUseCaseNode, uniqueIdent4ImportedCase, header,
//                                                                    listResourcesInfo));
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//                                } else if (elem.getTagName().contains(tagTestCase)) {
//                                    TestCaseREST testCaseRest = new TestCaseREST();
//                                    listTestsCases.add(testCaseRest.testCaseAnalysis(lsnode, uniqueIdent, header,
//                                            listResourcesInfo));
//                                } else if (elem.getTagName().contains(tagTestStepUI)) {
//                                    TestStepUI testStepUI = new TestStepUI();
//                                    listTestsCases.add(testStepUI.testCaseAnalysis(lsnode, uniqueIdent, header,
//                                            listResourcesInfo));
//                                } else if (elem.getTagName().contains(tagTestStepNonScim)) {
//                                    TestStepNonScim testStepNonScim = new TestStepNonScim();
//                                    listTestsCases.add(testStepNonScim.testCaseAnalysis(lsnode, uniqueIdent, header,
//                                            listResourcesInfo));
//                                } else if (elem.getTagName().contains(tagTestStepMisc)) {
//                                    TestStepMisc testStepMisc = new TestStepMisc();
//                                    listTestsCases.add(testStepMisc.testCaseAnalysis(lsnode, uniqueIdent, header,
//                                            listResourcesInfo));
//                                }
//                            }
//                        }
//                    }
//                }
//            } else {
//                nList = doc.getElementsByTagName(tagTestCase);
//                for (int iN = 0; iN < nList.getLength(); iN++) {
//                    Node nNode = nList.item(iN);
//                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                        TestCaseREST testCaseRest = new TestCaseREST();
//                        listTestsCases
//                                .add(testCaseRest.testCaseAnalysis(nNode, uniqueIdent, header, listResourcesInfo));
//                    }
//                }
//            }
//        } catch (Exception ex) {
//            System.out.println(" Test not executed " + xmlFile);
//            ex.printStackTrace();
//        }
//
//        return listTestsCases;
//    }
//
//    public static String replaceStringWithExistingResources(String stringToReplace, String uniqueIdent,
//                                                            List<ResourceREST> globalListResourcesForTest) {
//
//        if (stringToReplace != null) {
//            for (int i1 = 0; i1 < globalListResourcesForTest.size(); i1++) {
//                ResourceREST curRes = globalListResourcesForTest.get(i1);
//
//                String curUniqueIdent = curRes.getUniqueIdent();
//                if (uniqueIdent.equalsIgnoreCase(curUniqueIdent)) {
//                    if (curRes.getResourceIdentifierName() != null) {
//
//                        String stringToReplaceUpper = stringToReplace.toUpperCase();
//                        String curResIdentUpper = curRes.getResourceIdentifierName().toUpperCase();
//                        // replace contains by equalsIgnoreCase
//                        // if (stringToReplaceUpper.equalsIgnoreCase(curResIdentUpper + "_ID")) {
//                        if (isExactString(stringToReplaceUpper, curResIdentUpper + "_ID")) {
//                            /* Replace by the ID */
//                            stringToReplace = stringToReplace.replace(curRes.getResourceIdentifierName() + "_ID",
//                                    curRes.getResourceLocalId());
//                        } else if (stringToReplaceUpper.startsWith("MEACCESSTOKEN." + curResIdentUpper + "_ID")) {
//                            stringToReplace = stringToReplace.replace(curRes.getResourceIdentifierName() + "_ID",
//                                    curRes.getResourceLocalId());
//                        }
//                        // replace contains by equalsIgnoreCase
//                        // if ((stringToReplaceUpper.contains(curResIdentUpper)
//                        // && (!stringToReplace.contains(curRes.getResourceUniqueIdentifierName())))) {
//                        if (isExactString(stringToReplaceUpper, curResIdentUpper)
//                                && !isExactString(stringToReplace, curRes.getResourceUniqueIdentifierName())) {
//                            stringToReplace = stringToReplace.replace(curRes.getResourceIdentifierName(),
//                                    curRes.getResourceUniqueIdentifierName());
//                        }
//                    }
//                }
//            }
//        }
//
//        return stringToReplace;
//    }
//
//    public static String replaceTimeTag(String stringToReplace, String UniqueIdent) {
//        if (stringToReplace != null) {
//            stringToReplace = stringToReplace.replace("TIMETAG", UniqueIdent);
//        }
//        return stringToReplace;
//    }
//
//    public static String replaceName(String value, String uniqueIdent, List<ResourceREST> listResourcesInfo,
//                                     TestsCases tc) {
//        for (int i1 = 0; i1 < listResourcesInfo.size(); i1++) {
//            ResourceREST curRes = listResourcesInfo.get(i1);
//
//            String curUniqueIdent = curRes.getUniqueIdent();
//
//            if (uniqueIdent.equalsIgnoreCase(curUniqueIdent)) {
//
//                if (isExactString(value, curRes.getResourceIdentifierName())) {
//                    // if (value.contains(curRes.getResourceIdentifierName())) {
//
//                    value = value.replaceAll(curRes.getResourceIdentifierName(),
//                            curRes.getResourceUniqueIdentifierName());
//                }
//            }
//        }
//        value = value.replaceAll("UNIQUE_NAME", tc.getQueryResourceUniqueName());
//        return value;
//
//    }
//
//    public static boolean isExactString(String longString, String stringToFind) {
//        if (longString.equals(stringToFind))
//            return true;
//
//        boolean found = false;
//        char separators[] = { '<', '>', ' ', '"', '\\', '/' };
//
//        // check if the char before the String is a separator
//        boolean startBySep = false;
//        for (int i1 = 0; i1 < separators.length; i1++) {
//            String startString = separators[i1] + stringToFind;
//            if (longString.contains(startString)) {
//                startBySep = true;
//            }
//        }
//        // check if the char after the String is a separator
//        boolean endBySep = false;
//        for (int i1 = 0; i1 < separators.length; i1++) {
//            String endString = stringToFind + separators[i1];
//            if (longString.contains(endString)) {
//                endBySep = true;
//            }
//        }
//        if (startBySep && endBySep) {
//
//            return true;
//        }
//
//        return found;
//    }
//
//    public void replaceWithExistingResources(String uniqueIdent, List<ResourceREST> globalListResourcesForTest) {
//        this.userId = replaceStringWithExistingResources(this.userId, uniqueIdent, globalListResourcesForTest);
//
//        return;
//    }
//
//    public void checkAdminCredentials(String userId, String password) throws ScimException {
//        if (userId.equalsIgnoreCase(ResourceConstants.ADMIN_USER)) {
//            if (!password.equalsIgnoreCase(ResourceConstants.ADMIN_PASSWORD)) {
//                throw new ScimException(
//                        "checkAdminCredentials : incorrect credential for Admin user " + ResourceConstants.ADMIN_USER);
//            }
//        }
//    }
//
//    private static Document parsexml(String xmlFile) {
//        Document doc = null;
//        File fxmlFile = new File(xmlFile);
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        try {
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            doc = dBuilder.parse(fxmlFile);
//        } catch (ParserConfigurationException | SAXException | IOException ex) {
//            System.err.println("parsexml failed with Exception " + ex.getMessage());
//        }
//        return doc;
//    }
//
//    private Document parsexml(String xmlFile, String SchemaFile) {
//        // System.out.println("SchemaFile " + SchemaFile);
//
//        Document doc = null;
//        File fxmlFile = new File(xmlFile);
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        final SchemaFactory sf = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
//        try {
//            final Schema schema;
//            schema = sf.newSchema(new File(SchemaFile));
//            dbFactory.setSchema(schema);
//
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            doc = dBuilder.parse(fxmlFile);
//        } catch (ParserConfigurationException ex) {
//            System.err.println("parsexml failed with Exception " + ex.getMessage());
//        } catch (SAXException ex) {
//            System.err.println("parsexml failed with Exception " + ex.getMessage());
//
//        } catch (IOException ex) {
//            System.err.println("parsexml failed with Exception " + ex.getMessage());
//        }
//        return doc;
//    }
}
