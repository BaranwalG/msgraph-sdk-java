// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Root;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.SiteCollection;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionResponse;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionPage;
import com.microsoft.graph.requests.extensions.DriveCollectionResponse;
import com.microsoft.graph.requests.extensions.DriveCollectionPage;
import com.microsoft.graph.requests.extensions.BaseItemCollectionResponse;
import com.microsoft.graph.requests.extensions.BaseItemCollectionPage;
import com.microsoft.graph.requests.extensions.ListCollectionResponse;
import com.microsoft.graph.requests.extensions.ListCollectionPage;
import com.microsoft.graph.requests.extensions.SiteCollectionResponse;
import com.microsoft.graph.requests.extensions.SiteCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site.
 */
public class Site extends BaseItem implements IJsonBackedObject {


    /**
     * The Display Name.
     * The full title for the site. Read-only.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Root.
     * If present, indicates that this is the root site in the site collection. Read-only.
     */
    @SerializedName("root")
    @Expose
    public Root root;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Site Collection.
     * Provides details about the site's site collection. Available only on the root site. Read-only.
     */
    @SerializedName("siteCollection")
    @Expose
    public SiteCollection siteCollection;

    /**
     * The Columns.
     * The collection of column definitions reusable across lists under this site.
     */
    public ColumnDefinitionCollectionPage columns;

    /**
     * The Content Types.
     * The collection of content types defined for this site.
     */
    public ContentTypeCollectionPage contentTypes;

    /**
     * The Drive.
     * The default drive (document library) for this site.
     */
    @SerializedName("drive")
    @Expose
    public Drive drive;

    /**
     * The Drives.
     * The collection of drives (document libraries) under this site.
     */
    public DriveCollectionPage drives;

    /**
     * The Items.
     * Used to address any item contained in this site. This collection cannot be enumerated.
     */
    public BaseItemCollectionPage items;

    /**
     * The Lists.
     * The collection of lists under this site.
     */
    public ListCollectionPage lists;

    /**
     * The Sites.
     * The collection of the sub-sites under this site.
     */
    public SiteCollectionPage sites;

    /**
     * The Onenote.
     * Calls the OneNote service for notebook related operations.
     */
    @SerializedName("onenote")
    @Expose
    public Onenote onenote;


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


        if (json.has("columns")) {
            final ColumnDefinitionCollectionResponse response = new ColumnDefinitionCollectionResponse();
            if (json.has("columns@odata.nextLink")) {
                response.nextLink = json.get("columns@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("columns").toString(), JsonObject[].class);
            final ColumnDefinition[] array = new ColumnDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ColumnDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            columns = new ColumnDefinitionCollectionPage(response, null);
        }

        if (json.has("contentTypes")) {
            final ContentTypeCollectionResponse response = new ContentTypeCollectionResponse();
            if (json.has("contentTypes@odata.nextLink")) {
                response.nextLink = json.get("contentTypes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contentTypes").toString(), JsonObject[].class);
            final ContentType[] array = new ContentType[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ContentType.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contentTypes = new ContentTypeCollectionPage(response, null);
        }

        if (json.has("drives")) {
            final DriveCollectionResponse response = new DriveCollectionResponse();
            if (json.has("drives@odata.nextLink")) {
                response.nextLink = json.get("drives@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("drives").toString(), JsonObject[].class);
            final Drive[] array = new Drive[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Drive.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            drives = new DriveCollectionPage(response, null);
        }

        if (json.has("items")) {
            final BaseItemCollectionResponse response = new BaseItemCollectionResponse();
            if (json.has("items@odata.nextLink")) {
                response.nextLink = json.get("items@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("items").toString(), JsonObject[].class);
            final BaseItem[] array = new BaseItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), BaseItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            items = new BaseItemCollectionPage(response, null);
        }

        if (json.has("lists")) {
            final ListCollectionResponse response = new ListCollectionResponse();
            if (json.has("lists@odata.nextLink")) {
                response.nextLink = json.get("lists@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("lists").toString(), JsonObject[].class);
            final List[] array = new List[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), List.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            lists = new ListCollectionPage(response, null);
        }

        if (json.has("sites")) {
            final SiteCollectionResponse response = new SiteCollectionResponse();
            if (json.has("sites@odata.nextLink")) {
                response.nextLink = json.get("sites@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sites").toString(), JsonObject[].class);
            final Site[] array = new Site[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Site.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sites = new SiteCollectionPage(response, null);
        }
    }
}
