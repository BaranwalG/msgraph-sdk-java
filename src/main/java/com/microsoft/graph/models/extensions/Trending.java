// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ResourceVisualization;
import com.microsoft.graph.models.extensions.ResourceReference;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trending.
 */
public class Trending extends Entity implements IJsonBackedObject {


    /**
     * The Weight.
     * Value indicating how much the document is currently trending. The larger the number, the more the document is currently trending around the user (the more relevant it is). Returned documents are sorted by this value.
     */
    @SerializedName("weight")
    @Expose
    public Double weight;

    /**
     * The Resource Visualization.
     * Properties that you can use to visualize the document in your experience.
     */
    @SerializedName("resourceVisualization")
    @Expose
    public ResourceVisualization resourceVisualization;

    /**
     * The Resource Reference.
     * Reference properties of the trending document, such as the url and type of the document.
     */
    @SerializedName("resourceReference")
    @Expose
    public ResourceReference resourceReference;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Resource.
     * Used for navigating to the trending document.
     */
    @SerializedName("resource")
    @Expose
    public Entity resource;


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
