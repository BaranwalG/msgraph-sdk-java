// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.BookingBusiness;
import com.microsoft.graph.models.BookingCurrency;
import com.microsoft.graph.requests.BookingBusinessCollectionPage;
import com.microsoft.graph.requests.BookingCurrencyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Solutions Root.
 */
public class SolutionsRoot implements IJsonBackedObject {

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
     * The Booking Businesses.
     * 
     */
    @SerializedName(value = "bookingBusinesses", alternate = {"BookingBusinesses"})
    @Expose
	@Nullable
    public BookingBusinessCollectionPage bookingBusinesses;

    /**
     * The Booking Currencies.
     * 
     */
    @SerializedName(value = "bookingCurrencies", alternate = {"BookingCurrencies"})
    @Expose
	@Nullable
    public BookingCurrencyCollectionPage bookingCurrencies;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("bookingBusinesses")) {
            bookingBusinesses = serializer.deserializeObject(json.get("bookingBusinesses"), BookingBusinessCollectionPage.class);
        }

        if (json.has("bookingCurrencies")) {
            bookingCurrencies = serializer.deserializeObject(json.get("bookingCurrencies"), BookingCurrencyCollectionPage.class);
        }
    }
}
