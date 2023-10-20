package com.example.connexion_http_android;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Setter;

@Setter
public class WorldTime {

    @SerializedName("abbreviation")
    @Expose
    public String abbreviation;
    @SerializedName("client_ip")
    @Expose
    public String clientIp;
    @SerializedName("datetime")
    @Expose
    public String datetime;
    @SerializedName("day_of_week")
    @Expose
    public Integer dayOfWeek;
    @SerializedName("day_of_year")
    @Expose
    public Integer dayOfYear;
    @SerializedName("dst")
    @Expose
    public Boolean dst;
    @SerializedName("dst_from")
    @Expose
    public String dstFrom;
    @SerializedName("dst_offset")
    @Expose
    public Integer dstOffset;
    @SerializedName("dst_until")
    @Expose
    public String dstUntil;
    @SerializedName("raw_offset")
    @Expose
    public Integer rawOffset;
    @SerializedName("timezone")
    @Expose
    public String timezone;
    @SerializedName("unixtime")
    @Expose
    public Integer unixtime;
    @SerializedName("utc_datetime")
    @Expose
    public String utcDatetime;
    @SerializedName("utc_offset")
    @Expose
    public String utcOffset;
    @SerializedName("week_number")
    @Expose
    public Integer weekNumber;

    public String getDatetime() {
        return datetime;
    }

    @Override
    public String toString() {
        return
                "abbreviation=" + abbreviation + "\n" +
                "clientIp='" + clientIp + "\n" +
                "datetime=" + datetime + "\n" +
                "dayOfWeek=" + dayOfWeek +
                "dayOfYear=" + dayOfYear +
                "dst=" + dst +
                "dstFrom=" + dstFrom + "\n" +
                "dstOffset=" + dstOffset +
                "dstUntil=" + dstUntil + "\n" +
                "rawOffset=" + rawOffset +
                "timezone=" + timezone + "\n" +
                "unixtime=" + unixtime +
                "utcDatetime=" + utcDatetime + "\n" +
                "utcOffset=" + utcOffset + "\n" +
                "weekNumber=" + weekNumber ;
    }
}
