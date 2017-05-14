import java.sql.*;
import java.util.ArrayList;


public class DataAnalyzer {
    PreparedStatement all;
    ResultSet allResult;


    public ArrayList<DataTable> dataUpd() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        ArrayList<DataTable> dat = new ArrayList<>();
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:db.db")) {
            all = c.prepareStatement("SELECT rowid, audNumb, placesNumb,funcAud,compNumb,PO FROM audits ORDER BY audNumb");
            allResult = all.executeQuery();
            while (allResult.next()) {
                int rowid = allResult.getInt("rowid");
                int audN = allResult.getInt("audNumb");
                int plN = allResult.getInt("placesNumb");
                String funcAud = allResult.getString("funcAud");
                String compNumb = allResult.getString("compNumb");
                String po = allResult.getString("PO");
                String rowidS = Integer.toString(rowid);
                String audNS = Integer.toString(audN);
                String plNS = Integer.toString(plN);
                DataTable dataOne = new DataTable(rowidS, audNS, plNS, funcAud, compNumb, po);
                dat.add(dataOne);
                for (int i = 0; i < dat.size(); i++) {
                    DataTable deta = dat.get(i);
                    deta.setLastrowid(rowidS);
                    dat.set(i, deta);
                }
            }

        }
        return dat;
    }

    public void dataAdd(DataTable aud) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:db.db")) {
            String audN = aud.getAudN();
            String plN = aud.getPlN();
            String funcAud = "'" + aud.getFuncAud() + "'";
            String compNumb = "'" + aud.getCompNumb() + "'";
            String po = "'" + aud.getPo() + "'";
            String ins = "INSERT INTO audits" + " VALUES (" + audN + "," + plN + "," + funcAud + "," + compNumb + "," + po + ")";
            Statement statement = c.createStatement();
            statement.executeUpdate(ins);

        }
    }

    public void dataDel(Integer numb) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:db.db")) {
            Statement st = c.createStatement();
            String toDel = numb.toString();
            st.executeUpdate("DELETE FROM audits WHERE audNumb=" + toDel);
        }
    }

    public void dataUpd(int audToUpd,int audNEdit,String plEdit,String funcEdit,String PoEdit) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:db.db")) {
            Statement st = c.createStatement();

            String plN = plEdit;
            String funcAud = "'" + funcEdit + "'";
            String po = "'" + PoEdit + "'";


            st.executeUpdate("UPDATE audits SET audNumb="+audNEdit+", "+"placesNumb="+plN+", "+"funcAud="+funcAud+", "+"PO="+po+" WHERE audnumb=" + audToUpd);
        }
    }

    public ArrayList<DataTable> dataFilter(String audNumb, String func, String PO, String places) throws ClassNotFoundException, SQLException {
        ArrayList<DataTable> dat = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        int count = 0;
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:db.db")) {


            String seachStr = "SELECT rowid, audNumb, placesNumb,funcAud,compNumb,PO FROM audits WHERE";
            if (audNumb != " - ") {
                seachStr += " audNumb=" + audNumb;
                count++;
            }
            if (func != " - ") {
                if(count>0){
                    seachStr+=" AND ";
                }
                seachStr += " func=" + func;
                count++;
            }
            if(PO!=" - "){
                if(count>0){
                    seachStr+=" AND ";
                }
                seachStr+=" PO="+PO;
                count++;
            }
            if(places!=" - "){
                if(count>0){
                    seachStr+=" AND ";
                }
                seachStr+=" placesNumb="+places;
                count++;
            }
            if(count==0){
               seachStr=seachStr.substring(0,64);
            }
            System.out.println(seachStr);
             PreparedStatement seach=c.prepareStatement(seachStr);
             ResultSet seachResult = seach.executeQuery();


            while (seachResult.next()) {
                int rowid = seachResult.getInt("rowid");
                int audN = seachResult.getInt("audNumb");
                int plN = seachResult.getInt("placesNumb");
                String funcAud = seachResult.getString("funcAud");
                String compNumb = seachResult.getString("compNumb");
                String po = seachResult.getString("PO");
                String rowidS = Integer.toString(rowid);
                String audNS = Integer.toString(audN);
                String plNS = Integer.toString(plN);
                DataTable dataOne = new DataTable(rowidS, audNS, plNS, funcAud, compNumb, po);
                dat.add(dataOne);
                for (int i = 0; i < dat.size(); i++) {
                    DataTable deta = dat.get(i);
                    deta.setLastrowid(rowidS);
                    dat.set(i, deta);

                }
            }
        }

        return dat;
    }
}