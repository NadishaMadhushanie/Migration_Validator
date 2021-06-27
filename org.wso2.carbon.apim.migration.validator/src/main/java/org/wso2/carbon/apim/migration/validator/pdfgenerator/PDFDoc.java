package org.wso2.carbon.apim.migration.validator.pdfgenerator;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.apim.migration.validator.Validator320to400;
import java.io.FileOutputStream;
import java.util.stream.Stream;

public class PDFDoc {

        public void pdfCreate()
        {
        try {
                final Log log = LogFactory.getLog(PDFDoc.class);

                //1
                String table_count = Validator320to400.validateTableCount();
                log.info(table_count);

                //2
                String revision_creation = Validator320to400.validateRevisionCreation();
                log.info(revision_creation);

                //3
                String[] column_count_methods ={Validator320to400.validateTableColumnCount1(),Validator320to400.validateTableColumnCount2(),Validator320to400.validateTableColumnCount3(),Validator320to400.validateTableColumnCount4(),Validator320to400.validateTableColumnCount5(),Validator320to400.validateTableColumnCount6(),Validator320to400.validateTableColumnCount7(),Validator320to400.validateTableColumnCount8(),Validator320to400.validateTableColumnCount9(),Validator320to400.validateTableColumnCount10()};
                String[] column_count = new String[100];

                for(int i=0;i<10;i++)
                {
                        column_count[i+1] = column_count_methods[i];
                        log.info(column_count[i+1]);
                }

                //4
                String uuid_column_validation = Validator320to400.validateApiUuidContent();
                log.info(uuid_column_validation);

                //5
                String[] methods = {Validator320to400.checkTableExits1(),Validator320to400.checkTableExits2(),Validator320to400.checkTableExits3(),Validator320to400.checkTableExits4(),Validator320to400.checkTableExits5(),Validator320to400.checkTableExits6(),Validator320to400.checkTableExits7(),Validator320to400.checkTableExits8(),Validator320to400.checkTableExits9(),Validator320to400.checkTableExits10(),Validator320to400.checkTableExits11(),Validator320to400.checkTableExits12(),Validator320to400.checkTableExits13(),Validator320to400.checkTableExits14(),Validator320to400.checkTableExits15(),Validator320to400.checkTableExits16(),Validator320to400.checkTableExits17(),Validator320to400.checkTableExits18(),Validator320to400.checkTableExits19(),Validator320to400.checkTableExits20()};
                String[] table_exits = new String[100];

                for(int i=0;i<20;i++)
                {
                         table_exits[i+1] = methods[i];
                         log.info(table_exits[i+1]);
                }


                //6
                String vhost_relation_validation = Validator320to400.validateRelationVhost();
                log.info(vhost_relation_validation);

                //7
                String revision_relation_validation = Validator320to400.validateRelationRevision();
                log.info(revision_relation_validation);

                //8
                String published_api_relation_validation = Validator320to400.validateRelationPublishedApis();
                log.info(published_api_relation_validation);

                //9
                String[] table_removed_methods ={Validator320to400.checkTableRemoved1(),Validator320to400.checkTableRemoved2()};
                String[] table_removed = new String[100];

                for(int i=0;i<2;i++)
                {
                        table_removed[i+1] = table_removed_methods[i];
                        log.info(table_removed[i+1]);
                }

                //10,11,12
                String[] tables_content_methods ={Validator320to400.checkTableContent1(),Validator320to400.checkTableContent2(),Validator320to400.checkTableContent3()};
                String[] tables_content = new String[100];

                for(int i=0;i<3;i++)
                {
                    tables_content[i+1] = tables_content_methods[i];
                    log.info(tables_content[i+1]);
                }

                Document doc = new Document();
                PdfWriter.getInstance(doc, new FileOutputStream("Report.pdf"));
                doc.open();

                Font bold = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
                Paragraph paragraph = new Paragraph("Migration Validation Status.");

                PdfPTable table = new PdfPTable(1);
                Stream.of("STATUS").forEach(table::addCell);

                //1
                table.addCell(table_count);

                //2
                table.addCell(revision_creation);

                //3
                for(int i=0;i<10;i++)
                {
                        table.addCell(column_count[i+1]);
                }


                //4
                table.addCell(uuid_column_validation);

                //5
                for(int i=0;i<20;i++)
                {
                        table.addCell(table_exits[i+1]);
                }

                //6
                table.addCell(vhost_relation_validation);

                //7
                table.addCell(revision_relation_validation);

                //8
                table.addCell(published_api_relation_validation);

                //9
                for(int i=0;i<2;i++)
                {
                        table.addCell(table_removed[i+1]);
                }

                //10,11,12
                for(int i=0;i<3;i++)
                {
                        table.addCell(tables_content[i+1]);
                }


                paragraph.add(table);
                doc.add(paragraph);
                doc.close();
        }
        catch (Exception e)
        {
                e.getMessage();
        }
    }

}



