// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attendance Interval.
 */
public class AttendanceInterval implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Duration In Seconds.
     * Duration of the meeting interval in seconds; that is, the difference between joinDateTime and leaveDateTime.
     */
    @SerializedName(value = "durationInSeconds", alternate = {"DurationInSeconds"})
    @Expose
	@Nullable
    public Integer durationInSeconds;

    /**
     * The Join Date Time.
     * The time the attendee joined in UTC.
     */
    @SerializedName(value = "joinDateTime", alternate = {"JoinDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime joinDateTime;

    /**
     * The Leave Date Time.
     * The time the attendee left in UTC.
     */
    @SerializedName(value = "leaveDateTime", alternate = {"LeaveDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime leaveDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}