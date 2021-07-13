package org.wso2.carbon.apim.migration.validator.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;

public class ValidatorDAO320to400 {


    //1
    public boolean validateAPIMDbTableCount(int tableCount, String dbName) {

        String result = " ";

        String sqlQuery = SQLConstants.GET_TABLE_COUNT;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

       try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, dbName);
            ps.setInt(2,tableCount);
            resultSet = ps.executeQuery();

            if(resultSet.next()) {
                result = resultSet.getString("Result");
            }

            ps.close();
            conn.close();

        }
       catch (SQLException e){
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if(result.equals("true")) {
            return true;
        }
        else {
            return false;
        }

    }

//2
    public boolean validateAPIMDbRevisionCreation() {
        String result = " ";

        String sqlQuery = SQLConstants.VALIDATE_REVISION_CREATION;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            // ps.setString(1,tableName);
            // ps.setString(2,tableName);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }


        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

//3

public boolean validateAPIMDbTableColumnCount(String dbName,String tableName,int count) {
    String result = " ";

    String sqlQuery = SQLConstants.GET_COLUMN_COUNT;

    Connection conn = null;
    PreparedStatement ps = null;
    List<String> versionList = new ArrayList<String>();
    ResultSet resultSet = null;

    try {
        conn = APIMgtDBUtil.getConnection();
        ps = conn.prepareStatement(sqlQuery);
        ps.setString(1, dbName);
        ps.setString(2, tableName);
        ps.setInt(3, count);
        resultSet = ps.executeQuery();


        if (resultSet.next()) {
            result = resultSet.getString("Result");
        }

    } catch (SQLException e) {
        //TODO
        System.out.println(e.getMessage());

    } finally {
        APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
    }

    if (result.equals("true")) {
        return true;
    } else {
        return false;
    }
}

//4

public boolean validateAPIMDbUuidContent() {
    String result = " ";

    String sqlQuery = SQLConstants.VALIDATE_API_UUID_CONTENT;

    Connection conn = null;
    PreparedStatement ps = null;
    List<String> versionList = new ArrayList<String>();
    ResultSet resultSet = null;

    try {
        conn = APIMgtDBUtil.getConnection();
        ps = conn.prepareStatement(sqlQuery);
        resultSet = ps.executeQuery();


        if (resultSet.next()) {
            result = resultSet.getString("Result");
        }

    } catch (SQLException e) {
        //TODO
        System.out.println(e.getMessage());

    } finally {
        APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
    }

    if (result.equals("true")) {
        return true;
    } else {
        return false;
    }
}

//5

public boolean checkTableExists(String dbName, String tableName) {
    String result = " ";

    String sqlQuery = SQLConstants.CHECK_TABLES_EXISTS;

    Connection conn = null;
    PreparedStatement ps = null;
    List<String> versionList = new ArrayList<String>();
    ResultSet resultSet = null;

    try {
        conn = APIMgtDBUtil.getConnection();
        ps = conn.prepareStatement(sqlQuery);
        ps.setString(1, dbName);
        ps.setString(2, tableName);
        resultSet = ps.executeQuery();


        if (resultSet.next()) {
            result = resultSet.getString("Result");
        }

    } catch (SQLException e) {
        //TODO
        System.out.println(e.getMessage());

    } finally {
        APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
    }

    if (result.equals("true")) {
        return true;
    } else {
        return false;
    }
}


//6
public boolean checkRelationVhost() {
    String result = " ";

    String sqlQuery = SQLConstants.CHECK_RELATION_VHOST;

    Connection conn = null;
    PreparedStatement ps = null;
    List<String> versionList = new ArrayList<String>();
    ResultSet resultSet = null;

    try {
        conn = APIMgtDBUtil.getConnection();
        ps = conn.prepareStatement(sqlQuery);
        resultSet = ps.executeQuery();


        if (resultSet.next()) {
            result = resultSet.getString("Result");
        }

    } catch (SQLException e) {
        //TODO
        System.out.println(e.getMessage());

    } finally {
        APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
    }

    if (result.equals("true")) {
        return true;
    } else {
        return false;
    }
}

//7

    public boolean checkRelationRevision() {
        String result = " ";

        String sqlQuery = SQLConstants.CHECK_RELATION_REVISION;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

//8

    public boolean checkRelationPulishedApis() {
        String result = " ";

        String sqlQuery = SQLConstants.CHECK_RELATION_PUBLISHED_APIS;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

//9

    public boolean checkTablesRemoved(String dbName,String tableName) {
        String result = " ";

        String sqlQuery = SQLConstants.CHECK_TABLE_REMOVED;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, dbName);
            ps.setString(2, tableName);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //10
    public boolean checkTablesContent1(String status) {
        String result = " ";

        String sqlQuery = SQLConstants.CHECK_TABLE_CONTENT1;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, status);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //11
    public boolean checkTablesContent2() {
        String result = " ";

        String sqlQuery = SQLConstants.CHECK_TABLE_CONTENT2;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //12
    public boolean checkTablesContent3() {
        String result = " ";

        String sqlQuery = SQLConstants.CHECK_TABLE_CONTENT3;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }



    //s1
    public boolean sharedDbCheckTablesCount(String dbName,int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_GET_TABLE_COUNT;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, dbName);
            ps.setInt(2, tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s2
    public boolean sharedDbCheckTablesExists(String dbName, String tableName) {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_CHECK_TABLES_EXISTS;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, dbName);
            ps.setString(2, tableName);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s3
    public boolean sharedDbCheckColumnCount(String dbName,String tableName, int count) {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_GET_COLUMN_COUNT;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, dbName);
            ps.setString(2, tableName);
            ps.setInt(3,count);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s4
    public boolean sharedDbCheckTablesContent1() {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_CHECK_TABLE_CONTENT1;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s5
    public boolean sharedDbCheckTablesContent2() {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_CHECK_TABLE_CONTENT2;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s6
    public boolean sharedDbCheckTablesContent3() {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_CHECK_TABLE_CONTENT3;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s7
    public boolean sharedDbCheckTablesContent4() {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_CHECK_TABLE_CONTENT4;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s8
    public boolean sharedDbCheckTablesContent5() {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_CHECK_TABLE_CONTENT5;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s9
    public boolean sharedDbCheckTablesContent6() {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_CHECK_TABLE_CONTENT6;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    //s10

    public boolean sharedDbCheckTablesContent7() {
        String result = " ";

        String sqlQuery = SQLConstants.SHARED_DB_CHECK_TABLE_CONTENT7;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

//previous db

    public boolean comparePreviousDB1(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB1;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB2(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB2;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB3(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB3;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB4(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB4;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB5(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB5;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB6(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB6;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB7(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB7;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB8(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB8;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB9(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB9;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB10(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB10;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB11(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB11;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB12(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB12;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB13(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB13;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB14(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB14;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB15(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB15;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB16(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB16;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB17(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB17;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB18(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB18;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB19(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB19;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB20(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB20;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB21(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB21;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB22(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB22;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB23(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB23;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB24(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB24;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB25(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB25;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB26(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB26;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB27(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB27;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB28(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB28;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB29(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB29;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB30(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB30;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB31(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB31;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB32(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB32;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB33(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB33;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB34(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB34;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB35(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB35;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB36(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB36;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB37(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB37;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB38(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB38;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePreviousDB39(int tableCount) {
        String result = " ";

        String sqlQuery = SQLConstants.COMPARE_PREVIOUS_DB39;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setInt(1,tableCount);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }






}
