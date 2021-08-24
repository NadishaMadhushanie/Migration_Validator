package org.wso2.carbon.apim.migration.validator.dao;


public class SQLConstants {

    /*api-m 4.0.0 apim_db*/
//1
    /*table count should be equal to 177    1-apim_db , 2-177*/
    public static String GET_TABLE_COUNT = "SELECT  CASE WHEN (SELECT count(*) AS TOTAL FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ? )=(?) THEN 'true' ELSE 'false' END AS Result;";

//2
    /*In AM_API table, if status is published , revision should be created      1-apim_db.AM_API , 2-apim_db.AM_API*/
    public static String VALIDATE_REVISION_CREATION = "SELECT CASE WHEN (SELECT count(*) FROM apim_db.AM_API WHERE STATUS = 'PUBLISHED' and REVISIONS_CREATED = '1')=(SELECT count(*) FROM apim_db.AM_API WHERE STATUS = 'PUBLISHED') THEN 'true' ELSE 'false' END AS Result;";


//4
    /*all entries in “API_UUID” are not null.   1-apim_db.AM_API , 2-API_UUID*/
    public static String VALIDATE_API_UUID_CONTENT = "SELECT CASE WHEN (SELECT count(*) FROM apim_db.AM_API where API_UUID is null or API_UUID = '')=(0) THEN 'true' ELSE 'false' END AS Result;";

//3

    /*column count is changed after the migration in some tables
    1-'apim_db' , 2-'AM_API'                    , 3-15
    1-'apim_db' , 2-'AM_API_CLIENT_CERTIFICATE' , 3-7
    1-'apim_db' , 2-'AM_API_COMMENTS'           , 3-9
    1-'apim_db' , 2-'AM_API_PRODUCT_MAPPING'    , 3-4
    1-'apim_db' , 2-'AM_API_URL_MAPPING'        , 3-8
    1-'apim_db' , 2-'AM_CERTIFICATE_METADATA'   , 3-4
    1-'apim_db' , 2-'AM_GRAPHQL_COMPLEXITY'     , 3-6
    1-'apim_db' , 2-'AM_GW_API_ARTIFACTS'       , 3-4
    1-'apim_db' , 2-'AM_GW_PUBLISHED_API_DETAILS' , 3-6
    1-'apim_db' , 2-'AM_POLICY_SUBSCRIPTION'     , 3-25
                 */
    public static String GET_COLUMN_COUNT = "SELECT CASE WHEN (select count(*) as columns from INFORMATION_SCHEMA.COLUMNS where table_schema = ? and table_name = ?)=(?) THEN 'true' ELSE 'false' END AS Result;";

 //5
    /*check whether newly added tables are exists
        1-'apim_db' , 2-'AM_API_SERVICE_MAPPING'
        1-'apim_db' , 2-'AM_DEPLOYMENT_REVISION_MAPPING'
        1-'apim_db' , 2-'AM_GATEWAY_ENVIRONMENT'
        1-'apim_db' , 2-'AM_GW_API_DEPLOYMENTS'
        1-'apim_db' , 2-'AM_GW_VHOST'
        1-'apim_db' , 2-'AM_REVISION'
        1-'apim_db' , 2-'AM_SERVICE_CATALOG'
        1-'apim_db' , 2-'AM_WEBHOOKS_SUBSCRIPTION'
        1-'apim_db' , 2-'AM_WEBHOOKS_UNSUBSCRIPTION'
        1-'apim_db' , 2-'IDN_CONFIG_ATTRIBUTE'
        1-'apim_db' , 2-'IDN_CONFIG_FILE'
        1-'apim_db' , 2-'IDN_CONFIG_RESOURCE'
        1-'apim_db' , 2-'IDN_CONFIG_TYPE'
        1-'apim_db' , 2-'IDN_CORS_ASSOCIATION'
        1-'apim_db' , 2-'IDN_CORS_ORIGIN'
        1-'apim_db' , 2-'IDN_REMOTE_FETCH_CONFIG'
        1-'apim_db' , 2-'IDN_REMOTE_FETCH_REVISIONS'
        1-'apim_db' , 2-'IDN_USER_FUNCTIONALITY_MAPPING'
        1-'apim_db' , 2-'IDN_USER_FUNCTIONALITY_PROPERTY'
        1-'apim_db' , 2-'AM_API_REVISION_METADATA'
    */
    public static String CHECK_TABLES_EXISTS ="SELECT CASE WHEN (select count(*) FROM information_schema.tables WHERE table_schema = ? AND table_name = ?)=(1) THEN 'true' ELSE 'false' END AS Result;";

    /* 1 to many*/

    //6
    public static String CHECK_RELATION_VHOST ="SELECT CASE WHEN (SELECT COUNT(*)  from apim_db.AM_GATEWAY_ENVIRONMENT)<=(SELECT COUNT(*)  from apim_db.AM_GW_VHOST) THEN 'true' ELSE 'false' END AS Result;";

    //7
    public static String CHECK_RELATION_REVISION ="SELECT CASE WHEN (SELECT COUNT(*)  from apim_db.AM_REVISION)<=(SELECT COUNT(*)  from apim_db.AM_DEPLOYMENT_REVISION_MAPPING) THEN 'true' ELSE 'false' END AS Result;";

    //8
    public static String CHECK_RELATION_PUBLISHED_APIS ="SELECT CASE WHEN (SELECT COUNT(*)  from apim_db.AM_GW_PUBLISHED_API_DETAILS)<=(SELECT COUNT(*)  from apim_db.AM_GW_API_DEPLOYMENTS) THEN 'true' ELSE 'false' END AS Result;";

    /*AM_LABELS,AM_LABEL_URLS tables should be remove after the migration from apim_db
    1-'apim_db' , 2-'AM_LABELS'
    1-'apim_db' , 2-'AM_LABEL_URLS'
    * */

    //9

    public static String CHECK_TABLE_REMOVED = "SELECT CASE WHEN (select count(*) FROM information_schema.tables WHERE table_schema = ? AND table_name = ?)=(0) THEN 'true' ELSE 'false' END AS Result;";

    //10
    //AM_API TABLE PUBLISHED COUNT SHOULD BE EQUAL TO AM_REVISION TABLE COUNT
    // 1- 'PUBLISHED'
    public static String CHECK_TABLE_CONTENT1 ="SELECT CASE WHEN (SELECT count(*) FROM apim_db.AM_API where STATUS = ?)=(SELECT count(*) FROM apim_db.AM_REVISION) THEN 'true' ELSE 'false' END AS Result;";


    //11
    //AM_API_REVISION_METADATA TABLE  COUNT SHOULD BE EQUAL TO AM_REVISION TABLE COUNT
    public static String CHECK_TABLE_CONTENT2 ="SELECT CASE WHEN (SELECT count(*) FROM apim_db.AM_REVISION)=(SELECT count(*) FROM apim_db.AM_API_REVISION_METADATA) THEN 'true' ELSE 'false' END AS Result;";


    //12
    //AM_GW_API_ARTIFACTS TABLE  COUNT SHOULD BE EQUAL TO AM_GW_PUBLISHED_API_DETAILS TABLE COUNT
    public static String CHECK_TABLE_CONTENT3 ="SELECT CASE WHEN (SELECT count(*) FROM apim_db.AM_GW_API_ARTIFACTS)=(SELECT count(*) FROM apim_db.AM_GW_PUBLISHED_API_DETAILS) THEN 'true' ELSE 'false' END AS Result;";


    //shared_db

    //s1

    /*table count should be equal to 42    1-shared_db , 2-42*/
    public static String SHARED_DB_GET_TABLE_COUNT = "SELECT  CASE WHEN (SELECT count(*) AS TOTAL FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ? )=(?) THEN 'true' ELSE 'false' END AS Result;";

    //s2

    /*check whether newly added tables are exists
        1-'shared_db' , 2-'UM_HYBRID_GROUP_ROLE'
     */
    public static String SHARED_DB_CHECK_TABLES_EXISTS ="SELECT CASE WHEN (select count(*) FROM information_schema.tables WHERE table_schema = ? AND table_name = ?)=(1) THEN 'true' ELSE 'false' END AS Result;";

    //s3

     /*column count is changed after the migration in some tables
    1-'shared_db' , 2-'UM_TENANT'  , 3-7
    */
     public static String SHARED_DB_GET_COLUMN_COUNT = "SELECT CASE WHEN (select count(*) as columns from INFORMATION_SCHEMA.COLUMNS where table_schema = ? and table_name = ?)=(?) THEN 'true' ELSE 'false' END AS Result;";


     //S4
     public static String SHARED_DB_CHECK_TABLE_CONTENT1 ="SELECT CASE WHEN (SELECT count(*) FROM shared_db.REG_PATH )<=(SELECT count(*) FROM shared_db.REG_RESOURCE) THEN 'true' ELSE 'false' END AS Result;";

    //S5 s
    public static String SHARED_DB_CHECK_TABLE_CONTENT2 ="SELECT CASE WHEN (SELECT count(*) FROM shared_db.UM_USER )*2=(SELECT count(*) FROM shared_db.UM_USER_ATTRIBUTE) THEN 'true' ELSE 'false' END AS Result;";

    //S6 s
    public static String SHARED_DB_CHECK_TABLE_CONTENT3 ="SELECT CASE WHEN (SELECT count(*) FROM shared_db.UM_USER )=(SELECT count(*) FROM shared_db.UM_UUID_DOMAIN_MAPPER) THEN 'true' ELSE 'false' END AS Result;";

    //S7
    public static String SHARED_DB_CHECK_TABLE_CONTENT4 ="SELECT CASE WHEN (SELECT count(*) FROM shared_db.REG_PROPERTY )=(SELECT count(*) FROM shared_db.REG_RESOURCE_PROPERTY) THEN 'true' ELSE 'false' END AS Result;";

    //S8
    public static String SHARED_DB_CHECK_TABLE_CONTENT5 ="SELECT CASE WHEN (SELECT count(*) FROM shared_db.REG_RESOURCE_TAG )=(SELECT count(*) FROM shared_db.REG_TAG) THEN 'true' ELSE 'false' END AS Result;";


    /*If new entry added to UM_HYBRID_GROUP_ROLE table, it should added to UM_HYBRID_ROLE,UM_HYBRID_USER_ROLE tables.*/
    //s9 s
    public static String SHARED_DB_CHECK_TABLE_CONTENT6 ="SELECT CASE WHEN (SELECT count(*) FROM shared_db.UM_HYBRID_GROUP_ROLE )<=(SELECT count(*) FROM shared_db.UM_HYBRID_ROLE) THEN 'true' ELSE 'false' END AS Result;";

    //s10 s
    public static String SHARED_DB_CHECK_TABLE_CONTENT7 ="SELECT CASE WHEN (SELECT count(*) FROM shared_db.UM_HYBRID_GROUP_ROLE )<=(SELECT count(*) FROM shared_db.UM_HYBRID_USER_ROLE) THEN 'true' ELSE 'false' END AS Result;";



    //compare with previous database

//count validation

    public static String COMPARE_PREVIOUS_DB1 ="SELECT CASE WHEN (select count(*) from apim_db.AM_ALERT_TYPES)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB2 ="SELECT CASE WHEN (select count(*) from apim_db.AM_API)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB3 ="SELECT CASE WHEN (select count(*) from apim_db.AM_API_LC_EVENT)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB4 ="SELECT CASE WHEN (select count(*) from apim_db.AM_API_RATINGS)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB5 ="SELECT CASE WHEN (select count(*) from apim_db.AM_API_THROTTLE_POLICY)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB6 ="SELECT CASE WHEN (select count(*) from apim_db.AM_APPLICATION)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB7 ="SELECT CASE WHEN (select count(*) from apim_db.AM_APPLICATION_KEY_MAPPING)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB8 ="SELECT CASE WHEN (select count(*) from apim_db.AM_APPLICATION_REGISTRATION)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB9 ="SELECT CASE WHEN (select count(*) from apim_db.AM_KEY_MANAGER)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB10 ="SELECT CASE WHEN (select count(*) from apim_db.AM_POLICY_APPLICATION)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB11="SELECT CASE WHEN (select count(*) from apim_db.AM_POLICY_SUBSCRIPTION)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB12 ="SELECT CASE WHEN (select count(*) from apim_db.AM_SUBSCRIBER)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB13 ="SELECT CASE WHEN (select count(*) from apim_db.AM_SUBSCRIPTION)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB14 ="SELECT CASE WHEN (select count(*) from apim_db.AM_SYSTEM_APPS)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB15 ="SELECT CASE WHEN (select count(*) from apim_db.CM_PURPOSE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB16 ="SELECT CASE WHEN (select count(*) from apim_db.CM_PURPOSE_CATEGORY)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB17 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_AUTH_SESSION_APP_INFO)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB18 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_AUTH_SESSION_META_DATA)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB19 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_AUTH_SESSION_STORE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB20 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_AUTH_TEMP_SESSION_STORE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB21 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_AUTH_USER_SESSION_MAPPING)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB22 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_BASE_TABLE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB23 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_CLAIM_DIALECT)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB24 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OAUTH2_ACCESS_TOKEN)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB25 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OAUTH2_ACCESS_TOKEN_SCOPE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB26 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OAUTH2_AUTHORIZATION_CODE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB27 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OAUTH2_AUTHZ_CODE_SCOPE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB28 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OAUTH2_SCOPE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB29 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OAUTH2_SCOPE_BINDING)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB30 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OAUTH_CONSUMER_APPS)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB31 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OIDC_PROPERTY)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB32 ="SELECT CASE WHEN (select count(*) from apim_db.IDN_OIDC_SCOPE_CLAIM_MAPPING)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB33 ="SELECT CASE WHEN (select count(*) from apim_db.IDP)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB34 ="SELECT CASE WHEN (select count(*) from apim_db.IDP_AUTHENTICATOR)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB35 ="SELECT CASE WHEN (select count(*) from apim_db.IDP_AUTHENTICATOR_PROPERTY)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB36 ="SELECT CASE WHEN (select count(*) from apim_db.IDP_METADATA)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB37 ="SELECT CASE WHEN (select count(*) from apim_db.SP_APP)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB38 ="SELECT CASE WHEN (select count(*) from apim_db.SP_INBOUND_AUTH)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB39 ="SELECT CASE WHEN (select count(*) from apim_db.SP_METADATA)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB40 ="SELECT CASE WHEN (select count(*) from shared_db.REG_ASSOCIATION)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB41 ="SELECT CASE WHEN (select count(*) from shared_db.UM_DOMAIN)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB42 ="SELECT CASE WHEN (select count(*) from shared_db.UM_ROLE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB43 ="SELECT CASE WHEN (select count(*) from shared_db.UM_SYSTEM_ROLE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB44 ="SELECT CASE WHEN (select count(*) from shared_db.UM_SYSTEM_USER_ROLE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB45 ="SELECT CASE WHEN (select count(*) from shared_db.UM_USER_ROLE)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB46 ="SELECT CASE WHEN (select count(*) from apim_db.AM_GW_VHOST)=(?) THEN 'true' ELSE 'false' END AS Result;";

//content validation.
    public static String COMPARE_PREVIOUS_DB_CONTENT1 ="SELECT CASE WHEN (select COALESCE(sum(crc32(concat(API_ID,API_PROVIDER,API_NAME,API_VERSION,CONTEXT,CONTEXT_TEMPLATE,API_TYPE))),0) from apim_db.AM_API)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB_CONTENT2 ="SELECT CASE WHEN (select COALESCE(sum(crc32(UUID)),0) from apim_db.AM_GATEWAY_ENVIRONMENT)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB_CONTENT3 ="SELECT CASE WHEN (select COALESCE(sum(crc32(concat(NAME,DESCRIPTION))),0) from apim_db.AM_GATEWAY_ENVIRONMENT)=(?) THEN 'true' ELSE 'false' END AS Result;";
    public static String COMPARE_PREVIOUS_DB_CONTENT4 ="SELECT CASE WHEN (select COALESCE(sum(crc32(concat(UUID,APPLICATION_ID,CONSUMER_KEY,KEY_TYPE,STATE,CREATE_MODE,APP_INFO))),0) from apim_db.AM_APPLICATION_KEY_MAPPING)=(?) THEN 'true' ELSE 'false' END AS Result;";


    /*structural validation
      1,3,5,9,s1,s2,s3

     table relations validation
       2,4,6,7,8,10,11,12,s4-s10

     data validation against previous database
        -count validation
        -content validation
     */
}
