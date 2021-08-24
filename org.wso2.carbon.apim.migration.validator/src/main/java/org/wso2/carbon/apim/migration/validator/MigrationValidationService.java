package org.wso2.carbon.apim.migration.validator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;
import org.wso2.carbon.core.ServerStartupObserver;
import org.wso2.carbon.apim.migration.validator.pdfgenerator.PDFDoc;

public class MigrationValidationService implements ServerStartupObserver {

    private static final Log log = LogFactory.getLog(MigrationValidationService.class);

    @Override
    public void completingServerStartup() {
    }

    @Override
    public void completedServerStartup() {
        try {
            APIMgtDBUtil.initialize();

            log.info("*****************************************************Migration Validation**********************************************************");

            PDFDoc pdf = new PDFDoc();
            pdf.pdfCreate();

            log.info("***********************************************************************************************************************************");



        } catch (Exception e) {
            log.error("Error occurred while initializing DB Util ", e);
        }
    }

}