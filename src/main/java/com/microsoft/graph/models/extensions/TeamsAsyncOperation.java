// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.TeamsAsyncOperationType;
import com.microsoft.graph.models.generated.TeamsAsyncOperationStatus;
import com.microsoft.graph.models.extensions.OperationError;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Async Operation.
 */
public class TeamsAsyncOperation extends Entity implements IJsonBackedObject {


    /**
     * The Operation Type.
     * Denotes which type of operation is being described.
     */
    @SerializedName("operationType")
    @Expose
    public TeamsAsyncOperationType operationType;

    /**
     * The Created Date Time.
     * Time when the operation was created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Status.
     * Operation status.
     */
    @SerializedName("status")
    @Expose
    public TeamsAsyncOperationStatus status;

    /**
     * The Last Action Date Time.
     * Time when the async operation was last updated.
     */
    @SerializedName("lastActionDateTime")
    @Expose
    public java.util.Calendar lastActionDateTime;

    /**
     * The Attempts Count.
     * Number of times the operation was attempted before being marked successful or failed.
     */
    @SerializedName("attemptsCount")
    @Expose
    public Integer attemptsCount;

    /**
     * The Target Resource Id.
     * The ID of the object that's created or modified as result of this async operation, typically a team.
     */
    @SerializedName("targetResourceId")
    @Expose
    public String targetResourceId;

    /**
     * The Target Resource Location.
     * The location of the object that's created or modified as result of this async operation. This URL should be treated as an opaque value and not parsed into its component paths.
     */
    @SerializedName("targetResourceLocation")
    @Expose
    public String targetResourceLocation;

    /**
     * The Error.
     * Any error that causes the async operation to fail.
     */
    @SerializedName("error")
    @Expose
    public OperationError error;


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
