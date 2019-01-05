package com.example.mahesh.retrrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class UserList implements Serializable {
    @SerializedName("userData")
    @Expose
    public List<UserDatum> userData = null;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("msg")
    @Expose
    public String msg;
    private final static long serialVersionUID = -8375528707863731463L;

    public class UserDatum implements Serializable
    {

        @SerializedName("lead_id")
        @Expose
        public String leadId;
        @SerializedName("productlist")
        @Expose
        public String productlist;
        @SerializedName("rate")
        @Expose
        public String rate;
        @SerializedName("percentage")
        @Expose
        public String percentage;
        @SerializedName("requiredby")
        @Expose
        public String requiredby;
        @SerializedName("followupdate")
        @Expose
        public String followupdate;
        @SerializedName("shadecard")
        @Expose
        public String shadecard;
        @SerializedName("quantity")
        @Expose
        public String quantity;
        @SerializedName("typeofcall")
        @Expose
        public String typeofcall;
        @SerializedName("sender_id")
        @Expose
        public String senderId;
        @SerializedName("assign_lead")
        @Expose
        public String assignLead;
        @SerializedName("date")
        @Expose
        public String date;
        @SerializedName("customer_name")
        @Expose
        public String customerName;
        @SerializedName("address")
        @Expose
        public String address;
        @SerializedName("phone_no")
        @Expose
        public String phoneNo;
        @SerializedName("remarks")
        @Expose
        public String remarks;
        @SerializedName("lead_status")
        @Expose
        public String leadStatus;
        @SerializedName("comment")
        @Expose
        public String comment;
        @SerializedName("created_date")
        @Expose
        public String createdDate;
        @SerializedName("update_status")
        @Expose
        public String updateStatus;
        @SerializedName("attend")
        @Expose
        public String attend;
        @SerializedName("fname")
        @Expose
        public String fname;
        @SerializedName("email")
        @Expose
        public String email;
        @SerializedName("name")
        @Expose
        public String name;
        private final static long serialVersionUID = -4439443297598626149L;

    }
}
