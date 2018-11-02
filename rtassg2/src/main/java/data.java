public class data {

    private String no,name, fieldid,rtg, fed,club;

    public data(String no, String name, String fieldid, String fed, String rtg, String club) {

        this.no=no;
        this.name = name;
        this.fieldid = fieldid;
        this.fed = fed;
        this.rtg = rtg;
        this.club = club;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldid() {
        return fieldid;
    }

    public void setFieldid(String fieldid) {
        this.fieldid = fieldid;
    }

    public String getRtg() {
        return rtg;
    }

    public void setRtg(String rtg) {
        this.rtg = rtg;
    }

    public String getFed() {
        return fed;
    }

    public void setFed(String fed) {
        this.fed = fed;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}