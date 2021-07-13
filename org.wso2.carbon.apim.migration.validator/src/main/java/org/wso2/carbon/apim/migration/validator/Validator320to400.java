package org.wso2.carbon.apim.migration.validator;

import org.wso2.carbon.apim.migration.validator.dao.ValidatorDAO320to400;
import org.wso2.carbon.apim.migration.validator.fileReader.ReadFile;

import java.util.logging.Logger;

public class Validator320to400 {

    public static String validateTableCount()
    {
        final Logger LOGGER = Logger.getLogger(Validator320to400.class.getName());

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean countValidator = validate.validateAPIMDbTableCount(177,"apim_db");

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

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApi = validate.validateAPIMDbTableColumnCount("apim_db","AM_API",15);

        if(columnCountValidatorAmApi) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API table column count validation is fail.";
        }


    }

    public static String validateTableColumnCount2() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiClientCertificate = validate.validateAPIMDbTableColumnCount("apim_db","AM_API_CLIENT_CERTIFICATE",7);

        if(columnCountValidatorAmApiClientCertificate) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_CLIENT_CERTIFICATE table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_CLIENT_CERTIFICATE table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount3() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiComments = validate.validateAPIMDbTableColumnCount("apim_db","AM_API_COMMENTS",9);

        if(columnCountValidatorAmApiComments) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_COMMENTS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_COMMENTS table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount4() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiProductMapping = validate.validateAPIMDbTableColumnCount("apim_db","AM_API_PRODUCT_MAPPING",4);

        if(columnCountValidatorAmApiProductMapping) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_PRODUCT_MAPPING table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_PRODUCT_MAPPING table column count validation is fail.";
        }
    }

    public static String validateTableColumnCount5() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiUrlMapping = validate.validateAPIMDbTableColumnCount("apim_db","AM_API_URL_MAPPING",8);

        if(columnCountValidatorAmApiUrlMapping) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_URL_MAPPING table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_URL_MAPPING table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount6() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmCertificateMataData = validate.validateAPIMDbTableColumnCount("apim_db","AM_CERTIFICATE_METADATA",4);

        if(columnCountValidatorAmCertificateMataData) {
            return " * 3.2.0 to 4.0.0 apim_db AM_CERTIFICATE_METADATA table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_CERTIFICATE_METADATA table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount7() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGraphqlComplexity = validate.validateAPIMDbTableColumnCount("apim_db","AM_GRAPHQL_COMPLEXITY",6);

        if(columnCountValidatorAmGraphqlComplexity) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GRAPHQL_COMPLEXITY table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GRAPHQL_COMPLEXITY table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount8() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGwApiArtifacts = validate.validateAPIMDbTableColumnCount("apim_db","AM_GW_API_ARTIFACTS",4);

        if(columnCountValidatorAmGwApiArtifacts) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_API_ARTIFACTS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_API_ARTIFACTS table column count validation is fail.";
        }

    }
    public static String validateTableColumnCount9() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGwPublishedApiDetails = validate.validateAPIMDbTableColumnCount("apim_db","AM_GW_PUBLISHED_API_DETAILS",6);

        if(columnCountValidatorAmGwPublishedApiDetails) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_PUBLISHED_API_DETAILS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_PUBLISHED_API_DETAILS table column count validation is fail.";
        }

    }
    public static String validateTableColumnCount10() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmPolicySubscription = validate.validateAPIMDbTableColumnCount("apim_db","AM_POLICY_SUBSCRIPTION",25);

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

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_API_SERVICE_MAPPING");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_SERVICE_MAPPING table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_API_SERVICE_MAPPING table exists validation is fail.";
        }

    }

    public static String checkTableExists2() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_DEPLOYMENT_REVISION_MAPPING");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_DEPLOYMENT_REVISION_MAPPING table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_DEPLOYMENT_REVISION_MAPPING table exists validation is fail.";
        }

    }

    public static String checkTableExists3() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_GATEWAY_ENVIRONMENT");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GATEWAY_ENVIRONMENT table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GATEWAY_ENVIRONMENT table exists validation is fail.";
        }

    }

    public static String checkTableExists4() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_GW_API_DEPLOYMENTS");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_API_DEPLOYMENTS table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_API_DEPLOYMENTS table exists validation is fail.";
        }

    }

    public static String checkTableExists5() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_GW_VHOST");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_GW_VHOST table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_GW_VHOST table exists validation is fail.";
        }

    }

    public static String checkTableExists6() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_REVISION");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_REVISION table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_REVISION table exists validation is fail.";
        }

    }

    public static String checkTableExists7() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_SERVICE_CATALOG");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_SERVICE_CATALOG table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_SERVICE_CATALOG table exists validation is fail.";
        }

    }

    public static String checkTableExists8() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_WEBHOOKS_SUBSCRIPTION");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_WEBHOOKS_SUBSCRIPTION table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_WEBHOOKS_SUBSCRIPTION table exists validation is fail.";
        }

    }

    public static String checkTableExists9() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_WEBHOOKS_UNSUBSCRIPTION");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_WEBHOOKS_UNSUBSCRIPTION table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_WEBHOOKS_UNSUBSCRIPTION table exists validation is fail.";
        }

    }

    public static String checkTableExists10() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_CONFIG_ATTRIBUTE");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CONFIG_ATTRIBUTE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CONFIG_ATTRIBUTE table exists validation is fail.";
        }

    }

    public static String checkTableExists11() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_CONFIG_FILE");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CONFIG_FILE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CONFIG_FILE table exists validation is fail.";
        }

    }

    public static String checkTableExists12() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_CONFIG_RESOURCE");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CONFIG_RESOURCE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CONFIG_RESOURCE table exists validation is fail.";
        }

    }

    public static String checkTableExists13() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_CONFIG_TYPE");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CONFIG_TYPE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CONFIG_TYPE table exists validation is fail.";
        }

    }

    public static String checkTableExists14() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_CORS_ASSOCIATION");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CORS_ASSOCIATION table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CORS_ASSOCIATION table exists validation is fail.";
        }

    }

    public static String checkTableExists15() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_CORS_ORIGIN");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CORS_ORIGIN table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_CORS_ORIGIN table exists validation is fail.";
        }

    }

    public static String checkTableExists16() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_REMOTE_FETCH_CONFIG");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_REMOTE_FETCH_CONFIG table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_REMOTE_FETCH_CONFIG table exists validation is fail.";
        }

    }

    public static String checkTableExists17() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_REMOTE_FETCH_REVISIONS");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_REMOTE_FETCH_REVISIONS table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_REMOTE_FETCH_REVISIONS table exists validation is fail.";
        }

    }

    public static String checkTableExists18() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_USER_FUNCTIONALITY_MAPPING");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_USER_FUNCTIONALITY_MAPPING table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_USER_FUNCTIONALITY_MAPPING table exists validation is fail.";
        }

    }

    public static String checkTableExists19() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","IDN_USER_FUNCTIONALITY_PROPERTY");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_USER_FUNCTIONALITY_PROPERTY table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db IDN_USER_FUNCTIONALITY_PROPERTY table exists validation is fail.";
        }

    }

    public static String checkTableExists20() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTableExists("apim_db","AM_API_REVISION_METADATA");

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

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTablesRemoved("apim_db","AM_LABELS");

        if(tableExists) {
            return " * 3.2.0 to 4.0.0 apim_db AM_LABELS table remove validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 apim_db AM_LABELS table remove validation is fail.";
        }

    }

    public static String checkTableRemoved2() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExists = validate.checkTablesRemoved("apim_db","AM_LABEL_URLS");

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

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableCount = validate.sharedDbCheckTablesCount("shared_db",42);

        if(sharedDbTableCount) {
            return " * 3.2.0 to 4.0.0 shared_db tables count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db tables count validation is fail.";
        }

    }

    //s2
    public static String sharedDbCheckTablesExists() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbTableExists = validate.sharedDbCheckTablesExists("shared_db","UM_HYBRID_GROUP_ROLE");

        if(sharedDbTableExists) {
            return " * 3.2.0 to 4.0.0 shared_db UM_HYBRID_GROUP_ROLE table exists validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 shared_db shared_db UM_HYBRID_GROUP_ROLE table exists validation is fail.";
        }

    }

    //s3
    public static String sharedDbCheckColumnCount() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean sharedDbColumnCount = validate.sharedDbCheckColumnCount("shared_db","UM_TENANT",7);

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

    public static String[][] a = ReadFile.readFile();


    public static String comparePreviousDb1() {

        int x0 = Integer.parseInt(a[0][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb1 = validate.comparePreviousDB1(x0);

        if (compareDb1) {
            return " * 3.2.0 to 4.0.0 apim_db AM_ALERT_TYPES table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_ALERT_TYPES table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb2() {

        int x1 = Integer.parseInt(a[1][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb2 = validate.comparePreviousDB2(x1);

        if (compareDb2) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb3() {

        int x2 = Integer.parseInt(a[2][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb3 = validate.comparePreviousDB3(x2);

        if (compareDb3) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_LC_EVENT table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API_LC_EVENT table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb4() {

        int x3 = Integer.parseInt(a[3][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb4 = validate.comparePreviousDB4(x3);

        if (compareDb4) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_RATINGS table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API_RATINGS table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb5() {

        int x4 = Integer.parseInt(a[4][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb5 = validate.comparePreviousDB5(x4);

        if (compareDb5) {
            return " * 3.2.0 to 4.0.0 apim_db AM_API_THROTTLE_POLICY table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_API_THROTTLE_POLICY table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb6() {

        int x5 = Integer.parseInt(a[5][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb6 = validate.comparePreviousDB6(x5);

        if (compareDb6) {
            return " * 3.2.0 to 4.0.0 apim_db AM_APPLICATION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_APPLICATION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb7() {

        int x6 = Integer.parseInt(a[6][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb7 = validate.comparePreviousDB7(x6);

        if (compareDb7) {
            return " * 3.2.0 to 4.0.0 apim_db AM_APPLICATION_KEY_MAPPING table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_APPLICATION_KEY_MAPPING table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb8() {

        int x7 = Integer.parseInt(a[7][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb8 = validate.comparePreviousDB8(x7);

        if (compareDb8) {
            return " * 3.2.0 to 4.0.0 apim_db AM_APPLICATION_REGISTRATION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_APPLICATION_REGISTRATION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb9() {

        int x8 = Integer.parseInt(a[8][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb9 = validate.comparePreviousDB9(x8);

        if (compareDb9) {
            return " * 3.2.0 to 4.0.0 apim_db AM_KEY_MANAGER table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_KEY_MANAGER table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb10() {

        int x9 = Integer.parseInt(a[9][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb10 = validate.comparePreviousDB10(x9);

        if (compareDb10) {
            return " * 3.2.0 to 4.0.0 apim_db AM_POLICY_APPLICATION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_POLICY_APPLICATION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb11() {

        int x10 = Integer.parseInt(a[10][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb11 = validate.comparePreviousDB11(x10);

        if (compareDb11) {
            return " * 3.2.0 to 4.0.0 apim_db AM_POLICY_SUBSCRIPTION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_POLICY_SUBSCRIPTION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb12() {

        int x11 = Integer.parseInt(a[11][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb12 = validate.comparePreviousDB12(x11);

        if (compareDb12) {
            return " * 3.2.0 to 4.0.0 apim_db AM_SUBSCRIBER table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_SUBSCRIBER table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb13() {

        int x12 = Integer.parseInt(a[12][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb13 = validate.comparePreviousDB13(x12);

        if (compareDb13) {
            return " * 3.2.0 to 4.0.0 apim_db AM_SUBSCRIPTION table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_SUBSCRIPTION table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb14() {

        int x13 = Integer.parseInt(a[13][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb14 = validate.comparePreviousDB14(x13);

        if (compareDb14) {
            return " * 3.2.0 to 4.0.0 apim_db AM_SYSTEM_APPS table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db AM_SYSTEM_APPS table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb15() {

        int x14 = Integer.parseInt(a[14][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb15 = validate.comparePreviousDB15(x14);

        if (compareDb15) {
            return " * 3.2.0 to 4.0.0 apim_db CM_PURPOSE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db CM_PURPOSE table content before and after migration validation is fail.";
        }

    }

    public static String comparePreviousDb16() {

        int x15 = Integer.parseInt(a[15][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb16 = validate.comparePreviousDB16(x15);

        if (compareDb16) {
            return " * 3.2.0 to 4.0.0 apim_db CM_PURPOSE_CATEGORY table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db CM_PURPOSE_CATEGORY table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb17() {

        int x16 = Integer.parseInt(a[16][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb17 = validate.comparePreviousDB17(x16);

        if (compareDb17) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_APP_INFO table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_APP_INFO table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb18() {

        int x17 = Integer.parseInt(a[17][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb18 = validate.comparePreviousDB18(x17);

        if (compareDb18) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_META_DATA table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_META_DATA table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb19() {

        int x18 = Integer.parseInt(a[18][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb19 = validate.comparePreviousDB19(x18);

        if (compareDb19) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_STORE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_SESSION_STORE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb20() {

        int x19 = Integer.parseInt(a[19][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb20 = validate.comparePreviousDB20(x19);

        if (compareDb20) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_TEMP_SESSION_STORE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_TEMP_SESSION_STORE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb21() {

        int x20 = Integer.parseInt(a[20][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb21 = validate.comparePreviousDB21(x20);

        if (compareDb21) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_AUTH_USER_SESSION_MAPPING table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_AUTH_USER_SESSION_MAPPING table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb22() {

        int x21 = Integer.parseInt(a[21][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb22 = validate.comparePreviousDB22(x21);

        if (compareDb22) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_BASE_TABLE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_BASE_TABLE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb23() {

        int x22 = Integer.parseInt(a[22][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb23 = validate.comparePreviousDB23(x22);

        if (compareDb23) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_CLAIM_DIALECT table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_CLAIM_DIALECT table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb24() {

        int x23 = Integer.parseInt(a[23][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb24 = validate.comparePreviousDB24(x23);

        if (compareDb24) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_ACCESS_TOKEN table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_ACCESS_TOKEN table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb25() {

        int x24 = Integer.parseInt(a[24][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb25 = validate.comparePreviousDB25(x24);

        if (compareDb25) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_ACCESS_TOKEN_SCOPE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_ACCESS_TOKEN_SCOPE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb26() {

        int x25 = Integer.parseInt(a[25][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb26 = validate.comparePreviousDB26(x25);

        if (compareDb26) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_AUTHORIZATION_CODE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_AUTHORIZATION_CODE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb27() {

        int x26 = Integer.parseInt(a[26][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb27 = validate.comparePreviousDB27(x26);

        if (compareDb27) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_AUTHZ_CODE_SCOPE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_AUTHZ_CODE_SCOPE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb28() {

        int x27 = Integer.parseInt(a[27][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb28 = validate.comparePreviousDB28(x27);

        if (compareDb28) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_SCOPE table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_SCOPE table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb29() {

        int x28 = Integer.parseInt(a[28][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb29 = validate.comparePreviousDB29(x28);

        if (compareDb29) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH2_SCOPE_BINDING table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH2_SCOPE_BINDING table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb30() {

        int x29 = Integer.parseInt(a[29][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb30 = validate.comparePreviousDB30(x29);

        if (compareDb30) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OAUTH_CONSUMER_APPS table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OAUTH_CONSUMER_APPS table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb31() {

        int x30 = Integer.parseInt(a[30][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb31 = validate.comparePreviousDB31(x30);

        if (compareDb31) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OIDC_PROPERTY table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OIDC_PROPERTY table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb32() {

        int x31 = Integer.parseInt(a[31][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb32 = validate.comparePreviousDB32(x31);

        if (compareDb32) {
            return " * 3.2.0 to 4.0.0 apim_db IDN_OIDC_SCOPE_CLAIM_MAPPING table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDN_OIDC_SCOPE_CLAIM_MAPPING table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb33() {

        int x32 = Integer.parseInt(a[32][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb33 = validate.comparePreviousDB33(x32);

        if (compareDb33) {
            return " * 3.2.0 to 4.0.0 apim_db IDP table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDP table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb34() {

        int x33 = Integer.parseInt(a[33][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb34 = validate.comparePreviousDB34(x33);

        if (compareDb34) {
            return " * 3.2.0 to 4.0.0 apim_db IDP_AUTHENTICATOR table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDP_AUTHENTICATOR table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb35() {

        int x34 = Integer.parseInt(a[34][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb35 = validate.comparePreviousDB35(x34);

        if (compareDb35) {
            return " * 3.2.0 to 4.0.0 apim_db IDP_AUTHENTICATOR_PROPERTY table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDP_AUTHENTICATOR_PROPERTY table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb36() {

        int x35 = Integer.parseInt(a[35][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb36 = validate.comparePreviousDB36(x35);

        if (compareDb36) {
            return " * 3.2.0 to 4.0.0 apim_db IDP_METADATA table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db IDP_METADATA table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb37() {

        int x36 = Integer.parseInt(a[36][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb37 = validate.comparePreviousDB37(x36);

        if (compareDb37) {
            return " * 3.2.0 to 4.0.0 apim_db SP_APP table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db SP_APP table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb38() {

        int x37 = Integer.parseInt(a[37][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb38 = validate.comparePreviousDB38(x37);

        if (compareDb38) {
            return " * 3.2.0 to 4.0.0 apim_db SP_INBOUND_AUTH table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db SP_INBOUND_AUTH table content before and after migration validation is fail.";
        }
    }

    public static String comparePreviousDb39() {

        int x38 = Integer.parseInt(a[38][1]);

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean compareDb39 = validate.comparePreviousDB39(x38);

        if (compareDb39) {
            return " * 3.2.0 to 4.0.0 apim_db SP_METADATA table content before and after migration validation is successful.";
        } else {
            return "3.2.0 to 4.0.0 apim_db SP_METADATA table content before and after migration validation is fail.";
        }
    }

}
