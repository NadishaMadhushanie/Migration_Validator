package org.wso2.carbon.apim.migration.validator;

import org.wso2.carbon.apim.migration.validator.dao.ValidatorDAO320to400;
import org.wso2.carbon.apim.migration.validator.fileReader.ReadFile;

import java.util.HashMap;
import java.util.Map;

public class Validator320to400 {

    public static String validateTableCount()
    {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int tableCount = Integer.parseInt(map1.get("tablesCount_apimDB"));
        String dbName = map1.get("dbName_apimDB");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean countValidator = validate.validateAPIMDbTableCount(tableCount,dbName);

        if(countValidator) {
            return " * 3.2.0 to 4.0.0 apim_db table count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db table count validation is fail.";
        }

    }

    public static String validateRevisionCreation()
    {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean revisionValidator = validate.validateAPIMDbRevisionCreation();

        if(revisionValidator) {
            return " * 3.2.0 to 4.0.0 apim_db revision creation validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db revision creation validation is fail.";
        }

    }

    public static String validateTableColumnCount1()
    {
        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amAPI"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amAPI");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApi = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmApi) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API table column count validation is fail.";
        }


    }

    public static String validateTableColumnCount2() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amApiClientCertificate"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amApiClientCertificate");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiClientCertificate = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmApiClientCertificate) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_CLIENT_CERTIFICATE table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_CLIENT_CERTIFICATE table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount3() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amApiComments"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amApiComments");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiComments = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmApiComments) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_COMMENTS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_COMMENTS table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount4() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amApiProductMapping"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amApiProductMapping");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiProductMapping = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmApiProductMapping) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_PRODUCT_MAPPING table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_PRODUCT_MAPPING table column count validation is fail.";
        }
    }

    public static String validateTableColumnCount5() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amApiUrlMapping"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amApiUrlMapping");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiUrlMapping = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmApiUrlMapping) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_URL_MAPPING table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_URL_MAPPING table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount6() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amCertificateMetadata"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amCertificateMetadata");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmCertificateMataData = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmCertificateMataData) {
            return " * 3.2.0 to 4.0.0 apim_db AM_CERTIFICATE_METADATA table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_CERTIFICATE_METADATA table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount7() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amGraphqlComplexity"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amGraphqlComplexity");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGraphqlComplexity = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmGraphqlComplexity) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GRAPHQL_COMPLEXITY table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GRAPHQL_COMPLEXITY table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount8() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amGwApiArtifacts"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amGwApiArtifacts");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGwApiArtifacts = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmGwApiArtifacts) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_API_ARTIFACTS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_API_ARTIFACTS table column count validation is fail.";
        }

    }
    public static String validateTableColumnCount9() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amGwPublishedApiDetails"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amGwPublishedApiDetails");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGwPublishedApiDetails = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmGwPublishedApiDetails) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_PUBLISHED_API_DETAILS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_PUBLISHED_API_DETAILS table column count validation is fail.";
        }

    }
    public static String validateTableColumnCount10() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_amPolicySubscription"));
        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amPolicySubscription");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmPolicySubscription = validate.validateAPIMDbTableColumnCount(dbName,tableName,columnCount);

        if(columnCountValidatorAmPolicySubscription) {
            return " * 3.2.0 to 4.0.0 apim_db AM_POLICY_SUBSCRIPTION table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_POLICY_SUBSCRIPTION table column count validation is fail.";
        }

    }

    public static String validateApiUuidContent() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean uuidContentValidator = validate.validateAPIMDbUuidContent();

        if(uuidContentValidator) {
            return " * 3.2.0 to 4.0.0 apim_db UUID column validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db UUID column validation is fail.";
        }

    }

    public static String checkTableExists1() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amApiServiceMapping");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_SERVICE_MAPPING table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_SERVICE_MAPPING table exists validation is fail.";
        }

    }

    public static String checkTableExists2() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amDeploymentRevisionMapping");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_DEPLOYMENT_REVISION_MAPPING table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_DEPLOYMENT_REVISION_MAPPING table exists validation is fail.";
        }

    }

    public static String checkTableExists3() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amGatewayEnvironment");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GATEWAY_ENVIRONMENT table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GATEWAY_ENVIRONMENT table exists validation is fail.";
        }

    }

    public static String checkTableExists4() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amGwApiDeployments");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_API_DEPLOYMENTS table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_API_DEPLOYMENTS table exists validation is fail.";
        }

    }

    public static String checkTableExists5() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amGwVhost");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_VHOST table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_VHOST table exists validation is fail.";
        }

    }

    public static String checkTableExists6() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amRevision");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_REVISION table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_REVISION table exists validation is fail.";
        }

    }

    public static String checkTableExists7() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amServiceCatalog");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_SERVICE_CATALOG table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_SERVICE_CATALOG table exists validation is fail.";
        }

    }

    public static String checkTableExists8() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amWebhooksSubscription");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_WEBHOOKS_SUBSCRIPTION table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_WEBHOOKS_SUBSCRIPTION table exists validation is fail.";
        }

    }

    public static String checkTableExists9() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amWebhooksUnsubscription");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_WEBHOOKS_UNSUBSCRIPTION table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_WEBHOOKS_UNSUBSCRIPTION table exists validation is fail.";
        }

    }

    public static String checkTableExists10() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnConfigAttribute");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CONFIG_ATTRIBUTE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CONFIG_ATTRIBUTE table exists validation is fail.";
        }

    }

    public static String checkTableExists11() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnConfigFile");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CONFIG_FILE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CONFIG_FILE table exists validation is fail.";
        }

    }

    public static String checkTableExists12() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnConfigResource");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CONFIG_RESOURCE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CONFIG_RESOURCE table exists validation is fail.";
        }

    }

    public static String checkTableExists13() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnConfigType");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CONFIG_TYPE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CONFIG_TYPE table exists validation is fail.";
        }

    }

    public static String checkTableExists14() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnCorsAssociation");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CORS_ASSOCIATION table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CORS_ASSOCIATION table exists validation is fail.";
        }

    }

    public static String checkTableExists15() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnCorsOrigin");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CORS_ORIGIN table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CORS_ORIGIN table exists validation is fail.";
        }

    }

    public static String checkTableExists16() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnRemoteFetchConfig");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_REMOTE_FETCH_CONFIG table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_REMOTE_FETCH_CONFIG table exists validation is fail.";
        }

    }

    public static String checkTableExists17() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnRemoteFetchRevisions");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_REMOTE_FETCH_REVISIONS table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_REMOTE_FETCH_REVISIONS table exists validation is fail.";
        }

    }

    public static String checkTableExists18() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnUserFunctionalityMapping");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_USER_FUNCTIONALITY_MAPPING table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_USER_FUNCTIONALITY_MAPPING table exists validation is fail.";
        }

    }

    public static String checkTableExists19() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_IdnUserFunctionalityProperty");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_USER_FUNCTIONALITY_PROPERTY table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_USER_FUNCTIONALITY_PROPERTY table exists validation is fail.";
        }

    }

    public static String checkTableExists20() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amApirevisionMetadata");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_REVISION_METADATA table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_REVISION_METADATA table exists validation is fail.";
        }

    }

    //6
    public static String validateRelationVhost() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkRelationVhost();

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GATEWAY_ENVIRONMENT and AM_GW_VHOST table relation validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GATEWAY_ENVIRONMENT and AM_GW_VHOST table relation validation is fail.";
        }

    }

    //7
    public static String validateRelationRevision() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkRelationRevision();

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_REVISION and AM_DEPLOYMENT_REVISION_MAPPING table relation validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_REVISION and AM_DEPLOYMENT_REVISION_MAPPING table relation validation is fail.";
        }

    }

    //8
    public static String validateRelationPublishedApis() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkRelationRevision();

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_PUBLISHED_API_DETAILS and AM_GW_API_DEPLOYMENTS table relation validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_PUBLISHED_API_DETAILS and AM_GW_API_DEPLOYMENTS table relation validation is fail.";
        }

    }

    //9
    public static String checkTableRemoved1() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amLabels");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTablesRemoved(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_LABELS table remove validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_LABELS table remove validation is fail.";
        }

    }

    public static String checkTableRemoved2() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_apimDB");
        String tableName = map1.get("tableName_amLabelUrls");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTablesRemoved(dbName,tableName);

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_LABEL_URLS table remove validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_LABEL_URLS table remove validation is fail.";
        }

    }

    //10
    public static String checkTableContent1() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableContent1 = validate.checkTablesContent1("PUBLISHED");

        if(tableContent1) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API and AM_REVISION tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API and AM_REVISION tables content validation is fail.";
        }

    }

    //11

    public static String checkTableContent2() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableContent2 = validate.checkTablesContent2();

        if(tableContent2) {
            return " * 3.2.0 to 4.0.0 apim_db AM_REVISION and AM_API_REVISION_METADATA tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_REVISION and AM_API_REVISION_METADATA tables content validation is fail.";
        }

    }

    //12

    public static String checkTableContent3() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableContent3 = validate.checkTablesContent3();

        if(tableContent3) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_API_ARTIFACTS and AM_GW_PUBLISHED_API_DETAILS tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_API_ARTIFACTS and AM_GW_PUBLISHED_API_DETAILS tables content validation is fail.";
        }

    }

    //shared_db

    //s1
    public static String sharedDbCheckTablesCount() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_sharedDB");
        int tableCount = Integer.parseInt(map1.get("tablesCount_sharedDB"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableCount = validate.sharedDbCheckTablesCount(dbName,tableCount);

        if(sharedDbTableCount) {
            return " * 3.2.0 to 4.0.0 shared_db tables count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db tables count validation is fail.";
        }

    }

    //s2
    public static String sharedDbCheckTablesExists() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        String dbName = map1.get("dbName_sharedDB");
        String tableName = map1.get("tableName_umHybridGroupRole");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableExists = validate.sharedDbCheckTablesExists(dbName,tableName);

        if(sharedDbTableExists) {
            return " * 3.2.0 to 4.0.0 shared_db UM_HYBRID_GROUP_ROLE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db shared_db UM_HYBRID_GROUP_ROLE table exists validation is fail.";
        }

    }

    //s3
    public static String sharedDbCheckColumnCount() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readValidationRelatedData1();

        int columnCount = Integer.parseInt(map1.get("columnsCount_umTenant"));
        String dbName = map1.get("dbName_sharedDB");
        String tableName = map1.get("tableName_umTenant");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbColumnCount = validate.sharedDbCheckColumnCount(dbName,tableName,columnCount);

        if(sharedDbColumnCount) {
            return " * 3.2.0 to 4.0.0 shared_db UM_TENANT table, column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db UM_TENANT table, column count validation is fail.";
        }

    }

    //s4
    public static String sharedDbCheckTableContent1() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableContent1 = validate.sharedDbCheckTablesContent1();

        if(sharedDbTableContent1) {
            return " * 3.2.0 to 4.0.0 shared_db REG_PATH , REG_RESOURCE tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db REG_PATH , REG_RESOURCE tables content validation is fail.";
        }

    }

    //s5
    public static String sharedDbCheckTableContent2() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableContent2 = validate.sharedDbCheckTablesContent2();

        if(sharedDbTableContent2) {
            return " * 3.2.0 to 4.0.0 shared_db UM_USER , UM_USER_ATTRIBUTE tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db UM_USER , UM_USER_ATTRIBUTE tables content validation is fail.";
        }

    }

    //s6
    public static String sharedDbCheckTableContent3() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableContent3 = validate.sharedDbCheckTablesContent3();

        if(sharedDbTableContent3) {
            return " * 3.2.0 to 4.0.0 shared_db UM_USER , UM_UUID_DOMAIN_MAPPER tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db UM_USER , UM_UUID_DOMAIN_MAPPER tables content validation is fail.";
        }

    }

    //s7
    public static String sharedDbCheckTableContent4() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableContent4 = validate.sharedDbCheckTablesContent4();

        if(sharedDbTableContent4) {
            return " * 3.2.0 to 4.0.0 shared_db REG_PROPERTY , REG_RESOURCE_PROPERTY tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db REG_PROPERTY , REG_RESOURCE_PROPERTY tables content validation is fail.";
        }

    }

    //s8
    public static String sharedDbCheckTableContent5() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableContent5 = validate.sharedDbCheckTablesContent5();

        if(sharedDbTableContent5) {
            return " * 3.2.0 to 4.0.0 shared_db REG_RESOURCE_TAG , REG_TAG tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db REG_RESOURCE_TAG , REG_TAG tables content validation is fail.";
        }

    }

    //s9
    public static String sharedDbCheckTableContent6() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableContent6 = validate.sharedDbCheckTablesContent6();

        if(sharedDbTableContent6) {
            return " * 3.2.0 to 4.0.0 shared_db UM_HYBRID_GROUP_ROLE , UM_HYBRID_ROLE tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db UM_HYBRID_GROUP_ROLE , UM_HYBRID_ROLE tables content validation is fail.";
        }

    }

    //s10
    public static String sharedDbCheckTableContent7() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableContent7 = validate.sharedDbCheckTablesContent7();

        if(sharedDbTableContent7) {
            return " * 3.2.0 to 4.0.0 shared_db UM_HYBRID_GROUP_ROLE , UM_HYBRID_USER_ROLE tables content validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db UM_HYBRID_GROUP_ROLE , UM_HYBRID_USER_ROLE tables content validation is fail.";
        }

    }


    //previous db
    //count validation.

    public static String comparePreviousDb1() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x1 = Integer.parseInt(map1.get("am_alert_types"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb1 = validate.comparePreviousDB1(x1);

        if (compareDb1) {
            return " * 3.2.0 to 4.0.0 apim_db AM_ALERT_TYPES table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_ALERT_TYPES table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb2() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x2 = Integer.parseInt(map1.get("am_api"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb2 = validate.comparePreviousDB2(x2);

        if (compareDb2) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb3() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x3 = Integer.parseInt(map1.get("am_api_lc_event"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb3 = validate.comparePreviousDB3(x3);

        if (compareDb3) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_LC_EVENT table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API_LC_EVENT table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb4() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x4 = Integer.parseInt(map1.get("am_api_ratings"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb4 = validate.comparePreviousDB4(x4);

        if (compareDb4) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_RATINGS table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API_RATINGS table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb5() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x5 = Integer.parseInt(map1.get("am_api_throttle_policy"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb5 = validate.comparePreviousDB5(x5);

        if (compareDb5) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_THROTTLE_POLICY table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API_THROTTLE_POLICY table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb6() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x6 = Integer.parseInt(map1.get("am_application"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb6 = validate.comparePreviousDB6(x6);

        if (compareDb6) {
            return " * 3.2.0 to 4.0.0 apim_db AM_APPLICATION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_APPLICATION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb7() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x7 = Integer.parseInt(map1.get("am_application_key_mapping"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb7 = validate.comparePreviousDB7(x7);

        if (compareDb7) {
            return " * 3.2.0 to 4.0.0 apim_db AM_APPLICATION_KEY_MAPPING table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_APPLICATION_KEY_MAPPING table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb8() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x8 = Integer.parseInt(map1.get("am_application_registration"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb8 = validate.comparePreviousDB8(x8);

        if (compareDb8) {
            return " * 3.2.0 to 4.0.0 apim_db AM_APPLICATION_REGISTRATION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_APPLICATION_REGISTRATION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb9() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x9 = Integer.parseInt(map1.get("am_key_manager"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb9 = validate.comparePreviousDB9(x9);

        if (compareDb9) {
            return " * 3.2.0 to 4.0.0 apim_db AM_KEY_MANAGER table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_KEY_MANAGER table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb10() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x10 = Integer.parseInt(map1.get("am_policy_application"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb10 = validate.comparePreviousDB10(x10);

        if (compareDb10) {
            return " * 3.2.0 to 4.0.0 apim_db AM_POLICY_APPLICATION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_POLICY_APPLICATION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb11() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x11 = Integer.parseInt(map1.get("am_policy_subscription"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb11 = validate.comparePreviousDB11(x11);

        if (compareDb11) {
            return " * 3.2.0 to 4.0.0 apim_db AM_POLICY_SUBSCRIPTION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_POLICY_SUBSCRIPTION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb12() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x12 = Integer.parseInt(map1.get("am_subscriber"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb12 = validate.comparePreviousDB12(x12);

        if (compareDb12) {
            return " * 3.2.0 to 4.0.0 apim_db AM_SUBSCRIBER table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_SUBSCRIBER table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb13() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x13 = Integer.parseInt(map1.get("am_subscription"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb13 = validate.comparePreviousDB13(x13);

        if (compareDb13) {
            return " * 3.2.0 to 4.0.0 apim_db AM_SUBSCRIPTION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_SUBSCRIPTION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb14() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x14 = Integer.parseInt(map1.get("am_system_apps"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb14 = validate.comparePreviousDB14(x14);

        if (compareDb14) {
            return " * 3.2.0 to 4.0.0 apim_db AM_SYSTEM_APPS table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_SYSTEM_APPS table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb15() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x15 = Integer.parseInt(map1.get("cm_purpose"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb15 = validate.comparePreviousDB15(x15);

        if (compareDb15) {
            return " * 3.2.0 to 4.0.0 apim_db CM_PURPOSE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db CM_PURPOSE table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb16() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x16 = Integer.parseInt(map1.get("cm_purpose_category"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb16 = validate.comparePreviousDB16(x16);

        if (compareDb16) {
            return " * 3.2.0 to 4.0.0 apim_db CM_PURPOSE_CATEGORY table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db CM_PURPOSE_CATEGORY table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb17() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x17 = Integer.parseInt(map1.get("idn_auth_session_app_info"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb17 = validate.comparePreviousDB17(x17);

        if (compareDb17) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_APP_INFO table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_APP_INFO table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb18() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x18 = Integer.parseInt(map1.get("idn_auth_session_meta_data"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb18 = validate.comparePreviousDB18(x18);

        if (compareDb18) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_META_DATA table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_META_DATA table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb19() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x19 = Integer.parseInt(map1.get("idn_auth_session_store"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb19 = validate.comparePreviousDB19(x19);

        if (compareDb19) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_STORE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_STORE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb20() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x20 = Integer.parseInt(map1.get("idn_auth_temp_session_store"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb20 = validate.comparePreviousDB20(x20);

        if (compareDb20) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_TEMP_SESSION_STORE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_TEMP_SESSION_STORE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb21() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x21 = Integer.parseInt(map1.get("idn_auth_user_session_mapping"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb21 = validate.comparePreviousDB21(x21);

        if (compareDb21) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_USER_SESSION_MAPPING table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_USER_SESSION_MAPPING table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb22() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x22 = Integer.parseInt(map1.get("idn_base_table"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb22 = validate.comparePreviousDB22(x22);

        if (compareDb22) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_BASE_TABLE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_BASE_TABLE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb23() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x23 = Integer.parseInt(map1.get("idn_claim_dialect"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb23 = validate.comparePreviousDB23(x23);

        if (compareDb23) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CLAIM_DIALECT table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_CLAIM_DIALECT table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb24() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x24 = Integer.parseInt(map1.get("idn_oauth2_access_token"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb24 = validate.comparePreviousDB24(x24);

        if (compareDb24) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_ACCESS_TOKEN table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_ACCESS_TOKEN table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb25() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x25 = Integer.parseInt(map1.get("idn_oauth2_access_token_scope"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb25 = validate.comparePreviousDB25(x25);

        if (compareDb25) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_ACCESS_TOKEN_SCOPE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_ACCESS_TOKEN_SCOPE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb26() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x26 = Integer.parseInt(map1.get("idn_oauth2_authorization_code"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb26 = validate.comparePreviousDB26(x26);

        if (compareDb26) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_AUTHORIZATION_CODE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_AUTHORIZATION_CODE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb27() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x27 = Integer.parseInt(map1.get("idn_oauth2_authz_code_scope"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb27 = validate.comparePreviousDB27(x27);

        if (compareDb27) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_AUTHZ_CODE_SCOPE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_AUTHZ_CODE_SCOPE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb28() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x28 = Integer.parseInt(map1.get("idn_oauth2_scope"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb28 = validate.comparePreviousDB28(x28);

        if (compareDb28) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_SCOPE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_SCOPE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb29() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x29 = Integer.parseInt(map1.get("idn_oauth2_scope_binding"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb29 = validate.comparePreviousDB29(x29);

        if (compareDb29) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_SCOPE_BINDING table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_SCOPE_BINDING table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb30() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x30 = Integer.parseInt(map1.get("idn_oauth_consumer_apps"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb30 = validate.comparePreviousDB30(x30);

        if (compareDb30) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH_CONSUMER_APPS table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH_CONSUMER_APPS table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb31() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x31 = Integer.parseInt(map1.get("idn_oidc_property"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb31 = validate.comparePreviousDB31(x31);

        if (compareDb31) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OIDC_PROPERTY table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OIDC_PROPERTY table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb32() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x32 = Integer.parseInt(map1.get("idn_oidc_scope_claim_mapping"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb32 = validate.comparePreviousDB32(x32);

        if (compareDb32) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OIDC_SCOPE_CLAIM_MAPPING table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OIDC_SCOPE_CLAIM_MAPPING table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb33() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x33 = Integer.parseInt(map1.get("idp"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb33 = validate.comparePreviousDB33(x33);

        if (compareDb33) {
            return " * 3.2.0 to 4.0.0 apim_db IDP table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDP table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb34() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x34 = Integer.parseInt(map1.get("idp_authenticator"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb34 = validate.comparePreviousDB34(x34);

        if (compareDb34) {
            return " * 3.2.0 to 4.0.0 apim_db IDP_AUTHENTICATOR table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDP_AUTHENTICATOR table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb35() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x35 = Integer.parseInt(map1.get("idp_authenticator_property"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb35 = validate.comparePreviousDB35(x35);

        if (compareDb35) {
            return " * 3.2.0 to 4.0.0 apim_db IDP_AUTHENTICATOR_PROPERTY table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDP_AUTHENTICATOR_PROPERTY table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb36() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x36 = Integer.parseInt(map1.get("idp_metadata"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb36 = validate.comparePreviousDB36(x36);

        if (compareDb36) {
            return " * 3.2.0 to 4.0.0 apim_db IDP_METADATA table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDP_METADATA table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb37() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x37 = Integer.parseInt(map1.get("sp_app"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb37 = validate.comparePreviousDB37(x37);

        if (compareDb37) {
            return " * 3.2.0 to 4.0.0 apim_db SP_APP table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db SP_APP table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb38() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x38 = Integer.parseInt(map1.get("sp_inbound_auth"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb38 = validate.comparePreviousDB38(x38);

        if (compareDb38) {
            return " * 3.2.0 to 4.0.0 apim_db SP_INBOUND_AUTH table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db SP_INBOUND_AUTH table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb39() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x39 = Integer.parseInt(map1.get("sp_metadata"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb39 = validate.comparePreviousDB39(x39);

        if (compareDb39) {
            return " * 3.2.0 to 4.0.0 apim_db SP_METADATA table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db SP_METADATA table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb40() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x40 = Integer.parseInt(map1.get("reg_association"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb40 = validate.comparePreviousDB40(x40);

        if (compareDb40) {
            return " * 3.2.0 to 4.0.0 shared_db REG_ASSOCIATION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 shared_db REG_ASSOCIATION table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb41() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x41 = Integer.parseInt(map1.get("um_domain"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb41 = validate.comparePreviousDB41(x41);

        if (compareDb41) {
            return " * 3.2.0 to 4.0.0 shared_db UM_DOMAIN table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 shared_db UM_DOMAIN table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb42() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x42 = Integer.parseInt(map1.get("um_role"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb42 = validate.comparePreviousDB42(x42);

        if (compareDb42) {
            return " * 3.2.0 to 4.0.0 shared_db UM_ROLE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 shared_db UM_ROLE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb43() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x43 = Integer.parseInt(map1.get("um_system_role"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb43 = validate.comparePreviousDB43(x43);

        if (compareDb43) {
            return " * 3.2.0 to 4.0.0 shared_db UM_SYSTEM_ROLE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 shared_db UM_SYSTEM_ROLE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb44() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x44 = Integer.parseInt(map1.get("um_system_user_role"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb44 = validate.comparePreviousDB44(x44);

        if (compareDb44) {
            return " * 3.2.0 to 4.0.0 shared_db UM_SYSTEM_USER_ROLE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 shared_db UM_SYSTEM_USER_ROLE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb45() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x45 = Integer.parseInt(map1.get("um_user_role"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb45 = validate.comparePreviousDB45(x45);

        if (compareDb45) {
            return " * 3.2.0 to 4.0.0 shared_db UM_USER_ROLE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 shared_db UM_USER_ROLE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb46() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        int x46 = Integer.parseInt(map1.get("am_labels"));

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb46 = validate.comparePreviousDB46(x46);

        if (compareDb46) {
            return " * 3.2.0 to 4.0.0 apim_db AM_LABELS,AM_GW_VHOST tables content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_LABELS,AM_GW_VHOST tables content before and after migration validation is fail.";
        }
    }

    //content validation

    public static String comparePreviousDbContent1() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        String y1 = map1.get("am_api_sum");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb47 = validate.comparePreviousDBContent1(y1);

        if (compareDb47) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API table column content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API table column content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDbContent2() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        String y2 = map1.get("am_labels_sum1");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb48 = validate.comparePreviousDBContent2(y2);

        if (compareDb48) {
            return " * 3.2.0 to 4.0.0 apim_db AM_LABELS and AM_GATEWAY_ENVIRONMENT tables LABEL_ID,UUID column content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_LABELS and AM_GATEWAY_ENVIRONMENT tables LABEL_ID,UUID column content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDbContent3() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        String y3 = map1.get("am_labels_sum2");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb49 = validate.comparePreviousDBContent3(y3);

        if (compareDb49) {
            return " * 3.2.0 to 4.0.0 apim_db AM_LABELS and AM_GATEWAY_ENVIRONMENT tables NAME,DESCRIPTION column content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_LABELS and AM_GATEWAY_ENVIRONMENT tables NAME,DESCRIPTION  column content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDbContent4() {

        Map<String, String> map1 = new HashMap<>();
        ReadFile r = new ReadFile();
        map1=r.readFile();

        String y4 = map1.get("am_application_key_mapping_sum");

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb50 = validate.comparePreviousDBContent4(y4);

        if (compareDb50) {
            return " * 3.2.0 to 4.0.0 apim_db AM_APPLICATION_KEY_MAPPING table column content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_APPLICATION_KEY_MAPPING table column content before and after migration validation is fail.";
        }
    }

}
