import java.sql.*;
import java.util.ArrayList;


public class DataAnalyzer {
    PreparedStatement all;
    ResultSet allResult;



    public ArrayList<DataTable> dataUpd() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        ArrayList<DataTable> dat=new ArrayList<>();
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:db.db")) {
            all = c.prepareStatement("SELECT rowid, audNumb, placesNumb,funcAud,compNumb,PO FROM audits");
            allResult = all.executeQuery();
            while (allResult.next()) {
                int rowid = allResult.getInt("rowid");
                int audN = allResult.getInt("audNumb");
                int plN = allResult.getInt("placesNumb");
                String funcAud = allResult.getString("funcAud");
                String compNumb = allResult.getString("compNumb");
                String po = allResult.getString("PO");
                String rowidS=Integer.toString(rowid);
                String audNS=Integer.toString(audN);
                String plNS=Integer.toString(plN);
                DataTable dataOne=new DataTable(rowidS,audNS,plNS,funcAud,compNumb,po);
                dat.add(dataOne);
            }
        }

        return dat;
    }
}

