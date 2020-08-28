// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.generated.FollowupFlagStatus;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Followup Flag.
 */
public class FollowupFlag implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Completed Date Time.
     * The date and time that the follow-up was finished.
     */
    @SerializedName("completedDateTime")
    @Expose
    public DateTimeTimeZone completedDateTime;

    /**
     * The Due Date Time.
     * The date and time that the follow up is to be finished. Note: To set the due date, you must also specify the startDateTime; otherwise, you will get a 400 Bad Request response.
     */
    @SerializedName("dueDateTime")
    @Expose
    public DateTimeTimeZone dueDateTime;

    /**
     * The Start Date Time.
     * The date and time that the follow-up is to begin.
     */
    @SerializedName("startDateTime")
    @Expose
    public DateTimeTimeZone startDateTime;

    /**
     * The Flag Status.
     * The status for follow-up for an item. Possible values are notFlagged, complete, and flagged.
     */
    @SerializedName("flagStatus")
    @Expose
    public FollowupFlagStatus flagStatus;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
