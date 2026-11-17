package businessClass;

import java.io.Serializable;

public class Survey implements Serializable {
    private String hearFrom;
    private String wantsUpdate;
    private String contactVia;

    public Survey() {
        hearFrom = "";
        wantsUpdate = "";
        contactVia = "";
    }

    public Survey(String hearFrom, String wantsUpdate, String contactVia) {
        this.hearFrom = hearFrom;
        this.wantsUpdate = wantsUpdate;
        this.contactVia = contactVia;
    }

    // Getters và Setters cho hearFrom (kèm alias heardFrom)
    public String getHearFrom() {
        return hearFrom;
    }

    public void setHearFrom(String hearFrom) {
        this.hearFrom = hearFrom;
    }

    public String getHeardFrom() {
        return hearFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.hearFrom = heardFrom;
    }

    // Getters và Setters cho wantsUpdate (kèm alias wantsUpdates)
    public String getWantsUpdate() {
        return wantsUpdate;
    }

    public void setWantsUpdate(String wantsUpdate) {
        this.wantsUpdate = wantsUpdate;
    }

    public String getWantsUpdates() {
        return wantsUpdate;
    }

    public void setWantsUpdates(String wantsUpdates) {
        this.wantsUpdate = wantsUpdates;
    }

    // Getters và Setters cho contactVia
    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }

}
