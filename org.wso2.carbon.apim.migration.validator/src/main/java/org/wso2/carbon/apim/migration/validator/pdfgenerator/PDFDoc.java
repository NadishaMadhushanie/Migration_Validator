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

                log.info("1. Structural Validation.");

                //1
                String table_count = Validator320to400.validateTableCount();
                log.info(table_count);

                //3
                String[] column_count_methods ={Validator320to400.validateTableColumnCount1(),Validator320to400.validateTableColumnCount2(),Validator320to400.validateTableColumnCount3(),Validator320to400.validateTableColumnCount4(),Validator320to400.validateTableColumnCount5(),Validator320to400.validateTableColumnCount6(),Validator320to400.validateTableColumnCount7(),Validator320to400.validateTableColumnCount8(),Validator320to400.validateTableColumnCount9(),Validator320to400.validateTableColumnCount10()};
                String[] column_count = new String[100];

                for(int i=0;i<10;i++)
                {
                        column_count[i+1] = column_count_methods[i];
                        log.info(column_count[i+1]);
                }

                //5
                String[] methods = {Validator320to400.checkTableExists1(),Validator320to400.checkTableExists2(),Validator320to400.checkTableExists3(),Validator320to400.checkTableExists4(),Validator320to400.checkTableExists5(),Validator320to400.checkTableExists6(),Validator320to400.checkTableExists7(),Validator320to400.checkTableExists8(),Validator320to400.checkTableExists9(),Validator320to400.checkTableExists10(),Validator320to400.checkTableExists11(),Validator320to400.checkTableExists12(),Validator320to400.checkTableExists13(),Validator320to400.checkTableExists14(),Validator320to400.checkTableExists15(),Validator320to400.checkTableExists16(),Validator320to400.checkTableExists17(),Validator320to400.checkTableExists18(),Validator320to400.checkTableExists19(),Validator320to400.checkTableExists20()};
                String[] table_exists = new String[100];

                for(int i=0;i<20;i++)
                {
                        table_exists[i+1] = methods[i];
                        log.info(table_exists[i+1]);
                }

                //9
                String[] table_removed_methods ={Validator320to400.checkTableRemoved1(),Validator320to400.checkTableRemoved2()};
                String[] table_removed = new String[100];

                for(int i=0;i<2;i++)
                {
                        table_removed[i+1] = table_removed_methods[i];
                        log.info(table_removed[i+1]);
                }

                //s1
                String shared_db_table_count = Validator320to400.sharedDbCheckTablesCount();
                log.info(shared_db_table_count);

                //s2
                String shared_db_check_table_exist = Validator320to400.sharedDbCheckTablesExists();
                log.info(shared_db_check_table_exist);

                //s3
                String shared_db_check_column_count = Validator320to400.sharedDbCheckColumnCount();
                log.info(shared_db_check_column_count);




                log.info("2. Table Relations Validation.");

                //2
                String revision_creation = Validator320to400.validateRevisionCreation();
                log.info(revision_creation);

                //4
                String uuid_column_validation = Validator320to400.validateApiUuidContent();
                log.info(uuid_column_validation);

                //6
                String vhost_relation_validation = Validator320to400.validateRelationVhost();
                log.info(vhost_relation_validation);

                //7
                String revision_relation_validation = Validator320to400.validateRelationRevision();
                log.info(revision_relation_validation);

                //8
                String published_api_relation_validation = Validator320to400.validateRelationPublishedApis();
                log.info(published_api_relation_validation);

                //10,11,12
                String[] tables_content_methods ={Validator320to400.checkTableContent1(),Validator320to400.checkTableContent2(),Validator320to400.checkTableContent3()};
                String[] tables_content = new String[100];

                for(int i=0;i<3;i++)
                {
                    tables_content[i+1] = tables_content_methods[i];
                    log.info(tables_content[i+1]);
                }

                //s4-s10
                String[] shared_db_tables_content_methods={Validator320to400.sharedDbCheckTableContent1(),Validator320to400.sharedDbCheckTableContent2(),Validator320to400.sharedDbCheckTableContent3(),Validator320to400.sharedDbCheckTableContent4(),Validator320to400.sharedDbCheckTableContent5(),Validator320to400.sharedDbCheckTableContent6(),Validator320to400.sharedDbCheckTableContent7()};
                String[] shared_db_tables_content = new String[100];

                for(int i=0;i<7;i++)
                {
                        shared_db_tables_content[i+1] = shared_db_tables_content_methods[i];
                        log.info(shared_db_tables_content[i+1]);
                }



                //compare with previous db

                log.info("3. Data Validation Against Previous Database.");
                log.info("   - count validation.");

                String[] apim_db_compare_previous_db_methods_count = {Validator320to400.comparePreviousDb1(),Validator320to400.comparePreviousDb2(),Validator320to400.comparePreviousDb3(),Validator320to400.comparePreviousDb4(),Validator320to400.comparePreviousDb5(),Validator320to400.comparePreviousDb6(),Validator320to400.comparePreviousDb7(),Validator320to400.comparePreviousDb8(),Validator320to400.comparePreviousDb9(),Validator320to400.comparePreviousDb10(),Validator320to400.comparePreviousDb11(),Validator320to400.comparePreviousDb12(),Validator320to400.comparePreviousDb13(),Validator320to400.comparePreviousDb14(),Validator320to400.comparePreviousDb15(),Validator320to400.comparePreviousDb16(),Validator320to400.comparePreviousDb17(),Validator320to400.comparePreviousDb18(),Validator320to400.comparePreviousDb19(),Validator320to400.comparePreviousDb20(),Validator320to400.comparePreviousDb21(),Validator320to400.comparePreviousDb22(),Validator320to400.comparePreviousDb23(),Validator320to400.comparePreviousDb24(),Validator320to400.comparePreviousDb25(),Validator320to400.comparePreviousDb26(),Validator320to400.comparePreviousDb27(),Validator320to400.comparePreviousDb28(),Validator320to400.comparePreviousDb29(),Validator320to400.comparePreviousDb30(),Validator320to400.comparePreviousDb31(),Validator320to400.comparePreviousDb32(),Validator320to400.comparePreviousDb33(),Validator320to400.comparePreviousDb34(),Validator320to400.comparePreviousDb35(),Validator320to400.comparePreviousDb36(),Validator320to400.comparePreviousDb37(),Validator320to400.comparePreviousDb38(),Validator320to400.comparePreviousDb39(),Validator320to400.comparePreviousDb40(),Validator320to400.comparePreviousDb41(),Validator320to400.comparePreviousDb42(),Validator320to400.comparePreviousDb43(),Validator320to400.comparePreviousDb44(),Validator320to400.comparePreviousDb45(),Validator320to400.comparePreviousDb46()};
                String[] apim_db_compare_previous_db_count = new String[1000];

                for(int i=0;i<apim_db_compare_previous_db_methods_count.length;i++)
                {
                        apim_db_compare_previous_db_count[i+1] = apim_db_compare_previous_db_methods_count[i];
                        log.info(apim_db_compare_previous_db_count[i+1]);
                }


                log.info("   - content validation.");

                String[] apim_db_compare_previous_db_methods_content ={Validator320to400.comparePreviousDbContent1(),Validator320to400.comparePreviousDbContent2(),Validator320to400.comparePreviousDbContent3(),Validator320to400.comparePreviousDbContent4()};
                String[] apim_db_compare_previous_db_content = new String[1000];

                for(int i=0;i<apim_db_compare_previous_db_methods_content.length;i++)
                {
                        apim_db_compare_previous_db_content[i+1] = apim_db_compare_previous_db_methods_content[i];
                        log.info(apim_db_compare_previous_db_content[i+1]);
                }


                Document doc = new Document();
                PdfWriter.getInstance(doc, new FileOutputStream("Report.pdf"));
                doc.open();

                Font bold = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
                Paragraph paragraph = new Paragraph("MIGRATION VALIDATION STATUS.");

                Paragraph paragraph1 = new Paragraph("1. Structural Validation.");

                PdfPTable table = new PdfPTable(1);
                Stream.of("STATUS").forEach(table::addCell);

                //1
                table.addCell(table_count);

                //3
                for(int i=0;i<10;i++)
                {
                        table.addCell(column_count[i+1]);
                }

                //5
                for(int i=0;i<20;i++)
                {
                        table.addCell(table_exists[i+1]);
                }

                //9
                for(int i=0;i<2;i++)
                {
                        table.addCell(table_removed[i+1]);
                }

                //s1
                table.addCell(shared_db_table_count);

                //s2
                table.addCell(shared_db_check_table_exist);

                //s3
                table.addCell(shared_db_check_column_count);

                doc.add(paragraph);
                paragraph1.add(table);
                doc.add(paragraph1);


                Paragraph paragraph2 = new Paragraph("2. Table Relations Validation.");

                PdfPTable table2 = new PdfPTable(1);
                Stream.of("STATUS").forEach(table2::addCell);


                //2
                table2.addCell(revision_creation);

                //4
                table2.addCell(uuid_column_validation);

                //6
                table2.addCell(vhost_relation_validation);

                //7
                table2.addCell(revision_relation_validation);

                //8
                table2.addCell(published_api_relation_validation);

                //10,11,12
                for(int i=0;i<3;i++)
                {
                        table2.addCell(tables_content[i+1]);
                }

                //s4-s10
                for(int i=0;i<7;i++)
                {
                        table2.addCell(shared_db_tables_content[i+1]);
                }

                paragraph2.add(table2);
                doc.add(paragraph2);


                //compare with previous db

                Paragraph paragraph3 = new Paragraph("3. Data Validation Against Previous Database.");
                doc.add(paragraph3);

                Paragraph paragraph4 = new Paragraph("   - count validation.");

                PdfPTable table3 = new PdfPTable(1);
                Stream.of("STATUS").forEach(table3::addCell);

                for(int i=0;i<apim_db_compare_previous_db_methods_count.length;i++)
                {
                        table3.addCell(apim_db_compare_previous_db_count[i+1]);
                }

                paragraph4.add(table3);
                doc.add(paragraph4);


                Paragraph paragraph5 = new Paragraph("   - content validation.");

                PdfPTable table4 = new PdfPTable(1);
                Stream.of("STATUS").forEach(table4::addCell);

                for(int i=0;i<apim_db_compare_previous_db_methods_content.length;i++)
                {
                        table4.addCell(apim_db_compare_previous_db_content[i+1]);
                }

                paragraph5.add(table4);
                doc.add(paragraph5);


                doc.close();
        }
        catch (Exception e)
        {
                e.getMessage();
        }
    }

}



