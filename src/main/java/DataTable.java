/**
 * Created by Nival on 17.04.2017.
 */
public class DataTable {
    public String getRowid() {
        return rowid;
    }

    public void setRowid(String rowid) {
        this.rowid = rowid;
    }

    public String getAudN() {
        return audN;
    }

    public void setAudN(String audN) {
        this.audN = audN;
    }

    public String getPlN() {
        return plN;
    }

    public void setPlN(String plN) {
        this.plN = plN;
    }

    public String getFuncAud() {
        return funcAud;
    }

    public void setFuncAud(String funcAud) {
        this.funcAud = funcAud;
    }

    public String getCompNumb() {
        return compNumb;
    }

    public void setCompNumb(String compNumb) {
        this.compNumb = compNumb;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    String rowid;
    String audN;
    String plN;
    String funcAud;
    String compNumb;
    String po;


    public DataTable(){

    }
    public DataTable(String rid, String aud, String pl, String func, String comp, String prog){
        rowid=rid;
        audN=aud;
        plN=pl;
        funcAud=func;
        compNumb=comp;
        po=prog;
    }
    public void Setall(String rid, String aud, String pl, String func, String comp, String prog){
        rowid=rid;
        audN=aud;
        plN=pl;
        funcAud=func;
        compNumb=comp;
        po=prog;
    }

}
