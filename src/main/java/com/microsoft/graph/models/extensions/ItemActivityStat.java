// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ItemActionStat;
import com.microsoft.graph.models.extensions.IncompleteData;
import com.microsoft.graph.models.extensions.ItemActivity;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat.
 */
public class ItemActivityStat extends Entity implements IJsonBackedObject {


    /**
     * The Start Date Time.
     * When the interval starts. Read-only.
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The End Date Time.
     * When the interval ends. Read-only.
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Access.
     * Statistics about the access actions in this interval. Read-only.
     */
    @SerializedName("access")
    @Expose
    public ItemActionStat access;

    /**
     * The Create.
     * Statistics about the create actions in this interval. Read-only.
     */
    @SerializedName("create")
    @Expose
    public ItemActionStat create;

    /**
     * The Delete.
     * Statistics about the delete actions in this interval. Read-only.
     */
    @SerializedName("delete")
    @Expose
    public ItemActionStat delete;

    /**
     * The Edit.
     * Statistics about the edit actions in this interval. Read-only.
     */
    @SerializedName("edit")
    @Expose
    public ItemActionStat edit;

    /**
     * The Move.
     * Statistics about the move actions in this interval. Read-only.
     */
    @SerializedName("move")
    @Expose
    public ItemActionStat move;

    /**
     * The Is Trending.
     * Indicates whether the item is 'trending.' Read-only.
     */
    @SerializedName("isTrending")
    @Expose
    public Boolean isTrending;

    /**
     * The Incomplete Data.
     * Indicates that the statistics in this interval are based on incomplete data. Read-only.
     */
    @SerializedName("incompleteData")
    @Expose
    public IncompleteData incompleteData;

    /**
     * The Activities.
     * Exposes the itemActivities represented in this itemActivityStat resource.
     */
    public ItemActivityCollectionPage activities;


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


        if (json.has("activities")) {
            final ItemActivityCollectionResponse response = new ItemActivityCollectionResponse();
            if (json.has("activities@odata.nextLink")) {
                response.nextLink = json.get("activities@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("activities").toString(), JsonObject[].class);
            final ItemActivity[] array = new ItemActivity[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemActivity.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            activities = new ItemActivityCollectionPage(response, null);
        }
    }
}
