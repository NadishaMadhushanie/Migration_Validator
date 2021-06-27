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

public boolean checkTableExits(String dbName,String tableName) {
    String result = " ";

    String sqlQuery = SQLConstants.CHECK_TABLES_EXITS;

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

}
