// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Thumbnail;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Thumbnail Set.
 */
public class ThumbnailSet extends Entity implements IJsonBackedObject {


    /**
     * The Large.
     * A 1920x1920 scaled thumbnail.
     */
    @SerializedName("large")
    @Expose
    public Thumbnail large;

    /**
     * The Medium.
     * A 176x176 scaled thumbnail.
     */
    @SerializedName("medium")
    @Expose
    public Thumbnail medium;

    /**
     * The Small.
     * A 48x48 cropped thumbnail.
     */
    @SerializedName("small")
    @Expose
    public Thumbnail small;

    /**
     * The Source.
     * A custom thumbnail image or the original image used to generate other thumbnails.
     */
    @SerializedName("source")
    @Expose
    public Thumbnail source;


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
